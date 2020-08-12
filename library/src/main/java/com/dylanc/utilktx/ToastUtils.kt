@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import com.blankj.utilcode.util.ToastUtils

/**
 * @author Dylan Cai
 */

/**
 * Sets the gravity of toast. This is equivalent to calling:
 * ```
 * ToastUtils.setGravity(gravity, xOffset, yOffset)
 * ```
 */
inline fun setToastGravity(gravity: Int, xOffset: Int, yOffset: Int) =
  ToastUtils.setGravity(gravity, xOffset, yOffset)

/**
 * Sets the color of the toast's background. This is equivalent to calling:
 * ```
 * ToastUtils.setBgColor(bgColor)
 * ```
 */
inline var toastBgColor: Int
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(@ColorInt value) = ToastUtils.setBgColor(value)

/**
 * Sets the resource of the toast's background. This is equivalent to calling:
 * ```
 * ToastUtils.setBgResource(bgResource)
 * ```
 */
inline var toastMsgResource: Int
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(@DrawableRes value) = ToastUtils.setBgResource(value)

/**
 * Sets the color of the toast's message. This is equivalent to calling:
 * ```
 * ToastUtils.setMsgColor(msgColor)
 * ```
 */
inline var toastMsgColor: Int
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(@ColorInt value) = ToastUtils.setMsgColor(value)

/**
 * Sets the text size of the toast's message. This is equivalent to calling:
 * ```
 * ToastUtils.setMsgColor(msgColor)
 * ```
 */
inline var toastMsgTextSize: Int
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ToastUtils.setMsgTextSize(value)

/**
 * Shows the toast for a short period of time. This is equivalent to calling:
 * ```
 * ToastUtils.showShort(text)
 * ```
 */
inline fun toast(text: String?) = ToastUtils.showShort(text)

/**
 * Shows custom toast for a short period of time. This is equivalent to calling:
 * ```
 * ToastUtils.showCustomShort(view)
 * ```
 */
inline fun toast(view: View): View = ToastUtils.showCustomShort(view)

/**
 * Shows custom toast for a short period of time. This is equivalent to calling:
 * ```
 * ToastUtils.showCustomShort(layoutId)
 * ```
 */
inline fun toast(@LayoutRes layoutId: Int): View = ToastUtils.showCustomShort(layoutId)

/**
 * Shows the toast for a long period of time. This is equivalent to calling:
 * ```
 * ToastUtils.showLong(text)
 * ```
 */
inline fun longToast(text: String) = ToastUtils.showLong(text)

/**
 * Shows custom toast for a long period of time. This is equivalent to calling:
 * ```
 * ToastUtils.showCustomLong(view)
 * ```
 */
inline fun longToast(view: View): View = ToastUtils.showCustomLong(view)

/**
 * Shows custom toast for a long period of time. This is equivalent to calling:
 * ```
 * ToastUtils.showCustomLong(layoutId)
 * ```
 */
inline fun longToast(@LayoutRes layoutId: Int): View = ToastUtils.showCustomLong(layoutId)

/**
 * Cancels the toast. This is equivalent to calling:
 * ```
 * ToastUtils.cancel()
 * ```
 */
inline fun cancelToast() = ToastUtils.cancel()