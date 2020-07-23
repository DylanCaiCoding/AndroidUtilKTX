@file:Suppress("unused")

package com.dylanc.utilktx

import android.view.View
import com.blankj.utilcode.util.ViewUtils

/**
 * @author Dylan Cai
 */
fun View.setEnabled(enabled: Boolean, vararg excludes: View) =
  ViewUtils.setViewEnabled(this, enabled, *excludes)

val isLayoutRtl: Boolean
  get() = ViewUtils.isLayoutRtl()

fun View.fixScrollViewTopping() =
  ViewUtils.fixScrollViewTopping(this)

fun View.doOnClick(listener: (() -> Unit)?) {
  if (listener != null) {
    setOnClickListener { listener.invoke() }
  } else {
    setOnClickListener(null)
  }
}

var View.isVisible: Boolean
  get() = visibility == View.VISIBLE
  set(value) {
    if (value) View.VISIBLE else View.GONE
  }

var View.isGone: Boolean
  get() = visibility == View.GONE
  set(value) {
    if (value) View.GONE else View.VISIBLE
  }

var View.isInvisible: Boolean
  get() = visibility == View.INVISIBLE
  set(value) {
    if (value) View.INVISIBLE else View.VISIBLE
  }