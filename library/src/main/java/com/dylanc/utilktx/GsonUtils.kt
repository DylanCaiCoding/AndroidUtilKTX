package com.dylanc.utilktx

import com.blankj.utilcode.util.GsonUtils
import java.lang.reflect.Type
import kotlin.reflect.KClass

/**
 * @author Dylan Cai
 * @since 2019/12/5
 */
fun Any.toJson(): String = GsonUtils.toJson(this)

inline fun <reified T> String.toInstance(): T = GsonUtils.fromJson(this, T::class.java)

inline fun <reified T : Any> String.toInstance(clazz: KClass<T>): T =
  GsonUtils.fromJson(this, clazz.java)

inline fun <reified T : Any> String.toInstance(type: Type): T =
  GsonUtils.fromJson(this, type)