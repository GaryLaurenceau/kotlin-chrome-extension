@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.scriptBadge")
package chrome.scriptBadge

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

external interface GetPopupDetails {
    var tabId: Number
}
external interface AttentionDetails {
    var tabId: Number
}
external interface SetPopupDetails {
    var tabId: Number
    var popup: String
}
external interface ScriptBadgeClickedEvent : chrome.events.Event<(tab: chrome.tabs.Tab) -> Unit>
external fun getPopup(details: GetPopupDetails, callback: Function<*>): Unit = definedExternally
external fun getAttention(details: AttentionDetails): Unit = definedExternally
external fun setPopup(details: SetPopupDetails): Unit = definedExternally
external var onClicked: ScriptBadgeClickedEvent = definedExternally
