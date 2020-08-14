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

/**
 * Returns the [SnackbarUtils]. This is equivalent to calling:
 * ```
 * SnackbarUtils.with(activity.findViewById(android.R.id.content))
 * ```
 */
inline fun Activity.snackbarUtilsOf(): SnackbarUtils = snackbarUtilsOf(findViewById(android.R.id.content))

/**
 * Returns the [SnackbarUtils]. This is equivalent to calling:
 * ```
 * SnackbarUtils.with(view)
 * ```
 */
inline fun snackbarUtilsOf(view: View): SnackbarUtils = SnackbarUtils.with(view)

/**
 * Show the snackbar. This is equivalent to calling:
 * ```
 * SnackbarUtils.with(activity.findViewById(android.R.id.content)).show()
 * ```
 */
inline fun Activity.showSnackbar(block: SnackbarBuilder.() -> Unit): Snackbar =
  snackbarUtilsOf().apply { SnackbarBuilder(this).apply(block) }.show()

/**
 * Show the snackbar. This is equivalent to calling:
 * ```
 * SnackbarUtils.with(view).show()
 * ```
 */
inline fun showSnackbar(view: View, block: SnackbarBuilder.() -> Unit): Snackbar =
  snackbarUtilsOf(view).apply { SnackbarBuilder(this).apply(block) }.show()

/**
 * Show the snackbar with success style. This is equivalent to calling:
 * ```
 * SnackbarUtils.with(activity.findViewById(android.R.id.content)).showSuccess(isShowTop)
 * ```
 */
inline fun Activity.showSuccessSnackbar(isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit) =
  snackbarUtilsOf().apply { SnackbarBuilder(this).apply(block) }.showSuccess(isShowTop)

/**
 * Show the snackbar with success style. This is equivalent to calling:
 * ```
 * SnackbarUtils.with(view).showSuccess(isShowTop)
 * ```
 */
inline fun showSuccessSnackbar(view: View, isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit) =
  snackbarUtilsOf(view).apply { SnackbarBuilder(this).apply(block) }.showSuccess(isShowTop)

/**
 * Show the snackbar with warning style. This is equivalent to calling:
 * ```
 * SnackbarUtils.with(activity.findViewById(android.R.id.content)).showWarning(isShowTop)
 * ```
 */
inline fun Activity.showWarningSnackbar(isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit) =
  snackbarUtilsOf().apply { SnackbarBuilder(this).apply(block) }.showWarning(isShowTop)

/**
 * Show the snackbar with warning style. This is equivalent to calling:
 * ```
 * SnackbarUtils.with(view).showWarning(isShowTop)
 * ```
 */
inline fun showWarningSnackbar(view: View, isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit) =
  snackbarUtilsOf(view).apply { SnackbarBuilder(this).apply(block) }.showWarning(isShowTop)

/**
 * Show the snackbar with error style. This is equivalent to calling:
 * ```
 * SnackbarUtils.with(activity.findViewById(android.R.id.content)).showSuccess(isShowTop)
 * ```
 */
inline fun Activity.showErrorSnackbar(isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit) =
  snackbarUtilsOf().apply { SnackbarBuilder(this).apply(block) }.showError(isShowTop)

/**
 * Show the snackbar with error style. This is equivalent to calling:
 * ```
 * SnackbarUtils.with(view).showSuccess(isShowTop)
 * ```
 */
inline fun showErrorSnackbar(view: View, isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit) =
  snackbarUtilsOf(view).apply { SnackbarBuilder(this).apply(block) }.showError(isShowTop)

/**
 * Dismiss the snackbar. This is equivalent to calling:
 * ```
 * SnackbarUtils.dismiss()
 * ```
 */
inline fun dismissSnackbar() = SnackbarUtils.dismiss()

/**
 * Return the view of [SnackbarUtils]. This is equivalent to calling:
 * ```
 * SnackbarUtils.getView()
 * ```
 */
inline val snackbarView: View? get() = SnackbarUtils.getView()

/**
 * Add view to the [SnackbarUtils]. This is equivalent to calling:
 * ```
 * SnackbarUtils.addView(layoutId, params)
 * ```
 */
inline fun addSnackbarView(@LayoutRes layoutId: Int, params: ViewGroup.LayoutParams) =
  SnackbarUtils.addView(layoutId, params)

/**
 * Add view to the [SnackbarUtils]. This is equivalent to calling:
 * ```
 * SnackbarUtils.addView(childView, params)
 * ```
 */
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