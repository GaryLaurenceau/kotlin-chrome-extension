# 💾 Kotlin Chrome Extension
This is a sample project demonstrating how to build a Chrome extension using Kotlin 1.8 and Compose 1.3.
It has a popup view which renders HTML with Compose with a button that sends a message to the background.
The content script injects a view, then like the popup, send a message to the background.

<a href="https://twitter.com/garylaurenceau" target="_blank">
    <img alt="Twitter: @garylaurenceau" src="https://img.shields.io/twitter/follow/garylaurenceau.svg?style=social" />
</a>

## ⚙️ Modules:
- `app`: This module contains shared HTML, CSS, icons, resources, and the manifest file. Its purpose is to package the extension.
- `background`: This module contains the background script code.
- `buildSrc`: This module defines the dependencies with Kotlin DSL so that the definitions can be accessed and auto-completed from other gradle.build.kts files.
- `chrome`: This module contains external definitions of the Chrome API. It’s based on the depot [chrome-ts2kt](https://github.com/freewind/chrome-ts2kt/).
- `content`: This module defines the content script.
- `data`: This is a shared module that defines data used by other sub-modules.
- `popup`: This module contains the code for the popup window.

## 👨‍💻 Getting Started
- To build the extension, run the Gradle task app:buildExtension
- Load the extension in Google Chrome by opening the Extensions page (chrome://extensions/) and enabling Developer mode. Then, click on the "Load unpacked" button and select the app/build/distributions directory.
- Open a new tab and click on the extension button in the top-right corner of the browser to open the popup
- Click on the "Send message" button to test the communication between the popup and background scripts
- Check the console for logs from the background script

## 🔨 Build
Build extension:
```
./gradlew app:buildExtension
```

Build distribution (zip files):
```
./gradlew app:packageExtension
```

Read [this article](https://medium.com/@GaryLaurenceau/write-a-chrome-extension-with-kotlin-efef865d9381) for more details about this template.

## ✍️ Author

👤 **GaryLaurenceau**

* Twitter: <a href="https://twitter.com/GaryLaurenceau" target="_blank">@GaryLaurenceau</a>
* Email: gary.laurenceau@gmail.com
* Working on: https://pixel-perfect.dev and https://sumupnow.com

## 📝 License

```
MIT License

Copyright © 2023 - GaryLaurenceau

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```