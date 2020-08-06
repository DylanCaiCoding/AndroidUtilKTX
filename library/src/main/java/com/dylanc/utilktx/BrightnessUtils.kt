@file:Suppress("unused")

package com.dylanc.utilktx

import android.Manifest
import android.view.Window
import androidx.annotation.IntRange
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.BrightnessUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns whether automatic brightness mode is on or turns automatic brightness on or off.
 * This is equivalent to calling:
 * ```
 * BrightnessUtils.isAutoBrightnessEnabled()
 * ```
 * or
 * ```
 * BrightnessUtils.setAutoBrightnessEnabled(value)
 * ```
 */
inline var isAutoBrightnessEnabled: Boolean
  get() = BrightnessUtils.isAutoBrightnessEnabled()
  @RequiresPermission(Manifest.permission.WRITE_SETTINGS)
  set(value) {
    BrightnessUtils.setAutoBrightnessEnabled(value)
  }

/**
 * Returns the brightness of the screen or sets the brightness of the screen. This is equivalent to calling:
 * ```
 * BrightnessUtils.getBrightness()
 * ```
 * or
 * ```
 * BrightnessUtils.setBrightness(brightness)
 * ```
 */
inline var brightness: Int
  get() = BrightnessUtils.getBrightness()
  @RequiresPermission(Manifest.permission.WRITE_SETTINGS)
  set(@IntRange(from = 0, to = 255) value) {
    BrightnessUtils.setBrightness(value)
  }

/**
 * Returns the brightness of the window or sets the brightness of the window. This is equivalent to calling:
 * ```
 * BrightnessUtils.getBrightness(window)
 * ```
 * or
 * ```
 * BrightnessUtils.setBrightness(window, brightness)
 * ```
 */
inline var Window.brightness: Int
  get() = BrightnessUtils.getWindowBrightness(this)
  set(@IntRange(from = 0, to = 255) value) = BrightnessUtils.setWindowBrightness(this, value)