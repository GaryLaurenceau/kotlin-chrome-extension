@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.alarms")
package chrome.alarms

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

external interface AlarmCreateInfo {
    var delayInMinutes: Number? get() = definedExternally; set(value) = definedExternally
    var periodInMinutes: Number? get() = definedExternally; set(value) = definedExternally
    var `when`: Number? get() = definedExternally; set(value) = definedExternally
}
external interface Alarm {
    var periodInMinutes: Number? get() = definedExternally; set(value) = definedExternally
    var scheduledTime: Number
    var name: String
}
external interface AlarmEvent : chrome.events.Event<(alarm: Alarm) -> Unit>
external fun create(alarmInfo: AlarmCreateInfo): Unit = definedExternally
external fun create(name: String, alarmInfo: AlarmCreateInfo): Unit = definedExternally
external fun getAll(callback: (alarms: Array<Alarm>) -> Unit): Unit = definedExternally
external fun clearAll(callback: ((wasCleared: Boolean) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun clear(name: String? = definedExternally /* null */, callback: ((wasCleared: Boolean) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun clear(callback: (wasCleared: Boolean) -> Unit): Unit = definedExternally
external fun get(callback: (alarm: Alarm) -> Unit): Unit = definedExternally
external fun get(name: String, callback: (alarm: Alarm) -> Unit): Unit = definedExternally
external var onAlarm: AlarmEvent = definedExternally
