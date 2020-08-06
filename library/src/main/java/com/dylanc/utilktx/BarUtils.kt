@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission
import android.app.Activity
import android.os.Build
import android.view.View
import android.view.Window
import androidx.annotation.RequiresApi
import androidx.annotation.RequiresPermission
import androidx.drawerlayout.widget.DrawerLayout
import com.blankj.utilcode.util.BarUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns the height of the status bar. This is equivalent to calling:
 * ```
 * BarUtils.getStatusBarHeight()
 * ```
 */
inline val statusBarHeight: Int get() = BarUtils.getStatusBarHeight()

/**
 * Returns whether the status bar is visible or sets the status bar to be visible.
 * This is equivalent to calling:
 * ```
 * BarUtils.isStatusBarVisible(activity)
 * ```
 * or
 * ```
 * BarUtils.setStatusBarVisibility(activity, isVisible)
 * ```
 */
inline var Activity.isStatusBarVisible: Boolean
  get() = BarUtils.isStatusBarVisible(this)
  set(value) = BarUtils.setStatusBarVisibility(this, value)

/**
 * Sets the status bar to be visible. This is equivalent to calling:
 * ```
 * BarUtils.setStatusBarVisibility(window, isVisible)
 * ```
 */
inline var Window.isStatusBarVisible: Boolean
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = BarUtils.setStatusBarVisibility(this, value)

/**
 * Returns whether the status bar is light mode or sets the status bar to be light mode.
 * This is equivalent to calling:
 * ```
 * BarUtils.isStatusBarLightMode(activity)
 * ```
 * or
 * ```
 * BarUtils.setStatusBarLightMode(activity, isLightMode)
 * ```
 */
inline var Activity.isStatusBarLightMode: Boolean
  get() = BarUtils.isStatusBarLightMode(this)
  set(value) = BarUtils.setStatusBarLightMode(this, value)

/**
 * Returns whether the status bar is light mode or sets the status bar to be light mode.
 * This is equivalent to calling:
 * ```
 * BarUtils.isStatusBarLightMode(window)
 * ```
 * or
 * ```
 * BarUtils.setStatusBarLightMode(window, isLightMode)
 * ```
 */
inline var Window.isStatusBarLightMode: Boolean
  get() = BarUtils.isStatusBarLightMode(this)
  set(value) = BarUtils.setStatusBarLightMode(this, value)

/**
 * Add the top margin size equals the height of the status bar for view. This is equivalent to calling:
 * ```
 * BarUtils.addMarginTopEqualStatusBarHeight(view)
 * ```
 */
inline fun View.addMarginTopEqualStatusBarHeight() =
  BarUtils.addMarginTopEqualStatusBarHeight(this)

/**
 * Subtract the top margin size equals the height of the status bar for view. This is equivalent to calling:
 * ```
 * BarUtils.subtractMarginTopEqualStatusBarHeight(view)
 * ```
 */
inline fun View.subtractMarginTopEqualStatusBarHeight() =
  BarUtils.subtractMarginTopEqualStatusBarHeight(this)

/**
 * Sets the color of the status bar. This is equivalent to calling:
 * ```
 * BarUtils.setStatusBarColor(activity, color)
 * ```
 */
var Activity.statusBarColor: Int
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) {
    BarUtils.setStatusBarColor(this, value)
  }

/**
 * Sets the color of the status bar. This is equivalent to calling:
 * ```
 * BarUtils.setStatusBarColor(window, color)
 * ```
 */
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
inline fun Window.setStatusBarColor(color: Int, transparentStatusBar: Boolean = true) {
  if (transparentStatusBar) BarUtils.setStatusBarColor(this, color) else statusBarColor = color
}

/**
 * Sets the color of the status bar for drawer layout. This is equivalent to calling:
 * ```
 * BarUtils.setStatusBarColor4Drawer(drawerLayout, fakeStatusBar, color, isTop)
 * ```
 */
inline fun DrawerLayout.setStatusBarColor(fakeStatusBar: View, color: Int, isTop: Boolean = false) =
  BarUtils.setStatusBarColor4Drawer(this, fakeStatusBar, color, isTop)

