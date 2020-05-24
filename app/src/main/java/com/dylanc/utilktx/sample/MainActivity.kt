package com.dylanc.utilktx.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.MapUtils
import com.dylanc.utilktx.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    tv.setShadow {
      radius(8.dp.toFloat())
      size(4.dp)
    }

    notify(1) {
      setSmallIcon(R.mipmap.ic_launcher)
      setContentText("klasdja jaslkjdklasjdlkajsdlkjal k")
    }
  }
}
