@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.downloads")
package chrome.downloads

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

external interface HeaderNameValuePair {
    var name: String
    var value: String
}
external interface DownloadOptions {
    var body: String? get() = definedExternally; set(value) = definedExternally
    var saveAs: Boolean? get() = definedExternally; set(value) = definedExternally
    var url: String
    var filename: String? get() = definedExternally; set(value) = definedExternally
    var headers: Array<HeaderNameValuePair>? get() = definedExternally; set(value) = definedExternally
    var method: String? get() = definedExternally; set(value) = definedExternally
    var conflictAction: String? get() = definedExternally; set(value) = definedExternally
}
external interface DownloadDelta {
    var danger: StringDelta? get() = definedExternally; set(value) = definedExternally
    var url: StringDelta? get() = definedExternally; set(value) = definedExternally
    var totalBytes: DoubleDelta? get() = definedExternally; set(value) = definedExternally
    var filename: StringDelta? get() = definedExternally; set(value) = definedExternally
    var paused: BooleanDelta? get() = definedExternally; set(value) = definedExternally
    var state: StringDelta? get() = definedExternally; set(value) = definedExternally
    var mime: StringDelta? get() = definedExternally; set(value) = definedExternally
    var fileSize: DoubleDelta? get() = definedExternally; set(value) = definedExternally
    var startTime: DoubleDelta? get() = definedExternally; set(value) = definedExternally
    var error: StringDelta? get() = definedExternally; set(value) = definedExternally
    var endTime: DoubleDelta? get() = definedExternally; set(value) = definedExternally
    var id: Number
    var canResume: BooleanDelta? get() = definedExternally; set(value) = definedExternally
    var exists: BooleanDelta? get() = definedExternally; set(value) = definedExternally
}
external interface BooleanDelta {
    var current: Boolean? get() = definedExternally; set(value) = definedExternally
    var previous: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface DoubleDelta {
    var current: Number? get() = definedExternally; set(value) = definedExternally
    var previous: Number? get() = definedExternally; set(value) = definedExternally
}
external interface StringDelta {
    var current: String? get() = definedExternally; set(value) = definedExternally
    var previous: String? get() = definedExternally; set(value) = definedExternally
}
external interface DownloadItem {
    var bytesReceived: Number
    var danger: String
    var url: String
    var totalBytes: Number
    var filename: String
    var paused: Boolean
    var state: String
    var mime: String
    var fileSize: Number
    var startTime: String
    var error: String? get() = definedExternally; set(value) = definedExternally
    var endTime: String? get() = definedExternally; set(value) = definedExternally
    var id: Number
    var incognito: Boolean
    var referrer: String
    var estimatedEndTime: String? get() = definedExternally; set(value) = definedExternally
    var canResume: Boolean
    var exists: Boolean
    var byExtensionId: String? get() = definedExternally; set(value) = definedExternally
    var byExtensionName: String? get() = definedExternally; set(value) = definedExternally
}
external interface GetFileIconOptions {
    var size: Number? get() = definedExternally; set(value) = definedExternally
}
external interface DownloadQuery {
    var orderBy: Array<String>? get() = definedExternally; set(value) = definedExternally
    var urlRegex: String? get() = definedExternally; set(value) = definedExternally
    var endedBefore: Number? get() = definedExternally; set(value) = definedExternally
    var totalBytesGreater: Number? get() = definedExternally; set(value) = definedExternally
    var danger: String? get() = definedExternally; set(value) = definedExternally
    var totalBytes: Number? get() = definedExternally; set(value) = definedExternally
    var paused: Boolean? get() = definedExternally; set(value) = definedExternally
    var filenameRegex: String? get() = definedExternally; set(value) = definedExternally
    var query: Array<String>? get() = definedExternally; set(value) = definedExternally
    var totalBytesLess: Number? get() = definedExternally; set(value) = definedExternally
    var id: Number? get() = definedExternally; set(value) = definedExternally
    var bytesReceived: Number? get() = definedExternally; set(value) = definedExternally
    var endedAfter: Number? get() = definedExternally; set(value) = definedExternally
    var filename: String? get() = definedExternally; set(value) = definedExternally
    var state: String? get() = definedExternally; set(value) = definedExternally
    var startedAfter: Number? get() = definedExternally; set(value) = definedExternally
    var mime: String? get() = definedExternally; set(value) = definedExternally
    var fileSize: Number? get() = definedExternally; set(value) = definedExternally
    var startTime: Number? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var startedBefore: Number? get() = definedExternally; set(value) = definedExternally
    var limit: Number? get() = definedExternally; set(value) = definedExternally
    var error: Number? get() = definedExternally; set(value) = definedExternally
    var endTime: Number? get() = definedExternally; set(value) = definedExternally
    var exists: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface DownloadFilenameSuggestion {
    var filename: String
    var conflictAction: String? get() = definedExternally; set(value) = definedExternally
}
external interface DownloadChangedEvent : chrome.events.Event<(downloadDelta: DownloadDelta) -> Unit>
external interface DownloadCreatedEvent : chrome.events.Event<(downloadItem: DownloadItem) -> Unit>
external interface DownloadErasedEvent : chrome.events.Event<(downloadId: Number) -> Unit>
external interface DownloadDeterminingFilenameEvent : chrome.events.Event<(downloadItem: DownloadItem, suggest: (suggestion: DownloadFilenameSuggestion? /*= null*/) -> Unit) -> Unit>
external fun search(query: DownloadQuery, callback: (results: Array<DownloadItem>) -> Unit): Unit = definedExternally
external fun pause(downloadId: Number, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getFileIcon(downloadId: Number, callback: (iconURL: String) -> Unit): Unit = definedExternally
external fun getFileIcon(downloadId: Number, options: GetFileIconOptions, callback: (iconURL: String) -> Unit): Unit = definedExternally
external fun resume(downloadId: Number, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun cancel(downloadId: Number, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun download(options: DownloadOptions, callback: ((downloadId: Number) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun open(downloadId: Number): Unit = definedExternally
external fun show(downloadId: Number): Unit = definedExternally
external fun showDefaultFolder(): Unit = definedExternally
external fun erase(query: DownloadQuery, callback: (erasedIds: Array<Number>) -> Unit): Unit = definedExternally
external fun removeFile(downloadId: Number, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun acceptDanger(downloadId: Number, callback: () -> Unit): Unit = definedExternally
external fun drag(downloadId: Number): Unit = definedExternally
external fun setShelfEnabled(enabled: Boolean): Unit = definedExternally
external var onChanged: DownloadChangedEvent = definedExternally
external var onCreated: DownloadCreatedEvent = definedExternally
external var onErased: DownloadErasedEvent = definedExternally
external var onDeterminingFilename: DownloadDeterminingFilenameEvent = definedExternally
