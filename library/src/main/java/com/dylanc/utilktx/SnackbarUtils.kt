@file:Suppress("unused", "NOTHING_TO_INLINE")

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
 */
private const val COLOR_DEFAULT: Int = -0x1000001

inline fun Activity.snackbarUtilsOf(): SnackbarUtils = snackbarUtilsOf(findViewById(android.R.id.content))

inline fun snackbarUtilsOf(view: View): SnackbarUtils = SnackbarUtils.with(view)

inline fun Activity.showSnackbar(block: SnackbarBuilder.() -> Unit): Snackbar =
  snackbarUtilsOf().apply { SnackbarBuilder(this).apply(block) }.show()

inline fun showSnackbar(view: View, block: SnackbarBuilder.() -> Unit): Snackbar =
  snackbarUtilsOf(view).apply { SnackbarBuilder(this).apply(block) }.show()

inline fun Activity.showSuccessSnackbar(isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit) =
  snackbarUtilsOf().apply { SnackbarBuilder(this).apply(block) }.showSuccess(isShowTop)

inline fun showSuccessSnackbar(view: View, isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit) =
  snackbarUtilsOf(view).apply { SnackbarBuilder(this).apply(block) }.showSuccess(isShowTop)

inline fun Activity.showWarningSnackbar(isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit) =
  snackbarUtilsOf().apply { SnackbarBuilder(this).apply(block) }.showWarning(isShowTop)

inline fun showWarningSnackbar(view: View, isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit) =
  snackbarUtilsOf(view).apply { SnackbarBuilder(this).apply(block) }.showWarning(isShowTop)

inline fun Activity.showErrorSnackbar(isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit) =
  snackbarUtilsOf().apply { SnackbarBuilder(this).apply(block) }.showError(isShowTop)

inline fun showErrorSnackbar(view: View, isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit) =
  snackbarUtilsOf(view).apply { SnackbarBuilder(this).apply(block) }.showError(isShowTop)

inline fun dismissSnackbar() = SnackbarUtils.dismiss()

inline val snackbarView: View? get() = SnackbarUtils.getView()

inline fun addSnackbarView(@LayoutRes layoutId: Int, params: ViewGroup.LayoutParams) =
  SnackbarUtils.addView(layoutId, params)

inline fun addSnackbarView(child: View, params: ViewGroup.LayoutParams) =
  SnackbarUtils.addView(child, params)

class SnackbarBuilder(private val snackbarUtils: SnackbarUtils) {
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