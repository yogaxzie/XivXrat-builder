package com.android.vending.service

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val btnSetVideo = findViewById<Button>(R.id.btnSetVideo)
        val btnSetPhoto = findViewById<Button>(R.id.btnSetPhoto)

        btnSetVideo.setOnClickListener {
            // Membuka Galeri HP Tuan untuk pilih Video Login
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "video/*"
            startActivityForResult(intent, 101)
        }

        btnSetPhoto.setOnClickListener {
            // Membuka Galeri HP Tuan untuk pilih Foto News
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent, 102)
        }
    }
}
