package com.dylanc.utilktx.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dylanc.retrofit.helper.DOMAIN_HEADER
import com.dylanc.retrofit.helper.RetrofitHelper
import com.dylanc.retrofit.helper.RetrofitManager
import com.dylanc.utilktx.Logger
import com.dylanc.utilktx.debug
import com.dylanc.utilktx.json
import com.dylanc.utilktx.onClick
import kotlinx.android.synthetic.main.activity_main.*
import me.jessyan.progressmanager.ProgressManager
import me.jessyan.retrofiturlmanager.RetrofitUrlManager
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity(), Logger {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }
}
