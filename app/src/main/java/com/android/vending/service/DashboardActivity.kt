package com.android.vending.service

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val newsImg = findViewById<ImageView>(R.id.newsImage)
        val btnSettings = findViewById<Button>(R.id.btnSettingsAdmin)

        // LOGIKA SETTINGS ADMIN (UBAH NEWS/FOTO)
        btnSettings.setOnClickListener {
            // Pindah ke halaman pengaturan (Media Picker)
            Toast.makeText(this, "Siap Tuan, Membuka Ruang Kendali...", Toast.LENGTH_SHORT).show()
        }

        // Tampilkan notifikasi ke Telegram bahwa Admin sedang login
        TelegramEngine.send("👑 MASTER LOGIN: Ghostbuster Bhoppy sedang memantau Dashboard.")
    }
}
