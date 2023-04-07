@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.management")
package chrome.management

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

external interface ExtensionInfo {
    var disabledReason: String? get() = definedExternally; set(value) = definedExternally
    var appLaunchUrl: String? get() = definedExternally; set(value) = definedExternally
    var description: String
    var permissions: Array<String>
    var icons: Array<IconInfo>? get() = definedExternally; set(value) = definedExternally
    var hostPermissions: Array<String>
    var enabled: Boolean
    var homepageUrl: String? get() = definedExternally; set(value) = definedExternally
    var mayDisable: Boolean
    var installType: String
    var version: String
    var id: String
    var offlineEnabled: Boolean
    var updateUrl: String? get() = definedExternally; set(value) = definedExternally
    var type: String
    var optionsUrl: String
    var name: String
    var shortName: String
    var isApp: Boolean
    var launchType: String? get() = definedExternally; set(value) = definedExternally
    var availableLaunchTypes: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface IconInfo {
    var url: String
    var size: Number
}
external interface UninstallOptions {
    var showConfirmDialog: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ManagementDisabledEvent : chrome.events.Event<(info: ExtensionInfo) -> Unit>
external interface ManagementUninstalledEvent : chrome.events.Event<(id: String) -> Unit>
external interface ManagementInstalledEvent : chrome.events.Event<(info: ExtensionInfo) -> Unit>
external interface ManagementEnabledEvent : chrome.events.Event<(info: ExtensionInfo) -> Unit>
external fun setEnabled(id: String, enabled: Boolean, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getPermissionWarningsById(id: String, callback: ((permissionWarnings: Array<String>) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun get(id: String, callback: ((result: ExtensionInfo) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getAll(callback: ((result: Array<ExtensionInfo>) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getPermissionWarningsByManifest(manifestStr: String, callback: ((permissionwarnings: Array<String>) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun launchApp(id: String, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun uninstall(id: String, options: UninstallOptions? = definedExternally /* null */, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun uninstall(id: String, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getSelf(callback: ((result: ExtensionInfo) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun uninstallSelf(options: UninstallOptions? = definedExternally /* null */, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun uninstallSelf(callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun createAppShortcut(id: String, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setLaunchType(id: String, launchType: String, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun generateAppForLink(url: String, title: String, callback: ((result: ExtensionInfo) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external var onDisabled: ManagementDisabledEvent = definedExternally
external var onUninstalled: ManagementUninstalledEvent = definedExternally
external var onInstalled: ManagementInstalledEvent = definedExternally
external var onEnabled: ManagementEnabledEvent = definedExternally
external fun uninstall(id: String): Unit = definedExternally
external fun uninstallSelf(): Unit = definedExternally
