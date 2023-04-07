@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.contextMenus")
package chrome.contextMenus

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

external interface OnClickData {
    var selectionText: String? get() = definedExternally; set(value) = definedExternally
    var checked: Boolean? get() = definedExternally; set(value) = definedExternally
    var menuItemId: Any
    var frameUrl: String? get() = definedExternally; set(value) = definedExternally
    var editable: Boolean
    var mediaType: String? get() = definedExternally; set(value) = definedExternally
    var wasChecked: Boolean? get() = definedExternally; set(value) = definedExternally
    var pageUrl: String
    var linkUrl: String? get() = definedExternally; set(value) = definedExternally
    var parentMenuItemId: Any? get() = definedExternally; set(value) = definedExternally
    var srcUrl: String? get() = definedExternally; set(value) = definedExternally
}
external interface CreateProperties {
    var documentUrlPatterns: Array<String>? get() = definedExternally; set(value) = definedExternally
    var checked: Boolean? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var contexts: Array<String>? get() = definedExternally; set(value) = definedExternally
    var enabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var targetUrlPatterns: Array<String>? get() = definedExternally; set(value) = definedExternally
    var onclick: ((info: OnClickData, tab: chrome.tabs.Tab) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var parentId: Any? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
}
external interface UpdateProperties {
    var documentUrlPatterns: Array<String>? get() = definedExternally; set(value) = definedExternally
    var checked: Boolean? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var contexts: Array<String>? get() = definedExternally; set(value) = definedExternally
    var enabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var targetUrlPatterns: Array<String>? get() = definedExternally; set(value) = definedExternally
    var onclick: Function<*>? get() = definedExternally; set(value) = definedExternally
    var parentId: Any? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
}
external interface MenuClickedEvent : chrome.events.Event<(info: OnClickData, tab: chrome.tabs.Tab? /*= null*/) -> Unit>
external var ACTION_MENU_TOP_LEVEL_LIMIT: Number = definedExternally
external fun removeAll(callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun create(createProperties: CreateProperties, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun update(id: String, updateProperties: UpdateProperties, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun update(id: Number, updateProperties: UpdateProperties, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun remove(menuItemId: String, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun remove(menuItemId: Number, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external var onClicked: MenuClickedEvent = definedExternally
