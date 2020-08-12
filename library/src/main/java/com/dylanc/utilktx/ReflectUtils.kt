@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.ReflectUtils

/**
 * @author Dylan Cai
 */

inline fun <reified T> reflect(): ReflectUtils = ReflectUtils.reflect(T::class.java)

inline fun reflect(className: String, classLoader: ClassLoader? = null): ReflectUtils =
  if (classLoader == null) {
    ReflectUtils.reflect(className)
  } else {
    ReflectUtils.reflect(className, classLoader)
  }

inline fun reflect(any: Any): ReflectUtils = ReflectUtils.reflect(any)
