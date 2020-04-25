package com.dylanc.utilktx

import android.app.Activity
import android.view.Window
import com.blankj.utilcode.util.BarUtils

/**
 * @author Dylan Cai
 * @since 2020/4/25
 */
fun Activity.setStatusBarLightMode(isLightMode: Boolean) =
  BarUtils.setStatusBarLightMode(this, isLightMode)

fun Window.setStatusBarLightMode(isLightMode: Boolean) =
  BarUtils.setStatusBarLightMode(this, isLightMode)

fun Activity.setNavBarLightMode(isLightMode: Boolean) =
  BarUtils.setNavBarLightMode(this, isLightMode)

fun Window.setNavBarLightMode(isLightMode: Boolean) =
  BarUtils.setNavBarLightMode(this, isLightMode)