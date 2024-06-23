import VersionHelper.fallbackVersion
import VersionHelper.versionFmt

// Lets me depend on Maven Central artifacts immediately without waiting
resolvers ++= Resolver.sonatypeOssRepos("public")

// Makes sure to increment the version for local development
ThisBuild / version := dynverGitDescribeOutput.value
  .mkVersion(out => versionFmt(out, dynverSonatypeSnapshots.value), fallbackVersion(dynverCurrentDate.value))

ThisBuild / dynver := {
  val d = new java.util.Date
  sbtdynver.DynVer
    .getGitDescribeOutput(d)
    .mkVersion(out => versionFmt(out, dynverSonatypeSnapshots.value), fallbackVersion(d))
}

(ThisBuild / scalaVersion) := Versions.Scala_2_12

(ThisBuild / crossScalaVersions) := Seq(
  Versions.Scala_3,
  Versions.Scala_2_13,
  Versions.Scala_2_12
)

lazy val commonSettings = Seq(
  name := "Scala DOM Types",
  organization := "com.raquo",
  homepage := Some(url("https://github.com/raquo/scala-dom-types")),
  licenses += ("MIT", url("https://github.com/raquo/scala-dom-types/blob/master/LICENSE.md")),
  scmInfo := Some(
    ScmInfo(url("https://github.com/raquo/scala-dom-types"), "scm:git@github.com/raquo/scala-dom-types.git")
  ),
  developers := List(
    Developer(id = "raquo", name = "Nikita Gazarov", email = "nikita@raquo.com", url = url("https://github.com/raquo"))
  ),
  (Test / parallelExecution) := false,
  (Test / publishArtifact) := false,
  pomIncludeRepository := { _ => false },
  sonatypeCredentialHost := "s01.oss.sonatype.org",
  sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
)

lazy val noPublish = Seq(
  publishLocal / skip := true,
  publish / skip := true
)

lazy val root = project
  .in(file("."))
  .aggregate(
    domtypesJVM,
    domtypesJS,
    sbtDomtypes
  ) // order is important: first, generate sample traits, then try to compile them on the frontend
  .settings(commonSettings)
  .settings(noPublish)

lazy val domtypes = crossProject(JSPlatform, JVMPlatform)
  .in(file("."))
  .settings(commonSettings)
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %%% "scalatest" % Versions.ScalaTest % Test
    )
  )
  .settings(
    normalizedName := "domtypes",
    scalacOptions ++= Seq(
      "-feature",
      "-language:higherKinds"
    ),
    scalacOptions ~= (_.filterNot(
      Set(
        "-Wunused:params",
        "-Ywarn-unused:params",
        "-Wunused:explicits"
      )
    )),
    (Compile / doc / scalacOptions) ~= (_.filter(
      _.startsWith("-Xplugin")
    )), // https://github.com/DavidGregory084/sbt-tpolecat/issues/36
    (Compile / doc / scalacOptions) ++= Seq(
      "-no-link-warnings" // Suppress scaladoc "Could not find any member to link for" warnings
    ),
    (Test / scalacOptions) ~= { options: Seq[String] =>
      options.filterNot { o =>
        o.startsWith("-Ywarn-unused") || o.startsWith("-Wunused")
      }
    }
  )
  .jsSettings(
    scalaJSLinkerConfig ~= { _.withSourceMap(false) },
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % Versions.ScalaJsDom,
      "com.raquo" %%% "ew" % Versions.Ew % Test
    ),
    scalacOptions ++= {
      val sourcesUrl = s"https://raw.githubusercontent.com/raquo/scala-dom-types/${git.gitHeadCommit.value.get}"
      val sourcesOptionName = if (scalaVersion.value.startsWith("2.")) "-P:scalajs:mapSourceURI" else "-scalajs-mapSourceURI"
      Seq(
        s"${sourcesOptionName}:${file("js").toURI}->$sourcesUrl/js/",
        s"${sourcesOptionName}:${file("shared").toURI}->$sourcesUrl/shared/"
      )
    }
  )

lazy val domtypesJS = domtypes.js
lazy val domtypesJVM = domtypes.jvm

lazy val sbtDomtypes = project
  .in(file("sbt-domtypes"))
  .enablePlugins(SbtPlugin)
  .dependsOn(domtypesJVM)
  .settings(commonSettings: _*)
  .settings(
    name := "sbt-domtypes",
    normalizedName := "sbt-domtypes",
    sbtPlugin := true,
    scalaVersion := Versions.Scala_2_12,
    scriptedLaunchOpts := {
      scriptedLaunchOpts.value ++ Seq(
        "-Xmx1024M",
        "-Dplugin.version=" + version.value
      )
    },
    scriptedBufferLog := false,
    addSbtPlugin("org.scala-js" % "sbt-scalajs" % Versions.ScalaJs),
    libraryDependencies ++= Seq(
      "com.lihaoyi" %% "upickle" % "3.1.3", // for parsing custom-elements.json
      "com.lihaoyi" %% "pprint" % "0.7.0"
    ),
    (Compile / resourceGenerators) += Def.task {
      val file =
        (Compile / resourceManaged).value / "domtypes-version.properties"
      IO.write(file, s"domtypes.version=${version.value}")
      Seq(file)
    }
  )
