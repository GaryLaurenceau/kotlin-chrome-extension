import com.pixelperfect.tellme.data.Message
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main() {
    println("Background script initialized")

    chrome.runtime.onMessage.addListener { request, sender, sendResponse ->
        println("Background receives a message: ${request}")
        val message = Json.decodeFromString<Message>(request.toString())
        val response = when (message.action) {
            "POPUP_CLICK" -> Message(action = "BG_RESPONSE", message =  "Message from background to popup")
            "CONTENT_SCRIPT_CLICK" -> Message(action = "BG_RESPONSE", message =  "Message from background to content script")
            else -> Message(action = "ERROR", message = "Action not handled")
        }
        sendResponse(Json.encodeToString(response))
    }
}