@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.bookmarks")
package chrome.bookmarks

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

external interface BookmarkTreeNode {
    var index: Number? get() = definedExternally; set(value) = definedExternally
    var dateAdded: Number? get() = definedExternally; set(value) = definedExternally
    var title: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var dateGroupModified: Number? get() = definedExternally; set(value) = definedExternally
    var id: String
    var parentId: String? get() = definedExternally; set(value) = definedExternally
    var children: Array<BookmarkTreeNode>? get() = definedExternally; set(value) = definedExternally
    var unmodifiable: Any? get() = definedExternally; set(value) = definedExternally
}
external interface BookmarkRemoveInfo {
    var index: Number
    var parentId: String
    var node: BookmarkTreeNode
}
external interface BookmarkMoveInfo {
    var index: Number
    var oldIndex: Number
    var parentId: String
    var oldParentId: String
}
external interface BookmarkChangeInfo {
    var url: String? get() = definedExternally; set(value) = definedExternally
    var title: String
}
external interface BookmarkReorderInfo {
    var childIds: Array<String>
}
external interface BookmarkRemovedEvent : chrome.events.Event<(id: String, removeInfo: BookmarkRemoveInfo) -> Unit>
external interface BookmarkImportEndedEvent : chrome.events.Event<() -> Unit>
external interface BookmarkMovedEvent : chrome.events.Event<(id: String, moveInfo: BookmarkMoveInfo) -> Unit>
external interface BookmarkImportBeganEvent : chrome.events.Event<() -> Unit>
external interface BookmarkChangedEvent : chrome.events.Event<(id: String, changeInfo: BookmarkChangeInfo) -> Unit>
external interface BookmarkCreatedEvent : chrome.events.Event<(id: String, bookmark: BookmarkTreeNode) -> Unit>
external interface BookmarkChildrenReordered : chrome.events.Event<(id: String, reorderInfo: BookmarkReorderInfo) -> Unit>
external interface BookmarkSearchQuery {
    var query: String? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
}
external interface BookmarkCreateArg {
    var parentId: String? get() = definedExternally; set(value) = definedExternally
    var index: Number? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
}
external interface BookmarkDestinationArg {
    var parentId: String? get() = definedExternally; set(value) = definedExternally
    var index: Number? get() = definedExternally; set(value) = definedExternally
}
external interface BookmarkChangesArg {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
}
external var MAX_WRITE_OPERATIONS_PER_HOUR: Number = definedExternally
external var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Number = definedExternally
external fun search(query: String, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = definedExternally
external fun search(query: BookmarkSearchQuery, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = definedExternally
external fun getTree(callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = definedExternally
external fun getRecent(numberOfItems: Number, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = definedExternally
external fun get(id: String, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = definedExternally
external fun get(idList: Array<String>, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = definedExternally
external fun create(bookmark: BookmarkCreateArg, callback: ((result: BookmarkTreeNode) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun move(id: String, destination: BookmarkDestinationArg, callback: ((result: BookmarkTreeNode) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun update(id: String, changes: BookmarkChangesArg, callback: ((result: BookmarkTreeNode) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun remove(id: String, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun getChildren(id: String, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = definedExternally
external fun getSubTree(id: String, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = definedExternally
external fun removeTree(id: String, callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external var onRemoved: BookmarkRemovedEvent = definedExternally
external var onImportEnded: BookmarkImportEndedEvent = definedExternally
external var onImportBegan: BookmarkImportBeganEvent = definedExternally
external var onChanged: BookmarkChangedEvent = definedExternally
external var onMoved: BookmarkMovedEvent = definedExternally
external var onCreated: BookmarkCreatedEvent = definedExternally
external var onChildrenReordered: BookmarkChildrenReordered = definedExternally
