@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.view.View
import com.blankj.utilcode.util.SizeUtils

/**
 * @author Dylan Cai
 */

/**
 * Coverts the value of dp to the value of px. This is equivalent to calling:
 * ```
 * SizeUtils.dp2px(dpValue)
 * ```
 */
inline val Float.dp: Int get() = SizeUtils.dp2px(this)

/**
 * Coverts the value of dp to the value of px. This is equivalent to calling:
 * ```
 * SizeUtils.dp2px(dpValue.toFloat())
 * ```
 */
inline val Int.dp: Int get() = SizeUtils.dp2px(this.toFloat())

/**
 * Coverts the value of dp to the value of px. This is equivalent to calling:
 * ```
 * SizeUtils.dp2px(dpValue.toFloat())
 * ```
 */
inline val Long.dp: Int get() = SizeUtils.dp2px(this.toFloat())

/**
 * Coverts the value of dp to the value of px. This is equivalent to calling:
 * ```
 * SizeUtils.dp2px(dpValue.toFloat())
 * ```
 */
inline val Double.dp: Int get() = SizeUtils.dp2px(this.toFloat())

/**
 * Coverts the value of sp to the value of px. This is equivalent to calling:
 * ```
 * SizeUtils.sp2px(spValue)
 * ```
 */
inline val Float.sp: Int get() = SizeUtils.sp2px(this)

/**
 * Coverts the value of sp to the value of px. This is equivalent to calling:
 * ```
 * SizeUtils.sp2px(spValue.toFloat())
 * ```
 */
inline val Int.sp: Int get() = SizeUtils.sp2px(this.toFloat())

/**
 * Coverts the value of sp to the value of px. This is equivalent to calling:
 * ```
 * SizeUtils.sp2px(spValue.toFloat())
 * ```
 */
inline val Long.sp: Int get() = SizeUtils.sp2px(this.toFloat())

/**
 * Coverts the value of sp to the value of px. This is equivalent to calling:
 * ```
 * SizeUtils.sp2px(spValue.toFloat())
 * ```
 */
inline val Double.sp: Int get() = SizeUtils.sp2px(this.toFloat())

/**
 * Coverts the value of px to the value of dp. This is equivalent to calling:
 * ```
 * SizeUtils.px2dp(pxValue)
 * ```
 */
inline fun Float.px2dp(): Int = SizeUtils.px2dp(this)

/**
 * Coverts the value of px to the value of dp. This is equivalent to calling:
 * ```
 * SizeUtils.px2dp(pxValue.toFloat())
 * ```
 */
inline fun Int.px2dp(): Int = SizeUtils.px2dp(toFloat())

/**
 * Coverts the value of px to the value of dp. This is equivalent to calling:
 * ```
 * SizeUtils.px2dp(pxValue.toFloat())
 * ```
 */
inline fun Long.px2dp(): Int = SizeUtils.px2dp(toFloat())

/**
 * Coverts the value of px to the value of dp. This is equivalent to calling:
 * ```
 * SizeUtils.px2dp(pxValue.toFloat())
 * ```
 */
inline fun Double.px2dp(): Int = SizeUtils.px2dp(toFloat())

/**
 * Coverts the value of px to the value of sp. This is equivalent to calling:
 * ```
 * SizeUtils.px2sp(pxValue)
 * ```
 */
inline fun Float.px2sp(): Int = SizeUtils.px2sp(this)

/**
 * Coverts the value of px to the value of sp. This is equivalent to calling:
 * ```
 * SizeUtils.px2sp(pxValue.toFloat())
 * ```
 */
inline fun Int.px2sp(): Int = SizeUtils.px2sp(toFloat())

/**
 * Coverts the value of px to the value of sp. This is equivalent to calling:
 * ```
 * SizeUtils.px2sp(pxValue.toFloat())
 * ```
 */
inline fun Long.px2sp(): Int = SizeUtils.px2sp(toFloat())

/**
 * Coverts the value of px to the value of sp. This is equivalent to calling:
 * ```
 * SizeUtils.px2sp(pxValue.toFloat())
 * ```
 */
inline fun Double.px2sp(): Int = SizeUtils.px2sp(toFloat())

/**
 * Measure the view. This is equivalent to calling:
 * ```
 * SizeUtils.measureView(view)
 * ```
 *
 * @return arr[0]: view's width, arr[1]: view's height
 */
inline fun View.measure(): IntArray = SizeUtils.measureView(this)

/**
 * Return the width of view. This is equivalent to calling:
 * ```
 * SizeUtils.getMeasuredWidth(view)
 * ```
 */
inline val View.measureWidth: Int get() = SizeUtils.getMeasuredWidth(this)

/**
 * Return the height of view. This is equivalent to calling:
 * ```
 * SizeUtils.getMeasuredHeight(view)
 * ```
 */
inline val View.measureHeight: Int get() = SizeUtils.getMeasuredHeight(this)



