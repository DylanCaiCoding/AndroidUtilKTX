@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.view.View
import androidx.annotation.IntRange
import com.blankj.utilcode.util.ClickUtils

/**
 * @author Dylan Cai
 */

inline var View.pressedScale: Float
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedViewScale(this, value)

inline var Array<out View>.pressedScale: FloatArray
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedViewScale(this, value)

inline fun applyPressedViewScale(vararg view: View) =
  ClickUtils.applyPressedViewScale(*view)

inline var View.pressedAlpha: Float
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedViewAlpha(this, value)

inline var Array<out View>.pressedAlpha: FloatArray
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedViewAlpha(this, value)

inline fun applyPressedViewAlpha(vararg view: View) =
  ClickUtils.applyPressedViewAlpha(*view)

inline var View.pressedBgAlpha: Float
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedBgAlpha(this, value)

inline fun View.applyPressedBgAlpha() =
  ClickUtils.applyPressedBgAlpha(this)

inline var View.pressedBgDarkAlpha: Float
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedBgDark(this, value)

inline fun View.applyPressedBgDark() =
  ClickUtils.applyPressedBgDark(this)

inline fun View.doOnSingleClick(noinline listener: (View) -> Unit) =
  ClickUtils.applySingleDebouncing(this, listener)

inline fun View.doOnSingleClick(
  @IntRange(from = 0) duration: Long,
  noinline listener: (View) -> Unit
) =
  ClickUtils.applySingleDebouncing(this, duration, listener)

inline fun Array<View>.doOnSingleClick(noinline listener: (View) -> Unit) =
  ClickUtils.applySingleDebouncing(this, listener)

inline fun Array<View>.doOnSingleClick(
  @IntRange(from = 0) duration: Long,
  noinline listener: (View) -> Unit
) =
  ClickUtils.applySingleDebouncing(this, duration, listener)

inline fun View.doOnGlobalDebouncingClick(noinline listener: (View) -> Unit) =
  ClickUtils.applySingleDebouncing(this, listener)

inline fun View.doOnGlobalDebouncingClick(
  @IntRange(from = 0) duration: Long,
  noinline listener: (View) -> Unit
) =
  ClickUtils.applySingleDebouncing(this, duration, listener)

inline fun Array<View>.doOnGlobalDebouncingClick(noinline listener: (View) -> Unit) =
  ClickUtils.applyGlobalDebouncing(this, listener)

inline fun Array<View>.doOnGlobalDebouncingClick(
  @IntRange(from = 0) duration: Long,
  noinline listener: (View) -> Unit
) =
  ClickUtils.applyGlobalDebouncing(this, duration, listener)

inline fun View.expandClickArea(expandSize: Int) =
  ClickUtils.expandClickArea(this, expandSize)

inline fun View.expandClickArea(
  expandSizeTop: Int,
  expandSizeLeft: Int,
  expandSizeRight: Int,
  expandSizeBottom: Int
) =
  ClickUtils.expandClickArea(this, expandSizeTop, expandSizeLeft, expandSizeRight, expandSizeBottom)

inline fun back2HomeActivityFriendly(tip: CharSequence) =
  ClickUtils.back2HomeFriendly(tip)

inline fun back2HomeActivityFriendly(
  tip: CharSequence,
  duration: Long,
  listener: ClickUtils.Back2HomeFriendlyListener
) =
  ClickUtils.back2HomeFriendly(tip, duration, listener)

//
fun View.doOnClick(listener: (() -> Unit)?) {
  if (listener != null) {
    setOnClickListener { listener.invoke() }
  } else {
    setOnClickListener(null)
  }
}