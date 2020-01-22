package com.dylanc.utilktx

import android.app.Activity
import android.view.View
import android.view.Window
import com.blankj.utilcode.util.KeyboardUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
fun View.showKeyboard(flag: Int = 0) = KeyboardUtils.showSoftInput(this, flag)

fun Activity.showKeyboard() = KeyboardUtils.showSoftInput(this)

fun View.hideKeyboard() = KeyboardUtils.hideSoftInput(this)

fun Activity.hideKeyboard() = KeyboardUtils.hideSoftInput(this)

fun toggleKeyboard() = KeyboardUtils.toggleSoftInput()

val Activity.isKeyboardVisible
  get() = KeyboardUtils.isSoftInputVisible(this)

fun Activity.registerKeyboardChangedListener(listener: (height: Int) -> Unit) =
  KeyboardUtils.registerSoftInputChangedListener(this, listener)

fun Window.registerKeyboardChangedListener(listener: (height: Int) -> Unit) =
  KeyboardUtils.registerSoftInputChangedListener(this, listener)

fun Activity.fixAndroidBug5497() =
  KeyboardUtils.fixAndroidBug5497(this)

fun Window.fixAndroidBug5497() =
  KeyboardUtils.fixAndroidBug5497(this)

fun clickBlankArea2HideKeyboard() =
  KeyboardUtils.clickBlankArea2HideSoftInput()
