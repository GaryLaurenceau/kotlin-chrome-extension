@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.system.storage")
package chrome.system.storage

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

external interface StorageUnitInfo {
    var id: String
    var name: String
    var type: String
    var capacity: Number
}
external interface StorageCapacityInfo {
    var id: String
    var availableCapacity: Number
}
external interface SystemStorageAttachedEvent : chrome.events.Event<(info: StorageUnitInfo) -> Unit>
external interface SystemStorageDetachedEvent : chrome.events.Event<(id: String) -> Unit>
external fun getInfo(callback: (info: Array<StorageUnitInfo>) -> Unit): Unit = definedExternally
external fun ejectDevice(id: String, callback: (result: String) -> Unit): Unit = definedExternally
external fun getAvailableCapacity(id: String, callback: (info: StorageCapacityInfo) -> Unit): Unit = definedExternally
external var onAttached: SystemStorageAttachedEvent = definedExternally
external var onDetached: SystemStorageDetachedEvent = definedExternally
