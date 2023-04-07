@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.fileSystemProvider")
package chrome.fileSystemProvider

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

external interface OpenedFileInfo {
    var openRequestId: Number
    var filePath: String
    var mode: String
}
external interface FileWatchersInfo {
    var entryPath: String
    var recursive: Boolean
    var lastTag: String? get() = definedExternally; set(value) = definedExternally
}
external interface EntryMetadata {
    var isDirectory: Boolean
    var name: String
    var size: Number
    var modificationTime: Date
    var mimeType: String? get() = definedExternally; set(value) = definedExternally
    var thumbnail: String? get() = definedExternally; set(value) = definedExternally
}
external interface FileSystemInfo {
    var fileSystemId: String
    var displayName: String
    var writable: Boolean
    var openedFilesLimit: Number
    var openedFiles: Array<OpenedFileInfo>
    var supportsNotifyTag: Boolean? get() = definedExternally; set(value) = definedExternally
    var watchers: Array<FileWatchersInfo>
}
external interface GetActionsRequestedOptions {
    var fileSystemId: String
    var requestId: Number
    var entryPath: String
}
external interface Action {
    var id: String
    var title: String? get() = definedExternally; set(value) = definedExternally
}
external interface ExecuteActionRequestedOptions {
    var fileSystemId: String
    var requestId: Number
    var entryPath: String
    var actionId: String
}
external interface MountOptions {
    var fileSystemId: String
    var displayName: String
    var writable: Boolean? get() = definedExternally; set(value) = definedExternally
    var openedFilesLimit: Number? get() = definedExternally; set(value) = definedExternally
    var supportsNotifyTag: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface UnmountOptions {
    var fileSystemId: String
}
external interface NotificationChange {
    var entryPath: String
    var changeType: String
}
external interface NotificationOptions {
    var fileSystemId: String
    var observedPath: String
    var recursive: Boolean
    var changeType: String
    var changes: Array<NotificationChange>? get() = definedExternally; set(value) = definedExternally
    var tag: String? get() = definedExternally; set(value) = definedExternally
}
external interface RequestedEventOptions {
    var fileSystemId: String
    var requestId: Number
}
external interface EntryPathRequestedEventOptions : RequestedEventOptions {
    var entryPath: String
}
external interface MetadataRequestedEventOptions : EntryPathRequestedEventOptions {
    var thumbnail: Boolean
}
external interface DirectoryPathRequestedEventOptions : RequestedEventOptions {
    var directoryPath: String
}
external interface FilePathRequestedEventOptions : RequestedEventOptions {
    var filePath: String
}
external interface OpenFileRequestedEventOptions : FilePathRequestedEventOptions {
    var mode: String
}
external interface OpenedFileRequestedEventOptions : RequestedEventOptions {
    var openRequestId: Number
}
external interface OpenedFileOffsetRequestedEventOptions : OpenedFileRequestedEventOptions {
    var offset: Number
    var length: Number
}
external interface DirectoryPathRecursiveRequestedEventOptions : DirectoryPathRequestedEventOptions {
    var recursive: Boolean
}
external interface EntryPathRecursiveRequestedEventOptions : EntryPathRequestedEventOptions {
    var recursive: Boolean
}
external interface SourceTargetPathRequestedEventOptions : RequestedEventOptions {
    var sourcePath: String
    var targetPath: String
}
external interface FilePathLengthRequestedEventOptions : FilePathRequestedEventOptions {
    var length: Number
}
external interface OpenedFileIoRequestedEventOptions : OpenedFileRequestedEventOptions {
    var offset: Number
    var data: ArrayBuffer
}
external interface OperationRequestedEventOptions : RequestedEventOptions {
    var operationRequestId: Number
}
external interface RequestedEvent : chrome.events.Event<(options: RequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>
external interface MetadataRequestedEvent : chrome.events.Event<(options: MetadataRequestedEventOptions, successCallback: (metadata: EntryMetadata) -> Unit, errorCallback: (error: String) -> Unit) -> Unit>
external interface DirectoryPathRequestedEvent : chrome.events.Event<(options: DirectoryPathRequestedEventOptions, successCallback: (entries: Array<EntryMetadata>, hasMore: Boolean) -> Unit, errorCallback: (error: String) -> Unit) -> Unit>
external interface OpenFileRequestedEvent : chrome.events.Event<(options: OpenFileRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>
external interface OpenedFileRequestedEvent : chrome.events.Event<(options: OpenedFileRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>
external interface OpenedFileOffsetRequestedEvent : chrome.events.Event<(options: OpenedFileOffsetRequestedEventOptions, successCallback: (data: ArrayBuffer, hasMore: Boolean) -> Unit, errorCallback: (error: String) -> Unit) -> Unit>
external interface DirectoryPathRecursiveRequestedEvent : chrome.events.Event<(options: DirectoryPathRecursiveRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>
external interface EntryPathRecursiveRequestedEvent : chrome.events.Event<(options: EntryPathRecursiveRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>
external interface FilePathRequestedEvent : chrome.events.Event<(options: FilePathRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>
external interface SourceTargetPathRequestedEvent : chrome.events.Event<(options: SourceTargetPathRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>
external interface FilePathLengthRequestedEvent : chrome.events.Event<(options: FilePathLengthRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>
external interface OpenedFileIoRequestedEvent : chrome.events.Event<(options: OpenedFileIoRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>
external interface OperationRequestedEvent : chrome.events.Event<(options: OperationRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>
external interface OptionlessRequestedEvent : chrome.events.Event<(successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>
external fun mount(options: MountOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun unmount(options: UnmountOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getAll(callback: (fileSystems: Array<FileSystemInfo>) -> Unit): Unit = definedExternally
external fun get(fileSystemId: String, callback: (fileSystem: FileSystemInfo) -> Unit): Unit = definedExternally
external fun notify(options: NotificationOptions, callback: () -> Unit): Unit = definedExternally
external var onUnmountRequested: RequestedEvent = definedExternally
external var onGetMetadataRequested: MetadataRequestedEvent = definedExternally
external var onReadDirectoryRequested: DirectoryPathRequestedEvent = definedExternally
external var onOpenFileRequested: OpenFileRequestedEvent = definedExternally
external var onCloseFileRequested: OpenedFileRequestedEvent = definedExternally
external var onReadFileRequested: OpenedFileOffsetRequestedEvent = definedExternally
external var onCreateDirectoryRequested: DirectoryPathRecursiveRequestedEvent = definedExternally
external var onDeleteEntryRequested: EntryPathRecursiveRequestedEvent = definedExternally
external var onCreateFileRequested: FilePathRequestedEvent = definedExternally
external var onCopyEntryRequested: SourceTargetPathRequestedEvent = definedExternally
external var onMoveEntryRequested: SourceTargetPathRequestedEvent = definedExternally
external var onTruncateRequested: FilePathLengthRequestedEvent = definedExternally
external var onWriteFileRequested: OpenedFileIoRequestedEvent = definedExternally
external var onAbortRequested: OperationRequestedEvent = definedExternally
external var onConfigureRequested: RequestedEvent = definedExternally
external var onMountRequested: OptionlessRequestedEvent = definedExternally
external var onAddWatcherRequested: EntryPathRecursiveRequestedEvent = definedExternally
external var onRemoveWatcherRequested: EntryPathRecursiveRequestedEvent = definedExternally
