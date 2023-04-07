@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.contentSettings")
package chrome.contentSettings

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

external interface ClearDetails {
    var scope: String? get() = definedExternally; set(value) = definedExternally
}
external interface SetDetails {
    var resourceIdentifier: ResourceIdentifier? get() = definedExternally; set(value) = definedExternally
    var setting: Any
    var secondaryPattern: String? get() = definedExternally; set(value) = definedExternally
    var scope: String? get() = definedExternally; set(value) = definedExternally
    var primaryPattern: String
}
external interface GetDetails {
    var secondaryUrl: String? get() = definedExternally; set(value) = definedExternally
    var resourceIdentifier: ResourceIdentifier? get() = definedExternally; set(value) = definedExternally
    var incognito: Boolean? get() = definedExternally; set(value) = definedExternally
    var primaryUrl: String
}
external interface ReturnedDetails {
    var setting: Any
}
external interface ContentSetting {
    fun clear(details: ClearDetails, callback: (() -> Unit)? = definedExternally /* null */)
    fun set(details: SetDetails, callback: (() -> Unit)? = definedExternally /* null */)
    fun getResourceIdentifiers(callback: (resourceIdentifiers: Array<ResourceIdentifier>? /*= null*/) -> Unit)
    fun get(details: GetDetails, callback: (details: ReturnedDetails) -> Unit)
}
external interface ResourceIdentifier {
    var id: String
    var description: String? get() = definedExternally; set(value) = definedExternally
}
external var cookies: ContentSetting = definedExternally
external var popups: ContentSetting = definedExternally
external var javascript: ContentSetting = definedExternally
external var notifications: ContentSetting = definedExternally
external var plugins: ContentSetting = definedExternally
external var images: ContentSetting = definedExternally
external var location: ContentSetting = definedExternally
external var fullscreen: ContentSetting = definedExternally
external var mouselock: ContentSetting = definedExternally
external var unsandboxedPlugins: ContentSetting = definedExternally
external var automaticDownloads: ContentSetting = definedExternally
