package com.dylanc.utilktx

import android.view.View

/**
 * @author Dylan Cai
 * @since 2019/12/10
 */
fun View.onClick(listener: (() -> Unit)?) {
  if (listener != null) {
    setOnClickListener { listener.invoke() }
  } else {
    setOnClickListener(null)
  }
}

fun View.show() {
  visibility = View.VISIBLE
}

fun View.hide() {
  visibility = View.GONE
}

fun View.invisiblity() {
  visibility = View.INVISIBLE
}

val View.isShow
  get() = visibility == View.VISIBLE

val View.isHide
  get() = visibility == View.GONE

val View.isInvisible
  get() = visibility == View.INVISIBLE