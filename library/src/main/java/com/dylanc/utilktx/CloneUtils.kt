package com.dylanc.utilktx

import com.blankj.utilcode.util.CloneUtils
import java.lang.reflect.Type

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */
inline fun <reified T> T.deepClone(): T =
  CloneUtils.deepClone(this, typeOf(T::class.java))

fun <T> T.deepClone(type: Type): T =
  CloneUtils.deepClone(this, type)