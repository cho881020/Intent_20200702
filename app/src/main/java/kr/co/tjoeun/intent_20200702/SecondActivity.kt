package kr.co.tjoeun.intent_20200702

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        들어온 데이터를 받아서 텍스트뷰에 반영

//        액티비티가 가진 intent변수를 통해서 첨부된 (String) 데이터 저장
        val receivedMessage = intent.getStringExtra("message")

//        저장한 데이터를 텍스트뷰에 반영
        receivedMessageTxt.text = receivedMessage


    }
}