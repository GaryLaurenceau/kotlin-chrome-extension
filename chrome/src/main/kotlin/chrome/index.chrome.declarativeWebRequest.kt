@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.declarativeWebRequest")
package chrome.declarativeWebRequest

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

external interface HeaderFilter {
    var nameEquals: String? get() = definedExternally; set(value) = definedExternally
    var valueContains: Any? get() = definedExternally; set(value) = definedExternally
    var nameSuffix: String? get() = definedExternally; set(value) = definedExternally
    var valueSuffix: String? get() = definedExternally; set(value) = definedExternally
    var valuePrefix: String? get() = definedExternally; set(value) = definedExternally
    var nameContains: Any? get() = definedExternally; set(value) = definedExternally
    var valueEquals: String? get() = definedExternally; set(value) = definedExternally
    var namePrefix: String? get() = definedExternally; set(value) = definedExternally
}
external interface AddResponseHeader {
    var name: String
    var value: String
}
external interface RemoveResponseCookie {
    var filter: ResponseCookie
}
external interface RemoveResponseHeader {
    var name: String
    var value: String? get() = definedExternally; set(value) = definedExternally
}
external interface RequestMatcher {
    var contentType: Array<String>? get() = definedExternally; set(value) = definedExternally
    var url: chrome.events.UrlFilter? get() = definedExternally; set(value) = definedExternally
    var excludeContentType: Array<String>? get() = definedExternally; set(value) = definedExternally
    var excludeResponseHeader: Array<HeaderFilter>? get() = definedExternally; set(value) = definedExternally
    var resourceType: String? get() = definedExternally; set(value) = definedExternally
    var responseHeaders: Array<HeaderFilter>? get() = definedExternally; set(value) = definedExternally
}
external interface IgnoreRules {
    var lowerPriorityThan: Number
}
external interface RedirectToEmptyDocument
external interface RedirectRequest {
    var redirectUrl: String
}
external interface ResponseCookie {
    var domain: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var expires: String? get() = definedExternally; set(value) = definedExternally
    var maxAge: Number? get() = definedExternally; set(value) = definedExternally
    var value: String? get() = definedExternally; set(value) = definedExternally
    var path: String? get() = definedExternally; set(value) = definedExternally
    var httpOnly: String? get() = definedExternally; set(value) = definedExternally
    var secure: String? get() = definedExternally; set(value) = definedExternally
}
external interface AddResponseCookie {
    var cookie: ResponseCookie
}
external interface EditResponseCookie {
    var filter: ResponseCookie
    var modification: ResponseCookie
}
external interface CancelRequest
external interface RemoveRequestHeader {
    var name: String
}
external interface EditRequestCookie {
    var filter: RequestCookie
    var modification: RequestCookie
}
external interface SetRequestHeader {
    var name: String
    var value: String
}
external interface RequestCookie {
    var name: String? get() = definedExternally; set(value) = definedExternally
    var value: String? get() = definedExternally; set(value) = definedExternally
}
external interface RedirectByRegEx {
    var to: String
    var from: String
}
external interface RedirectToTransparentImage
external interface AddRequestCookie {
    var cookie: RequestCookie
}
external interface RemoveRequestCookie {
    var filter: RequestCookie
}
external interface RequestedEvent : chrome.events.Event<Function<*>>
external var onRequest: RequestedEvent = definedExternally
