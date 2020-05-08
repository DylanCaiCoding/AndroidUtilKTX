package com.dylanc.utilktx

import android.app.Activity
import android.graphics.Bitmap
import com.blankj.utilcode.util.ScreenUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
val screenWidth
  get() = ScreenUtils.getScreenWidth()

val screenHeight
  get() = ScreenUtils.getScreenHeight()

val appScreenWidth
  get() = ScreenUtils.getAppScreenWidth()

val appScreenHeight
  get() = ScreenUtils.getAppScreenHeight()

val screenDensity
  get() = ScreenUtils.getScreenDensity()

val screenDensityDpi
  get() = ScreenUtils.getScreenDensityDpi()

fun Activity.fullScreen() = ScreenUtils.setFullScreen(this)

fun Activity.cancelFullScreen() = ScreenUtils.setNonFullScreen(this)

fun Activity.toggleFullScreen() = ScreenUtils.toggleFullScreen(this)

val Activity.isFullScreen
  get() = ScreenUtils.isFullScreen(this)

fun Activity.setLandscape() = ScreenUtils.setLandscape(this)

fun Activity.setPortrait() = ScreenUtils.setPortrait(this)

val isLandscape
  get() = ScreenUtils.isLandscape()

val isPortrait
  get() = ScreenUtils.isPortrait()

val Activity.screenRotation
  get() = ScreenUtils.getScreenRotation(this)

fun Activity.screenShot(isDeleteStatusBar: Boolean = false):Bitmap =
  ScreenUtils.screenShot(this, isDeleteStatusBar)

val isScreenLock
  get() = ScreenUtils.isScreenLock()

fun setSleepDuration(duration:Int) = ScreenUtils.setSleepDuration(duration)

val sleepDuration
  get() = ScreenUtils.getSleepDuration()

