@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.gcm")
package chrome.gcm

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

external interface OutgoingMessage {
    var destinationId: String
    var messageId: String
    var timeToLive: Number? get() = definedExternally; set(value) = definedExternally
    var data: Any
}
external interface IncomingMessage {
    var data: Any
    var from: String? get() = definedExternally; set(value) = definedExternally
    var collapseKey: String? get() = definedExternally; set(value) = definedExternally
}
external interface GcmError {
    var errorMessage: String
    var messageId: String? get() = definedExternally; set(value) = definedExternally
    var detail: Any
}
external interface MessageReceptionEvent : chrome.events.Event<(message: IncomingMessage) -> Unit>
external interface MessageDeletionEvent : chrome.events.Event<() -> Unit>
external interface GcmErrorEvent : chrome.events.Event<(error: GcmError) -> Unit>
external var MAX_MESSAGE_SIZE: Number = definedExternally
external fun register(senderIds: Array<String>, callback: (registrationId: String) -> Unit): Unit = definedExternally
external fun unregister(callback: () -> Unit): Unit = definedExternally
external fun send(message: OutgoingMessage, callback: (messageId: String) -> Unit): Unit = definedExternally
external var onMessage: MessageReceptionEvent = definedExternally
external var onMessagesDeleted: MessageDeletionEvent = definedExternally
external var onSendError: GcmErrorEvent = definedExternally
