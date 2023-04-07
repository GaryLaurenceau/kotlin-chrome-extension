@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.i18n")
package chrome.i18n

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

external interface DetectedLanguage {
    var language: String
    var percentage: Number
}
external interface LanguageDetectionResult {
    var isReliable: Boolean
    var languages: Array<DetectedLanguage>
}
external fun getAcceptLanguages(callback: (languages: Array<String>) -> Unit): Unit = definedExternally
external fun getMessage(messageName: String, substitutions: Any? = definedExternally /* null */): String = definedExternally
external fun getUILanguage(): String = definedExternally
external fun detectLanguage(text: String, callback: (result: LanguageDetectionResult) -> Unit): Unit = definedExternally
