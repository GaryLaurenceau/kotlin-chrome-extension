@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.identity")
package chrome.identity

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

external interface AccountInfo {
    var id: String
}
external interface TokenDetails {
    var interactive: Boolean? get() = definedExternally; set(value) = definedExternally
    var account: AccountInfo? get() = definedExternally; set(value) = definedExternally
    var scopes: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface UserInfo {
    var email: String
    var id: String
}
external interface TokenInformation {
    var token: String
}
external interface WebAuthFlowOptions {
    var url: String
    var interactive: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface SignInChangeEvent : chrome.events.Event<(account: AccountInfo, signedIn: Boolean) -> Unit>
external fun getAccounts(callback: (accounts: Array<AccountInfo>) -> Unit): Unit = definedExternally
external fun getAuthToken(details: TokenDetails, callback: ((token: String) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getProfileUserInfo(callback: (userInfo: UserInfo) -> Unit): Unit = definedExternally
external fun removeCachedAuthToken(details: TokenInformation, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun launchWebAuthFlow(details: WebAuthFlowOptions, callback: (responseUrl: String? /*= null*/) -> Unit): Unit = definedExternally
external fun getRedirectURL(path: String? = definedExternally /* null */): String = definedExternally
external var onSignInChanged: SignInChangeEvent = definedExternally
