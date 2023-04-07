@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.windows")
package chrome.windows

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

external interface Window {
    var tabs: Array<chrome.tabs.Tab>? get() = definedExternally; set(value) = definedExternally
    var top: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var state: String
    var focused: Boolean
    var alwaysOnTop: Boolean
    var incognito: Boolean
    var type: String
    var id: Number
    var left: Number? get() = definedExternally; set(value) = definedExternally
    var sessionId: String? get() = definedExternally; set(value) = definedExternally
}
external interface GetInfo {
    var populate: Boolean? get() = definedExternally; set(value) = definedExternally
    var windowTypes: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface CreateData {
    var tabId: Number? get() = definedExternally; set(value) = definedExternally
    var url: dynamic /* String | Array<String> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    var top: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var focused: Boolean? get() = definedExternally; set(value) = definedExternally
    var incognito: Boolean? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var left: Number? get() = definedExternally; set(value) = definedExternally
    var state: String? get() = definedExternally; set(value) = definedExternally
}
external interface UpdateInfo {
    var top: Number? get() = definedExternally; set(value) = definedExternally
    var drawAttention: Boolean? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var state: String? get() = definedExternally; set(value) = definedExternally
    var focused: Boolean? get() = definedExternally; set(value) = definedExternally
    var left: Number? get() = definedExternally; set(value) = definedExternally
}
external interface WindowEventFilter {
    var windowTypes: Array<String>
}
external interface WindowIdEvent : chrome.events.Event<(windowId: Number, filters: WindowEventFilter? /*= null*/) -> Unit>
external interface WindowReferenceEvent : chrome.events.Event<(window: Window, filters: WindowEventFilter? /*= null*/) -> Unit>
external var WINDOW_ID_CURRENT: Number = definedExternally
external var WINDOW_ID_NONE: Number = definedExternally
external fun get(windowId: Number, callback: (window: Window) -> Unit): Unit = definedExternally
external fun get(windowId: Number, getInfo: GetInfo, callback: (window: Window) -> Unit): Unit = definedExternally
external fun getCurrent(callback: (window: Window) -> Unit): Unit = definedExternally
external fun getCurrent(getInfo: GetInfo, callback: (window: Window) -> Unit): Unit = definedExternally
external fun create(callback: ((window: Window? /*= null*/) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun create(createData: CreateData, callback: ((window: Window? /*= null*/) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getAll(callback: (windows: Array<Window>) -> Unit): Unit = definedExternally
external fun getAll(getInfo: GetInfo, callback: (windows: Array<Window>) -> Unit): Unit = definedExternally
external fun update(windowId: Number, updateInfo: UpdateInfo, callback: ((window: Window) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun remove(windowId: Number, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun getLastFocused(callback: (window: Window) -> Unit): Unit = definedExternally
external fun getLastFocused(getInfo: GetInfo, callback: (window: Window) -> Unit): Unit = definedExternally
external var onRemoved: WindowIdEvent = definedExternally
external var onCreated: WindowReferenceEvent = definedExternally
external var onFocusChanged: WindowIdEvent = definedExternally
