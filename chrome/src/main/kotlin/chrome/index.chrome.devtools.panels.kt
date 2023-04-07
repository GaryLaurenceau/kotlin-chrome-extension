@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.devtools.panels")
package chrome.devtools.panels

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

external interface PanelShownEvent : chrome.events.Event<(window: Window) -> Unit>
external interface PanelHiddenEvent : chrome.events.Event<() -> Unit>
external interface PanelSearchEvent : chrome.events.Event<(action: String, queryString: String? /*= null*/) -> Unit>
external interface ExtensionPanel {
    fun createStatusBarButton(iconPath: String, tooltipText: String, disabled: Boolean): Button
    var onShown: PanelShownEvent
    var onHidden: PanelHiddenEvent
    var onSearch: PanelSearchEvent
}
external interface ButtonClickedEvent : chrome.events.Event<() -> Unit>
external interface Button {
    fun update(iconPath: String? = definedExternally /* null */, tooltipText: String? = definedExternally /* null */, disabled: Boolean? = definedExternally /* null */)
    var onClicked: ButtonClickedEvent
}
external interface SelectionChangedEvent : chrome.events.Event<() -> Unit>
external interface ElementsPanel {
    fun createSidebarPane(title: String, callback: ((result: ExtensionSidebarPane) -> Unit)? = definedExternally /* null */)
    var onSelectionChanged: SelectionChangedEvent
}
external interface SourcesPanel {
    fun createSidebarPane(title: String, callback: ((result: ExtensionSidebarPane) -> Unit)? = definedExternally /* null */)
    var onSelectionChanged: SelectionChangedEvent
}
external interface ExtensionSidebarPaneShownEvent : chrome.events.Event<(window: chrome.windows.Window) -> Unit>
external interface ExtensionSidebarPaneHiddenEvent : chrome.events.Event<() -> Unit>
external interface ExtensionSidebarPane {
    fun setHeight(height: String)
    fun setExpression(expression: String, rootTitle: String? = definedExternally /* null */, callback: (() -> Unit)? = definedExternally /* null */)
    fun setExpression(expression: String, callback: (() -> Unit)? = definedExternally /* null */)
    fun setObject(jsonObject: Any, rootTitle: String? = definedExternally /* null */, callback: (() -> Unit)? = definedExternally /* null */)
    fun setObject(jsonObject: Any, callback: (() -> Unit)? = definedExternally /* null */)
    fun setPage(path: String)
    var onShown: ExtensionSidebarPaneShownEvent
    var onHidden: ExtensionSidebarPaneHiddenEvent
    fun setExpression(expression: String)
    fun setObject(jsonObject: Any)
}
external var elements: ElementsPanel = definedExternally
external var sources: SourcesPanel = definedExternally
external fun create(title: String, iconPath: String, pagePath: String, callback: ((panel: ExtensionPanel) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setOpenResourceHandler(callback: ((resource: chrome.devtools.inspectedWindow.Resource) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun openResource(url: String, lineNumber: Number, callback: () -> Unit): Unit = definedExternally
