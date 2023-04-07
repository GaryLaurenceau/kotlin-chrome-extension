@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.devtools.network")
package chrome.devtools.network

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

external interface Request {
    fun getContent(callback: (content: String, encoding: String) -> Unit)
}
external interface RequestFinishedEvent : chrome.events.Event<(request: Request) -> Unit>
external interface NavigatedEvent : chrome.events.Event<(url: String) -> Unit>
external fun getHAR(callback: (harLog: Any) -> Unit): Unit = definedExternally
external var onRequestFinished: RequestFinishedEvent = definedExternally
external var onNavigated: NavigatedEvent = definedExternally
