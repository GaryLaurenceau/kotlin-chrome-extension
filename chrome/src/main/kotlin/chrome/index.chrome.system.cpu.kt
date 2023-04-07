@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("chrome.system.cpu")
package chrome.system.cpu

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

external interface ProcessorUsage {
    var user: Number
    var kernel: Number
    var idle: Number
    var total: Number
}
external interface ProcessorInfo {
    var usage: ProcessorUsage
}
external interface CpuInfo {
    var numOfProcessors: Number
    var archName: String
    var modelName: String
    var features: Array<String>
    var processors: Array<ProcessorInfo>
}
external fun getInfo(callback: (info: CpuInfo) -> Unit): Unit = definedExternally
