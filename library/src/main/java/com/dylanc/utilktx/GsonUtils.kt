@file:Suppress("unused")

package com.dylanc.utilktx

import com.blankj.utilcode.util.GsonUtils
import com.google.gson.Gson
import java.io.Reader
import java.lang.reflect.Type

/**
 * @author Dylan Cai
 * @since 2019/12/5
 */
fun setGsonDelegate(gson: Gson) =
  GsonUtils.setGsonDelegate(gson)

fun putGson(key: String, gson: Gson) =
  GsonUtils.setGson(key, gson)

fun gsonOf(key: String): Gson? =
  GsonUtils.getGson(key)

val gson: Gson
  get() = GsonUtils.getGson()

fun Any.toJson(): String =
  GsonUtils.toJson(this)

inline fun <reified T> String.toInstance(gson: Gson = com.dylanc.utilktx.gson): T =
  GsonUtils.fromJson(gson, this, T::class.java)

fun <T> String.toInstance(type: Type, gson: Gson = com.dylanc.utilktx.gson): T =
  GsonUtils.fromJson(gson, this, type)

inline fun <reified T> Reader.toInstance(gson: Gson = com.dylanc.utilktx.gson): T =
  GsonUtils.fromJson(gson, this, T::class.java)

fun <T> Reader.toInstance(type: Type, gson: Gson = com.dylanc.utilktx.gson): T =
  GsonUtils.fromJson(gson, this, type)

fun listTypeOf(type: Type): Type =
  GsonUtils.getListType(type)

inline fun <reified T> String.toListInstance(): List<T> =
  toInstance(listTypeOf<T>())

inline fun <reified T> String.toArrayInstance(): Array<T> =
  toInstance(arrayTypeOf<T>())

inline fun <reified T> String.toSetInstance(): Set<T> =
  toInstance(setTypeOf<T>())

inline fun <reified K, reified V> String.toMapInstance(): Map<K, V> =
  toInstance(mapTypeOf<K, V>())

inline fun <reified T> listTypeOf(): Type =
  GsonUtils.getListType(T::class.java)

fun arrayTypeOf(type: Type): Type =
  GsonUtils.getArrayType(type)

inline fun <reified T> arrayTypeOf(): Type =
  GsonUtils.getArrayType(T::class.java)

fun setTypeOf(type: Type): Type =
  GsonUtils.getSetType(type)

inline fun <reified T> setTypeOf(): Type =
  GsonUtils.getSetType(T::class.java)

fun mapTypeOf(keyType: Type, valueType: Type): Type =
  GsonUtils.getMapType(keyType, valueType)

inline fun <reified K, reified V> mapTypeOf(): Type =
  GsonUtils.getMapType(K::class.java, V::class.java)

fun typeOf(type: Type, vararg typeArgument: Type): Type =
  GsonUtils.getType(type, *typeArgument)