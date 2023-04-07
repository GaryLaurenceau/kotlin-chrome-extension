@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.runtime")
package chrome.runtime

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

external var lastError: LastError? = definedExternally
external var id: String = definedExternally
external interface LastError {
    var message: String? get() = definedExternally; set(value) = definedExternally
}
external interface ConnectInfo {
    var name: String? get() = definedExternally; set(value) = definedExternally
}
external interface InstalledDetails {
    var reason: String
    var previousVersion: String? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessageOptions {
    var includeTlsChannelId: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface MessageSender {
    var id: String? get() = definedExternally; set(value) = definedExternally
    var tab: chrome.tabs.Tab? get() = definedExternally; set(value) = definedExternally
    var frameId: Number? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var tlsChannelId: String? get() = definedExternally; set(value) = definedExternally
}
external interface PlatformInfo {
    var os: String
    var arch: String
    var nacl_arch: String
}
external interface Port {
    var postMessage: (message: Any) -> Unit
    var disconnect: () -> Unit
    var sender: MessageSender? get() = definedExternally; set(value) = definedExternally
    var onDisconnect: PortDisconnectEvent
    var onMessage: PortMessageEvent
    var name: String
}
external interface UpdateAvailableDetails {
    var version: String
}
external interface UpdateCheckDetails {
    var version: String
}
external interface PortDisconnectEvent : chrome.events.Event<(port: Port) -> Unit>
external interface PortMessageEvent : chrome.events.Event<(message: Any, port: Port) -> Unit>
external interface ExtensionMessageEvent : chrome.events.Event<(message: Any, sender: MessageSender, sendResponse: (response: Any) -> Unit) -> Unit>
external interface ExtensionConnectEvent : chrome.events.Event<(port: Port) -> Unit>
external interface RuntimeInstalledEvent : chrome.events.Event<(details: InstalledDetails) -> Unit>
external interface RuntimeEvent : chrome.events.Event<() -> Unit>
external interface RuntimeRestartRequiredEvent : chrome.events.Event<(reason: String) -> Unit>
external interface RuntimeUpdateAvailableEvent : chrome.events.Event<(details: UpdateAvailableDetails) -> Unit>
external interface ManifestIcons {
    @nativeGetter
    operator fun get(size: Number): String?
    @nativeSetter
    operator fun set(size: Number, value: String)
}
external interface ManifestAction {
    var default_icon: ManifestIcons? get() = definedExternally; set(value) = definedExternally
    var default_title: String? get() = definedExternally; set(value) = definedExternally
    var default_popup: String? get() = definedExternally; set(value) = definedExternally
}
external interface SearchProvider {
    var name: String? get() = definedExternally; set(value) = definedExternally
    var keyword: String? get() = definedExternally; set(value) = definedExternally
    var favicon_url: String? get() = definedExternally; set(value) = definedExternally
    var search_url: String
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var suggest_url: String? get() = definedExternally; set(value) = definedExternally
    var instant_url: String? get() = definedExternally; set(value) = definedExternally
    var image_url: String? get() = definedExternally; set(value) = definedExternally
    var search_url_post_params: String? get() = definedExternally; set(value) = definedExternally
    var suggest_url_post_params: String? get() = definedExternally; set(value) = definedExternally
    var instant_url_post_params: String? get() = definedExternally; set(value) = definedExternally
    var image_url_post_params: String? get() = definedExternally; set(value) = definedExternally
    var alternate_urls: Array<String>? get() = definedExternally; set(value) = definedExternally
    var prepopulated_id: Number? get() = definedExternally; set(value) = definedExternally
    var is_default: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$2` {
    var scripts: Array<String>? get() = definedExternally; set(value) = definedExternally
    var page: String? get() = definedExternally; set(value) = definedExternally
    var persistent: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$3` {
    var homepage: String? get() = definedExternally; set(value) = definedExternally
    var search_provider: SearchProvider? get() = definedExternally; set(value) = definedExternally
    var startup_pages: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$4` {
    var remove_bookmark_shortcut: Boolean? get() = definedExternally; set(value) = definedExternally
    var remove_button: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$5` {
    var bookmarks_ui: `T$4`? get() = definedExternally; set(value) = definedExternally
}
external interface `T$6` {
    var bookmarks: String? get() = definedExternally; set(value) = definedExternally
    var history: String? get() = definedExternally; set(value) = definedExternally
    var newtab: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$7` {
    var default: String? get() = definedExternally; set(value) = definedExternally
    var windows: String? get() = definedExternally; set(value) = definedExternally
    var mac: String? get() = definedExternally; set(value) = definedExternally
    var chromeos: String? get() = definedExternally; set(value) = definedExternally
    var linux: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$8` {
    var suggested_key: `T$7`? get() = definedExternally; set(value) = definedExternally
    var description: String? get() = definedExternally; set(value) = definedExternally
    var global: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$9` {
    @nativeGetter
    operator fun get(name: String): `T$8`?
    @nativeSetter
    operator fun set(name: String, value: `T$8`)
}
external interface `T$10` {
    var matches: Array<String>? get() = definedExternally; set(value) = definedExternally
    var permissions: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$11` {
    var matches: Array<String>? get() = definedExternally; set(value) = definedExternally
    var exclude_matches: Array<String>? get() = definedExternally; set(value) = definedExternally
    var css: Array<String>? get() = definedExternally; set(value) = definedExternally
    var js: Array<String>? get() = definedExternally; set(value) = definedExternally
    var run_at: String? get() = definedExternally; set(value) = definedExternally
    var all_frames: Boolean? get() = definedExternally; set(value) = definedExternally
    var include_globs: Array<String>? get() = definedExternally; set(value) = definedExternally
    var exclude_globs: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$12` {
    var type: String
}
external interface `T$13` {
    var event: String? get() = definedExternally; set(value) = definedExternally
    var actions: Array<`T$12`>? get() = definedExternally; set(value) = definedExternally
    var conditions: Array<chrome.declarativeContent.PageStateMatcherProperties>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$14` {
    var ids: Array<String>? get() = definedExternally; set(value) = definedExternally
    var matches: Array<String>? get() = definedExternally; set(value) = definedExternally
    var accepts_tls_channel_id: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$15` {
    var id: String? get() = definedExternally; set(value) = definedExternally
    var default_title: String? get() = definedExternally; set(value) = definedExternally
    var file_filters: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$16` {
    var configurable: Boolean? get() = definedExternally; set(value) = definedExternally
    var watchable: Boolean? get() = definedExternally; set(value) = definedExternally
    var multiple_mounts: Boolean? get() = definedExternally; set(value) = definedExternally
    var source: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$17` {
    var id: String
    var minimum_version: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$18` {
    var whitelist: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$19` {
    var name: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
    var description: String? get() = definedExternally; set(value) = definedExternally
    var language: String? get() = definedExternally; set(value) = definedExternally
    var layouts: Array<Any>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$20` {
    var path: String
    var mime_type: String
}
external interface `T$21` {
    var client_id: String
    var scopes: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$22` {
    var keyword: String
}
external interface `T$23` {
    var page: String? get() = definedExternally; set(value) = definedExternally
    var chrome_style: Boolean? get() = definedExternally; set(value) = definedExternally
    var open_in_tab: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$24` {
    var nacl_arch: String? get() = definedExternally; set(value) = definedExternally
    var sub_package_path: String
}
external interface `T$25` {
    var path: String
}
external interface `T$26` {
    var npapi: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$27` {
    var plugins: `T$26`? get() = definedExternally; set(value) = definedExternally
}
external interface `T$28` {
    var pages: Array<String>
    var content_security_policy: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$29` {
    var dictionary_language: String? get() = definedExternally; set(value) = definedExternally
    var dictionary_locale: String? get() = definedExternally; set(value) = definedExternally
    var dictionary_format: String? get() = definedExternally; set(value) = definedExternally
    var dictionary_path: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$30` {
    var managed_schema: String
}
external interface `T$31` {
    var voice_name: String
    var lang: String? get() = definedExternally; set(value) = definedExternally
    var gender: String? get() = definedExternally; set(value) = definedExternally
    var event_types: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$32` {
    var voices: Array<`T$31`>
}
external interface Manifest {
    var manifest_version: Number
    var name: String
    var version: String
    var default_locale: String? get() = definedExternally; set(value) = definedExternally
    var description: String? get() = definedExternally; set(value) = definedExternally
    var icons: ManifestIcons? get() = definedExternally; set(value) = definedExternally
    var browser_action: ManifestAction? get() = definedExternally; set(value) = definedExternally
    var page_action: ManifestAction? get() = definedExternally; set(value) = definedExternally
    var author: Any? get() = definedExternally; set(value) = definedExternally
    var automation: Any? get() = definedExternally; set(value) = definedExternally
    var background: `T$2`? get() = definedExternally; set(value) = definedExternally
    var background_page: String? get() = definedExternally; set(value) = definedExternally
    var chrome_settings_overrides: `T$3`? get() = definedExternally; set(value) = definedExternally
    var chrome_ui_overrides: `T$5`? get() = definedExternally; set(value) = definedExternally
    var chrome_url_overrides: `T$6`? get() = definedExternally; set(value) = definedExternally
    var commands: `T$9`? get() = definedExternally; set(value) = definedExternally
    var content_capabilities: `T$10`? get() = definedExternally; set(value) = definedExternally
    var content_scripts: Array<`T$11`>? get() = definedExternally; set(value) = definedExternally
    var content_security_policy: String? get() = definedExternally; set(value) = definedExternally
    var converted_from_user_script: Boolean? get() = definedExternally; set(value) = definedExternally
    var copresence: Any? get() = definedExternally; set(value) = definedExternally
    var current_locale: String? get() = definedExternally; set(value) = definedExternally
    var devtools_page: String? get() = definedExternally; set(value) = definedExternally
    var event_rules: Array<`T$13`>? get() = definedExternally; set(value) = definedExternally
    var externally_connectable: `T$14`? get() = definedExternally; set(value) = definedExternally
    var file_browser_handlers: Array<`T$15`>? get() = definedExternally; set(value) = definedExternally
    var file_system_provider_capabilities: `T$16`? get() = definedExternally; set(value) = definedExternally
    var homepage_url: String? get() = definedExternally; set(value) = definedExternally
    var import: Array<`T$17`>? get() = definedExternally; set(value) = definedExternally
    var export: `T$18`? get() = definedExternally; set(value) = definedExternally
    var incognito: String? get() = definedExternally; set(value) = definedExternally
    var input_components: Array<`T$19`>? get() = definedExternally; set(value) = definedExternally
    var key: String? get() = definedExternally; set(value) = definedExternally
    var minimum_chrome_version: String? get() = definedExternally; set(value) = definedExternally
    var nacl_modules: Array<`T$20`>? get() = definedExternally; set(value) = definedExternally
    var oauth2: `T$21`? get() = definedExternally; set(value) = definedExternally
    var offline_enabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var omnibox: `T$22`? get() = definedExternally; set(value) = definedExternally
    var optional_permissions: Array<String>? get() = definedExternally; set(value) = definedExternally
    var options_page: String? get() = definedExternally; set(value) = definedExternally
    var options_ui: `T$23`? get() = definedExternally; set(value) = definedExternally
    var permissions: Array<String>? get() = definedExternally; set(value) = definedExternally
    var platforms: Array<`T$24`>? get() = definedExternally; set(value) = definedExternally
    var plugins: Array<`T$25`>? get() = definedExternally; set(value) = definedExternally
    var requirements: `T$27`? get() = definedExternally; set(value) = definedExternally
    var sandbox: `T$28`? get() = definedExternally; set(value) = definedExternally
    var short_name: String? get() = definedExternally; set(value) = definedExternally
    var signature: Any? get() = definedExternally; set(value) = definedExternally
    var spellcheck: `T$29`? get() = definedExternally; set(value) = definedExternally
    var storage: `T$30`? get() = definedExternally; set(value) = definedExternally
    var system_indicator: Any? get() = definedExternally; set(value) = definedExternally
    var tts_engine: `T$32`? get() = definedExternally; set(value) = definedExternally
    var update_url: String? get() = definedExternally; set(value) = definedExternally
    var version_name: String? get() = definedExternally; set(value) = definedExternally
    var web_accessible_resources: Array<String>? get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}
external fun connect(connectInfo: ConnectInfo? = definedExternally /* null */): Port = definedExternally
external fun connect(extensionId: String, connectInfo: ConnectInfo? = definedExternally /* null */): Port = definedExternally
external fun connectNative(application: String): Port = definedExternally
external fun getBackgroundPage(callback: (backgroundPage: Window? /*= null*/) -> Unit): Unit = definedExternally
external fun getManifest(): Manifest = definedExternally
external fun getPackageDirectoryEntry(callback: (directoryEntry: DirectoryEntry) -> Unit): Unit = definedExternally
external fun getPlatformInfo(callback: (platformInfo: PlatformInfo) -> Unit): Unit = definedExternally
external fun getURL(path: String): String = definedExternally
external fun reload(): Unit = definedExternally
external fun requestUpdateCheck(callback: (status: String, details: UpdateCheckDetails? /*= null*/) -> Unit): Unit = definedExternally
external fun restart(): Unit = definedExternally
external fun sendMessage(message: Any, responseCallback: ((response: Any) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun sendMessage(message: Any, options: MessageOptions, responseCallback: ((response: Any) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun sendMessage(extensionId: String, message: Any, responseCallback: ((response: Any) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun sendMessage(extensionId: String, message: Any, options: MessageOptions, responseCallback: ((response: Any) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun sendNativeMessage(application: String, message: Any, responseCallback: ((response: Any) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setUninstallURL(url: String, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun openOptionsPage(callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external var onConnect: ExtensionConnectEvent = definedExternally
external var onConnectExternal: ExtensionConnectEvent = definedExternally
external var onSuspend: RuntimeEvent = definedExternally
external var onStartup: RuntimeEvent = definedExternally
external var onInstalled: RuntimeInstalledEvent = definedExternally
external var onSuspendCanceled: RuntimeEvent = definedExternally
external var onMessage: ExtensionMessageEvent = definedExternally
external var onMessageExternal: ExtensionMessageEvent = definedExternally
external var onRestartRequired: RuntimeRestartRequiredEvent = definedExternally
external var onUpdateAvailable: RuntimeUpdateAvailableEvent = definedExternally
external var onBrowserUpdateAvailable: RuntimeEvent = definedExternally
