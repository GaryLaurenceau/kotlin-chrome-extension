@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.platformKeys")
package chrome.platformKeys

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

external interface Match {
    var certificate: ArrayBuffer
    var keyAlgorithm: KeyAlgorithm
}
external interface ClientCertificateSelectRequestDetails {
    var certificateTypes: Array<String>
    var certificateAuthorities: Array<ArrayBuffer>
}
external interface ClientCertificateSelectDetails {
    var request: ClientCertificateSelectRequestDetails
    var clientCerts: Array<ArrayBuffer>? get() = definedExternally; set(value) = definedExternally
    var interactive: Boolean
}
external interface ServerCertificateVerificationDetails {
    var serverCertificateChain: Array<ArrayBuffer>
    var hostname: String
}
external interface ServerCertificateVerificationResult {
    var trusted: Boolean
    var debug_errors: Array<String>
}
external fun selectClientCertificates(details: ClientCertificateSelectDetails, callback: (matches: Array<Match>) -> Unit): Unit = definedExternally
external fun getKeyPair(certificate: ArrayBuffer, parameters: Any, callback: (publicKey: CryptoKey, privateKey: CryptoKey?) -> Unit): Unit = definedExternally
external fun subtleCrypto(): SubtleCrypto = definedExternally
external fun verifyTLSServerCertificate(details: ServerCertificateVerificationDetails, callback: (result: ServerCertificateVerificationResult) -> Unit): Unit = definedExternally
