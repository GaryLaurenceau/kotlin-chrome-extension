@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.browserAction")
package chrome.browserAction

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

external interface BadgeBackgroundColorDetails {
    var color: dynamic /* String | dynamic /* JsTuple<Number, Number, Number, Number> */ */
    var tabId: Number? get() = definedExternally; set(value) = definedExternally
}
external interface BadgeTextDetails {
    var text: String
    var tabId: Number? get() = definedExternally; set(value) = definedExternally
}
external interface TitleDetails {
    var title: String
    var tabId: Number? get() = definedExternally; set(value) = definedExternally
}
external interface TabDetails {
    var tabId: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$0` {
    @nativeGetter
    operator fun get(index: Number): ImageData?
    @nativeSetter
    operator fun set(index: Number, value: ImageData)
}
external interface TabIconDetails {
    var path: Any? get() = definedExternally; set(value) = definedExternally
    var tabId: Number? get() = definedExternally; set(value) = definedExternally
    var imageData: dynamic /* ImageData | `T$0` */ get() = definedExternally; set(value) = definedExternally
}
external interface PopupDetails {
    var tabId: Number? get() = definedExternally; set(value) = definedExternally
    var popup: String
}
external interface BrowserClickedEvent : chrome.events.Event<(tab: chrome.tabs.Tab) -> Unit>
external fun enable(tabId: Number? = definedExternally /* null */): Unit = definedExternally
external fun setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = definedExternally
external fun setBadgeText(details: BadgeTextDetails): Unit = definedExternally
external fun setTitle(details: TitleDetails): Unit = definedExternally
external fun getBadgeText(details: TabDetails, callback: (result: String) -> Unit): Unit = definedExternally
external fun setPopup(details: PopupDetails): Unit = definedExternally
external fun disable(tabId: Number? = definedExternally /* null */): Unit = definedExternally
external fun getTitle(details: TabDetails, callback: (result: String) -> Unit): Unit = definedExternally
external fun getBadgeBackgroundColor(details: TabDetails, callback: (result: dynamic /* JsTuple<Number, Number, Number, Number> */) -> Unit): Unit = definedExternally
external fun getPopup(details: TabDetails, callback: (result: String) -> Unit): Unit = definedExternally
external fun setIcon(details: TabIconDetails, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external var onClicked: BrowserClickedEvent = definedExternally
