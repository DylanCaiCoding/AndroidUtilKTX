@file:Suppress("unused")

package com.dylanc.utilktx

import android.view.Window
import com.blankj.utilcode.util.BrightnessUtils

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */
var isAutoBrightnessEnabled: Boolean
  get() = BrightnessUtils.isAutoBrightnessEnabled()
  set(value) {
    BrightnessUtils.setAutoBrightnessEnabled(value)
  }

fun setAutoBrightnessEnabled(enabled: Boolean): Boolean =
  BrightnessUtils.setAutoBrightnessEnabled(enabled)

var screenBrightness: Int
  get() = BrightnessUtils.getBrightness()
  set(value) {
    BrightnessUtils.setBrightness(value)
  }

fun setScreenBrightness(brightness: Int): Boolean =
  BrightnessUtils.setBrightness(brightness)

var Window.windowBrightness: Int
  get() = BrightnessUtils.getWindowBrightness(this)
  set(value) = BrightnessUtils.setWindowBrightness(this, value)