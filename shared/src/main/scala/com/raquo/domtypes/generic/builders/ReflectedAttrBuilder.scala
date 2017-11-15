package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.codecs.{BooleanAsIsCodec, Codec, DoubleAsIsCodec, DoubleAsStringCodec, IntAsIsCodec, IntAsStringCodec, StringAsIsCodec}

/** This trait builds objects representing reflected attributes which are typically on the left hand side
  * of the `reflectedAttr := value` syntax.
  *
  * Reflected attributes are explained in the README file.
  *
  * Also see [[com.raquo.domtypes.generic.defs.reflectedAttrs.ReflectedAttrs]] for a summary of
  * reflected attributes. Basically it's a subset of HTML attributes that are fully mirrored
  * as DOM properties, so typically you don't want to load both an attribute and a property
  * of the same name.
  *
  * @tparam RA
  *            Reflected Attribute, canonically either [[com.raquo.domtypes.generic.keys.Attr]]
  *            or [[com.raquo.domtypes.generic.keys.Prop]] depending on whether you want to build
  *            properties or attributes
  */
trait ReflectedAttrBuilder[RA[_, _]] {

  /** Create a reflected attribute */
  @inline def reflectedAttr[V, DomPropV](
    attrKey: String,
    propKey: String,
    attrCodec: Codec[V, String],
    propCodec: Codec[V, DomPropV]
  ): RA[V, DomPropV]

  @inline def intReflectedAttr(attrKey: String, propKey: String): RA[Int, Int] = {
    reflectedAttr(attrKey = attrKey, propKey = propKey, attrCodec = IntAsStringCodec, propCodec = IntAsIsCodec)
  }

  @inline def intReflectedAttr(key: String): RA[Int, Int] = {
    intReflectedAttr(attrKey = key, propKey = key)
  }

  @inline def doubleReflectedAttr(key: String): RA[Double, Double] = {
    reflectedAttr(attrKey = key, propKey = key, attrCodec = DoubleAsStringCodec, propCodec = DoubleAsIsCodec)
  }

  @inline def stringReflectedAttr(attrKey: String, propKey: String): RA[String, String] = {
    reflectedAttr(attrKey = attrKey, propKey = propKey, attrCodec = StringAsIsCodec, propCodec = StringAsIsCodec)
  }

  @inline def stringReflectedAttr(key: String): RA[String, String] = {
    stringReflectedAttr(attrKey = key, propKey = key)
  }

  @inline def booleanReflectedAttr(attrKey: String, propKey: String, attrCodec: Codec[Boolean, String]): RA[Boolean, Boolean] = {
    reflectedAttr(attrKey = attrKey, propKey = propKey, attrCodec = attrCodec, propCodec = BooleanAsIsCodec)
  }

  @inline def booleanReflectedAttr(key: String, attrCodec: Codec[Boolean, String]): RA[Boolean, Boolean] = {
    reflectedAttr(attrKey = key, propKey = key, attrCodec = attrCodec, propCodec = BooleanAsIsCodec)
  }
}
