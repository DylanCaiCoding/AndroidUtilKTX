@file:Suppress("ObjectPropertyName", "unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.content.Context
import com.blankj.utilcode.util.SPStaticUtils
import com.blankj.utilcode.util.SPUtils
import com.dylanc.utilktx.Internals.NO_GETTER
import com.dylanc.utilktx.Internals.noGetter

/**
 * @author Dylan Cai
 */

/**
 * Returns the single [SPUtils] instance. This is equivalent to calling:
 * ```
 * SPUtils.getInstance(spName, mode)
 * ```
 */
inline fun spUtilsOf(spName: String = "", mode: Int = Context.MODE_PRIVATE): SPUtils =
  SPUtils.getInstance(spName, mode)

/**
 * Sets the default instance of [SPUtils]. This is equivalent to calling:
 * ```
 * SPStaticUtils.setDefaultSPUtils(spUtils)
 * ```
 */
inline var defaultSpUtils: SPUtils
  @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
  get() = throw noGetter()
  set(value) = SPStaticUtils.setDefaultSPUtils(value)

/**
 * Puts the string value in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.put(key, value, isCommit)
 * ```
 */
inline fun putSpValue(key: String, value: String, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

/**
 * Puts the integer value in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.put(key, value, isCommit)
 * ```
 */
inline fun putSpValue(key: String, value: Int, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

/**
 * Puts the boolean value in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.put(key, value, isCommit)
 * ```
 */
inline fun putSpValue(key: String, value: Boolean, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

/**
 * Puts the long value in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.put(key, value, isCommit)
 * ```
 */
inline fun putSpValue(key: String, value: Long, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

/**
 * Puts the float value in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.put(key, value, isCommit)
 * ```
 */
inline fun putSpValue(key: String, value: Float, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

/**
 * Returns the boolean value in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.getBoolean(key, defaultValue)
 * ```
 */
inline fun spValueOf(key: String, defaultValue: Boolean = false): Boolean =
  SPStaticUtils.getBoolean(key, defaultValue)

/**
 * Returns the string value in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.getBoolean(key, defaultValue)
 * ```
 */
inline fun spValueOf(key: String, defaultValue: String? = null): String? =
  SPStaticUtils.getString(key, defaultValue)

/**
 * Returns the integer value in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.getBoolean(key, defaultValue)
 * ```
 */
inline fun spValueOf(key: String, defaultValue: Int = -1): Int =
  SPStaticUtils.getInt(key, defaultValue)

/**
 * Returns the long value in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.getBoolean(key, defaultValue)
 * ```
 */
inline fun spValueOf(key: String, defaultValue: Long = -1L): Long =
  SPStaticUtils.getLong(key, defaultValue)

/**
 * Returns the float value in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.getBoolean(key, defaultValue)
 * ```
 */
inline fun spValueOf(key: String, defaultValue: Float = -1f): Float =
  SPStaticUtils.getFloat(key, defaultValue)

/**
 * Returns all values in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.getAll()
 * ```
 */
inline val allSpValues: Map<String, *> get() = SPStaticUtils.getAll()

/**
 * Returns whether the sp contains the preference. This is equivalent to calling:
 * ```
 * SPStaticUtils.contains(key)
 * ```
 */
inline fun containSpValue(key: String): Boolean = SPStaticUtils.contains(key)

/**
 * Removes the preference in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.remove(key, isCommit)
 * ```
 */
inline fun removeSpValue(key: String, isCommit: Boolean = false) =
  SPStaticUtils.remove(key, isCommit)

/**
 * Removes all preferences in sp. This is equivalent to calling:
 * ```
 * SPStaticUtils.clear(isCommit)
 * ```
 */
inline fun clearSp(isCommit: Boolean = false) = SPStaticUtils.clear(isCommit)