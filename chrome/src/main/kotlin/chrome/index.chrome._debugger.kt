@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome._debugger")
package chrome._debugger

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

external interface Debuggee {
    var tabId: Number? get() = definedExternally; set(value) = definedExternally
    var extensionId: String? get() = definedExternally; set(value) = definedExternally
    var targetId: String? get() = definedExternally; set(value) = definedExternally
}
external interface TargetInfo {
    var type: String
    var id: String
    var tabId: Number? get() = definedExternally; set(value) = definedExternally
    var extensionId: String? get() = definedExternally; set(value) = definedExternally
    var attached: Boolean
    var title: String
    var url: String
    var faviconUrl: String? get() = definedExternally; set(value) = definedExternally
}
external interface DebuggerDetachedEvent : chrome.events.Event<(source: Debuggee, reason: String) -> Unit>
external interface DebuggerEventEvent : chrome.events.Event<(source: Debuggee, method: String, params: Any? /*= null*/) -> Unit>
external fun attach(target: Debuggee, requiredVersion: String, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun detach(target: Debuggee, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun sendCommand(target: Debuggee, method: String, commandParams: Any? = definedExternally /* null */, callback: ((result: Any? /*= null*/) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getTargets(callback: (result: Array<TargetInfo>) -> Unit): Unit = definedExternally
external var onDetach: DebuggerDetachedEvent = definedExternally
external var onEvent: DebuggerEventEvent = definedExternally
