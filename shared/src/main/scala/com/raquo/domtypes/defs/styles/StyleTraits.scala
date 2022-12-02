package com.raquo.domtypes.defs.styles

import com.raquo.domtypes.common.{StyleKeywordDef, StyleTraitDef}

object StyleTraits {
  
  val defs: List[StyleTraitDef] = List(
    
    StyleTraitDef(
      scalaName = "AlignContent",
      extendsTraits = List("FlexPosition"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "spaceBetween",
          domName = "space-between",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "spaceAround",
          domName = "space-around",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "spaceEvenly",
          domName = "space-evenly",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Auto",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "auto",
          domName = "auto",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "BackfaceVisibility",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "visible",
          domName = "visible",
          isOverride = false,
          commentLines = List(
            "The back face is visible.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hidden",
          domName = "hidden",
          isOverride = false,
          commentLines = List(
            "The back face is not visible.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "BackgroundAttachment",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "fixed",
          domName = "fixed",
          isOverride = false,
          commentLines = List(
            "The background is fixed relative to the viewport. Even if an element has",
            "a scrolling mechanism, the background doesn't move with the element.",
            "(This is not compatible with background-clip: text.)",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "local",
          domName = "local",
          isOverride = false,
          commentLines = List(
            "The background is fixed relative to the element's contents. If the element",
            "has a scrolling mechanism, the background scrolls with the element's",
            "contents, and the background painting area and background positioning area",
            "are relative to the scrollable area of the element rather than to the",
            "border framing them.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "scroll",
          domName = "scroll",
          isOverride = false,
          commentLines = List(
            "The background is fixed relative to the element itself and does not scroll",
            "with its contents. (It is effectively attached to the element's border.)",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "BackgroundSize",
      extendsTraits = List("Auto"),
      extendsUnits = List("Length"),
      keywords = List(
        StyleKeywordDef(
          scalaName = "cover",
          domName = "cover",
          isOverride = false,
          commentLines = List(
            "This keyword specifies that the background image should be scaled to be",
            "as small as possible while ensuring both its dimensions are greater than",
            "or equal to the corresponding dimensions of the background positioning",
            "area.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "contain",
          domName = "contain",
          isOverride = false,
          commentLines = List(
            "This keyword specifies that the background image should be scaled to be",
            "as large as possible while ensuring both its dimensions are less than or",
            "equal to the corresponding dimensions of the background positioning area.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Base",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "initial",
          domName = "initial",
          isOverride = false,
          commentLines = List(
            "The initial CSS keyword applies the initial (or default) value of a",
            "property to an element.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "inherit",
          domName = "inherit",
          isOverride = false,
          commentLines = List(
            "The inherit CSS keyword causes the element for which it is specified to",
            "take the computed value of the property from its parent element.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "revert",
          domName = "revert",
          isOverride = false,
          commentLines = List(
            "The revert CSS keyword reverts the cascaded value of the property from its",
            "current value to the value the property would have had if no changes had",
            "been made by the current style origin to the current element.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "unset",
          domName = "unset",
          isOverride = false,
          commentLines = List(
            "The unset CSS keyword resets a property to its inherited value if the",
            "property naturally inherits from its parent, and to its initial value if",
            "not. In other words, it behaves like the inherit keyword in the first case,",
            "when the property is an inherited property, and like the initial keyword in",
            "the second case, when the property is a non-inherited property.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "BorderCollapse",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "separate",
          domName = "separate",
          isOverride = false,
          commentLines = List(
            "Use separated-border table rendering model. This is the default.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "collapse",
          domName = "collapse",
          isOverride = false,
          commentLines = List(
            "Use collapsed-border table rendering model.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "BoxSizing",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "borderBox",
          domName = "border-box",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "contentBox",
          domName = "content-box",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Clear",
      extendsTraits = List("None"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "left",
          domName = "left",
          isOverride = false,
          commentLines = List(
            "The element is moved down to clear past left floats.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "right",
          domName = "right",
          isOverride = false,
          commentLines = List(
            "The element is moved down to clear past right floats.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "both",
          domName = "both",
          isOverride = false,
          commentLines = List(
            "The element is moved down to clear past both left and right floats.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Color",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "black",
          domName = "black",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "blue",
          domName = "blue",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "cyan",
          domName = "cyan",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "gray",
          domName = "gray",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "green",
          domName = "green",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "purple",
          domName = "purple",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "silver",
          domName = "silver",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "red",
          domName = "red",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "white",
          domName = "white",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "yellow",
          domName = "yellow",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Cursor",
      extendsTraits = List("Auto", "None"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "default",
          domName = "default",
          isOverride = false,
          commentLines = List(
            "Default cursor, typically an arrow.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "contextMenu",
          domName = "context-menu",
          isOverride = false,
          commentLines = List(
            "A context menu is available under the cursor.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "help",
          domName = "help",
          isOverride = false,
          commentLines = List(
            "Indicating help is available.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "pointer",
          domName = "pointer",
          isOverride = false,
          commentLines = List(
            "E.g. used when hovering over links, typically a hand.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "progress",
          domName = "progress",
          isOverride = false,
          commentLines = List(
            "The program is busy in the background but the user can still interact",
            "with the interface (unlike for wait).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "waitCss",
          domName = "wait",
          isOverride = false,
          commentLines = List(
            "The program is busy (sometimes an hourglass or a watch).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "cell",
          domName = "cell",
          isOverride = false,
          commentLines = List(
            "Indicating that cells can be selected.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "crosshair",
          domName = "crosshair",
          isOverride = false,
          commentLines = List(
            "Cross cursor, often used to indicate selection in a bitmap.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "text",
          domName = "text",
          isOverride = false,
          commentLines = List(
            "Indicating text can be selected, typically an I-beam.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "verticalText",
          domName = "vertical-text",
          isOverride = false,
          commentLines = List(
            "Indicating that vertical text can be selected, typically a sideways I-beam",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "alias",
          domName = "alias",
          isOverride = false,
          commentLines = List(
            "Indicating an alias or shortcut is to be created.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "copy",
          domName = "copy",
          isOverride = false,
          commentLines = List(
            "Indicating that something can be copied",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "move",
          domName = "move",
          isOverride = false,
          commentLines = List(
            "The hovered object may be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "noDrop",
          domName = "no-drop",
          isOverride = false,
          commentLines = List(
            "Cursor showing that a drop is not allowed at the current location.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "notAllowed",
          domName = "not-allowed",
          isOverride = false,
          commentLines = List(
            "Cursor showing that something cannot be done.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "allScroll",
          domName = "all-scroll",
          isOverride = false,
          commentLines = List(
            "Cursor showing that something can be scrolled in any direction (panned).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "colResize",
          domName = "col-resize",
          isOverride = false,
          commentLines = List(
            "The item/column can be resized horizontally. Often rendered as arrows",
            "pointing left and right with a vertical separating.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "rowResize",
          domName = "row-resize",
          isOverride = false,
          commentLines = List(
            "The item/row can be resized vertically. Often rendered as arrows pointing",
            "up and down with a horizontal bar separating them.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "nResize",
          domName = "n-resize",
          isOverride = false,
          commentLines = List(
            "The top edge is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "eResize",
          domName = "e-resize",
          isOverride = false,
          commentLines = List(
            "The right edge is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "sResize",
          domName = "s-resize",
          isOverride = false,
          commentLines = List(
            "The bottom edge is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "wResize",
          domName = "w-resize",
          isOverride = false,
          commentLines = List(
            "The left edge is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "neResize",
          domName = "ne-resize",
          isOverride = false,
          commentLines = List(
            "The top-right corner is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "nwResize",
          domName = "nw-resize",
          isOverride = false,
          commentLines = List(
            "The top-left corner is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "seResize",
          domName = "se-resize",
          isOverride = false,
          commentLines = List(
            "The bottom-right corner is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "swResize",
          domName = "sw-resize",
          isOverride = false,
          commentLines = List(
            "The bottom-left corner is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "ewResize",
          domName = "ew-resize",
          isOverride = false,
          commentLines = List(
            "The left and right edges are to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "nsResize",
          domName = "ns-resize",
          isOverride = false,
          commentLines = List(
            "The top and bottom edges are to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "neswResize",
          domName = "nesw-resize",
          isOverride = false,
          commentLines = List(
            "The top right and bottom left corners are to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "nwseResize",
          domName = "nwse-resize",
          isOverride = false,
          commentLines = List(
            "The top left and bottom right corners are to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "zoomIn",
          domName = "zoom-in",
          isOverride = false,
          commentLines = List(
            "Indicates that something can be zoomed (magnified) in.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "zoomOut",
          domName = "zoom-out",
          isOverride = false,
          commentLines = List(
            "Indicates that something can be zoomed (magnified) out.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "grab",
          domName = "grab",
          isOverride = false,
          commentLines = List(
            "Indicates that something can be grabbed (dragged to be moved).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "grabbing",
          domName = "grabbing",
          isOverride = false,
          commentLines = List(
            "Indicates that something can be grabbed (dragged to be moved).",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Direction",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "ltr",
          domName = "ltr",
          isOverride = false,
          commentLines = List(
            "Text and other elements go from left to right.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "rtl",
          domName = "rtl",
          isOverride = false,
          commentLines = List(
            "Text and other elements go from right to left.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Display",
      extendsTraits = List("None"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "block",
          domName = "block",
          isOverride = false,
          commentLines = List(
            "The element generates a block element box",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "inline",
          domName = "inline",
          isOverride = false,
          commentLines = List(
            "The element generates one or more inline element boxes",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "flow",
          domName = "flow",
          isOverride = false,
          commentLines = List(
            "The element lays out its contents using flow layout (block-and-inline layout).",
            "",
            "If its outer display type is inline or run-in, and it is participating in a",
            "block or inline formatting context, then it generates an inline box.",
            "Otherwise it generates a block container box.",
            "",
            "Depending on the value of other properties (such as position, float, or overflow)",
            "and whether it is itself participating in a block or inline formatting context,",
            "it either establishes a new block formatting context (BFC) for its contents or",
            "integrates its contents into its parent formatting context.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "flowRoot",
          domName = "flow-root",
          isOverride = false,
          commentLines = List(
            "The element generates a block element box that establishes a new block",
            "formatting context, defining where the formatting root lies",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "flex",
          domName = "flex",
          isOverride = false,
          commentLines = List(
            "The element behaves like a block element and lays out its content according",
            "to the flexbox model",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "grid",
          domName = "grid",
          isOverride = false,
          commentLines = List(
            "The element behaves like a block element and lays out its content according",
            "to the grid model",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "ruby",
          domName = "ruby",
          isOverride = false,
          commentLines = List(
            "The element behaves like an inline element and lays out its content according",
            "to the ruby formatting model. It behaves like the corresponding HTML <ruby>",
            "elements.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "inlineBlock",
          domName = "inline-block",
          isOverride = false,
          commentLines = List(
            "The element generates a block element box that will be flowed with",
            "surrounding content as if it were a single inline box.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "inlineFlex",
          domName = "inline-flex",
          isOverride = false,
          commentLines = List(
            "The element behaves like an inline element and lays out its content",
            "according to the flexbox model",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "inlineGrid",
          domName = "inline-grid",
          isOverride = false,
          commentLines = List(
            "The element behaves like an inline element and lays out its content",
            "according to the grid model",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "inlineTable",
          domName = "inline-table",
          isOverride = false,
          commentLines = List(
            "The inline-table value does not have a direct mapping in HTML. It behaves",
            "like a table HTML element, but as an inline box, rather than a",
            "block-level box. Inside the table box is a block-level context",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "none",
          domName = "none",
          isOverride = true,
          commentLines = List(
            "Turns off the display of an element (it has no effect on layout); all",
            "descendant elements also have their display turned off. The document is",
            "rendered as though the element did not exist.",
            "",
            "To render an element box's dimensions, yet have its contents be invisible,",
            "see the visibility property.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "contents",
          domName = "contents",
          isOverride = false,
          commentLines = List(
            "These elements don't produce a specific box by themselves.",
            "They are replaced by their pseudo-box and their child boxes.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "listItem",
          domName = "list-item",
          isOverride = false,
          commentLines = List(
            "The element generates a block box for the content and a separate list-item",
            "inline box",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "table",
          domName = "table",
          isOverride = false,
          commentLines = List(
            "Behaves like the table HTML element. It defines a block-level box",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "tableCaption",
          domName = "table-caption",
          isOverride = false,
          commentLines = List(
            "Behaves like the caption HTML element",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "tableCell",
          domName = "table-cell",
          isOverride = false,
          commentLines = List(
            "Behaves like the td HTML element",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "tableColumn",
          domName = "table-column",
          isOverride = false,
          commentLines = List(
            "These elements behave like the corresponding col HTML elements",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "tableColumnGroup",
          domName = "table-column-group",
          isOverride = false,
          commentLines = List(
            "These elements behave like the corresponding colgroup HTML elements",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "tableFooterGroup",
          domName = "table-footer-group",
          isOverride = false,
          commentLines = List(
            "These elements behave like the corresponding tfoot HTML elements",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "tableHeaderGroup",
          domName = "table-header-group",
          isOverride = false,
          commentLines = List(
            "These elements behave like the corresponding thead HTML elements",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "tableRow",
          domName = "table-row",
          isOverride = false,
          commentLines = List(
            "Behaves like the tr HTML element",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "tableRowGroup",
          domName = "table-row-group",
          isOverride = false,
          commentLines = List(
            "These elements behave like the corresponding tbody HTML elements",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "EmptyCells",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "show",
          domName = "show",
          isOverride = false,
          commentLines = List(
            "Borders and backgrounds should be drawn like in a normal cells.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hide",
          domName = "hide",
          isOverride = false,
          commentLines = List(
            "No border or backgrounds of empty cells should be drawn.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "FlexDirection",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "column",
          domName = "column",
          isOverride = false,
          commentLines = List(
            "The flex container's main-axis is the same as the block-axis.",
            "The main-start and main-end points are the same as the before",
            "and after points of the writing-mode.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "columnReverse",
          domName = "column-reverse",
          isOverride = false,
          commentLines = List(
            "Behaves the same as column but the main-start and main-end are permuted.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "row",
          domName = "row",
          isOverride = false,
          commentLines = List(
            "The flex container's main-axis is defined to be the same as the text direction.",
            "The main-start and main-end points are the same as the content direction.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "rowReverse",
          domName = "row-reverse",
          isOverride = false,
          commentLines = List(
            "Behaves the same as row but the main-start and main-end points are permuted.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "FlexPosition",
      extendsTraits = List("Normal"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "flexStart",
          domName = "flex-start",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "flexEnd",
          domName = "flex-end",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "center",
          domName = "center",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "start",
          domName = "start",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "end",
          domName = "end",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "selfStart",
          domName = "self-start",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "selfEnd",
          domName = "self-end",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "baseline",
          domName = "baseline",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "firstBaseline",
          domName = "first baseline",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lastBaseline",
          domName = "last baseline",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "stretch",
          domName = "stretch",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "FlexWrap",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "nowrap",
          domName = "nowrap",
          isOverride = false,
          commentLines = List(
            "The flex items are laid out in a single line which may cause the",
            "flex container to overflow. The cross-start is either equivalent",
            "to start or before depending flex-direction value.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "wrap",
          domName = "wrap",
          isOverride = false,
          commentLines = List(
            "The flex items break into multiple lines. The cross-start is",
            "either equivalent to start or before depending flex-direction",
            "value and the cross-end is the opposite of the specified",
            "cross-start.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "wrapReverse",
          domName = "wrap-reverse",
          isOverride = false,
          commentLines = List(
            "Behaves the same as wrap but cross-start and cross-end are",
            "permuted.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Float",
      extendsTraits = List("None"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "left",
          domName = "left",
          isOverride = false,
          commentLines = List(
            "Element must float on the left side of its containing block.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "right",
          domName = "right",
          isOverride = false,
          commentLines = List(
            "Element must float on the right side of its containing block.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "FontSize",
      extendsTraits = Nil,
      extendsUnits = List("Length"),
      keywords = List(
        StyleKeywordDef(
          scalaName = "xxSmall",
          domName = "xx-small",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "xSmall",
          domName = "x-small",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "small",
          domName = "small",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "medium",
          domName = "medium",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "large",
          domName = "large",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "xLarge",
          domName = "x-large",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "xxLarge",
          domName = "xx-large",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "larger",
          domName = "larger",
          isOverride = false,
          commentLines = List(
            "Larger than the parent element's font size, by roughly the ratio used to",
            "separate the absolute size keywords above.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "smaller",
          domName = "smaller",
          isOverride = false,
          commentLines = List(
            "Smaller than the parent element's font size, by roughly the ratio used to",
            "separate the absolute size keywords above.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "FontStyle",
      extendsTraits = List("Normal"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "italic",
          domName = "italic",
          isOverride = false,
          commentLines = List(
            "Selects a font that is labeled italic, if that is not available,",
            "one labeled oblique",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "oblique",
          domName = "oblique",
          isOverride = false,
          commentLines = List(
            "Selects a font that is labeled oblique",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "FontWeight",
      extendsTraits = List("Normal"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "normal",
          domName = "normal",
          isOverride = true,
          commentLines = List(
            "Normal font weight. Same as 400.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "bold",
          domName = "bold",
          isOverride = false,
          commentLines = List(
            "Bold font weight. Same as 700.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lighter",
          domName = "lighter",
          isOverride = false,
          commentLines = List(
            "One font weight lighter than the parent element (among the available",
            "weights of the font).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "bolder",
          domName = "bolder",
          isOverride = false,
          commentLines = List(
            "One font weight darker than the parent element (among the available",
            "weights of the font)",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "JustifyContent",
      extendsTraits = List("AlignContent"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "left",
          domName = "left",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "right",
          domName = "right",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Line",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "dotted",
          domName = "dotted",
          isOverride = false,
          commentLines = List(
            "Displays a series of rounded dots. The spacing of the dots are not",
            "defined by the specification and are implementation-specific. The radius",
            "of the dots is half the calculated border-right-width.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "dashed",
          domName = "dashed",
          isOverride = false,
          commentLines = List(
            "Displays a series of short square-ended dashes or line segments. The exact",
            "size and Length of the segments are not defined by the specification and",
            "are implementation-specific.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "solid",
          domName = "solid",
          isOverride = false,
          commentLines = List(
            "Displays a single, straight, solid line.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "double",
          domName = "double",
          isOverride = false,
          commentLines = List(
            "Displays two straight lines that add up to the pixel amount defined as",
            "border-width or border-right-width.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "groove",
          domName = "groove",
          isOverride = false,
          commentLines = List(
            "Displays a border leading to a carved effect. It is the opposite of ridge.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "ridge",
          domName = "ridge",
          isOverride = false,
          commentLines = List(
            "Displays a border with a 3D effect, like if it is coming out of the page.",
            "It is the opposite of groove.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "inset",
          domName = "inset",
          isOverride = false,
          commentLines = List(
            "Displays a border that makes the box appear embedded. It is the opposite",
            "of outset. When applied to a table cell with border-collapse set to",
            "collapsed, this value behaves like groove.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "outset",
          domName = "outset",
          isOverride = false,
          commentLines = List(
            "Displays a border that makes the box appear in 3D, embossed. It is the",
            "opposite of inset. When applied to a table cell with border-collapse set",
            "to collapsed, this value behaves like ridge.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "LineWidth",
      extendsTraits = Nil,
      extendsUnits = List("Length"),
      keywords = List(
        StyleKeywordDef(
          scalaName = "thin",
          domName = "thin",
          isOverride = false,
          commentLines = List(
            "Typically 1px in desktop browsers like Firefox.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "medium",
          domName = "medium",
          isOverride = false,
          commentLines = List(
            "Typically 3px in desktop browsers like Firefox.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "thick",
          domName = "thick",
          isOverride = false,
          commentLines = List(
            "Typically 5px in desktop browsers like Firefox.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "ListStylePosition",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "outside",
          domName = "outside",
          isOverride = false,
          commentLines = List(
            "The marker box is outside the principal block box.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "inside",
          domName = "inside",
          isOverride = false,
          commentLines = List(
            "The marker box is the first inline box in the principal block box, after",
            "which the element's content flows.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "ListStyleType",
      extendsTraits = List("None"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "disc",
          domName = "disc",
          isOverride = false,
          commentLines = List(
            "A filled circle (default value)",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "circle",
          domName = "circle",
          isOverride = false,
          commentLines = List(
            "A hollow circle",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "square",
          domName = "square",
          isOverride = false,
          commentLines = List(
            "A filled square",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "decimal",
          domName = "decimal",
          isOverride = false,
          commentLines = List(
            "Decimal numbers begining with 1",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "cjkDecimal",
          domName = "cjk-decimal",
          isOverride = false,
          commentLines = List(
            "Han decimal numbers",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "decimalLeadingZero",
          domName = "decimal-leading-zero",
          isOverride = false,
          commentLines = List(
            "Decimal numbers padded by initial zeros",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lowerRoman",
          domName = "lower-roman",
          isOverride = false,
          commentLines = List(
            "Lowercase roman numerals",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "upperRoman",
          domName = "upper-roman",
          isOverride = false,
          commentLines = List(
            "Uppercase roman numerals",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lowerGreek",
          domName = "lower-greek",
          isOverride = false,
          commentLines = List(
            "Lowercase classical greek",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lowerAlpha",
          domName = "lower-alpha",
          isOverride = false,
          commentLines = List(
            "Lowercase ASCII letters",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lowerLatin",
          domName = "lower-latin",
          isOverride = false,
          commentLines = List(
            "Lowercase ASCII letters",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "upperAlpha",
          domName = "upper-alpha",
          isOverride = false,
          commentLines = List(
            "Uppercase ASCII letters",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "upperLatin",
          domName = "upper-latin",
          isOverride = false,
          commentLines = List(
            "Uppercase ASCII letters",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "armenian",
          domName = "armenian",
          isOverride = false,
          commentLines = List(
            "Traditional Armenian numbering",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "georgian",
          domName = "georgian",
          isOverride = false,
          commentLines = List(
            "Traditional Georgian numbering",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hebrew",
          domName = "hebrew",
          isOverride = false,
          commentLines = List(
            "Traditional Hebrew numbering",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hiragana",
          domName = "hiragana",
          isOverride = false,
          commentLines = List(
            "Japanese Hiragana",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hiraganaIroha",
          domName = "hiragana-iroha",
          isOverride = false,
          commentLines = List(
            "Japanese Hiragana. Iroha is the old japanese ordering of syllables",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "katakana",
          domName = "katakana",
          isOverride = false,
          commentLines = List(
            "Japanese Katakana",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "katakanaIroha",
          domName = "katakana-iroha",
          isOverride = false,
          commentLines = List(
            "Japanese Katakana. Iroha is the old japanese ordering of syllables",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "MinMaxLength",
      extendsTraits = Nil,
      extendsUnits = List("Length"),
      keywords = List(
        StyleKeywordDef(
          scalaName = "maxContent",
          domName = "max-content",
          isOverride = false,
          commentLines = List(
            "The intrinsic preferred length.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "minContent",
          domName = "min-content",
          isOverride = false,
          commentLines = List(
            "The intrinsic minimum length.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "fitContent",
          domName = "fit-content",
          isOverride = false,
          commentLines = List(
            "Defined as min(max-content, max(min-content, fill-available)).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "fillAvailable",
          domName = "fill-available",
          isOverride = false,
          commentLines = List(
            "The containing block width minus margin, border and padding.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "None",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "none",
          domName = "none",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Normal",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "normal",
          domName = "normal",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Overflow",
      extendsTraits = List("Auto"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "visible",
          domName = "visible",
          isOverride = false,
          commentLines = List(
            "Default value. Content is not clipped, it may be rendered outside the",
            "content box.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hidden",
          domName = "hidden",
          isOverride = false,
          commentLines = List(
            "The content is clipped and no scrollbars are provided.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "scroll",
          domName = "scroll",
          isOverride = false,
          commentLines = List(
            "The content is clipped and desktop browsers use scrollbars, whether or",
            "not any content is clipped. This avoids any problem with scrollbars",
            "appearing and disappearing in a dynamic environment. Printers may print",
            "overflowing content.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "OverflowWrap",
      extendsTraits = List("Normal"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "normal",
          domName = "normal",
          isOverride = true,
          commentLines = List(
            "Indicates that lines may only break at normal word break points.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "breakWord",
          domName = "break-word",
          isOverride = false,
          commentLines = List(
            "Indicates that normally unbreakable words may be broken at arbitrary",
            "points if there are no otherwise acceptable break points in the line.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "PaddingBoxSizing",
      extendsTraits = List("BoxSizing"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "paddingBox",
          domName = "padding-box",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "PageBreak",
      extendsTraits = List("Auto"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "always",
          domName = "always",
          isOverride = false,
          commentLines = List(
            "Always force page breaks.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "avoid",
          domName = "avoid",
          isOverride = false,
          commentLines = List(
            "Avoid page breaks.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "left",
          domName = "left",
          isOverride = false,
          commentLines = List(
            "Force page breaks so that the next page is formatted as a left page.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "right",
          domName = "right",
          isOverride = false,
          commentLines = List(
            "Force page breaks so that the next page is formatted as a right page.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "PointerEvents",
      extendsTraits = List("None", "Auto"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "auto",
          domName = "auto",
          isOverride = true,
          commentLines = List(
            "The element behaves as it would if the pointer-events property was not",
            "specified. In SVG content, this value and the value visiblePainted have",
            "the same effect.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "none",
          domName = "none",
          isOverride = true,
          commentLines = List(
            "The element is never the target of mouse events; however, mouse events",
            "may target its descendant elements if those descendants have pointer-events",
            "set to some other value. In these circumstances, mouse events will trigger",
            "event listeners on this parent element as appropriate on their way to/from",
            "the descendant during the event capture/bubble phases.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "visiblePainted",
          domName = "visiblePainted",
          isOverride = false,
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "visibility property is set to visible and when the mouse cursor is over",
            "the interior (i.e., 'fill') of the element and the fill property is set",
            "to a value other than none, or when the mouse cursor is over the perimeter",
            "(i.e., 'stroke') of the element and the stroke property is set to a value",
            "other than none.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "visibleFill",
          domName = "visibleFill",
          isOverride = false,
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "visibility property is set to visible and when the mouse cursor is over",
            "the interior (i.e., fill) of the element. The value of the fill property",
            "does not effect event processing.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "visibleStroke",
          domName = "visibleStroke",
          isOverride = false,
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "visibility property is set to visible and when the mouse cursor is over",
            "the perimeter (i.e., stroke) of the element. The value of the stroke",
            "property does not effect event processing.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "visible",
          domName = "visible",
          isOverride = false,
          commentLines = List(
            "SVG only. The element can be the target of a mouse event when the",
            "visibility property is set to visible and the mouse cursor is over either",
            "the interior (i.e., fill) or the perimeter (i.e., stroke) of the element.",
            "The values of the fill and stroke do not effect event processing.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "painted",
          domName = "painted",
          isOverride = false,
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "mouse cursor is over the interior (i.e., 'fill') of the element and the",
            "fill property is set to a value other than none, or when the mouse cursor",
            "is over the perimeter (i.e., 'stroke') of the element and the stroke",
            "property is set to a value other than none. The value of the visibility",
            "property does not effect event processing.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "fill",
          domName = "fill",
          isOverride = false,
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "pointer is over the interior (i.e., fill) of the element. The values of",
            "the fill and visibility properties do not effect event processing.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "stroke",
          domName = "stroke",
          isOverride = false,
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "pointer is over the perimeter (i.e., stroke) of the element. The values",
            "of the stroke and visibility properties do not effect event processing.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "all",
          domName = "all",
          isOverride = false,
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "pointer is over the interior (i.e., fill) or the perimeter (i.e., stroke)",
            "of the element. The values of the fill, stroke and visibility properties",
            "do not effect event processing.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Position",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "static",
          domName = "static",
          isOverride = false,
          commentLines = List(
            "This keyword let the element use the normal behavior, that is it is laid",
            "out in its current position in the flow.  The top, right, bottom, and left",
            "properties do not apply.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "relative",
          domName = "relative",
          isOverride = false,
          commentLines = List(
            "This keyword lays out all elements as though the element were not",
            "positioned, and then adjust the element's position, without changing",
            "layout (and thus leaving a gap for the element where it would have been",
            "had it not been positioned). The effect of position:relative on",
            "table-*-group, table-row, table-column, table-cell, and table-caption",
            "elements is undefined.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "absolute",
          domName = "absolute",
          isOverride = false,
          commentLines = List(
            "Do not leave space for the element. Instead, position it at a specified",
            "position relative to its closest positioned ancestor or to the containing",
            "block. Absolutely positioned boxes can have margins, they do not collapse",
            "with any other margins.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "fixed",
          domName = "fixed",
          isOverride = false,
          commentLines = List(
            "Do not leave space for the element. Instead, position it at a specified",
            "position relative to the screen's viewport and doesn't move when scrolled.",
            "When printing, position it at that fixed position on every page.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "TableLayout",
      extendsTraits = List("Auto"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "auto",
          domName = "auto",
          isOverride = true,
          commentLines = List(
            "An automatic table layout algorithm is commonly used by most browsers for",
            "table layout. The width of the table and its cells depends on the content",
            "thereof.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "fixed",
          domName = "fixed",
          isOverride = false,
          commentLines = List(
            "Table and column widths are set by the widths of table and col elements",
            "or by the width of the first row of cells. Cells in subsequent rows do",
            "not affect column widths.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "TextAlign",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "start",
          domName = "start",
          isOverride = false,
          commentLines = List(
            "`left` if direction is left-to-right and `right` otherwise.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "end",
          domName = "end",
          isOverride = false,
          commentLines = List(
            "`right` if direction is left-to-right and `left` otherwise.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "left",
          domName = "left",
          isOverride = false,
          commentLines = List(
            "The inline contents are aligned to the left edge of the line box.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "right",
          domName = "right",
          isOverride = false,
          commentLines = List(
            "The inline contents are aligned to the right edge of the line box.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "center",
          domName = "center",
          isOverride = false,
          commentLines = List(
            "The inline contents are centered within the line box.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "justify",
          domName = "justify",
          isOverride = false,
          commentLines = List(
            "The text is justified. Text should line up their left and right edges to",
            "the left and right content edges of the paragraph.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "TextDecoration",
      extendsTraits = List("None"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "underline",
          domName = "underline",
          isOverride = false,
          commentLines = List(
            "Each line of text is underlined.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "overline",
          domName = "overline",
          isOverride = false,
          commentLines = List(
            "Each line of text has a line above it.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lineThrough",
          domName = "line-through",
          isOverride = false,
          commentLines = List(
            "Each line of text has a line through the middle.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "TextOverflow",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "clip",
          domName = "clip",
          isOverride = false,
          commentLines = List(
            "This keyword value indicates to truncate the text at the limit of the",
            "content area, therefore the truncation can happen in the middle of a",
            "character. To truncate at the transition between two characters, the",
            "empty string value must be used. The value clip is the default for",
            "this property.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "ellipsis",
          domName = "ellipsis",
          isOverride = false,
          commentLines = List(
            "This keyword value indicates to display an ellipsis ('…', U+2026 HORIZONTAL",
            "ELLIPSIS) to represent clipped text. The ellipsis is displayed inside the",
            "content area, decreasing the amount of text displayed. If there is not",
            "enough space to display the ellipsis, it is clipped.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "TextTransform",
      extendsTraits = List("None"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "capitalize",
          domName = "capitalize",
          isOverride = false,
          commentLines = List(
            "Forces the first letter of each word to be converted to",
            "uppercase. Other characters are unchanged.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "uppercase",
          domName = "uppercase",
          isOverride = false,
          commentLines = List(
            "Forces all characters to be converted to uppercase.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lowercase",
          domName = "lowercase",
          isOverride = false,
          commentLines = List(
            "Forces all characters to be converted to lowercase.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "TextUnderlinePosition",
      extendsTraits = List("Auto"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "auto",
          domName = "auto",
          isOverride = true,
          commentLines = List(
            "This keyword allows the browser to use an algorithm to choose between",
            "under and alphabetic.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "under",
          domName = "under",
          isOverride = false,
          commentLines = List(
            "This keyword forces the line to be set below the alphabetic baseline, at",
            "a position where it won't cross any descender. This is useful to prevent",
            "chemical or mathematical formulas, which make a large use of subscripts,",
            "to be illegible.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "left",
          domName = "left",
          isOverride = false,
          commentLines = List(
            "In vertical writing-modes, this keyword forces the line to be placed on",
            "the left of the characters. In horizontal writing-modes, it is a synonym",
            "of under.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "right",
          domName = "right",
          isOverride = false,
          commentLines = List(
            "In vertical writing-modes, this keyword forces the line to be placed on",
            "the right of the characters. In horizontal writing-modes, it is a synonym",
            "of under.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "underLeft",
          domName = "under left",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "underRight",
          domName = "under right",
          isOverride = false,
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "VerticalAlign",
      extendsTraits = Nil,
      extendsUnits = List("Length"),
      keywords = List(
        StyleKeywordDef(
          scalaName = "baseline",
          domName = "baseline",
          isOverride = false,
          commentLines = List(
            "Aligns the baseline of the element with the baseline of its parent. The",
            "baseline of some replaced elements, like textarea is not specified by",
            "the HTML specification, meaning that their behavior with this keyword may",
            "change from one browser to the other.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "sub",
          domName = "sub",
          isOverride = false,
          commentLines = List(
            "Aligns the baseline of the element with the subscript-baseline of its",
            "parent.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "`super`",
          domName = "super",
          isOverride = false,
          commentLines = List(
            "Aligns the baseline of the element with the superscript-baseline of its",
            "parent.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "textTop",
          domName = "text-top",
          isOverride = false,
          commentLines = List(
            "Aligns the top of the element with the top of the parent element's font.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "textBottom",
          domName = "text-bottom",
          isOverride = false,
          commentLines = List(
            "Aligns the bottom of the element with the bottom of the parent element's",
            "font.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "middle",
          domName = "middle",
          isOverride = false,
          commentLines = List(
            "Aligns the middle of the element with the middle of lowercase letters in",
            "the parent.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "top",
          domName = "top",
          isOverride = false,
          commentLines = List(
            "Aligns the top of the element and its descendants with the top of the",
            "entire line.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "bottom",
          domName = "bottom",
          isOverride = false,
          commentLines = List(
            "Aligns the bottom of the element and its descendants with the bottom of",
            "the entire line.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "Visibility",
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "visible",
          domName = "visible",
          isOverride = false,
          commentLines = List(
            "Default value, the box is visible",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hidden",
          domName = "hidden",
          isOverride = false,
          commentLines = List(
            "The box is invisible (fully transparent, nothing is drawn), but still",
            "affects layout.  Descendants of the element will be visible if they have",
            "visibility:visible",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "collapse",
          domName = "collapse",
          isOverride = false,
          commentLines = List(
            "For table rows, columns, column groups, and row groups the row(s) or",
            "column(s) are hidden and the space they would have occupied is (as if",
            "display: none were applied to the column/row of the table)",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "WhiteSpace",
      extendsTraits = List("Normal"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "normal",
          domName = "normal",
          isOverride = true,
          commentLines = List(
            "Sequences of whitespace are collapsed. Newline characters in the source",
            "are handled as other whitespace. Breaks lines as necessary to fill line",
            "boxes.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "nowrap",
          domName = "nowrap",
          isOverride = false,
          commentLines = List(
            "Collapses whitespace as for normal, but suppresses line breaks (text",
            "wrapping) within text.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "pre",
          domName = "pre",
          isOverride = false,
          commentLines = List(
            "Sequences of whitespace are preserved, lines are only broken at newline",
            "characters in the source and at br elements.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "preWrap",
          domName = "pre-wrap",
          isOverride = false,
          commentLines = List(
            "Sequences of whitespace are preserved. Lines are broken at newline",
            "characters, at br, and as necessary to fill line boxes.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "preLine",
          domName = "pre-line",
          isOverride = false,
          commentLines = List(
            "Sequences of whitespace are collapsed. Lines are broken at newline",
            "characters, at br, and as necessary to fill line boxes.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = "WordBreak",
      extendsTraits = List("Normal"),
      extendsUnits = Nil,
      keywords = List(
        StyleKeywordDef(
          scalaName = "breakAll",
          domName = "break-all",
          isOverride = false,
          commentLines = List(
            "To prevent overflow, word breaks should be inserted between any two",
            "characters (excluding Chinese/Japanese/Korean text).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "keepAll",
          domName = "keep-all",
          isOverride = false,
          commentLines = List(
            "Word breaks should not be used for Chinese/Japanese/Korean (CJK) text.",
            "Non-CJK text behavior is the same as for normal.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "breakWord",
          domName = "break-word",
          isOverride = false,
          commentLines = List(
            "To prevent overflow, normally unbreakable words may be broken at",
            "arbitrary points if there are no otherwise acceptable break points",
            "in the line.",
            "",
            "Note: IE does not support this value",
          ),
          docUrls = Nil,
        ),

      ),
    ),

  )
  
}