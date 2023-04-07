@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.omnibox")
package chrome.omnibox

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

external interface SuggestResult {
    var content: String
    var description: String
}
external interface Suggestion {
    var description: String
}
external interface OmniboxInputEnteredEvent : chrome.events.Event<(text: String) -> Unit>
external interface OmniboxInputChangedEvent : chrome.events.Event<(text: String, suggest: (suggestResults: Array<SuggestResult>) -> Unit) -> Unit>
external interface OmniboxInputStartedEvent : chrome.events.Event<() -> Unit>
external interface OmniboxInputCancelledEvent : chrome.events.Event<() -> Unit>
external fun setDefaultSuggestion(suggestion: Suggestion): Unit = definedExternally
external var onInputEntered: OmniboxInputEnteredEvent = definedExternally
external var onInputChanged: OmniboxInputChangedEvent = definedExternally
external var onInputStarted: OmniboxInputStartedEvent = definedExternally
external var onInputCancelled: OmniboxInputCancelledEvent = definedExternally
