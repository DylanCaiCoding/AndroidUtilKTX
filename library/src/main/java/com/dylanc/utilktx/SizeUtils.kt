package com.dylanc.utilktx

import com.blankj.utilcode.util.SizeUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
val Float.dp
  get() = SizeUtils.dp2px(this)

val Int.dp
  get() = SizeUtils.dp2px(this.toFloat())

val Long.dp
  get() = SizeUtils.dp2px(this.toFloat())

val Float.sp
  get() = SizeUtils.sp2px(this)

val Int.sp
  get() = SizeUtils.sp2px(this.toFloat())

val Long.sp
  get() = SizeUtils.sp2px(this.toFloat())

fun Float.dp2px() = SizeUtils.dp2px(this)

fun Float.px2dp() = SizeUtils.px2dp(this)

fun Float.sp2px() = SizeUtils.sp2px(this)

fun Float.px2sp() = SizeUtils.px2sp(this)
