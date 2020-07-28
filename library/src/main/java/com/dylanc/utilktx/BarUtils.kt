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

inline val statusBarHeight: Int
  get() = BarUtils.getStatusBarHeight()

inline var Activity.isStatusBarVisible: Boolean
  get() = BarUtils.isStatusBarVisible(this)
  set(value) = BarUtils.setStatusBarVisibility(this, value)

inline var Window.isStatusBarVisible: Boolean
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = BarUtils.setStatusBarVisibility(this, value)

inline var Activity.isStatusBarLightMode: Boolean
  get() = BarUtils.isStatusBarLightMode(this)
  set(value) = BarUtils.setStatusBarLightMode(this, value)

inline var Window.isStatusBarLightMode: Boolean
  get() = BarUtils.isStatusBarLightMode(this)
  set(value) = BarUtils.setStatusBarLightMode(this, value)

inline fun View.addMarginTopEqualStatusBarHeight() =
  BarUtils.addMarginTopEqualStatusBarHeight(this)

inline fun View.subtractMarginTopEqualStatusBarHeight() =
  BarUtils.subtractMarginTopEqualStatusBarHeight(this)

var Activity.statusBarColor: Int
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) {
    BarUtils.setStatusBarColor(this, value)
  }

inline fun Activity.setStatusBarColor(color: Int): View? =
  BarUtils.setStatusBarColor(this, color)

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
inline fun Window.setStatusBarColor(color: Int): View? =
  BarUtils.setStatusBarColor(this, color)

inline fun DrawerLayout.setStatusBarColor(fakeStatusBar: View, color: Int, isTop: Boolean = false) =
  BarUtils.setStatusBarColor4Drawer(this, fakeStatusBar, color, isTop)

inline fun Activity.transparentStatusBar() =
  BarUtils.transparentStatusBar(this)

inline fun Window.transparentStatusBar() =
  BarUtils.transparentStatusBar(this)

inline val actionBarHeight: Int
  get() = BarUtils.getActionBarHeight()

inline var isNotificationBarVisible: Boolean
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  @RequiresPermission(permission.EXPAND_STATUS_BAR)
  set(value) = BarUtils.setNotificationBarVisibility(value)

inline val navBarHeight: Int
  get() = BarUtils.getNavBarHeight()

inline var Activity.isNavBarVisible: Boolean
  get() = BarUtils.isNavBarVisible(this)
  set(value) = BarUtils.setNavBarVisibility(this, value)

inline var Window.isNavBarVisible: Boolean
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = BarUtils.setNavBarVisibility(this, value)

inline var Activity.navBarColor: Int
  @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
  get() = BarUtils.getNavBarColor(this)
  @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
  set(value) = BarUtils.setNavBarColor(this, value)

inline var Window.navBarColor: Int
  @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
  get() = BarUtils.getNavBarColor(this)
  @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
  set(value) = BarUtils.setNavBarColor(this, value)

inline val isSupportNavBar: Boolean
  get() = BarUtils.isSupportNavBar()

inline var Activity.isNavBarLightMode: Boolean
  get() = BarUtils.isNavBarLightMode(this)
  set(value) = BarUtils.setNavBarLightMode(this, value)

inline var Window.isNavBarLightMode: Boolean
  get() = BarUtils.isNavBarLightMode(this)
  set(value) = BarUtils.setNavBarLightMode(this, value)