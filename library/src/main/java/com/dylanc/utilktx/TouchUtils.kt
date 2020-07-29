@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.view.View
import com.blankj.utilcode.util.TouchUtils

/**
 * @author Dylan Cai
 */

inline fun View.doOnTouch(listener: TouchUtils.OnTouchUtilsListener) =
  TouchUtils.setOnTouchListener(this, listener)