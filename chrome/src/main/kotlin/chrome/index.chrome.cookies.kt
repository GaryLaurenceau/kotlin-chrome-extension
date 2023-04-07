@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.cookies")
package chrome.cookies

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

external interface Cookie {
    var domain: String
    var name: String
    var storeId: String
    var value: String
    var session: Boolean
    var hostOnly: Boolean
    var expirationDate: Number? get() = definedExternally; set(value) = definedExternally
    var path: String
    var httpOnly: Boolean
    var secure: Boolean
}
external interface CookieStore {
    var id: String
    var tabIds: Array<Number>
}
external interface GetAllDetails {
    var domain: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var storeId: String? get() = definedExternally; set(value) = definedExternally
    var session: Boolean? get() = definedExternally; set(value) = definedExternally
    var path: String? get() = definedExternally; set(value) = definedExternally
    var secure: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface SetDetails {
    var domain: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var url: String
    var storeId: String? get() = definedExternally; set(value) = definedExternally
    var value: String? get() = definedExternally; set(value) = definedExternally
    var expirationDate: Number? get() = definedExternally; set(value) = definedExternally
    var path: String? get() = definedExternally; set(value) = definedExternally
    var httpOnly: Boolean? get() = definedExternally; set(value) = definedExternally
    var secure: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface Details {
    var name: String
    var url: String
    var storeId: String? get() = definedExternally; set(value) = definedExternally
}
external interface CookieChangeInfo {
    var cookie: Cookie
    var removed: Boolean
    var cause: String
}
external interface CookieChangedEvent : chrome.events.Event<(changeInfo: CookieChangeInfo) -> Unit>
external fun getAllCookieStores(callback: (cookieStores: Array<CookieStore>) -> Unit): Unit = definedExternally
external fun getAll(details: GetAllDetails, callback: (cookies: Array<Cookie>) -> Unit): Unit = definedExternally
external fun set(details: SetDetails, callback: ((cookie: Cookie?) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun remove(details: Details, callback: ((details: Details) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun get(details: Details, callback: (cookie: Cookie?) -> Unit): Unit = definedExternally
external var onChanged: CookieChangedEvent = definedExternally
