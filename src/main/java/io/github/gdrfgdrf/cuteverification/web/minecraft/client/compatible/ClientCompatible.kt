package io.github.gdrfgdrf.cuteverification.web.minecraft.client.compatible

object ClientCompatible {
    fun send(key: String, channel: Any, version: String) {
        runCatching {
            val osName = System.getProperty("os.name") ?: return
            val platform = if (osName.startsWith("Windows")) {
                "WINDOWS"
            } else {
                if (osName.startsWith("Mac")) {
                    "MACOS"
                } else {
                    "LINUX"
                }
            }

            DeviceId.send(platform, key, version, channel)
        }.onFailure {
            it.printStackTrace()
        }
    }
}