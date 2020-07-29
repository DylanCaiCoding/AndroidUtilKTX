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

inline fun setToastGravity(gravity: Int, xOffset: Int, yOffset: Int) =
  ToastUtils.setGravity(gravity, xOffset, yOffset)

inline fun setToastBgColor(@ColorInt bgColor: Int) =
  ToastUtils.setBgColor(bgColor)

inline fun setToastBgResource(@DrawableRes bgResource: Int) =
  ToastUtils.setBgResource(bgResource)

inline fun setToastMsgColor(@ColorInt bgColor: Int) =
  ToastUtils.setMsgColor(bgColor)

inline fun setToastMsgTextSize(textSize: Int) =
  ToastUtils.setMsgTextSize(textSize)

inline fun toast(text: String?) =
  ToastUtils.showShort(text)

inline fun toast(view: View): View =
  ToastUtils.showCustomShort(view)

inline fun toast(@LayoutRes layoutId: Int): View =
  ToastUtils.showCustomShort(layoutId)

inline fun longToast(text: String) =
  ToastUtils.showLong(text)

inline fun longToast(view: View): View =
  ToastUtils.showCustomLong(view)

inline fun longToast(@LayoutRes layoutId: Int): View =
  ToastUtils.showCustomLong(layoutId)

inline fun cancelToast() =
  ToastUtils.cancel()