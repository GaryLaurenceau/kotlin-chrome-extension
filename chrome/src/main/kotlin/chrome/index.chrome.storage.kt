@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.storage")
package chrome.storage

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

external interface StorageArea {
    fun getBytesInUse(callback: (bytesInUse: Number) -> Unit)
    fun getBytesInUse(keys: String, callback: (bytesInUse: Number) -> Unit)
    fun getBytesInUse(keys: Array<String>, callback: (bytesInUse: Number) -> Unit)
    fun getBytesInUse(keys: Nothing?, callback: (bytesInUse: Number) -> Unit)
    fun clear(callback: (() -> Unit)? = definedExternally /* null */)
    fun set(items: Any, callback: (() -> Unit)? = definedExternally /* null */)
    fun remove(keys: String, callback: (() -> Unit)? = definedExternally /* null */)
    fun remove(keys: Array<String>, callback: (() -> Unit)? = definedExternally /* null */)
    fun remove(keys: Nothing?, callback: (() -> Unit)? = definedExternally /* null */)
    fun get(callback: (items: Json) -> Unit)
    fun get(keys: String, callback: (items: Json) -> Unit)
    fun get(keys: Any, callback: (items: Json) -> Unit)
    fun get(keys: Array<String>, callback: (items: Json) -> Unit)
    fun get(keys: Nothing?, callback: (items: Json) -> Unit)
}
external interface StorageChange {
    var newValue: Any? get() = definedExternally; set(value) = definedExternally
    var oldValue: Any? get() = definedExternally; set(value) = definedExternally
}
external interface LocalStorageArea : StorageArea {
    var QUOTA_BYTES: Number
}
external interface SyncStorageArea : StorageArea {
    var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Number
    var QUOTA_BYTES: Number
    var QUOTA_BYTES_PER_ITEM: Number
    var MAX_ITEMS: Number
    var MAX_WRITE_OPERATIONS_PER_HOUR: Number
    var MAX_WRITE_OPERATIONS_PER_MINUTE: Number
}
external interface `T$33` {
    @nativeGetter
    operator fun get(key: String): StorageChange?
    @nativeSetter
    operator fun set(key: String, value: StorageChange)
}
external interface StorageChangedEvent : chrome.events.Event<(changes: `T$33`, areaName: String) -> Unit>
external var local: LocalStorageArea = definedExternally
external var sync: SyncStorageArea = definedExternally
external var managed: StorageArea = definedExternally
external var onChanged: StorageChangedEvent = definedExternally
