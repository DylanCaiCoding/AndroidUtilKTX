@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.content.res.Resources
import com.blankj.utilcode.util.AdaptScreenUtils

/**
 * @author Dylan Cai
 */

/**
 * Adapt for the horizontal screen, and call it in [android.app.Activity.getResources].
 * This is equivalent to calling:
 * ```
 * AdaptScreenUtils.adaptWidth(resources, designWidth)
 * ```
 */
inline fun adaptScreenWidth(resources: Resources, designWidth: Int): Resources =
  AdaptScreenUtils.adaptWidth(resources, designWidth)

/**
 * Adapt for the vertical screen, and call it in [android.app.Activity.getResources].
 * This is equivalent to calling:
 * ```
 * AdaptScreenUtils.adaptHeight(resources, designWidth, includeNavBar)
 * ```
 */
inline fun adaptScreenHeight(
  resources: Resources, designWidth: Int, includeNavBar: Boolean = false
): Resources = AdaptScreenUtils.adaptHeight(resources, designWidth, includeNavBar)

/**
 * Cancel adapting for the screen, and call it in [android.app.Activity.getResources].
 * This is equivalent to calling:
 * ```
 * AdaptScreenUtils.closeAdapt(resources)
 * ```
 */
inline fun closeAdaptScreen(resources: Resources): Resources =
  AdaptScreenUtils.closeAdapt(resources)

/**
 * Return the value converted from pt to px. This is equivalent to calling:
 * ```
 * AdaptScreenUtils.pt2Px(float)
 * ```
 */
inline val Float.pt: Int get() = AdaptScreenUtils.pt2Px(this)

/**
 * Return the value converted from px to pt. This is equivalent to calling:
 * ```
 * AdaptScreenUtils.pt2Px(float)
 * ```
 */
inline fun Float.px2pt() = AdaptScreenUtils.px2Pt(this)

