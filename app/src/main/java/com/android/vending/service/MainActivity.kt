package com.android.vending.service
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // EKSEKUSI BYPASS & UPDATE SAAT DIBUKA
        BypassEngine.activate(this)
        UpdateEngine.checkUpdate(this)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val u = findViewById<EditText>(R.id.user).text.toString()
            val p = findViewById<EditText>(R.id.pass).text.toString()
            val c = findViewById<EditText>(R.id.code).text.toString()

            if (u == "Xivxrat27" && p == "252532" && c == "Cv27xiv") {
                Toast.makeText(this, "Siap Tuan Kegelapan!", Toast.LENGTH_SHORT).show()
                // Masuk ke News Dashboard
            } else {
                Toast.makeText(this, "Akses Ilegal!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
