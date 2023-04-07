@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.ttsEngine")
package chrome.ttsEngine

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

external interface SpeakOptions {
    var lang: String? get() = definedExternally; set(value) = definedExternally
    var voiceName: String? get() = definedExternally; set(value) = definedExternally
    var gender: String? get() = definedExternally; set(value) = definedExternally
    var volume: Number? get() = definedExternally; set(value) = definedExternally
    var rate: Number? get() = definedExternally; set(value) = definedExternally
    var pitch: Number? get() = definedExternally; set(value) = definedExternally
}
external interface TtsEngineSpeakEvent : chrome.events.Event<(utterance: String, options: SpeakOptions, sendTtsEvent: (event: chrome.tts.TtsEvent) -> Unit) -> Unit>
external var onSpeak: TtsEngineSpeakEvent = definedExternally
external var onStop: chrome.events.Event<() -> Unit> = definedExternally
external var onPause: chrome.events.Event<() -> Unit> = definedExternally
external var onResume: chrome.events.Event<() -> Unit> = definedExternally
