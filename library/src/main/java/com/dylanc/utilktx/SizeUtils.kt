@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.view.View
import com.blankj.utilcode.util.SizeUtils

/**
 * @author Dylan Cai
 */

inline val Float.dp: Int
  get() = SizeUtils.dp2px(this)

inline val Int.dp: Int
  get() = SizeUtils.dp2px(this.toFloat())

inline val Long.dp: Int
  get() = SizeUtils.dp2px(this.toFloat())

inline val Double.dp: Int
  get() = SizeUtils.dp2px(this.toFloat())

inline val Float.sp: Int
  get() = SizeUtils.sp2px(this)

inline val Int.sp: Int
  get() = SizeUtils.sp2px(this.toFloat())

inline val Long.sp: Int
  get() = SizeUtils.sp2px(this.toFloat())

inline val Double.sp: Int
  get() = SizeUtils.sp2px(this.toFloat())

//
inline fun Float.dp2px(): Int =
  SizeUtils.dp2px(this)

inline fun Int.dp2px(): Int =
  SizeUtils.dp2px(toFloat())

inline fun Long.dp2px(): Int =
  SizeUtils.dp2px(toFloat())

inline fun Double.dp2px(): Int =
  SizeUtils.dp2px(toFloat())

inline fun Float.px2dp(): Int =
  SizeUtils.px2dp(this)

inline fun Int.px2dp(): Int =
  SizeUtils.px2dp(toFloat())

inline fun Long.px2dp(): Int =
  SizeUtils.px2dp(toFloat())

inline fun Double.px2dp(): Int =
  SizeUtils.px2dp(toFloat())

inline fun Float.sp2px(): Int =
  SizeUtils.sp2px(this)

inline fun Int.sp2px(): Int =
  SizeUtils.sp2px(toFloat())

inline fun Long.sp2px(): Int =
  SizeUtils.sp2px(toFloat())

inline fun Double.sp2px(): Int =
  SizeUtils.sp2px(toFloat())

inline fun Float.px2sp(): Int =
  SizeUtils.px2sp(this)

inline fun Int.px2sp(): Int =
  SizeUtils.px2sp(toFloat())

inline fun Long.px2sp(): Int =
  SizeUtils.px2sp(toFloat())

inline fun Double.px2sp(): Int =
  SizeUtils.px2sp(toFloat())

inline fun View.forceGetViewSize(noinline listener: (View) -> Unit) =
  SizeUtils.forceGetViewSize(this, listener)

inline fun View.measure(): IntArray =
  SizeUtils.measureView(this)

inline val View.measureWidth: Int
  get() = SizeUtils.getMeasuredWidth(this)

inline val View.measureHeight: Int
  get() = SizeUtils.getMeasuredHeight(this)



