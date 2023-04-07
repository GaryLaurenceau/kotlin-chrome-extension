@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.accessibilityFeatures")
package chrome.accessibilityFeatures

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

external interface AccessibilityFeaturesGetArg {
    var incognito: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface AccessibilityFeaturesCallbackArg {
    var value: Any
    var levelOfControl: String
    var incognitoSpecific: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface AccessibilityFeaturesSetArg {
    var value: Any
    var scope: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccessibilityFeaturesClearArg {
    var scope: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccessibilityFeaturesSetting {
    fun get(details: AccessibilityFeaturesGetArg, callback: (details: AccessibilityFeaturesCallbackArg) -> Unit)
    fun set(details: AccessibilityFeaturesSetArg, callback: (() -> Unit)? = definedExternally /* null */)
    fun clear(details: AccessibilityFeaturesClearArg, callback: (() -> Unit)? = definedExternally /* null */)
}
external var spokenFeedback: AccessibilityFeaturesSetting = definedExternally
external var largeCursor: AccessibilityFeaturesSetting = definedExternally
external var stickyKeys: AccessibilityFeaturesSetting = definedExternally
external var highContrast: AccessibilityFeaturesSetting = definedExternally
external var screenMagnifier: AccessibilityFeaturesSetting = definedExternally
external var autoclick: AccessibilityFeaturesSetting = definedExternally
external var virtualKeyboard: AccessibilityFeaturesSetting = definedExternally
external var animationPolicy: AccessibilityFeaturesSetting = definedExternally
