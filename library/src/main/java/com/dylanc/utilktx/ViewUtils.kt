@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.blankj.utilcode.util.ViewUtils

/**
 * @author Dylan Cai
 */

/**
 * Sets the enabled state of this view exclude some view. This is equivalent to calling:
 * ```
 * ViewUtils.setViewEnabled(view, enabled, excludes)
 * ```
 */
inline fun View.setEnabled(enabled: Boolean, vararg excludes: View) =
  ViewUtils.setViewEnabled(this, enabled, *excludes)

/**
 * Returns whether horizontal layout direction of views are from Right to Left. This is equivalent to calling:
 * ```
 * ViewUtils.isLayoutRtl()
 * ```
 */
inline val isLayoutRtl: Boolean get() = ViewUtils.isLayoutRtl()

/**
 * Fixes the problem of topping the ScrollView nested ListView/GridView/WebView/RecyclerView. This is equivalent to calling:
 * ```
 * ViewUtils.fixScrollViewTopping(view)
 * ```
 */
inline fun View.fixScrollViewTopping() = ViewUtils.fixScrollViewTopping(this)
