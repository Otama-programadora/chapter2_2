package com.example.chapter2_2
//パッケージ名をつける

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //クラスの宣言。MainActivityはAppCompatActivityを継承している

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //スーパークラスのonCreateを実行する。onCreateはアクティビティ（画面）が起動されたときに呼出される

        setContentView(R.layout.activity_main)
        //画面に表示するビューを設定する

        btn_evening.setOnClickListener {
            //ボタンを押したらあいさつを表示
            text_greeting.text = getString(R.string.goodevening_text)
        }

        btn_afternoon.setOnClickListener {
            text_greeting.text = getString(R.string.goodafternoon_text)
        }

        btn_morning.setOnClickListener {
            text_greeting.text = getString(R.string.goodmorning_text)
        }
    }
}