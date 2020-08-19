@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.view.View
import androidx.annotation.IntRange
import com.blankj.utilcode.util.ClickUtils

/**
 * @author Dylan Cai
 */

const val DEBOUNCING_DEFAULT_VALUE: Long = 200

/**
 * Applies the scale animation for the view's click. This is equivalent to calling:
 * ```
 * ClickUtils.applyPressedViewScale(view, value)
 * ```
 */
inline var View.pressedScale: Float
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedViewScale(this, value)

/**
 * Applies the scale animation for the views' click. This is equivalent to calling:
 * ```
 * ClickUtils.applyPressedViewScale(views, value)
 * ```
 */
inline var Array<out View>.pressedScale: FloatArray
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedViewScale(this, value)

/**
 * Applies the alpha animation for the view's click. This is equivalent to calling:
 * ```
 * ClickUtils.applyPressedViewAlpha(view, value)
 * ```
 */
inline var View.pressedAlpha: Float
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedViewAlpha(this, value)

/**
 * Applies the alpha animation for the views' click. This is equivalent to calling:
 * ```
 * ClickUtils.applyPressedViewAlpha(views, value)
 * ```
 */
inline var Array<out View>.pressedAlpha: FloatArray
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedViewAlpha(this, value)

/**
 * Applies the alpha for the view's background. This is equivalent to calling:
 * ```
 * ClickUtils.applyPressedBgAlpha(view, value)
 * ```
 */
inline var View.pressedBgAlpha: Float
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedBgAlpha(this, value)

/**
 * Applies the alpha for the view's background. This is equivalent to calling:
 * ```
 * ClickUtils.applyPressedBgAlpha(view)
 * ```
 */
inline fun View.applyPressedBgAlpha() = ClickUtils.applyPressedBgAlpha(this)

/**
 * Applies the alpha of dark for the view's background. This is equivalent to calling:
 * ```
 * ClickUtils.applyPressedBgDark(view, value)
 * ```
 */
inline var View.pressedBgDarkAlpha: Float
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedBgDark(this, value)

/**
 * Applies the alpha of dark for the view's background. This is equivalent to calling:
 * ```
 * ClickUtils.applyPressedBgDark(view)
 * ```
 */
inline fun View.applyPressedBgDark() = ClickUtils.applyPressedBgDark(this)

/**
 * Applies the single debouncing for the view's click. This is equivalent to calling:
 * ```
 * ClickUtils.applySingleDebouncing(view, duration, listener)
 * ```
 */
inline fun View.doOnDebouncedClick(@IntRange(from = 0) duration: Long = DEBOUNCING_DEFAULT_VALUE, noinline listener: (View) -> Unit) =
  ClickUtils.applySingleDebouncing(this, duration, listener)

/**
 * Applies the single debouncing for the views' click. This is equivalent to calling:
 * ```
 * ClickUtils.applySingleDebouncing(views, duration, listener)
 * ```
 */
inline fun Array<View>.doOnDebouncedClick(
  @IntRange(from = 0) duration: Long = DEBOUNCING_DEFAULT_VALUE, noinline listener: (View) -> Unit
) =
  ClickUtils.applySingleDebouncing(this, duration, listener)

/**
 * Applies the global debouncing for the views' click. This is equivalent to calling:
 * ```
 * ClickUtils.applyGlobalDebouncing(views, duration, listener)
 * ```
 */
inline fun View.doOnGlobalDebouncedClick(@IntRange(from = 0) duration: Long = DEBOUNCING_DEFAULT_VALUE, noinline listener: (View) -> Unit) =
  ClickUtils.applyGlobalDebouncing(this, duration, listener)

/**
 * Applies the global debouncing for the views' click. This is equivalent to calling:
 * ```
 * ClickUtils.applyGlobalDebouncing(views, duration, listener)
 * ```
 */
inline fun Array<View>.doOnGlobalDebouncedClick(
  @IntRange(from = 0) duration: Long = DEBOUNCING_DEFAULT_VALUE, noinline listener: (View) -> Unit
) =
  ClickUtils.applyGlobalDebouncing(this, duration, listener)

/**
 * Expand the click area of ​​the view. This is equivalent to calling:
 * ```
 * ClickUtils.expandClickArea(view, expandSize)
 * ```
 */
inline fun View.expandClickArea(expandSize: Int) = ClickUtils.expandClickArea(this, expandSize)

/**
 * Expand the click area of ​​the view. This is equivalent to calling:
 * ```
 * ClickUtils.expandClickArea(view, expandSizeTop, expandSizeLeft, expandSizeRight, expandSizeBottom)
 * ```
 */
inline fun View.expandClickArea(expandSizeTop: Int, expandSizeLeft: Int, expandSizeRight: Int, expandSizeBottom: Int) =
  ClickUtils.expandClickArea(this, expandSizeTop, expandSizeLeft, expandSizeRight, expandSizeBottom)

/**
 * Back to the home activity friendly. This is equivalent to calling:
 * ```
 * ClickUtils.back2HomeFriendly(tip)
 * ```
 */
inline fun back2HomeActivityFriendly(tip: CharSequence) = ClickUtils.back2HomeFriendly(tip)

/**
 * Back to the home activity friendly. This is equivalent to calling:
 * ```
 * ClickUtils.back2HomeFriendly(tip, duration, listener)
 * ```
 */
inline fun back2HomeActivityFriendly(tip: CharSequence, duration: Long, listener: ClickUtils.Back2HomeFriendlyListener) =
  ClickUtils.back2HomeFriendly(tip, duration, listener)