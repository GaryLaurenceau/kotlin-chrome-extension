@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.printerProvider")
package chrome.printerProvider

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

external interface PrinterInfo {
    var id: String
    var name: String
    var description: String? get() = definedExternally; set(value) = definedExternally
}
external interface PrinterCapabilities {
    var capabilities: Any
}
external interface PrintJob {
    var printerId: String
    var title: String
    var ticket: Any
    var contentType: String
    var document: Blob
}
external interface PrinterRequestedEvent : chrome.events.Event<(resultCallback: (printerInfo: Array<PrinterInfo>) -> Unit) -> Unit>
external interface PrinterInfoRequestedEvent : chrome.events.Event<(device: Any, resultCallback: (printerInfo: PrinterInfo? /*= null*/) -> Unit) -> Unit>
external interface CapabilityRequestedEvent : chrome.events.Event<(printerId: String, resultCallback: (capabilities: PrinterCapabilities) -> Unit) -> Unit>
external interface PrintRequestedEvent : chrome.events.Event<(printJob: PrintJob, resultCallback: (result: String) -> Unit) -> Unit>
external var onGetPrintersRequested: PrinterRequestedEvent = definedExternally
external var onGetUsbPrinterInfoRequested: PrinterInfoRequestedEvent = definedExternally
external var onGetCapabilityRequested: CapabilityRequestedEvent = definedExternally
external var onPrintRequested: PrintRequestedEvent = definedExternally
