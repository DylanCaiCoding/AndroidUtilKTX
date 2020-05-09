@file:Suppress("unused")

package com.dylanc.utilktx

import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import com.blankj.utilcode.util.ToastUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
fun setToastGravity(gravity: Int, xOffset: Int, yOffset: Int) =
  ToastUtils.setGravity(gravity, xOffset, yOffset)

fun setToastBgColor(@ColorInt bgColor: Int) =
  ToastUtils.setBgColor(bgColor)

fun setToastBgResource(@DrawableRes bgResource: Int) =
  ToastUtils.setBgResource(bgResource)

fun setToastMsgColor(@ColorInt bgColor: Int) =
  ToastUtils.setMsgColor(bgColor)

fun setToastMsgTextSize(textSize: Int) =
  ToastUtils.setMsgTextSize(textSize)

fun toast(text: String?) =
  ToastUtils.showShort(text)

fun toast(view: View): View =
  ToastUtils.showCustomShort(view)

fun toast(@LayoutRes layoutId: Int): View =
  ToastUtils.showCustomShort(layoutId)

fun longToast(text: String) =
  ToastUtils.showLong(text)

fun longToast(view: View): View =
  ToastUtils.showCustomLong(view)

fun longToast(@LayoutRes layoutId: Int): View =
  ToastUtils.showCustomLong(layoutId)

fun cancelToast() =
  ToastUtils.cancel()