@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.content.res.Resources
import com.blankj.utilcode.util.AdaptScreenUtils

/**
 * @author Dylan Cai
 */

/**
 * Adapts for the horizontal screen, and call it in [android.app.Activity.getResources].
 * This is equivalent to calling:
 * ```
 * AdaptScreenUtils.adaptWidth(resources, designWidth)
 * ```
 */
inline fun Resources.adaptScreenWidth(designWidth: Int): Resources =
  AdaptScreenUtils.adaptWidth(this, designWidth)

/**
 * Adapts for the vertical screen, and call it in [android.app.Activity.getResources].
 * This is equivalent to calling:
 * ```
 * AdaptScreenUtils.adaptHeight(resources, designWidth, includeNavBar)
 * ```
 */
inline fun Resources.adaptScreenHeight(designWidth: Int, includeNavBar: Boolean = false): Resources =
  AdaptScreenUtils.adaptHeight(this, designWidth, includeNavBar)

/**
 * Cancels adapting for the screen, and call it in [android.app.Activity.getResources].
 * This is equivalent to calling:
 * ```
 * AdaptScreenUtils.closeAdapt(resources)
 * ```
 */
inline fun Resources.closeAdaptScreen(): Resources = AdaptScreenUtils.closeAdapt(this)

/**
 * Returns the value converted from pt to px. This is equivalent to calling:
 * ```
 * AdaptScreenUtils.pt2Px(float)
 * ```
 */
inline val Float.pt: Int get() = AdaptScreenUtils.pt2Px(this)

/**
 * Returns the value converted from px to pt. This is equivalent to calling:
 * ```
 * AdaptScreenUtils.pt2Px(float)
 * ```
 */
inline fun Float.pxToPt() = AdaptScreenUtils.px2Pt(this)

