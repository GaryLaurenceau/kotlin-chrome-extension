@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.browsingData")
package chrome.browsingData

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

external interface OriginTypes {
    var protectedWeb: Boolean? get() = definedExternally; set(value) = definedExternally
    var extension: Boolean? get() = definedExternally; set(value) = definedExternally
    var unprotectedWeb: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface RemovalOptions {
    var originTypes: OriginTypes? get() = definedExternally; set(value) = definedExternally
    var since: Number? get() = definedExternally; set(value) = definedExternally
}
external interface DataTypeSet {
    var webSQL: Boolean? get() = definedExternally; set(value) = definedExternally
    var indexedDB: Boolean? get() = definedExternally; set(value) = definedExternally
    var cookies: Boolean? get() = definedExternally; set(value) = definedExternally
    var passwords: Boolean? get() = definedExternally; set(value) = definedExternally
    var serverBoundCertificates: Boolean? get() = definedExternally; set(value) = definedExternally
    var downloads: Boolean? get() = definedExternally; set(value) = definedExternally
    var cache: Boolean? get() = definedExternally; set(value) = definedExternally
    var appcache: Boolean? get() = definedExternally; set(value) = definedExternally
    var fileSystems: Boolean? get() = definedExternally; set(value) = definedExternally
    var pluginData: Boolean? get() = definedExternally; set(value) = definedExternally
    var localStorage: Boolean? get() = definedExternally; set(value) = definedExternally
    var formData: Boolean? get() = definedExternally; set(value) = definedExternally
    var history: Boolean? get() = definedExternally; set(value) = definedExternally
    var serviceWorkers: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface SettingsCallback {
    var options: RemovalOptions
    var dataToRemove: DataTypeSet
    var dataRemovalPermitted: DataTypeSet
}
external fun settings(callback: (result: SettingsCallback) -> Unit): Unit = definedExternally
external fun removePluginData(options: RemovalOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun removeFormData(options: RemovalOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun removeFileSystems(options: RemovalOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun remove(options: RemovalOptions, dataToRemove: DataTypeSet, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun removePasswords(options: RemovalOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun removeCookies(options: RemovalOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun removeWebSQL(options: RemovalOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun removeAppcache(options: RemovalOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun removeDownloads(options: RemovalOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun removeLocalStorage(options: RemovalOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun removeCache(options: RemovalOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun removeHistory(options: RemovalOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun removeIndexedDB(options: RemovalOptions, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
