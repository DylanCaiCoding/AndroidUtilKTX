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

inline var isAutoBrightnessEnabled: Boolean
  get() = BrightnessUtils.isAutoBrightnessEnabled()
  @RequiresPermission(Manifest.permission.WRITE_SETTINGS)
  set(value) {
    BrightnessUtils.setAutoBrightnessEnabled(value)
  }

inline var brightness: Int
  get() = BrightnessUtils.getBrightness()
  @RequiresPermission(Manifest.permission.WRITE_SETTINGS)
  set(@IntRange(from = 0, to = 255) value) {
    BrightnessUtils.setBrightness(value)
  }

inline var Window.brightness: Int
  get() = BrightnessUtils.getWindowBrightness(this)
  set(value) = BrightnessUtils.setWindowBrightness(this, value)