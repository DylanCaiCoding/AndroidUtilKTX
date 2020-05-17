@file:Suppress("unused")

package com.dylanc.utilktx

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import com.blankj.utilcode.util.SnackbarUtils
import com.google.android.material.snackbar.Snackbar

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
private const val COLOR_DEFAULT: Int = -0x1000001

fun Activity.showSnackbar(block: SnackbarUtilsBuilder.() -> Unit): Snackbar =
  SnackbarUtils.with(findViewById(android.R.id.content))
    .apply { SnackbarUtilsBuilder(this).apply(block) }.show()

fun showSnackbar(view: View, block: SnackbarUtilsBuilder.() -> Unit): Snackbar =
  SnackbarUtils.with(view)
    .apply { SnackbarUtilsBuilder(this).apply(block) }.show()

fun Activity.showSuccessSnackbar(
  isShowTop: Boolean = false,
  block: SnackbarUtilsBuilder.() -> Unit
) =
  SnackbarUtils.with(findViewById(android.R.id.content))
    .apply { SnackbarUtilsBuilder(this).apply(block) }.showSuccess(isShowTop)

fun showSuccessSnackbar(
  view: View,
  isShowTop: Boolean = false,
  block: SnackbarUtilsBuilder.() -> Unit
) =
  SnackbarUtils.with(view)
    .apply { SnackbarUtilsBuilder(this).apply(block) }.showSuccess(isShowTop)

fun Activity.showWarningSnackbar(
  isShowTop: Boolean = false,
  block: SnackbarUtilsBuilder.() -> Unit
) =
  SnackbarUtils.with(findViewById(android.R.id.content))
    .apply { SnackbarUtilsBuilder(this).apply(block) }.showWarning(isShowTop)

fun showWarningSnackbar(
  view: View,
  isShowTop: Boolean = false,
  block: SnackbarUtilsBuilder.() -> Unit
) =
  SnackbarUtils.with(view)
    .apply { SnackbarUtilsBuilder(this).apply(block) }.showWarning(isShowTop)

fun Activity.showErrorSnackbar(
  isShowTop: Boolean = false,
  block: SnackbarUtilsBuilder.() -> Unit
) =
  SnackbarUtils.with(findViewById(android.R.id.content))
    .apply { SnackbarUtilsBuilder(this).apply(block) }.showError(isShowTop)

fun showErrorSnackbar(
  view: View,
  isShowTop: Boolean = false,
  block: SnackbarUtilsBuilder.() -> Unit
) =
  SnackbarUtils.with(view)
    .apply { SnackbarUtilsBuilder(this).apply(block) }.showError(isShowTop)

fun dismissSnackbar() =
  SnackbarUtils.dismiss()

val snackbarView: View?
  get() = SnackbarUtils.getView()

fun addSnackbarView(@LayoutRes layoutId: Int, params: ViewGroup.LayoutParams) =
  SnackbarUtils.addView(layoutId, params)

fun addSnackbarView(child: View, params: ViewGroup.LayoutParams) =
  SnackbarUtils.addView(child, params)

class SnackbarUtilsBuilder(private val snackbarUtils: SnackbarUtils) {
  fun message(msg: CharSequence) {
    snackbarUtils.setMessage(msg)
  }

  fun messageColor(@ColorInt color: Int) {
    snackbarUtils.setMessageColor(color)
  }

  fun bgColor(@ColorInt color: Int) {
    snackbarUtils.setBgColor(color)
  }

  fun bgResource(@DrawableRes bgResource: Int) {
    snackbarUtils.setBgResource(bgResource)
  }

  fun duration(duration: Int) {
    snackbarUtils.setDuration(duration)
  }

  fun action(text: CharSequence, @ColorInt color: Int = COLOR_DEFAULT, listener: (View) -> Unit) {
    snackbarUtils.setAction(text, color, listener)
  }

  fun bottomMargin(bottomMargin: Int) {
    snackbarUtils.setBottomMargin(bottomMargin)
  }
}