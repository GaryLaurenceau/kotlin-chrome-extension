@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.extension")
package chrome.extension

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

external interface FetchProperties {
    var windowId: Number? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
}
external interface LastError {
    var message: String
}
external interface OnRequestEvent : chrome.events.Event<dynamic /* (request: Any, sender: chrome.runtime.MessageSender, sendResponse: (response: Any) -> Unit) -> Unit | (sender: chrome.runtime.MessageSender, sendResponse: (response: Any) -> Unit) -> Unit */>
external var inIncognitoContext: Boolean = definedExternally
external var lastError: LastError = definedExternally
external fun getBackgroundPage(): Window? = definedExternally
external fun getURL(path: String): String = definedExternally
external fun setUpdateUrlData(data: String): Unit = definedExternally
external fun getViews(fetchProperties: FetchProperties? = definedExternally /* null */): Array<Window> = definedExternally
external fun isAllowedFileSchemeAccess(callback: (isAllowedAccess: Boolean) -> Unit): Unit = definedExternally
external fun isAllowedIncognitoAccess(callback: (isAllowedAccess: Boolean) -> Unit): Unit = definedExternally
external fun sendRequest(extensionId: String, request: Any, responseCallback: ((response: Any) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun sendRequest(request: Any, responseCallback: ((response: Any) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getExtensionTabs(windowId: Number? = definedExternally /* null */): Array<Window> = definedExternally
external var onRequest: OnRequestEvent = definedExternally
external var onRequestExternal: OnRequestEvent = definedExternally
