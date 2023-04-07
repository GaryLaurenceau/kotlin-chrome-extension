@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.socket")
package chrome.socket

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

external interface CreateInfo {
    var socketId: Number
}
external interface AcceptInfo {
    var resultCode: Number
    var socketId: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ReadInfo {
    var resultCode: Number
    var data: ArrayBuffer
}
external interface WriteInfo {
    var bytesWritten: Number
}
external interface RecvFromInfo {
    var resultCode: Number
    var data: ArrayBuffer
    var port: Number
    var address: String
}
external interface SocketInfo {
    var socketType: String
    var localPort: Number? get() = definedExternally; set(value) = definedExternally
    var peerAddress: String? get() = definedExternally; set(value) = definedExternally
    var peerPort: Number? get() = definedExternally; set(value) = definedExternally
    var localAddress: String? get() = definedExternally; set(value) = definedExternally
    var connected: Boolean
}
external interface NetworkInterface {
    var name: String
    var address: String
}
external fun create(type: String, options: Any? = definedExternally /* null */, callback: ((createInfo: CreateInfo) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun destroy(socketId: Number): Unit = definedExternally
external fun connect(socketId: Number, hostname: String, port: Number, callback: (result: Number) -> Unit): Unit = definedExternally
external fun bind(socketId: Number, address: String, port: Number, callback: (result: Number) -> Unit): Unit = definedExternally
external fun disconnect(socketId: Number): Unit = definedExternally
external fun read(socketId: Number, bufferSize: Number? = definedExternally /* null */, callback: ((readInfo: ReadInfo) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun write(socketId: Number, data: ArrayBuffer, callback: ((writeInfo: WriteInfo) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun recvFrom(socketId: Number, bufferSize: Number? = definedExternally /* null */, callback: ((recvFromInfo: RecvFromInfo) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun sendTo(socketId: Number, data: ArrayBuffer, address: String, port: Number, callback: ((writeInfo: WriteInfo) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun listen(socketId: Number, address: String, port: Number, backlog: Number? = definedExternally /* null */, callback: ((result: Number) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun accept(socketId: Number, callback: ((acceptInfo: AcceptInfo) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setKeepAlive(socketId: Number, enable: Boolean, delay: Number? = definedExternally /* null */, callback: ((result: Boolean) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setNoDelay(socketId: Number, noDelay: Boolean, callback: ((result: Boolean) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getInfo(socketId: Number, callback: (result: SocketInfo) -> Unit): Unit = definedExternally
external fun getNetworkList(callback: (result: Array<NetworkInterface>) -> Unit): Unit = definedExternally
