@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.networking.config")
package chrome.networking.config

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

external interface NetworkInfo {
    var Type: String
    var GUID: String? get() = definedExternally; set(value) = definedExternally
    var HexSSID: String? get() = definedExternally; set(value) = definedExternally
    var SSID: String? get() = definedExternally; set(value) = definedExternally
    var BSSID: String? get() = definedExternally; set(value) = definedExternally
    var Security: String? get() = definedExternally; set(value) = definedExternally
}
external interface CaptivePorttalDetectedEvent : chrome.events.Event<(networkInfo: NetworkInfo) -> Unit>
external fun setNetworkFilter(networks: Array<NetworkInfo>, callback: () -> Unit): Unit = definedExternally
external fun finishAuthentication(GUID: String, result: String, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external var onCaptivePortalDetected: CaptivePorttalDetectedEvent = definedExternally
