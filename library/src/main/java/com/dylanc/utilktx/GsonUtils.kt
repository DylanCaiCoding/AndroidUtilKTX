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

/**
 * Returns the delegate of gson or sets the delegate of gson. This is equivalent to calling:
 * ```
 * GsonUtils.getGson()
 * ```
 * or
 * ```
 * GsonUtils.setGsonDelegate(value)
 * ```
 */
inline var gsonDelegate: Gson
  get() = GsonUtils.getGson()
  set(value) = GsonUtils.setGsonDelegate(value)

/**
 * Puts the Gson with key. This is equivalent to calling:
 * ```
 * GsonUtils.setGson(key, gson)
 * ```
 */
inline fun putGson(key: String, gson: Gson) = GsonUtils.setGson(key, gson)

/**
 * Returns the Gson with key. This is equivalent to calling:
 * ```
 * GsonUtils.getGson(key)
 * ```
 */
inline fun gsonOf(key: String): Gson? = GsonUtils.getGson(key)

/**
 * Serializes an object into a JSON string. This is equivalent to calling:
 * ```
 * GsonUtils.toJson(object)
 * ```
 */
inline fun Any.toJson(): String = GsonUtils.toJson(this)

/**
 * Converts the JSON string to the given type. This is equivalent to calling:
 * ```
 * GsonUtils.fromJson(gson, json, type)
 * ```
 */
inline fun <reified T> String.toInstance(gson: Gson = gsonDelegate): T = GsonUtils.fromJson(gson, this, T::class.java)

/**
 * Converts the JSON string to the given type. This is equivalent to calling:
 * ```
 * GsonUtils.fromJson(gson, json, type)
 * ```
 */
inline fun <T> String.toInstance(type: Type, gson: Gson = gsonDelegate): T = GsonUtils.fromJson(gson, this, type)

/**
 * Converts the [Reader] to the given type. This is equivalent to calling:
 * ```
 * GsonUtils.fromJson(gson, reader, type)
 * ```
 */
inline fun <reified T> Reader.toInstance(gson: Gson = gsonDelegate): T = GsonUtils.fromJson(gson, this, T::class.java)

/**
 * Converts the [Reader] to the given type. This is equivalent to calling:
 * ```
 * GsonUtils.fromJson(gson, reader, type)
 * ```
 */
inline fun <T> Reader.toInstance(type: Type, gson: Gson = gsonDelegate): T = GsonUtils.fromJson(gson, this, type)

/**
 * Converts the JSON string to the list. This is equivalent to calling:
 * ```
 * GsonUtils.fromJson(gson, json, GsonUtils.getListType(clazz))
 * ```
 */
inline fun <reified T> String.toList(gson: Gson = gsonDelegate): List<T> = toInstance(listTypeOf<T>(), gson)

/**
 * Converts the JSON string to the set. This is equivalent to calling:
 * ```
 * GsonUtils.fromJson(gson, json, GsonUtils.getSetType(clazz))
 * ```
 */
inline fun <reified T> String.toSet(gson: Gson = gsonDelegate): Set<T> = toInstance(setTypeOf<T>(), gson)

/**
 * Converts the JSON string to the map. This is equivalent to calling:
 * ```
 * GsonUtils.fromJson(gson, json, GsonUtils.getMapType(clazz))
 * ```
 */
inline fun <reified K, reified V> String.toMap(): Map<K, V> = toInstance(mapTypeOf<K, V>())

/**
 * Converts the JSON string to the array. This is equivalent to calling:
 * ```
 * GsonUtils.fromJson(gson, json, GsonUtils.getArrayType(clazz))
 * ```
 */
inline fun <reified T> String.toArray(gson: Gson = gsonDelegate): Array<T> = toInstance(arrayTypeOf<T>(), gson)

/**
 * Returns the [Type] of the list. This is equivalent to calling:
 * ```
 * GsonUtils.getListType(type)
 * ```
 */
inline fun listTypeOf(type: Type): Type = GsonUtils.getListType(type)

/**
 * Returns the [Type] of the list. This is equivalent to calling:
 * ```
 * GsonUtils.getListType(type)
 * ```
 */
inline fun <reified T> listTypeOf(): Type = GsonUtils.getListType(T::class.java)

/**
 * Returns the [Type] of the set. This is equivalent to calling:
 * ```
 * GsonUtils.getSetType(type)
 * ```
 */
inline fun setTypeOf(type: Type): Type = GsonUtils.getSetType(type)

/**
 * Returns the [Type] of the set. This is equivalent to calling:
 * ```
 * GsonUtils.getSetType(type)
 * ```
 */
inline fun <reified T> setTypeOf(): Type = GsonUtils.getSetType(T::class.java)

/**
 * Returns the [Type] of the map. This is equivalent to calling:
 * ```
 * GsonUtils.getMapType(keyType, valueType)
 * ```
 */
inline fun mapTypeOf(keyType: Type, valueType: Type): Type = GsonUtils.getMapType(keyType, valueType)

/**
 * Returns the [Type] of the map. This is equivalent to calling:
 * ```
 * GsonUtils.getMapType(keyType, valueType)
 * ```
 */
inline fun <reified K, reified V> mapTypeOf(): Type = GsonUtils.getMapType(K::class.java, V::class.java)

/**
 * Returns the [Type] of the array. This is equivalent to calling:
 * ```
 * GsonUtils.getArrayType(type)
 * ```
 */
inline fun arrayTypeOf(type: Type): Type = GsonUtils.getArrayType(type)

/**
 * Returns the [Type] of the array. This is equivalent to calling:
 * ```
 * GsonUtils.getArrayType(type)
 * ```
 */
inline fun <reified T> arrayTypeOf(): Type = GsonUtils.getArrayType(T::class.java)

/**
 * Returns the [Type] of rawType with the typeArguments. This is equivalent to calling:
 * ```
 * GsonUtils.getType(type, typeArgument)
 * ```
 */
inline fun typeOf(type: Type, vararg typeArgument: Type): Type = GsonUtils.getType(type, *typeArgument)

/**
 * Returns the string is a JSON string.
 */
inline fun String.isJson(): Boolean =
  try {
    JSONObject(this)
    true
  } catch (e: Exception) {
    false
  }
