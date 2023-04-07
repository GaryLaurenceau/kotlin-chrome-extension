@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.webRequest")
package chrome.webRequest

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

external interface AuthCredentials {
    var username: String
    var password: String
}
external interface HttpHeader {
    var name: String
    var value: String? get() = definedExternally; set(value) = definedExternally
    var binaryValue: ArrayBuffer? get() = definedExternally; set(value) = definedExternally
}
external interface BlockingResponse {
    var cancel: Boolean? get() = definedExternally; set(value) = definedExternally
    var redirectUrl: String? get() = definedExternally; set(value) = definedExternally
    var responseHeaders: Array<HttpHeader>? get() = definedExternally; set(value) = definedExternally
    var authCredentials: AuthCredentials? get() = definedExternally; set(value) = definedExternally
    var requestHeaders: Array<HttpHeader>? get() = definedExternally; set(value) = definedExternally
}
external interface RequestFilter {
    var tabId: Number? get() = definedExternally; set(value) = definedExternally
    var types: Array<dynamic /* String /* "object" */ | String /* "main_frame" */ | String /* "sub_frame" */ | String /* "stylesheet" */ | String /* "script" */ | String /* "image" */ | String /* "font" */ | String /* "xmlhttprequest" */ | String /* "ping" */ | String /* "csp_report" */ | String /* "media" */ | String /* "websocket" */ | String /* "other" */ */>? get() = definedExternally; set(value) = definedExternally
    var urls: Array<String>
    var windowId: Number? get() = definedExternally; set(value) = definedExternally
}
external interface UploadData {
    var bytes: ArrayBuffer? get() = definedExternally; set(value) = definedExternally
    var file: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$34` {
    @nativeGetter
    operator fun get(key: String): Array<String>?
    @nativeSetter
    operator fun set(key: String, value: Array<String>)
}
external interface WebRequestBody {
    var error: String? get() = definedExternally; set(value) = definedExternally
    var formData: `T$34`? get() = definedExternally; set(value) = definedExternally
    var raw: Array<UploadData>? get() = definedExternally; set(value) = definedExternally
}
external interface WebAuthChallenger {
    var host: String
    var port: Number
}
external interface ResourceRequest {
    var url: String
    var requestId: String
    var frameId: Number
    var parentFrameId: Number
    var tabId: Number
    var type: dynamic /* String /* "object" */ | String /* "main_frame" */ | String /* "sub_frame" */ | String /* "stylesheet" */ | String /* "script" */ | String /* "image" */ | String /* "font" */ | String /* "xmlhttprequest" */ | String /* "ping" */ | String /* "csp_report" */ | String /* "media" */ | String /* "websocket" */ | String /* "other" */ */
    var timeStamp: Number
}
external interface WebRequestDetails : ResourceRequest {
    var method: String
}
external interface WebRequestHeadersDetails : WebRequestDetails {
    var requestHeaders: Array<HttpHeader>? get() = definedExternally; set(value) = definedExternally
}
external interface WebRequestBodyDetails : WebRequestDetails {
    var requestBody: WebRequestBody
}
external interface WebRequestFullDetails : WebRequestHeadersDetails, WebRequestBodyDetails
external interface WebResponseDetails : ResourceRequest {
    var statusLine: String
    var statusCode: Number
}
external interface WebResponseHeadersDetails : WebResponseDetails {
    var responseHeaders: Array<HttpHeader>? get() = definedExternally; set(value) = definedExternally
    var method: String
}
external interface WebResponseCacheDetails : WebResponseHeadersDetails {
    var ip: String? get() = definedExternally; set(value) = definedExternally
    var fromCache: Boolean
}
external interface WebRedirectionResponseDetails : WebResponseCacheDetails {
    var redirectUrl: String
}
external interface WebAuthenticationChallengeDetails : WebResponseHeadersDetails {
    var scheme: String
    var realm: String? get() = definedExternally; set(value) = definedExternally
    var challenger: WebAuthChallenger
    var isProxy: Boolean
}
external interface WebResponseErrorDetails : WebResponseCacheDetails {
    var error: String
}
external interface WebRequestBodyEvent : chrome.events.Event<(details: WebRequestBodyDetails) -> Unit> {
    fun addListener(callback: (details: WebRequestBodyDetails) -> Unit, filter: RequestFilter? = definedExternally /* null */, opt_extraInfoSpec: Array<String>? = definedExternally /* null */)
}
external interface WebRequestHeadersEvent : chrome.events.Event<(details: WebRequestHeadersDetails) -> Unit> {
    fun addListener(callback: (details: WebRequestHeadersDetails) -> Unit, filter: RequestFilter? = definedExternally /* null */, opt_extraInfoSpec: Array<String>? = definedExternally /* null */)
}
external interface _WebResponseHeadersEvent<T : WebResponseHeadersDetails> : chrome.events.Event<(details: T) -> Unit> {
    fun addListener(callback: (details: T) -> Unit, filter: RequestFilter? = definedExternally /* null */, opt_extraInfoSpec: Array<String>? = definedExternally /* null */)
}
external interface WebResponseHeadersEvent : _WebResponseHeadersEvent<WebResponseHeadersDetails>
external interface WebResponseCacheEvent : _WebResponseHeadersEvent<WebResponseCacheDetails>
external interface WebRedirectionResponseEvent : _WebResponseHeadersEvent<WebRedirectionResponseDetails>
external interface WebAuthenticationChallengeEvent : chrome.events.Event<(details: WebAuthenticationChallengeDetails, callback: ((response: BlockingResponse) -> Unit)? /*= null*/) -> Unit> {
    fun addListener(callback: (details: WebAuthenticationChallengeDetails, callback: ((response: BlockingResponse) -> Unit)? /*= null*/) -> Unit, filter: RequestFilter? = definedExternally /* null */, opt_extraInfoSpec: Array<String>? = definedExternally /* null */)
}
external interface WebResponseErrorEvent : _WebResponseHeadersEvent<WebResponseErrorDetails>
external var MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Number = definedExternally
external fun handlerBehaviorChanged(callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external var onBeforeRequest: WebRequestBodyEvent = definedExternally
external var onBeforeSendHeaders: WebRequestHeadersEvent = definedExternally
external var onSendHeaders: WebRequestHeadersEvent = definedExternally
external var onHeadersReceived: WebResponseHeadersEvent = definedExternally
external var onAuthRequired: WebAuthenticationChallengeEvent = definedExternally
external var onResponseStarted: WebResponseCacheEvent = definedExternally
external var onBeforeRedirect: WebRedirectionResponseEvent = definedExternally
external var onCompleted: WebResponseCacheEvent = definedExternally
external var onErrorOccurred: WebResponseErrorEvent = definedExternally
