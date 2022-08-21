package jp.techacademy.asuki.kamada.kotolinlog3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


                Log.d("kotlintest", "ログへの出力テスト")

        val p1 = Human("kamadda",23,"java")
        p1.say()
        p1.think()
        val p2 = Human("asuki", 24,"kotlin")
        p2.say()
        p2.think()




    }
}