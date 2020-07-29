@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Activity
import android.view.View
import android.view.Window
import com.blankj.utilcode.util.KeyboardUtils

/**
 * @author Dylan Cai
 */

inline fun View.showKeyboard(flag: Int = 0) = KeyboardUtils.showSoftInput(this, flag)

inline fun Activity.showKeyboard() = KeyboardUtils.showSoftInput(this)

inline fun View.hideKeyboard() = KeyboardUtils.hideSoftInput(this)

inline fun Activity.hideKeyboard() = KeyboardUtils.hideSoftInput(this)

inline fun toggleKeyboard() = KeyboardUtils.toggleSoftInput()

inline val Activity.isKeyboardVisible
  get() = KeyboardUtils.isSoftInputVisible(this)

inline fun Activity.registerKeyboardChangedListener(noinline listener: (height: Int) -> Unit) =
  KeyboardUtils.registerSoftInputChangedListener(this, listener)

inline fun Window.registerKeyboardChangedListener(noinline listener: (height: Int) -> Unit) =
  KeyboardUtils.registerSoftInputChangedListener(this, listener)

inline fun Activity.fixAndroidBug5497() =
  KeyboardUtils.fixAndroidBug5497(this)

inline fun Window.fixAndroidBug5497() =
  KeyboardUtils.fixAndroidBug5497(this)
