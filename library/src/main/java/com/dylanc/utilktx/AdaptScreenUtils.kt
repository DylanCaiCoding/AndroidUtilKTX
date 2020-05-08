package com.dylanc.utilktx

import android.content.res.Resources
import com.blankj.utilcode.util.AdaptScreenUtils

/**
 * @author Dylan Cai
 * @since 2020/4/4
 */
fun adaptScreenWidth(resources: Resources, designWidth: Int):Resources =
  AdaptScreenUtils.adaptWidth(resources, designWidth)

fun adaptScreenHeight(resources: Resources, designWidth: Int, includeNavBar: Boolean = false):Resources =
  AdaptScreenUtils.adaptHeight(resources, designWidth, includeNavBar)

fun closeAdapt(resources: Resources):Resources = AdaptScreenUtils.closeAdapt(resources)

val Float.pt: Int
  get() = AdaptScreenUtils.pt2Px(this)

fun Float.px2pt() = AdaptScreenUtils.px2Pt(this)

