package app.myoji.nickname.checkworkcount_plusbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.myoji.nickname.checkworkcount_plusbutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // バインディングクラスの変数
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }
    }
}