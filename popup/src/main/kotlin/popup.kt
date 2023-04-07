import androidx.compose.runtime.NoLiveLiterals
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import com.pixelperfect.tellme.data.Message

fun main() {
    renderComposable("root") {
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

@NoLiveLiterals
private fun sendMessage(onResponse: (Message) -> Unit) {
    val message = Message(action = "POPUP_CLICK", message = "Message from popup")
    chrome.runtime.sendMessage(
        message = Json.encodeToString(message),
        responseCallback = { response ->
            val message = Json.decodeFromString<Message>(response.toString())
            onResponse(message)
        }
    )
}