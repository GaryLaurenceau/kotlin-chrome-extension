@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.sessions")
package chrome.sessions

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

external interface Filter {
    var maxResults: Number? get() = definedExternally; set(value) = definedExternally
}
external interface Session {
    var lastModified: Number
    var tab: chrome.tabs.Tab? get() = definedExternally; set(value) = definedExternally
    var window: chrome.windows.Window? get() = definedExternally; set(value) = definedExternally
}
external interface Device {
    var deviceName: String
    var sessions: Array<Session>
}
external interface SessionChangedEvent : chrome.events.Event<() -> Unit>
external var MAX_SESSION_RESULTS: Number = definedExternally
external fun getRecentlyClosed(filter: Filter, callback: (sessions: Array<Session>) -> Unit): Unit = definedExternally
external fun getRecentlyClosed(callback: (sessions: Array<Session>) -> Unit): Unit = definedExternally
external fun getDevices(filter: Filter, callback: (devices: Array<Device>) -> Unit): Unit = definedExternally
external fun getDevices(callback: (devices: Array<Device>) -> Unit): Unit = definedExternally
external fun restore(sessionId: String? = definedExternally /* null */, callback: ((restoredSession: Session) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external var onChanged: SessionChangedEvent = definedExternally
