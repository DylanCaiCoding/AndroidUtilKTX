@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.CloneUtils
import java.lang.reflect.Type

/**
 * @author Dylan Cai
 */

/**
 * Returns a deeply cloned object. This is equivalent to calling:
 * ```
 * CloneUtils.deepClone(data, type)
 * ```
 */
inline fun <reified T> T.deepClone(): T = CloneUtils.deepClone(this, typeOf(T::class.java))

/**
 * Returns a deeply cloned object. This is equivalent to calling:
 * ```
 * CloneUtils.deepClone(data, type)
 * ```
 */
inline fun <T> T.deepClone(type: Type): T = CloneUtils.deepClone(this, type)