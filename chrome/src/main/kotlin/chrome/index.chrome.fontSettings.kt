@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.fontSettings")
package chrome.fontSettings

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface FontName {
    var displayName: String
    var fontId: String
}
external interface DefaultFontSizeDetails {
    var pixelSize: Number
}
external interface FontDetails {
    var genericFamily: String
    var script: String? get() = definedExternally; set(value) = definedExternally
}
external interface FullFontDetails {
    var genericFamily: String
    var levelOfControl: String
    var script: String? get() = definedExternally; set(value) = definedExternally
    var fontId: String
}
external interface FontDetailsResult {
    var levelOfControl: String
    var fontId: String
}
external interface FontSizeDetails {
    var pixelSize: Number
    var levelOfControl: String
}
external interface SetFontSizeDetails {
    var pixelSize: Number
}
external interface SetFontDetails : FontDetails {
    var fontId: String
}
external interface DefaultFixedFontSizeChangedEvent : chrome.events.Event<(details: FontSizeDetails) -> Unit>
external interface DefaultFontSizeChangedEvent : chrome.events.Event<(details: FontSizeDetails) -> Unit>
external interface MinimumFontSizeChangedEvent : chrome.events.Event<(details: FontSizeDetails) -> Unit>
external interface FontChangedEvent : chrome.events.Event<(details: FullFontDetails) -> Unit>
external fun setDefaultFontSize(details: DefaultFontSizeDetails, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun getFont(details: FontDetails, callback: ((details: FontDetailsResult) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getDefaultFontSize(details: Any? = definedExternally /* null */, callback: ((options: FontSizeDetails) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getMinimumFontSize(details: FontSizeDetails? = definedExternally /* null */, callback: ((options: FontSizeDetails) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setMinimumFontSize(details: SetFontSizeDetails, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun getDefaultFixedFontSize(details: Any? = definedExternally /* null */, callback: ((details: FontSizeDetails) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun clearDefaultFontSize(details: Any? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun setDefaultFixedFontSize(details: SetFontSizeDetails, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun clearFont(details: FontDetails, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun setFont(details: SetFontDetails, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun clearMinimumFontSize(details: Any? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun getFontList(callback: (results: Array<FontName>) -> Unit): Unit = definedExternally
external fun clearDefaultFixedFontSize(details: Any, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external var onDefaultFixedFontSizeChanged: DefaultFixedFontSizeChangedEvent = definedExternally
external var onDefaultFontSizeChanged: DefaultFontSizeChangedEvent = definedExternally
external var onMinimumFontSizeChanged: MinimumFontSizeChangedEvent = definedExternally
external var onFontChanged: FontChangedEvent = definedExternally
