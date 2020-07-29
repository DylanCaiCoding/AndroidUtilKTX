@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.GsonUtils
import com.google.gson.Gson
import org.json.JSONObject
import java.io.Reader
import java.lang.reflect.Type

/**
 * @author Dylan Cai
 */

inline var gsonDelegate: Gson
  get() = GsonUtils.getGson()
  set(value) = GsonUtils.setGsonDelegate(value)

inline fun putGson(key: String, gson: Gson) =
  GsonUtils.setGson(key, gson)

inline fun gsonOf(key: String): Gson? =
  GsonUtils.getGson(key)

inline fun Any.toJson(): String =
  GsonUtils.toJson(this)

inline fun <reified T> String.toInstance(gson: Gson = gsonDelegate): T =
  GsonUtils.fromJson(gson, this, T::class.java)

inline fun <T> String.toInstance(type: Type, gson: Gson = gsonDelegate): T =
  GsonUtils.fromJson(gson, this, type)

inline fun <reified T> Reader.toInstance(gson: Gson = gsonDelegate): T =
  GsonUtils.fromJson(gson, this, T::class.java)

inline fun <T> Reader.toInstance(type: Type, gson: Gson = gsonDelegate): T =
  GsonUtils.fromJson(gson, this, type)

inline fun listTypeOf(type: Type): Type =
  GsonUtils.getListType(type)

inline fun <reified T> String.toList(): List<T> =
  toInstance(listTypeOf<T>())

inline fun <reified T> String.toArray(): Array<T> =
  toInstance(arrayTypeOf<T>())

inline fun <reified T> String.toSet(): Set<T> =
  toInstance(setTypeOf<T>())

inline fun <reified K, reified V> String.toMap(): Map<K, V> =
  toInstance(mapTypeOf<K, V>())

inline fun <reified T> listTypeOf(): Type =
  GsonUtils.getListType(T::class.java)

inline fun arrayTypeOf(type: Type): Type =
  GsonUtils.getArrayType(type)

inline fun <reified T> arrayTypeOf(): Type =
  GsonUtils.getArrayType(T::class.java)

inline fun setTypeOf(type: Type): Type =
  GsonUtils.getSetType(type)

inline fun <reified T> setTypeOf(): Type =
  GsonUtils.getSetType(T::class.java)

inline fun mapTypeOf(keyType: Type, valueType: Type): Type =
  GsonUtils.getMapType(keyType, valueType)

inline fun <reified K, reified V> mapTypeOf(): Type =
  GsonUtils.getMapType(K::class.java, V::class.java)

inline fun typeOf(type: Type, vararg typeArgument: Type): Type =
  GsonUtils.getType(type, *typeArgument)

inline fun String.isJson(): Boolean =
  try {
    JSONObject(this)
    true
  } catch (e: Exception) {
    false
  }
