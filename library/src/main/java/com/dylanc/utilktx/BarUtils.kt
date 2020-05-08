@file:Suppress("unused")

package com.dylanc.utilktx

import android.app.Activity
import android.view.View
import android.view.Window
import androidx.drawerlayout.widget.DrawerLayout
import com.blankj.utilcode.util.BarUtils

/**
 * @author Dylan Cai
 * @since 2020/4/25
 */
val statusBarHeight: Int
  get() = BarUtils.getStatusBarHeight()

fun Activity.setStatusBarVisibility(isLightMode: Boolean) =
  BarUtils.setStatusBarVisibility(this, isLightMode)

fun Window.setStatusBarVisibility(isLightMode: Boolean) =
  BarUtils.setStatusBarVisibility(this, isLightMode)

val Activity.isStatusBarVisible: Boolean
  get() = BarUtils.isStatusBarVisible(this)

fun Activity.setStatusBarLightMode(isLightMode: Boolean) =
  BarUtils.setStatusBarLightMode(this, isLightMode)

fun Window.setStatusBarLightMode(isLightMode: Boolean) =
  BarUtils.setStatusBarLightMode(this, isLightMode)

val Activity.isStatusBarLightMode: Boolean
  get() = BarUtils.isStatusBarLightMode(this)

val Window.isStatusBarLightMode: Boolean
  get() = BarUtils.isStatusBarLightMode(this)

fun View.addMarginTopEqualStatusBarHeight() =
  BarUtils.addMarginTopEqualStatusBarHeight(this)

fun View.subtractMarginTopEqualStatusBarHeight() =
  BarUtils.subtractMarginTopEqualStatusBarHeight(this)

fun Activity.setStatusBarColor(color: Int): View? =
  BarUtils.setStatusBarColor(this, color)

fun Window.setStatusBarColor(color: Int): View? =
  BarUtils.setStatusBarColor(this, color)

fun DrawerLayout.setStatusBarColor(fakeStatusBar: View, color: Int, isTop: Boolean = false) =
  BarUtils.setStatusBarColor4Drawer(this, fakeStatusBar, color, isTop)

fun Activity.transparentStatusBar() =
  BarUtils.transparentStatusBar(this)

fun Window.transparentStatusBar() =
  BarUtils.transparentStatusBar(this)

val actionBarHeight: Int
  get() = BarUtils.getActionBarHeight()

fun setNotificationBarVisibility(isVisible: Boolean) =
  BarUtils.setNotificationBarVisibility(isVisible)

val navBarHeight: Int
  get() = BarUtils.getNavBarHeight()

fun Activity.setNavBarVisibility(isLightMode: Boolean) =
  BarUtils.setNavBarVisibility(this, isLightMode)

fun Window.setNavBarVisibility(isLightMode: Boolean) =
  BarUtils.setNavBarVisibility(this, isLightMode)

val Activity.isNavBarVisible: Boolean
  get() = BarUtils.isNavBarVisible(this)

fun Activity.setNavBarColor(color: Int) =
  BarUtils.setNavBarColor(this, color)

fun Window.setNavBarColor(color: Int) =
  BarUtils.setNavBarColor(this, color)

val Activity.vavBarColor: Int
  get() = BarUtils.getNavBarColor(this)

val Window.vavBarColor: Int
  get() = BarUtils.getNavBarColor(this)

val isSupportNavBar: Boolean
  get() = BarUtils.isSupportNavBar()

fun Activity.setNavBarLightMode(isLightMode: Boolean) =
  BarUtils.setNavBarLightMode(this, isLightMode)

fun Window.setNavBarLightMode(isLightMode: Boolean) =
  BarUtils.setNavBarLightMode(this, isLightMode)

val Activity.isNavBarLightMode: Boolean
  get() = BarUtils.isNavBarLightMode(this)

val Window.isNavBarLightMode: Boolean
  get() = BarUtils.isNavBarLightMode(this)