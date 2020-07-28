@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.content.res.Resources
import com.blankj.utilcode.util.AdaptScreenUtils

/**
 * @author Dylan Cai
 */

inline fun adaptScreenWidth(resources: Resources, designWidth: Int): Resources =
  AdaptScreenUtils.adaptWidth(resources, designWidth)

inline fun adaptScreenHeight(
  resources: Resources,
  designWidth: Int,
  includeNavBar: Boolean = false
): Resources =
  AdaptScreenUtils.adaptHeight(resources, designWidth, includeNavBar)

inline fun closeAdapt(resources: Resources): Resources =
  AdaptScreenUtils.closeAdapt(resources)

inline val Float.pt: Int
  get() = AdaptScreenUtils.pt2Px(this)

inline fun Float.px2pt() =
  AdaptScreenUtils.px2Pt(this)

