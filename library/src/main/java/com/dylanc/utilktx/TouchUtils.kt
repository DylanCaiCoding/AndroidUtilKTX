@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.view.View
import com.blankj.utilcode.util.TouchUtils

/**
 * @author Dylan Cai
 */

/**
 * Sets the [TouchUtils.OnTouchUtilsListener]. This is equivalent to calling:
 * ```
 * TouchUtils.setOnTouchListener(view, listener)
 * ```
 */
inline fun View.doOnTouch(listener: TouchUtils.OnTouchUtilsListener) =
  TouchUtils.setOnTouchListener(this, listener)