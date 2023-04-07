@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.tabCapture")
package chrome.tabCapture

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

external interface CaptureInfo {
    var tabId: Number
    var status: String
    var fullscreen: Boolean
}
external interface CaptureOptions {
    var audio: Boolean? get() = definedExternally; set(value) = definedExternally
    var video: Boolean? get() = definedExternally; set(value) = definedExternally
    var audioConstraints: MediaStreamConstraints? get() = definedExternally; set(value) = definedExternally
    var videoConstraints: MediaStreamConstraints? get() = definedExternally; set(value) = definedExternally
}
external interface CaptureStatusChangedEvent : chrome.events.Event<(info: CaptureInfo) -> Unit>
external fun capture(options: CaptureOptions, callback: (stream: MediaStream?) -> Unit): Unit = definedExternally
external fun getCapturedTabs(callback: (result: Array<CaptureInfo>) -> Unit): Unit = definedExternally
external var onStatusChanged: CaptureStatusChangedEvent = definedExternally
