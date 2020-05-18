@file:Suppress("unused")

package com.dylanc.utilktx

import android.app.Activity
import android.graphics.Bitmap
import com.blankj.utilcode.util.ScreenUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
val screenWidth: Int
  get() = ScreenUtils.getScreenWidth()

val screenHeight: Int
  get() = ScreenUtils.getScreenHeight()

val appScreenWidth: Int
  get() = ScreenUtils.getAppScreenWidth()

val appScreenHeight: Int
  get() = ScreenUtils.getAppScreenHeight()

val screenDensity: Float
  get() = ScreenUtils.getScreenDensity()

val screenDensityDpi: Int
  get() = ScreenUtils.getScreenDensityDpi()

fun Activity.setFullScreen() =
  ScreenUtils.setFullScreen(this)

fun Activity.setNonFullScreen() =
  ScreenUtils.setNonFullScreen(this)

fun Activity.toggleFullScreen() =
  ScreenUtils.toggleFullScreen(this)

val Activity.isFullScreen: Boolean
  get() = ScreenUtils.isFullScreen(this)

fun Activity.setLandscape() =
  ScreenUtils.setLandscape(this)

fun Activity.setPortrait() =
  ScreenUtils.setPortrait(this)

fun isLandscape(): Boolean =
  ScreenUtils.isLandscape()

fun isPortrait(): Boolean =
  ScreenUtils.isPortrait()

val Activity.screenRotation: Int
  get() = ScreenUtils.getScreenRotation(this)

fun Activity.screenShot(isDeleteStatusBar: Boolean = false): Bitmap =
  ScreenUtils.screenShot(this, isDeleteStatusBar)

fun isScreenLock(): Boolean =
  ScreenUtils.isScreenLock()

var sleepDuration: Int
  set(value) = ScreenUtils.setSleepDuration(value)
  get() = ScreenUtils.getSleepDuration()

