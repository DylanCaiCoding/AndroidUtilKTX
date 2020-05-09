package com.dylanc.utilktx

import androidx.annotation.ColorRes
import androidx.annotation.FloatRange
import androidx.annotation.IntRange
import com.blankj.utilcode.util.ColorUtils

/**
 * @author Dylan Cai
 * @since 2019/12/12
 */
fun colorOf(@ColorRes id: Int) =
  ColorUtils.getColor(id)

fun Int.setColorAlpha(@IntRange(from = 0x0, to = 0xFF) alpha: Int) =
  ColorUtils.setAlphaComponent(this, alpha)

fun Int.setColorAlpha(@FloatRange(from = 0.0, to = 1.0) alpha: Float) =
  ColorUtils.setAlphaComponent(this, alpha)

fun Int.setColorRedComponent(@IntRange(from = 0x0, to = 0xFF) alpha: Int) =
  ColorUtils.setRedComponent(this, alpha)

fun Int.setColorRedComponent(@FloatRange(from = 0.0, to = 1.0) alpha: Float) =
  ColorUtils.setRedComponent(this, alpha)

fun Int.setColorGreenComponent(@IntRange(from = 0x0, to = 0xFF) alpha: Int) =
  ColorUtils.setGreenComponent(this, alpha)

fun Int.setColorGreenComponent(@FloatRange(from = 0.0, to = 1.0) alpha: Float) =
  ColorUtils.setGreenComponent(this, alpha)

fun Int.setColorBlueComponent(@IntRange(from = 0x0, to = 0xFF) alpha: Int) =
  ColorUtils.setBlueComponent(this, alpha)

fun Int.setColorBlueComponent(@FloatRange(from = 0.0, to = 1.0) alpha: Float) =
  ColorUtils.setBlueComponent(this, alpha)

fun String.string2Color() =
  ColorUtils.string2Int(this)

fun Int.color2RgbString(): String =
  ColorUtils.int2RgbString(this)

fun Int.color2ArgbString(): String =
  ColorUtils.int2ArgbString(this)

val randomColor
  get() = ColorUtils.getRandomColor()

fun randomColorOf(supportAlpha: Boolean) =
  ColorUtils.getRandomColor(supportAlpha)