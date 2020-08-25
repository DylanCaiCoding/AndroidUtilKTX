@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import com.blankj.utilcode.util.SnackbarUtils
import com.dylanc.utilktx.Internals.NO_GETTER
import com.dylanc.utilktx.Internals.noGetter
import com.google.android.material.snackbar.Snackbar

/**
 * @author Dylan Cai
 */

private const val COLOR_DEFAULT: Int = -0x1000001

/**
 * Show the snackbar. This is equivalent to calling:
 * ```
 * SnackbarBuilder(activity).apply(block).build().setMessage(message).show()
 * ```
 */
inline fun Activity.showSnackbar(message: String, block: SnackbarBuilder.() -> Unit = {}): Snackbar =
  SnackbarBuilder(this).apply(block).build().setMessage(message).show()

/**
 * Show the snackbar. This is equivalent to calling:
 * ```
 * SnackbarBuilder(view).apply(block).build().setMessage(message).show()
 * ```
 */
inline fun showSnackbar(view: View, message: String, block: SnackbarBuilder.() -> Unit = {}): Snackbar =
  SnackbarBuilder(view).apply(block).build().setMessage(message).show()

/**
 * Show the snackbar with success style. This is equivalent to calling:
 * ```
 * SnackbarBuilder(activity).apply(block).build().setMessage(message).showSuccess(isShowTop)
 * ```
 */
inline fun Activity.showSuccessSnackbar(message: String, isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit = {}) =
  SnackbarBuilder(this).apply(block).build().setMessage(message).showSuccess(isShowTop)

/**
 * Show the snackbar with success style. This is equivalent to calling:
 * ```
 * SnackbarBuilder(view).apply(block).build().setMessage(message).showSuccess(isShowTop)
 * ```
 */
inline fun showSuccessSnackbar(view: View, message: String, isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit = {}) =
  SnackbarBuilder(view).apply(block).build().setMessage(message).showSuccess(isShowTop)

/**
 * Show the snackbar with warning style. This is equivalent to calling:
 * ```
 * SnackbarBuilder(activity).apply(block).build().setMessage(message).showWarning(isShowTop)
 * ```
 */
inline fun Activity.showWarningSnackbar(message: String, isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit = {}) =
  SnackbarBuilder(this).apply(block).build().setMessage(message).showWarning(isShowTop)

/**
 * Show the snackbar with warning style. This is equivalent to calling:
 * ```
 * SnackbarBuilder(view).apply(block).build().setMessage(message).showWarning(isShowTop)
 * ```
 */
inline fun showWarningSnackbar(view: View, message: String, isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit = {}) =
  SnackbarBuilder(view).apply(block).build().setMessage(message).showWarning(isShowTop)

/**
 * Show the snackbar with error style. This is equivalent to calling:
 * ```
 * SnackbarBuilder(activity).apply(block).build().setMessage(message).showError(isShowTop)
 * ```
 */
inline fun Activity.showErrorSnackbar(message: String, isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit = {}) =
  SnackbarBuilder(this).apply(block).build().setMessage(message).showError(isShowTop)

/**
 * Show the snackbar with error style. This is equivalent to calling:
 * ```
 * SnackbarBuilder(view).apply(block).build().setMessage(message).showError(isShowTop)
 * ```
 */
inline fun showErrorSnackbar(view: View, message: String, isShowTop: Boolean = false, block: SnackbarBuilder.() -> Unit = {}) =
  SnackbarBuilder(view).apply(block).build().setMessage(message).showError(isShowTop)

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

class SnackbarBuilder(view: View) {

  constructor(activity: Activity) : this(activity.findViewById<View>(android.R.id.content))

  private val snackbarUtils: SnackbarUtils = SnackbarUtils.with(view)

  var messageColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = throw noGetter()
    set(@ColorInt value) {
      snackbarUtils.setMessageColor(value)
    }

  var bgColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = throw noGetter()
    set(@ColorInt value) {
      snackbarUtils.setBgColor(value)
    }

  var bgResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = throw noGetter()
    set(@DrawableRes value) {
      snackbarUtils.setBgResource(value)
    }

  var duration: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = throw noGetter()
    set(value) {
      snackbarUtils.setDuration(value)
    }

  fun action(text: CharSequence, @ColorInt color: Int = COLOR_DEFAULT, listener: (View) -> Unit) {
    snackbarUtils.setAction(text, color, listener)
  }

  var bottomMargin: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = throw noGetter()
    set(value) {
      snackbarUtils.setBottomMargin(value)
    }

  fun build() = snackbarUtils
}