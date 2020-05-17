@file:Suppress("unused")

package com.dylanc.utilktx

import android.view.View
import com.blankj.utilcode.util.SizeUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
val Float.dp: Int
  get() = SizeUtils.dp2px(this)

val Int.dp: Int
  get() = SizeUtils.dp2px(this.toFloat())

val Long.dp: Int
  get() = SizeUtils.dp2px(this.toFloat())

val Double.dp: Int
  get() = SizeUtils.dp2px(this.toFloat())

val Float.sp: Int
  get() = SizeUtils.sp2px(this)

val Int.sp: Int
  get() = SizeUtils.sp2px(this.toFloat())

val Long.sp: Int
  get() = SizeUtils.sp2px(this.toFloat())

val Double.sp: Int
  get() = SizeUtils.sp2px(this.toFloat())

fun Float.dp2px(): Int =
  SizeUtils.dp2px(this)

fun Int.dp2px(): Int =
  SizeUtils.dp2px(toFloat())

fun Long.dp2px(): Int =
  SizeUtils.dp2px(toFloat())

fun Double.dp2px(): Int =
  SizeUtils.dp2px(toFloat())

fun Float.px2dp(): Int =
  SizeUtils.px2dp(this)

fun Int.px2dp(): Int =
  SizeUtils.px2dp(toFloat())

fun Long.px2dp(): Int =
  SizeUtils.px2dp(toFloat())

fun Double.px2dp(): Int =
  SizeUtils.px2dp(toFloat())

fun Float.sp2px(): Int =
  SizeUtils.sp2px(this)

fun Int.sp2px(): Int =
  SizeUtils.sp2px(toFloat())

fun Long.sp2px(): Int =
  SizeUtils.sp2px(toFloat())

fun Double.sp2px(): Int =
  SizeUtils.sp2px(toFloat())

fun Float.px2sp(): Int =
  SizeUtils.px2sp(this)

fun Int.px2sp(): Int =
  SizeUtils.px2sp(toFloat())

fun Long.px2sp(): Int =
  SizeUtils.px2sp(toFloat())

fun Double.px2sp(): Int =
  SizeUtils.px2sp(toFloat())

fun View.forceGetViewSize(listener: (View) -> Unit) =
  SizeUtils.forceGetViewSize(this, listener)

fun View.measure(): IntArray =
  SizeUtils.measureView(this)

val View.measureWidth: Int
  get() = SizeUtils.getMeasuredWidth(this)

val View.measureHeight: Int
  get() = SizeUtils.getMeasuredHeight(this)



