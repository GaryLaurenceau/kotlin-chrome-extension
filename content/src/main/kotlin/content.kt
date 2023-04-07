import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.pixelperfect.tellme.data.Message
import kotlinx.browser.document
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {

    println("Content script initialized")

    val element = document.createElement("div")
    element.id = "rootDialog"

    document.body?.appendChild(element)

    renderComposable(element) {
        var result by remember { mutableStateOf("") }
        Button({
            onClick {
                sendMessage {
                    result = "Message result: ${it.message}"
                }
            }
        }) {
            Text("Send message")
        }

        Text(result)
    }
}

private fun sendMessage(onResponse: (Message) -> Unit) {
    val message = Message(action = "CONTENT_SCRIPT_CLICK", message = "Message from content script")
    chrome.runtime.sendMessage(
        message = Json.encodeToString(message),
        responseCallback = { response ->
            val message = Json.decodeFromString<Message>(response.toString())
            onResponse(message)
        }
    )
}