@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.webstore")
package chrome.webstore

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

external fun install(url: String, successCallback: Function<*>? = definedExternally /* null */, failureCallback: ((error: String, errorCode: String? /*= null*/) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun install(successCallback: Function<*>, failureCallback: ((error: String, errorCode: String? /*= null*/) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun install(failureCallback: ((error: String, errorCode: String? /*= null*/) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external interface InstallationStageEvent : chrome.events.Event<(stage: String) -> Unit>
external interface DownloadProgressEvent : chrome.events.Event<(percentDownloaded: Number) -> Unit>
external var onInstallStageChanged: InstallationStageEvent = definedExternally
external var onDownloadProgress: DownloadProgressEvent = definedExternally
