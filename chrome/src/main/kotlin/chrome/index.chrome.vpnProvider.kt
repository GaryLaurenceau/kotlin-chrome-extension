@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.vpnProvider")
package chrome.vpnProvider

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

external interface VpnSessionParameters {
    var address: String
    var broadcastAddress: String? get() = definedExternally; set(value) = definedExternally
    var mtu: String? get() = definedExternally; set(value) = definedExternally
    var exclusionList: Array<String>
    var inclusionList: Array<String>
    var domainSearch: Array<String>? get() = definedExternally; set(value) = definedExternally
    var dnsServer: Array<String>
}
external interface VpnPlatformMessageEvent : chrome.events.Event<(id: String, message: String, error: String) -> Unit>
external interface VpnPacketReceptionEvent : chrome.events.Event<(data: ArrayBuffer) -> Unit>
external interface VpnConfigRemovalEvent : chrome.events.Event<(id: String) -> Unit>
external interface VpnConfigCreationEvent : chrome.events.Event<(id: String, name: String, data: Any) -> Unit>
external interface VpnUiEvent : chrome.events.Event<(event: String, id: String? /*= null*/) -> Unit>
external fun createConfig(name: String, callback: (id: String) -> Unit): Unit = definedExternally
external fun destroyConfig(id: String, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun setParameters(parameters: VpnSessionParameters, callback: Function<*>): Unit = definedExternally
external fun sendPacket(data: ArrayBuffer, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun notifyConnectionStateChanged(state: String, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external var onPlatformMessage: VpnPlatformMessageEvent = definedExternally
external var onPacketReceived: VpnPacketReceptionEvent = definedExternally
external var onConfigRemoved: VpnConfigRemovalEvent = definedExternally
external var onConfigCreated: VpnConfigCreationEvent = definedExternally
external var onUIEvent: VpnUiEvent = definedExternally
