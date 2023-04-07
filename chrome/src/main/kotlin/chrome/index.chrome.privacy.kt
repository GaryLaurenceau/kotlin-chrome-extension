@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.privacy")
package chrome.privacy

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

external interface Services {
    var spellingServiceEnabled: chrome.types.ChromeSetting
    var searchSuggestEnabled: chrome.types.ChromeSetting
    var instantEnabled: chrome.types.ChromeSetting
    var alternateErrorPagesEnabled: chrome.types.ChromeSetting
    var safeBrowsingEnabled: chrome.types.ChromeSetting
    var autofillEnabled: chrome.types.ChromeSetting
    var translationServiceEnabled: chrome.types.ChromeSetting
    var passwordSavingEnabled: chrome.types.ChromeSetting
    var hotwordSearchEnabled: chrome.types.ChromeSetting
    var safeBrowsingExtendedReportingEnabled: chrome.types.ChromeSetting
}
external interface Network {
    var networkPredictionEnabled: chrome.types.ChromeSetting
    var webRTCMultipleRoutesEnabled: chrome.types.ChromeSetting
    var webRTCNonProxiedUdpEnabled: chrome.types.ChromeSetting
}
external interface Websites {
    var thirdPartyCookiesAllowed: chrome.types.ChromeSetting
    var referrersEnabled: chrome.types.ChromeSetting
    var hyperlinkAuditingEnabled: chrome.types.ChromeSetting
    var protectedContentEnabled: chrome.types.ChromeSetting
}
external var services: Services = definedExternally
external var network: Network = definedExternally
external var websites: Websites = definedExternally
