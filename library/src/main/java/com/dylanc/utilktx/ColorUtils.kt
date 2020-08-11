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

/**
 * Returns a color associated with a particular resource ID. This is equivalent to calling:
 * ```
 * ColorUtils.getColor(id)
 * ```
 */
inline fun colorOf(@ColorRes id: Int): Int = ColorUtils.getColor(id)

/**
 * Sets the alpha component of the color. This is equivalent to calling:
 * ```
 * ColorUtils.setAlphaComponent(color, alpha)
 * ```
 */
inline fun @receiver:ColorInt Int.convertAlpha(@IntRange(from = 0x0, to = 0xFF) alpha: Int): Int =
  ColorUtils.setAlphaComponent(this, alpha)

/**
 * Sets the alpha component of the color. This is equivalent to calling:
 * ```
 * ColorUtils.setAlphaComponent(color, alpha)
 * ```
 */
inline fun @receiver:ColorInt Int.convertAlpha(@FloatRange(from = 0.0, to = 1.0) alpha: Float): Int =
  ColorUtils.setAlphaComponent(this, alpha)

/**
 * Sets the red component of the color. This is equivalent to calling:
 * ```
 * ColorUtils.setRedComponent(color, red)
 * ```
 */
inline fun @receiver:ColorInt Int.convertRed(@IntRange(from = 0x0, to = 0xFF) red: Int): Int =
  ColorUtils.setRedComponent(this, red)

/**
 * Sets the red component of the color. This is equivalent to calling:
 * ```
 * ColorUtils.setRedComponent(color, red)
 * ```
 */
inline fun @receiver:ColorInt Int.convertRed(@FloatRange(from = 0.0, to = 1.0) red: Float): Int =
  ColorUtils.setRedComponent(this, red)

/**
 * Sets the green component of the color. This is equivalent to calling:
 * ```
 * ColorUtils.setGreenComponent(color, green)
 * ```
 */
inline fun @receiver:ColorInt Int.convertGreen(@IntRange(from = 0x0, to = 0xFF) green: Int): Int =
  ColorUtils.setGreenComponent(this, green)

/**
 * Sets the green component of the color. This is equivalent to calling:
 * ```
 * ColorUtils.setGreenComponent(color, green)
 * ```
 */
inline fun @receiver:ColorInt Int.convertGreen(@FloatRange(from = 0.0, to = 1.0) green: Float): Int =
  ColorUtils.setGreenComponent(this, green)

/**
 * Sets the blue component of the color. This is equivalent to calling:
 * ```
 * ColorUtils.setBlueComponent(color, blue)
 * ```
 */
inline fun @receiver:ColorInt Int.convertBlue(@IntRange(from = 0x0, to = 0xFF) blue: Int): Int =
  ColorUtils.setBlueComponent(this, blue)

/**
 * Sets the blue component of the color. This is equivalent to calling:
 * ```
 * ColorUtils.setBlueComponent(color, blue)
 * ```
 */
inline fun @receiver:ColorInt Int.convertBlue(@FloatRange(from = 0.0, to = 1.0) blue: Float): Int =
  ColorUtils.setBlueComponent(this, blue)

/**
 * Converts the color int to the RGB string. This is equivalent to calling:
 * ```
 * ColorUtils.int2RgbString(colorInt)
 * ```
 */
inline fun @receiver:ColorInt Int.toRgbColorString(): String = ColorUtils.int2RgbString(this)

/**
 * Converts the color int to the ARGB string. This is equivalent to calling:
 * ```
 * ColorUtils.int2RgbString(colorInt)
 * ```
 */
inline fun @receiver:ColorInt Int.toArgbColorString(): String = ColorUtils.int2ArgbString(this)

/**
 * Returns a random color. This is equivalent to calling:
 * ```
 * ColorUtils.getRandomColor()
 * ```
 */
inline val randomColor: Int get() = ColorUtils.getRandomColor()

/**
 * Returns a random color. This is equivalent to calling:
 * ```
 * ColorUtils.getRandomColor(supportAlpha)
 * ```
 */
inline fun randomColorOf(supportAlpha: Boolean): Int = ColorUtils.getRandomColor(supportAlpha)