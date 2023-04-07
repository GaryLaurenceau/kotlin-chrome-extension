@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.notifications")
package chrome.notifications

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

external interface ButtonOptions {
    var title: String
    var iconUrl: String? get() = definedExternally; set(value) = definedExternally
}
external interface ItemOptions {
    var title: String
    var message: String
}
external interface NotificationOptions {
    var type: String? get() = definedExternally; set(value) = definedExternally
    var iconUrl: String? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var message: String? get() = definedExternally; set(value) = definedExternally
    var contextMessage: String? get() = definedExternally; set(value) = definedExternally
    var priority: Number? get() = definedExternally; set(value) = definedExternally
    var eventTime: Number? get() = definedExternally; set(value) = definedExternally
    var buttons: Array<ButtonOptions>? get() = definedExternally; set(value) = definedExternally
    var items: Array<ItemOptions>? get() = definedExternally; set(value) = definedExternally
    var progress: Number? get() = definedExternally; set(value) = definedExternally
    var isClickable: Boolean? get() = definedExternally; set(value) = definedExternally
    var appIconMaskUrl: String? get() = definedExternally; set(value) = definedExternally
    var imageUrl: String? get() = definedExternally; set(value) = definedExternally
    var requireInteraction: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface NotificationClosedEvent : chrome.events.Event<(notificationId: String, byUser: Boolean) -> Unit>
external interface NotificationClickedEvent : chrome.events.Event<(notificationId: String) -> Unit>
external interface NotificationButtonClickedEvent : chrome.events.Event<(notificationId: String, buttonIndex: Number) -> Unit>
external interface NotificationPermissionLevelChangedEvent : chrome.events.Event<(level: String) -> Unit>
external interface NotificationShowSettingsEvent : chrome.events.Event<() -> Unit>
external var onClosed: NotificationClosedEvent = definedExternally
external var onClicked: NotificationClickedEvent = definedExternally
external var onButtonClicked: NotificationButtonClickedEvent = definedExternally
external var onPermissionLevelChanged: NotificationPermissionLevelChangedEvent = definedExternally
external var onShowSettings: NotificationShowSettingsEvent = definedExternally
external fun create(notificationId: String, options: NotificationOptions, callback: ((notificationId: String) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun create(options: NotificationOptions, callback: ((notificationId: String) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun update(notificationId: String, options: NotificationOptions, callback: ((wasUpdated: Boolean) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun clear(notificationId: String, callback: ((wasCleared: Boolean) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getAll(callback: (notifications: Any) -> Unit): Unit = definedExternally
external fun getPermissionLevel(callback: (level: String) -> Unit): Unit = definedExternally
