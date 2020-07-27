@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.ObjectUtils

/**
 * @author Dylan Cai
 */

inline fun <T> T?.requireNonNull(): T =
  ObjectUtils.requireNonNull(this)!!

inline fun requireNonNulls(vararg any: Any) =
  ObjectUtils.requireNonNulls(*any)

inline fun <T> T?.requireNonNull(defaultValue: T): T =
  ObjectUtils.getOrDefault(this, defaultValue)!!
