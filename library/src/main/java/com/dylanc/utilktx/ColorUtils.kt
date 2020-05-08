package com.dylanc.utilktx

import androidx.annotation.ColorRes
import androidx.annotation.FloatRange
import androidx.annotation.IntRange
import com.blankj.utilcode.util.ColorUtils

/**
 * @author Dylan Cai
 * @since 2019/12/12
 */
fun colorOf(@ColorRes id: Int) = ColorUtils.getColor(id)

fun Int.setColorAlpha(@IntRange alpha: Int) = ColorUtils.setAlphaComponent(this, alpha)

fun Int.setColorAlpha(@FloatRange alpha: Float) = ColorUtils.setAlphaComponent(this, alpha)

fun Int.setColorRedComponent(@IntRange alpha: Int) = ColorUtils.setRedComponent(this, alpha)

fun Int.setColorRedComponent(@FloatRange alpha: Float) = ColorUtils.setRedComponent(this, alpha)

fun Int.setColorGreenComponent(@IntRange alpha: Int) = ColorUtils.setGreenComponent(this, alpha)

fun Int.setColorGreenComponent(@FloatRange alpha: Float) = ColorUtils.setGreenComponent(this, alpha)

fun Int.setColorBlueComponent(@IntRange alpha: Int) = ColorUtils.setBlueComponent(this, alpha)

fun Int.setColorBlueComponent(@FloatRange alpha: Float) = ColorUtils.setBlueComponent(this, alpha)

fun String.string2Color() = ColorUtils.string2Int(this)

fun Int.color2RgbString():String = ColorUtils.int2RgbString(this)

fun Int.color2ArgbString():String = ColorUtils.int2ArgbString(this)

val randomColor
  get() = ColorUtils.getRandomColor()

fun randomColorOf(supportAlpha: Boolean) = ColorUtils.getRandomColor(supportAlpha)