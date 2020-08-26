@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Activity
import android.view.View
import android.view.Window
import com.blankj.utilcode.util.KeyboardUtils
import android.view.inputmethod.InputMethodManager


/**
 * @author Dylan Cai
 */

/**
 * Shows the soft input. This is equivalent to calling:
 * ```
 * KeyboardUtils.showSoftInput(activity)
 * ```
 */
inline fun Activity.showKeyboard() = KeyboardUtils.showSoftInput(this)

/**
 * Shows the soft input. This is equivalent to calling:[InputMethodManager]
 * ```
 * KeyboardUtils.showSoftInput(view, flag)
 * ```
 *
 * @param flags Provides additional operating flags.  Currently may be 0 or have the [InputMethodManager.SHOW_IMPLICIT] bit set.
 */
inline fun View.showKeyboard(flags: Int = 0) = KeyboardUtils.showSoftInput(this, flags)

/**
 * Hides the soft input. This is equivalent to calling:
 * ```
 * KeyboardUtils.showSoftInput(activity)
 * ```
 */
inline fun Activity.hideKeyboard() = KeyboardUtils.hideSoftInput(this)

/**
 * Hides the soft input. This is equivalent to calling:
 * ```
 * KeyboardUtils.showSoftInput(view)
 * ```
 */
inline fun View.hideKeyboard() = KeyboardUtils.hideSoftInput(this)

/**
 * Toggles the soft input display or not. This is equivalent to calling:
 * ```
 * KeyboardUtils.toggleSoftInput()
 * ```
 */
inline fun toggleKeyboard() = KeyboardUtils.toggleSoftInput()

/**
 * Returns whether the keyboard is visible. This is equivalent to calling:
 * ```
 * KeyboardUtils.isSoftInputVisible(activity)
 * ```
 */
inline val Activity.isKeyboardVisible get() = KeyboardUtils.isSoftInputVisible(this)

/**
 * Registers the changed listener of keyboard. This is equivalent to calling:
 * ```
 * KeyboardUtils.registerSoftInputChangedListener(activity, listener)
 * ```
 */
inline fun Activity.registerKeyboardChangedListener(noinline listener: (height: Int) -> Unit) =
  KeyboardUtils.registerSoftInputChangedListener(this, listener)

/**
 * Registers the changed listener of keyboard. This is equivalent to calling:
 * ```
 * KeyboardUtils.registerSoftInputChangedListener(window, listener)
 * ```
 */
inline fun Window.registerKeyboardChangedListener(noinline listener: (height: Int) -> Unit) =
  KeyboardUtils.registerSoftInputChangedListener(this, listener)

/**
 * Registers the changed listener of keyboard. This is equivalent to calling:
 * ```
 * KeyboardUtils.unregisterSoftInputChangedListener(window, listener)
 * ```
 */
inline fun Activity.unregisterKeyboardChangedListener() = KeyboardUtils.unregisterSoftInputChangedListener(window)

/**
 * Registers the changed listener of keyboard. This is equivalent to calling:
 * ```
 * KeyboardUtils.unregisterSoftInputChangedListener(window, listener)
 * ```
 */
inline fun Window.unregisterKeyboardChangedListener() = KeyboardUtils.unregisterSoftInputChangedListener(this)

/**
 * Fixes the bug of 5497 in Android. Don't set adjustResize. This is equivalent to calling:
 * ```
 * KeyboardUtils.fixAndroidBug5497(activity)
 * ```
 */
inline fun Activity.fixAndroidBug5497() = KeyboardUtils.fixAndroidBug5497(this)

/**
 * Fixes the bug of 5497 in Android. Don't set adjustResize. This is equivalent to calling:
 * ```
 * KeyboardUtils.fixAndroidBug5497(window)
 * ```
 */
inline fun Window.fixAndroidBug5497() = KeyboardUtils.fixAndroidBug5497(this)

/**
 * Fix the leaks of soft input. This is equivalent to calling:
 * ```
 * KeyboardUtils.fixSoftInputLeaks(this)
 * ```
 */
inline fun Activity.fixKeyboardLeaks() = KeyboardUtils.fixSoftInputLeaks(this)

/**
 * Fix the leaks of soft input. This is equivalent to calling:
 * ```
 * KeyboardUtils.fixSoftInputLeaks(this)
 * ```
 */
inline fun Window.fixKeyboardLeaks() = KeyboardUtils.fixSoftInputLeaks(this)
