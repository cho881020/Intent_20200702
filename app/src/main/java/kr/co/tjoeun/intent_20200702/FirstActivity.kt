package kr.co.tjoeun.intent_20200702

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        backToMainBtn.setOnClickListener {

//            메인 화면으로 복귀

//            Intent로 복귀하면, 새 화면이 계속 쌓이는 코드.
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)

//            복귀 : FirstActivity 종료.
            finish()

        }

    }
}