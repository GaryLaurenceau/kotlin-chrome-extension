@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.tabs")
package chrome.tabs

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

external interface MutedInfo {
    var muted: Boolean
    var reason: String? get() = definedExternally; set(value) = definedExternally
    var extensionId: String? get() = definedExternally; set(value) = definedExternally
}
external interface Tab {
    var status: String? get() = definedExternally; set(value) = definedExternally
    var index: Number
    var openerTabId: Number? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var pinned: Boolean
    var highlighted: Boolean
    var windowId: Number
    var active: Boolean
    var favIconUrl: String? get() = definedExternally; set(value) = definedExternally
    var id: Number? get() = definedExternally; set(value) = definedExternally
    var incognito: Boolean
    var selected: Boolean
    var audible: Boolean? get() = definedExternally; set(value) = definedExternally
    var discarded: Boolean
    var autoDiscardable: Boolean
    var mutedInfo: MutedInfo? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var sessionId: String? get() = definedExternally; set(value) = definedExternally
}
external interface ZoomSettings {
    var mode: String? get() = definedExternally; set(value) = definedExternally
    var scope: String? get() = definedExternally; set(value) = definedExternally
    var defaultZoomFactor: Number? get() = definedExternally; set(value) = definedExternally
}
external interface InjectDetails {
    var allFrames: Boolean? get() = definedExternally; set(value) = definedExternally
    var code: String? get() = definedExternally; set(value) = definedExternally
    var runAt: String? get() = definedExternally; set(value) = definedExternally
    var file: String? get() = definedExternally; set(value) = definedExternally
    var frameId: Number? get() = definedExternally; set(value) = definedExternally
    var matchAboutBlank: Boolean? get() = definedExternally; set(value) = definedExternally
    var cssOrigin: String? get() = definedExternally; set(value) = definedExternally
}
external interface CreateProperties {
    var index: Number? get() = definedExternally; set(value) = definedExternally
    var openerTabId: Number? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var pinned: Boolean? get() = definedExternally; set(value) = definedExternally
    var windowId: Number? get() = definedExternally; set(value) = definedExternally
    var active: Boolean? get() = definedExternally; set(value) = definedExternally
    var selected: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface MoveProperties {
    var index: Number
    var windowId: Number? get() = definedExternally; set(value) = definedExternally
}
external interface UpdateProperties {
    var pinned: Boolean? get() = definedExternally; set(value) = definedExternally
    var openerTabId: Number? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var highlighted: Boolean? get() = definedExternally; set(value) = definedExternally
    var active: Boolean? get() = definedExternally; set(value) = definedExternally
    var selected: Boolean? get() = definedExternally; set(value) = definedExternally
    var muted: Boolean? get() = definedExternally; set(value) = definedExternally
    var autoDiscardable: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface CaptureVisibleTabOptions {
    var quality: Number? get() = definedExternally; set(value) = definedExternally
    var format: String? get() = definedExternally; set(value) = definedExternally
}
external interface ReloadProperties {
    var bypassCache: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ConnectInfo {
    var name: String? get() = definedExternally; set(value) = definedExternally
    var frameId: Number? get() = definedExternally; set(value) = definedExternally
}
external interface MessageSendOptions {
    var frameId: Number? get() = definedExternally; set(value) = definedExternally
}
external interface HighlightInfo {
    var tabs: dynamic /* Number | Array<Number> */
    var windowId: Number? get() = definedExternally; set(value) = definedExternally
}
external interface QueryInfo {
    var status: dynamic /* String /* "loading" */ | String /* "complete" */ */ get() = definedExternally; set(value) = definedExternally
    var lastFocusedWindow: Boolean? get() = definedExternally; set(value) = definedExternally
    var windowId: Number? get() = definedExternally; set(value) = definedExternally
    var windowType: dynamic /* String /* "normal" */ | String /* "popup" */ | String /* "panel" */ | String /* "app" */ | String /* "devtools" */ */ get() = definedExternally; set(value) = definedExternally
    var active: Boolean? get() = definedExternally; set(value) = definedExternally
    var index: Number? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var url: dynamic /* String | Array<String> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    var currentWindow: Boolean? get() = definedExternally; set(value) = definedExternally
    var highlighted: Boolean? get() = definedExternally; set(value) = definedExternally
    var discarded: Boolean? get() = definedExternally; set(value) = definedExternally
    var autoDiscardable: Boolean? get() = definedExternally; set(value) = definedExternally
    var pinned: Boolean? get() = definedExternally; set(value) = definedExternally
    var audible: Boolean? get() = definedExternally; set(value) = definedExternally
    var muted: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface TabHighlightInfo {
    var windowId: Number
    var tabIds: Array<Number>
}
external interface TabRemoveInfo {
    var windowId: Number
    var isWindowClosing: Boolean
}
external interface TabAttachInfo {
    var newPosition: Number
    var newWindowId: Number
}
external interface TabChangeInfo {
    var status: String? get() = definedExternally; set(value) = definedExternally
    var pinned: Boolean? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var audible: Boolean? get() = definedExternally; set(value) = definedExternally
    var discarded: Boolean? get() = definedExternally; set(value) = definedExternally
    var autoDiscardable: Boolean? get() = definedExternally; set(value) = definedExternally
    var mutedInfo: MutedInfo? get() = definedExternally; set(value) = definedExternally
    var favIconUrl: String? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
}
external interface TabMoveInfo {
    var toIndex: Number
    var windowId: Number
    var fromIndex: Number
}
external interface TabDetachInfo {
    var oldWindowId: Number
    var oldPosition: Number
}
external interface TabActiveInfo {
    var tabId: Number
    var windowId: Number
}
external interface TabWindowInfo {
    var windowId: Number
}
external interface ZoomChangeInfo {
    var tabId: Number
    var oldZoomFactor: Number
    var newZoomFactor: Number
    var zoomSettings: ZoomSettings
}
external interface TabHighlightedEvent : chrome.events.Event<(highlightInfo: HighlightInfo) -> Unit>
external interface TabRemovedEvent : chrome.events.Event<(tabId: Number, removeInfo: TabRemoveInfo) -> Unit>
external interface TabUpdatedEvent : chrome.events.Event<(tabId: Number, changeInfo: TabChangeInfo, tab: Tab) -> Unit>
external interface TabAttachedEvent : chrome.events.Event<(tabId: Number, attachInfo: TabAttachInfo) -> Unit>
external interface TabMovedEvent : chrome.events.Event<(tabId: Number, moveInfo: TabMoveInfo) -> Unit>
external interface TabDetachedEvent : chrome.events.Event<(tabId: Number, detachInfo: TabDetachInfo) -> Unit>
external interface TabCreatedEvent : chrome.events.Event<(tab: Tab) -> Unit>
external interface TabActivatedEvent : chrome.events.Event<(activeInfo: TabActiveInfo) -> Unit>
external interface TabReplacedEvent : chrome.events.Event<(addedTabId: Number, removedTabId: Number) -> Unit>
external interface TabSelectedEvent : chrome.events.Event<(tabId: Number, selectInfo: TabWindowInfo) -> Unit>
external interface TabZoomChangeEvent : chrome.events.Event<(ZoomChangeInfo: ZoomChangeInfo) -> Unit>
external fun executeScript(details: InjectDetails, callback: ((result: Array<Any>) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun executeScript(tabId: Number, details: InjectDetails, callback: ((result: Array<Any>) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun get(tabId: Number, callback: (tab: Tab) -> Unit): Unit = definedExternally
external fun getAllInWindow(callback: (tab: Tab) -> Unit): Unit = definedExternally
external fun getAllInWindow(windowId: Number, callback: (tab: Tab) -> Unit): Unit = definedExternally
external fun getCurrent(callback: (tab: Tab? /*= null*/) -> Unit): Unit = definedExternally
external fun getSelected(callback: (tab: Tab) -> Unit): Unit = definedExternally
external fun getSelected(windowId: Number, callback: (tab: Tab) -> Unit): Unit = definedExternally
external fun create(createProperties: CreateProperties, callback: ((tab: Tab) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun move(tabId: Number, moveProperties: MoveProperties, callback: ((tab: Tab) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun move(tabIds: Array<Number>, moveProperties: MoveProperties, callback: ((tabs: Array<Tab>) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun update(updateProperties: UpdateProperties, callback: ((tab: Tab? /*= null*/) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun update(tabId: Number, updateProperties: UpdateProperties, callback: ((tab: Tab? /*= null*/) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun remove(tabId: Number, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun remove(tabIds: Array<Number>, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun captureVisibleTab(callback: (dataUrl: String) -> Unit): Unit = definedExternally
external fun captureVisibleTab(windowId: Number, callback: (dataUrl: String) -> Unit): Unit = definedExternally
external fun captureVisibleTab(options: CaptureVisibleTabOptions, callback: (dataUrl: String) -> Unit): Unit = definedExternally
external fun captureVisibleTab(windowId: Number, options: CaptureVisibleTabOptions, callback: (dataUrl: String) -> Unit): Unit = definedExternally
external fun reload(tabId: Number, reloadProperties: ReloadProperties? = definedExternally /* null */, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun reload(reloadProperties: ReloadProperties, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun reload(callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun duplicate(tabId: Number, callback: ((tab: Tab? /*= null*/) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun sendMessage(tabId: Number, message: Any, responseCallback: ((response: Any) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun sendMessage(tabId: Number, message: Any, options: MessageSendOptions, responseCallback: ((response: Any) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun sendRequest(tabId: Number, request: Any, responseCallback: ((response: Any) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun connect(tabId: Number, connectInfo: ConnectInfo? = definedExternally /* null */): chrome.runtime.Port = definedExternally
external fun insertCSS(details: InjectDetails, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun insertCSS(tabId: Number, details: InjectDetails, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun highlight(highlightInfo: HighlightInfo, callback: (window: chrome.windows.Window) -> Unit): Unit = definedExternally
external fun query(queryInfo: QueryInfo, callback: (result: Array<Tab>) -> Unit): Unit = definedExternally
external fun detectLanguage(callback: (language: String) -> Unit): Unit = definedExternally
external fun detectLanguage(tabId: Number, callback: (language: String) -> Unit): Unit = definedExternally
external fun setZoom(zoomFactor: Number, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setZoom(tabId: Number, zoomFactor: Number, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getZoom(callback: (zoomFactor: Number) -> Unit): Unit = definedExternally
external fun getZoom(tabId: Number, callback: (zoomFactor: Number) -> Unit): Unit = definedExternally
external fun setZoomSettings(zoomSettings: ZoomSettings, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setZoomSettings(tabId: Number, zoomSettings: ZoomSettings, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getZoomSettings(callback: (zoomSettings: ZoomSettings) -> Unit): Unit = definedExternally
external fun getZoomSettings(tabId: Number, callback: (zoomSettings: ZoomSettings) -> Unit): Unit = definedExternally
external fun discard(tabId: Number, callback: (tab: Tab) -> Unit): Unit = definedExternally
external var onHighlighted: TabHighlightedEvent = definedExternally
external var onRemoved: TabRemovedEvent = definedExternally
external var onUpdated: TabUpdatedEvent = definedExternally
external var onAttached: TabAttachedEvent = definedExternally
external var onMoved: TabMovedEvent = definedExternally
external var onDetached: TabDetachedEvent = definedExternally
external var onCreated: TabCreatedEvent = definedExternally
external var onActivated: TabActivatedEvent = definedExternally
external var onReplaced: TabReplacedEvent = definedExternally
external var onSelectionChanged: TabSelectedEvent = definedExternally
external var onActiveChanged: TabSelectedEvent = definedExternally
external var onHighlightChanged: TabHighlightedEvent = definedExternally
external var onZoomChange: TabZoomChangeEvent = definedExternally
external var TAB_ID_NONE: Number /* -1 */ = definedExternally
