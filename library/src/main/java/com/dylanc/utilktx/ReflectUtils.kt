@file:Suppress("unused")

package com.dylanc.utilktx

import com.blankj.utilcode.util.ReflectUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
inline fun <reified T> reflect(): ReflectUtils =
  ReflectUtils.reflect(T::class.java)

fun reflect(className: String, classLoader: ClassLoader? = null): ReflectUtils =
  if (classLoader == null) {
    ReflectUtils.reflect(className)
  } else {
    ReflectUtils.reflect(className, classLoader)
  }

fun reflect(any: Any): ReflectUtils =
  ReflectUtils.reflect(any)
