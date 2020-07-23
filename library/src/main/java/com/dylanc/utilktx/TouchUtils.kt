@file:Suppress("unused")

package com.dylanc.utilktx

import android.view.View
import com.blankj.utilcode.util.TouchUtils

/**
 * @author Dylan Cai
 */
fun View?.setOnTouchListener(listener: TouchUtils.OnTouchUtilsListener) =
  TouchUtils.setOnTouchListener(this, listener)