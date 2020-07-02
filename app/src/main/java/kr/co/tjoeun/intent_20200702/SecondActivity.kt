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

//        첨부된 Int 데이터를 변수에 저장.
//        만약 첨부가 안되었다면 -1을 대신 집어넣자.
//        JAVA의 기본형 변수를 받을때만 필요한 작업.
        val recNum = intent.getIntExtra("number", -1)

//        받은데이터 : 1234 등 숫자.
//        세팅할 내용 => "고유번호 : 1234" 등 가공된 String
        numberTxt.text = "고유번호 : ${recNum}"


    }
}