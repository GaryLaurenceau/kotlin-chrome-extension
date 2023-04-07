@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.proxy")
package chrome.proxy

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

external interface PacScript {
    var url: String? get() = definedExternally; set(value) = definedExternally
    var mandatory: Boolean? get() = definedExternally; set(value) = definedExternally
    var data: String? get() = definedExternally; set(value) = definedExternally
}
external interface ProxyConfig {
    var rules: ProxyRules? get() = definedExternally; set(value) = definedExternally
    var pacScript: PacScript? get() = definedExternally; set(value) = definedExternally
    var mode: String
}
external interface ProxyServer {
    var host: String
    var scheme: String? get() = definedExternally; set(value) = definedExternally
    var port: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ProxyRules {
    var proxyForFtp: ProxyServer? get() = definedExternally; set(value) = definedExternally
    var proxyForHttp: ProxyServer? get() = definedExternally; set(value) = definedExternally
    var fallbackProxy: ProxyServer? get() = definedExternally; set(value) = definedExternally
    var singleProxy: ProxyServer? get() = definedExternally; set(value) = definedExternally
    var proxyForHttps: ProxyServer? get() = definedExternally; set(value) = definedExternally
    var bypassList: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface ErrorDetails {
    var details: String
    var error: String
    var fatal: Boolean
}
external interface ProxyErrorEvent : chrome.events.Event<(details: ErrorDetails) -> Unit>
external var settings: chrome.types.ChromeSetting = definedExternally
external var onProxyError: ProxyErrorEvent = definedExternally
