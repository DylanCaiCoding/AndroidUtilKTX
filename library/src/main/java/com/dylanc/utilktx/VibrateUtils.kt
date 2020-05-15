package com.dylanc.utilktx

import com.blankj.utilcode.util.VibrateUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
fun vibrate(milliseconds: Long) =
  VibrateUtils.vibrate(milliseconds)

fun vibrate(pattern: LongArray, repeat: Int) =
  VibrateUtils.vibrate(pattern, repeat)

fun cancelVibrate() =
  VibrateUtils.cancel()