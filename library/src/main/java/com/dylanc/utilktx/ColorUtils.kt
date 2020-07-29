@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.FloatRange
import androidx.annotation.IntRange
import com.blankj.utilcode.util.ColorUtils

/**
 * @author Dylan Cai
 */

inline fun colorOf(@ColorRes id: Int): Int =
  ColorUtils.getColor(id)

inline fun @receiver:ColorInt Int.convertAlpha(
  @IntRange(from = 0x0, to = 0xFF) alpha: Int
) =
  ColorUtils.setAlphaComponent(this, alpha)

inline fun @receiver:ColorInt Int.convertAlpha(
  @FloatRange(from = 0.0, to = 1.0) alpha: Float
) =
  ColorUtils.setAlphaComponent(this, alpha)

inline fun @receiver:ColorInt Int.convertRed(
  @IntRange(from = 0x0, to = 0xFF) alpha: Int
) =
  ColorUtils.setRedComponent(this, alpha)

inline fun @receiver:ColorInt Int.convertRed(
  @FloatRange(from = 0.0, to = 1.0) alpha: Float
) =
  ColorUtils.setRedComponent(this, alpha)

inline fun @receiver:ColorInt Int.convertGreen(
  @IntRange(from = 0x0, to = 0xFF) alpha: Int
) =
  ColorUtils.setGreenComponent(this, alpha)

inline fun @receiver:ColorInt Int.convertGreen(
  @FloatRange(from = 0.0, to = 1.0) alpha: Float
) =
  ColorUtils.setGreenComponent(this, alpha)

inline fun @receiver:ColorInt Int.convertBlue(
  @IntRange(from = 0x0, to = 0xFF) alpha: Int
) =
  ColorUtils.setBlueComponent(this, alpha)

inline fun @receiver:ColorInt Int.convertBlue(
  @FloatRange(from = 0.0, to = 1.0) alpha: Float
) =
  ColorUtils.setBlueComponent(this, alpha)

inline fun @receiver:ColorInt Int.toRgbColorString(): String =
  ColorUtils.int2RgbString(this)

inline fun @receiver:ColorInt Int.toArgbColorString(): String =
  ColorUtils.int2ArgbString(this)

inline val randomColor: Int
  get() = ColorUtils.getRandomColor()

inline fun randomColorOf(supportAlpha: Boolean): Int =
  ColorUtils.getRandomColor(supportAlpha)