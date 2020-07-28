@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.CloneUtils
import java.lang.reflect.Type

/**
 * @author Dylan Cai
 */

inline fun <reified T> T.deepClone(): T =
  CloneUtils.deepClone(this, typeOf(T::class.java))

inline fun <T> T.deepClone(type: Type): T =
  CloneUtils.deepClone(this, type)