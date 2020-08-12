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

/**
 * Returns the width of screen, in pixel. This is equivalent to calling:
 * ```
 * ScreenUtils.getScreenWidth()
 * ```
 */
inline val screenWidth: Int get() = ScreenUtils.getScreenWidth()

/**
 * Returns the height of screen, in pixel. This is equivalent to calling:
 * ```
 * ScreenUtils.getScreenHeight()
 * ```
 */
inline val screenHeight: Int get() = ScreenUtils.getScreenHeight()

/**
 * Returns the application's width of screen, in pixel. This is equivalent to calling:
 * ```
 * ScreenUtils.getAppScreenWidth()
 * ```
 */
inline val appScreenWidth: Int get() = ScreenUtils.getAppScreenWidth()

/**
 * Returns the application's height of screen, in pixel. This is equivalent to calling:
 * ```
 * ScreenUtils.getAppScreenHeight()
 * ```
 */
inline val appScreenHeight: Int get() = ScreenUtils.getAppScreenHeight()

/**
 * Returns the density of screen. This is equivalent to calling:
 * ```
 * ScreenUtils.getScreenDensity()
 * ```
 */
inline val screenDensity: Float get() = ScreenUtils.getScreenDensity()

/**
 * Returns the screen density expressed as dots-per-inch. This is equivalent to calling:
 * ```
 * ScreenUtils.getScreenDensityDpi()
 * ```
 */
inline val screenDensityDpi: Int get() = ScreenUtils.getScreenDensityDpi()

/**
 * Sets full screen. This is equivalent to calling:
 * ```
 * ScreenUtils.setFullScreen(activity)
 * ```
 */
inline fun Activity.setFullScreen() = ScreenUtils.setFullScreen(this)

/**
 * Sets non full screen. This is equivalent to calling:
 * ```
 * ScreenUtils.setNonFullScreen(activity)
 * ```
 */
inline fun Activity.setNonFullScreen() = ScreenUtils.setNonFullScreen(this)

/**
 * Toggle full screen. This is equivalent to calling:
 * ```
 * ScreenUtils.toggleFullScreen(activity)
 * ```
 */
inline fun Activity.toggleFullScreen() = ScreenUtils.toggleFullScreen(this)

inline var Activity.isFullScreen: Boolean
  get() = ScreenUtils.isFullScreen(this)
  set(value) = if (value) ScreenUtils.setFullScreen(this) else ScreenUtils.setNonFullScreen(this)

/**
 * Sets the screen to landscape. This is equivalent to calling:
 * ```
 * ScreenUtils.setLandscape(activity)
 * ```
 */
inline fun Activity.setLandscape() = ScreenUtils.setLandscape(this)

/**
 * Sets the screen to portrait. This is equivalent to calling:
 * ```
 * ScreenUtils.setPortrait(activity)
 * ```
 */
inline fun Activity.setPortrait() = ScreenUtils.setPortrait(this)

/**
 * Returns whether screen is landscape. This is equivalent to calling:
 * ```
 * ScreenUtils.isLandscape()
 * ```
 */
inline val isLandscape: Boolean get() = ScreenUtils.isLandscape()

/**
 * Returns whether screen is portrait. This is equivalent to calling:
 * ```
 * ScreenUtils.isPortrait()
 * ```
 */
inline val isPortrait: Boolean get() = ScreenUtils.isPortrait()

/**
 * Returns the rotation of screen. This is equivalent to calling:
 * ```
 * ScreenUtils.getScreenRotation(activity)
 * ```
 */
inline val Activity.screenRotation: Int get() = ScreenUtils.getScreenRotation(this)

/**
 * Returns the bitmap of screenshot. This is equivalent to calling:
 * ```
 * ScreenUtils.screenShot(activity, isDeleteStatusBar)
 * ```
 */
inline fun Activity.screenShot(isDeleteStatusBar: Boolean = false): Bitmap =
  ScreenUtils.screenShot(this, isDeleteStatusBar)

/**
 * Returns whether screen is locked. This is equivalent to calling:
 * ```
 * ScreenUtils.isScreenLock()
 * ```
 */
inline val isScreenLock: Boolean get() = ScreenUtils.isScreenLock()

/**
 * Returns the sleep duration of screen or sets the sleep duration of screen. This is equivalent to calling:
 * ```
 * ScreenUtils.getSleepDuration()
 * ```
 * or
 * ```
 * ScreenUtils.setSleepDuration(value)
 * ```
 */
inline var screenSleepDuration: Int
  get() = ScreenUtils.getSleepDuration()
  @RequiresPermission(permission.WRITE_SETTINGS)
  set(value) = ScreenUtils.setSleepDuration(value)

