@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.input.ime")
package chrome.input.ime

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

external interface KeyboardEvent {
    var shiftKey: Boolean? get() = definedExternally; set(value) = definedExternally
    var altKey: Boolean? get() = definedExternally; set(value) = definedExternally
    var requestId: String
    var key: String
    var ctrlKey: Boolean? get() = definedExternally; set(value) = definedExternally
    var type: String
    var extensionId: String? get() = definedExternally; set(value) = definedExternally
    var code: String
    var keyCode: Number? get() = definedExternally; set(value) = definedExternally
    var capsLock: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface InputContext {
    var contextID: Number
    var type: String
    var autoCorrect: Boolean
    var autoComplete: Boolean
    var spellCheck: Boolean
}
external interface MenuItem {
    var id: String
    var label: String? get() = definedExternally; set(value) = definedExternally
    var style: String? get() = definedExternally; set(value) = definedExternally
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
    var checked: Boolean? get() = definedExternally; set(value) = definedExternally
    var enabled: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ImeParameters {
    var items: Array<MenuItem>
    var engineID: String
}
external interface CommitTextParameters {
    var text: String
    var contextID: Number
}
external interface CandidateUsage {
    var title: String
    var body: String
}
external interface CandidateTemplate {
    var candidate: String
    var id: Number
    var parentId: Number? get() = definedExternally; set(value) = definedExternally
    var label: String? get() = definedExternally; set(value) = definedExternally
    var annotation: String? get() = definedExternally; set(value) = definedExternally
    var usage: CandidateUsage? get() = definedExternally; set(value) = definedExternally
}
external interface CandidatesParameters {
    var contextID: Number
    var candidates: Array<CandidateTemplate>
}
external interface CompositionParameterSegment {
    var start: Number
    var end: Number
    var style: String
}
external interface CompositionParameters {
    var contextID: Number
    var text: String
    var segments: Array<CompositionParameterSegment>
    var cursor: Number
    var selectionStart: Number? get() = definedExternally; set(value) = definedExternally
    var selectionEnd: Number? get() = definedExternally; set(value) = definedExternally
}
external interface MenuItemParameters {
    var items: Array<Any>
    var engineId: String
}
external interface CandidateWindowParameterProperties {
    var cursorVisible: Boolean? get() = definedExternally; set(value) = definedExternally
    var vertical: Boolean? get() = definedExternally; set(value) = definedExternally
    var pageSize: Number? get() = definedExternally; set(value) = definedExternally
    var auxiliaryTextVisible: Boolean? get() = definedExternally; set(value) = definedExternally
    var auxiliaryText: String? get() = definedExternally; set(value) = definedExternally
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
    var windowPosition: String? get() = definedExternally; set(value) = definedExternally
}
external interface CandidateWindowParameter {
    var engineID: String
    var properties: CandidateWindowParameterProperties
}
external interface ClearCompositionParameters {
    var contextID: Number
}
external interface CursorPositionParameters {
    var candidateID: Number
    var contextID: Number
}
external interface SendKeyEventParameters {
    var contextID: Number
    var keyData: Array<KeyboardEvent>
}
external interface DeleteSurroundingTextParameters {
    var engineID: String
    var contextID: Number
    var offset: Number
    var length: Number
}
external interface SurroundingTextInfo {
    var text: String
    var focus: Number
    var anchor: Number
}
external interface BlurEvent : chrome.events.Event<(contextID: Number) -> Unit>
external interface CandidateClickedEvent : chrome.events.Event<(engineID: String, candidateID: Number, button: String) -> Unit>
external interface KeyEventEvent : chrome.events.Event<(engineID: String, keyData: KeyboardEvent) -> Unit>
external interface DeactivatedEvent : chrome.events.Event<(engineID: String) -> Unit>
external interface InputContextUpdateEvent : chrome.events.Event<(context: InputContext) -> Unit>
external interface ActivateEvent : chrome.events.Event<(engineID: String, screen: String) -> Unit>
external interface FocusEvent : chrome.events.Event<(context: InputContext) -> Unit>
external interface MenuItemActivatedEvent : chrome.events.Event<(engineID: String, name: String) -> Unit>
external interface SurroundingTextChangedEvent : chrome.events.Event<(engineID: String, surroundingInfo: SurroundingTextInfo) -> Unit>
external interface InputResetEvent : chrome.events.Event<(engineID: String) -> Unit>
external fun setMenuItems(parameters: ImeParameters, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun commitText(parameters: CommitTextParameters, callback: ((success: Boolean) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setCandidates(parameters: CandidatesParameters, callback: ((success: Boolean) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setComposition(parameters: CompositionParameters, callback: ((success: Boolean) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun updateMenuItems(parameters: MenuItemParameters, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setCandidateWindowProperties(parameters: CandidateWindowParameter, callback: ((success: Boolean) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun clearComposition(parameters: ClearCompositionParameters, callback: ((success: Boolean) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setCursorPosition(parameters: CursorPositionParameters, callback: ((success: Boolean) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun sendKeyEvents(parameters: SendKeyEventParameters, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun hideInputView(): Unit = definedExternally
external fun deleteSurroundingText(parameters: DeleteSurroundingTextParameters, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun keyEventHandled(requestId: String, response: Boolean): Unit = definedExternally
external var onBlur: BlurEvent = definedExternally
external var onCandidateClicked: CandidateClickedEvent = definedExternally
external var onKeyEvent: KeyEventEvent = definedExternally
external var onDeactivated: DeactivatedEvent = definedExternally
external var onInputContextUpdate: InputContextUpdateEvent = definedExternally
external var onActivate: ActivateEvent = definedExternally
external var onFocus: FocusEvent = definedExternally
external var onMenuItemActivated: MenuItemActivatedEvent = definedExternally
external var onSurroundingTextChanged: SurroundingTextChangedEvent = definedExternally
external var onReset: InputResetEvent = definedExternally
