package tr.com.nuritiras.ogrenmebirimi4uygulama3

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onClickOnayla(view: View) {

        val kullaniciAdi = "fatih"
        val sifre = "1453"

        val userName = findViewById<EditText>(R.id.editTextUserName).text.toString()
        val password = findViewById<EditText>(R.id.editTextPassword).text.toString()

        if (kullaniciAdi.equals(userName) && sifre.equals(password))
            Toast.makeText(this, "Kullanıcı Girişi Başarılı", Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this, "Kullanıcı Adı veya Şifresi Hatalı", Toast.LENGTH_LONG).show()
    }
}