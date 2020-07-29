@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission
import android.app.Activity
import android.graphics.Bitmap
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.ScreenUtils

/**
 * @author Dylan Cai
 */

inline val screenWidth: Int
  get() = ScreenUtils.getScreenWidth()

inline val screenHeight: Int
  get() = ScreenUtils.getScreenHeight()

inline val appScreenWidth: Int
  get() = ScreenUtils.getAppScreenWidth()

inline val appScreenHeight: Int
  get() = ScreenUtils.getAppScreenHeight()

inline val screenDensity: Float
  get() = ScreenUtils.getScreenDensity()

inline val screenDensityDpi: Int
  get() = ScreenUtils.getScreenDensityDpi()

//
inline fun Activity.setFullScreen() =
  ScreenUtils.setFullScreen(this)

inline fun Activity.setNonFullScreen() =
  ScreenUtils.setNonFullScreen(this)

inline fun Activity.toggleFullScreen() =
  ScreenUtils.toggleFullScreen(this)

inline var Activity.isFullScreen: Boolean
  get() = ScreenUtils.isFullScreen(this)
  set(value) {
    if (value) {
      ScreenUtils.setFullScreen(this)
    } else {
      ScreenUtils.setNonFullScreen(this)
    }
  }

inline fun Activity.setLandscape() =
  ScreenUtils.setLandscape(this)

inline fun Activity.setPortrait() =
  ScreenUtils.setPortrait(this)

inline val isLandscape: Boolean
  get() = ScreenUtils.isLandscape()

inline val isPortrait: Boolean
  get() = ScreenUtils.isPortrait()

inline val Activity.screenRotation: Int
  get() = ScreenUtils.getScreenRotation(this)

inline fun Activity.screenShot(isDeleteStatusBar: Boolean = false): Bitmap =
  ScreenUtils.screenShot(this, isDeleteStatusBar)

inline val isScreenLock: Boolean
  get() = ScreenUtils.isScreenLock()

inline var sleepDuration: Int
  get() = ScreenUtils.getSleepDuration()
  @RequiresPermission(permission.WRITE_SETTINGS)
  set(value) = ScreenUtils.setSleepDuration(value)

