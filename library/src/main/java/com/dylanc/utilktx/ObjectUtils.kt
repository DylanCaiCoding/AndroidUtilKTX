@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.ObjectUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns the non-null object or the default object. This is equivalent to calling:
 * ```
 * ObjectUtils.getOrDefault(object, defaultValue)!!
 * ```
 */
inline fun <T> T?.toNonNull(defaultValue: T): T = ObjectUtils.getOrDefault(this, defaultValue)!!
