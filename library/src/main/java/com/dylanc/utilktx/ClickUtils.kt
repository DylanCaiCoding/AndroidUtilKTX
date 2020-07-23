package com.dylanc.utilktx

import android.view.View
import androidx.annotation.IntRange
import com.blankj.utilcode.util.ClickUtils

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */
var View.pressedScale: Float
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedViewScale(this, value)

fun applyPressedViewScale(vararg view: View) =
  ClickUtils.applyPressedViewScale(*view)

fun applyPressedViewScale(views: Array<out View>, scaleFactors: FloatArray) =
  ClickUtils.applyPressedViewScale(views, scaleFactors)

var View.pressedAlpha: Float
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedViewAlpha(this, value)

fun applyPressedViewAlpha(vararg view: View) =
  ClickUtils.applyPressedViewAlpha(*view)

var  Array<out View>.pressedAlpha: FloatArray
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedViewAlpha(this, value)

var View.pressedBgAlpha: Float
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedBgAlpha(this, value)

fun View.applyPressedBgAlpha() =
  ClickUtils.applyPressedBgAlpha(this)

var View.pressedBgDarkAlpha: Float
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = ClickUtils.applyPressedBgDark(this, value)

fun View.applyPressedBgDark() =
  ClickUtils.applyPressedBgDark(this)

fun View.doOnSingleDebouncingClick(listener: (View) -> Unit) =
  ClickUtils.applySingleDebouncing(this, listener)

fun View.doOnSingleDebouncingClick(@IntRange(from = 0) duration: Long, listener: (View) -> Unit) =
  ClickUtils.applySingleDebouncing(this, duration, listener)

fun Array<View>.doOnSingleDebouncingClick(listener: (View) -> Unit) =
  ClickUtils.applySingleDebouncing(this, listener)

fun Array<View>.doOnSingleDebouncingClick(@IntRange(from = 0) duration: Long, listener: (View) -> Unit) =
  ClickUtils.applySingleDebouncing(this, duration, listener)

fun View.doOnGlobalDebouncingClick(listener: (View) -> Unit) =
  ClickUtils.applySingleDebouncing(this, listener)

fun View.doOnGlobalDebouncingClick(@IntRange(from = 0) duration: Long, listener: (View) -> Unit) =
  ClickUtils.applySingleDebouncing(this, duration, listener)

fun Array<View>.doOnGlobalDebouncingClick(listener: (View) -> Unit) =
  ClickUtils.applyGlobalDebouncing(this, listener)

fun Array<View>.doOnGlobalDebouncingClick(@IntRange(from = 0) duration: Long, listener: (View) -> Unit) =
  ClickUtils.applyGlobalDebouncing(this, duration, listener)

fun View.expandClickArea(expandSize: Int) =
  ClickUtils.expandClickArea(this, expandSize)

fun View.expandClickArea(
  expandSizeTop: Int,
  expandSizeLeft: Int,
  expandSizeRight: Int,
  expandSizeBottom: Int
) =
  ClickUtils.expandClickArea(this, expandSizeTop, expandSizeLeft, expandSizeRight, expandSizeBottom)

fun back2HomeFriendly(tip: CharSequence) =
  ClickUtils.back2HomeFriendly(tip)

fun back2HomeFriendly(
  tip: CharSequence,
  duration: Long,
  listener: ClickUtils.Back2HomeFriendlyListener
) =
  ClickUtils.back2HomeFriendly(tip, duration, listener)
