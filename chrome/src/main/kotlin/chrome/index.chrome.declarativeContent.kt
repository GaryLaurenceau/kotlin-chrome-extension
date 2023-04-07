@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.declarativeContent")
package chrome.declarativeContent

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

external interface PageStateUrlDetails {
    var hostContains: String? get() = definedExternally; set(value) = definedExternally
    var hostEquals: String? get() = definedExternally; set(value) = definedExternally
    var hostPrefix: String? get() = definedExternally; set(value) = definedExternally
    var hostSuffix: String? get() = definedExternally; set(value) = definedExternally
    var pathContains: String? get() = definedExternally; set(value) = definedExternally
    var pathEquals: String? get() = definedExternally; set(value) = definedExternally
    var pathPrefix: String? get() = definedExternally; set(value) = definedExternally
    var pathSuffix: String? get() = definedExternally; set(value) = definedExternally
    var queryContains: String? get() = definedExternally; set(value) = definedExternally
    var queryEquals: String? get() = definedExternally; set(value) = definedExternally
    var queryPrefix: String? get() = definedExternally; set(value) = definedExternally
    var querySuffix: String? get() = definedExternally; set(value) = definedExternally
    var urlContains: String? get() = definedExternally; set(value) = definedExternally
    var urlEquals: String? get() = definedExternally; set(value) = definedExternally
    var urlMatches: String? get() = definedExternally; set(value) = definedExternally
    var originAndPathMatches: String? get() = definedExternally; set(value) = definedExternally
    var urlPrefix: String? get() = definedExternally; set(value) = definedExternally
    var urlSuffix: String? get() = definedExternally; set(value) = definedExternally
    var schemes: Array<String>? get() = definedExternally; set(value) = definedExternally
    var ports: Array<dynamic /* Number | Array<Number> */>? get() = definedExternally; set(value) = definedExternally
}
external open class PageStateMatcherProperties {
    open var pageUrl: PageStateUrlDetails = definedExternally
    open var css: Array<String> = definedExternally
    open var isBookmarked: Boolean = definedExternally
}
external open class PageStateMatcher(options: PageStateMatcherProperties)
external open class ShowPageAction
external interface PageChangedEvent : chrome.events.Event<() -> Unit>
external var onPageChanged: PageChangedEvent = definedExternally
