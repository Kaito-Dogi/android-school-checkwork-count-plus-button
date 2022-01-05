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

        // 整数を管理する変数
        var count: Int = 0

        // plus_buttonをクリックした時の処理
        binding.plusButton.setOnClickListener {
            // countの値を1増やす
            count += 1
            // 以下のような書き方もOK！
            // count = count + 1
            // count++

            // countの値をcount_textに表示する
            binding.countText.text = count.toString()
        }
    }
}