/**
 * Sets the status bar transparent. This is equivalent to calling:
 * ```
 * BarUtils.transparentStatusBar(activity)
 * ```
 */
inline fun Activity.transparentStatusBar() = BarUtils.transparentStatusBar(this)

/**
 * Sets the status bar transparent. This is equivalent to calling:
 * ```
 * BarUtils.transparentStatusBar(window)
 * ```
 */
inline fun Window.transparentStatusBar() = BarUtils.transparentStatusBar(this)

/**
 * Returns the height of action bar. This is equivalent to calling:
 * ```
 * BarUtils.getActionBarHeight()
 * ```
 */
inline val actionBarHeight: Int get() = BarUtils.getActionBarHeight()

/**
 * Sets the notification bar to be visible. This is equivalent to calling:
 * ```
 * BarUtils.setNotificationBarVisibility(value)
 * ```
 */
inline var isNotificationBarVisible: Boolean
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  @RequiresPermission(permission.EXPAND_STATUS_BAR)
  set(value) = BarUtils.setNotificationBarVisibility(value)

/**
 * Returns the height of the navigation bar. This is equivalent to calling:
 * ```
 * BarUtils.getNavBarHeight()
 * ```
 */
inline val navBarHeight: Int get() = BarUtils.getNavBarHeight()

/**
 * Returns whether the navigation bar is visible or sets the navigation bar to be visible.
 * This is equivalent to calling:
 * ```
 * BarUtils.isNavBarVisible(activity)
 * ```
 * or
 * ```
 * BarUtils.setNavBarVisibility(activity, isVisible)
 * ```
 */
inline var Activity.isNavBarVisible: Boolean
  get() = BarUtils.isNavBarVisible(this)
  set(value) = BarUtils.setNavBarVisibility(this, value)

/**
 * Returns whether the navigation bar is visible. This is equivalent to calling:
 * ```
 * BarUtils.isNavBarVisible(window)
 * ```
 */
inline var Window.isNavBarVisible: Boolean
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = BarUtils.setNavBarVisibility(this, value)

/**
 * Returns the color of the navigation bar or sets the color of the navigation bar.
 * This is equivalent to calling:
 * ```
 * BarUtils.getNavBarColor(activity)
 * ```
 * or
 * ```
 * BarUtils.setNavBarColor(activity, isVisible)
 * ```
 */
inline var Activity.navBarColor: Int
  @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
  get() = BarUtils.getNavBarColor(this)
  @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
  set(value) = BarUtils.setNavBarColor(this, value)

/**
 * Returns the color of the navigation bar or sets the color of the navigation bar.
 * This is equivalent to calling:
 * ```
 * BarUtils.getNavBarColor(window)
 * ```
 * or
 * ```
 * BarUtils.setNavBarColor(window, isVisible)
 * ```
 */
inline var Window.navBarColor: Int
  @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
  get() = BarUtils.getNavBarColor(this)
  @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
  set(value) = BarUtils.setNavBarColor(this, value)

/**
 * Returns whether the navigation bar is visible. This is equivalent to calling:
 * ```
 * BarUtils.isSupportNavBar()
 * ```
 */
inline val isSupportNavBar: Boolean get() = BarUtils.isSupportNavBar()

/**
 * Returns whether the navigation bar is light mode or sets the navigation bar to be light mode.
 * This is equivalent to calling:
 * ```
 * BarUtils.isNavBarLightMode(activity)
 * ```
 * or
 * ```
 * BarUtils.setNavBarLightMode(activity, isLightMode)
 * ```
 */
inline var Activity.isNavBarLightMode: Boolean
  get() = BarUtils.isNavBarLightMode(this)
  set(value) = BarUtils.setNavBarLightMode(this, value)

/**
 * Returns whether the navigation bar is light mode or sets the navigation bar to be light mode.
 * This is equivalent to calling:
 * ```
 * BarUtils.isNavBarLightMode(window)
 * ```
 * or
 * ```
 * BarUtils.setNavBarLightMode(window, isLightMode)
 * ```
 */
inline var Window.isNavBarLightMode: Boolean
  get() = BarUtils.isNavBarLightMode(this)
  set(value) = BarUtils.setNavBarLightMode(this, value)