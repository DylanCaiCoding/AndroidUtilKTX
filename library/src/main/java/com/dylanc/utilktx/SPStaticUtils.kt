@file:Suppress("ObjectPropertyName", "unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.content.Context
import com.blankj.utilcode.util.SPStaticUtils
import com.blankj.utilcode.util.SPUtils

/**
 * @author Dylan Cai
 */

inline var defaultSpUtils: SPUtils
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) {
    SPStaticUtils.setDefaultSPUtils(value)
  }

inline fun spUtilsOf(spName: String = "", mode: Int = Context.MODE_PRIVATE): SPUtils =
  SPUtils.getInstance(spName, mode)

inline val allSP: Map<String, *>
  get() = SPStaticUtils.getAll()

inline fun putSP(key: String, value: String, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

inline fun putSP(key: String, value: Int, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

inline fun putSP(key: String, value: Boolean, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

inline fun putSP(key: String, value: Long, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

inline fun putSP(key: String, value: Float, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

inline fun spValueOf(key: String, defaultValue: Boolean = false): Boolean =
  SPStaticUtils.getBoolean(key, defaultValue)

inline fun spValueOf(key: String, defaultValue: String? = null): String? =
  SPStaticUtils.getString(key, defaultValue)

inline fun spValueOf(key: String, defaultValue: Int = -1): Int =
  SPStaticUtils.getInt(key, defaultValue)

inline fun spValueOf(key: String, defaultValue: Long = -1L): Long =
  SPStaticUtils.getLong(key, defaultValue)

inline fun spValueOf(key: String, defaultValue: Float = -1f): Float =
  SPStaticUtils.getFloat(key, defaultValue)

inline fun containSp(key: String): Boolean =
  SPStaticUtils.contains(key)

inline fun removeSp(key: String, isCommit: Boolean = false) =
  SPStaticUtils.remove(key, isCommit)

inline fun clearSp(isCommit: Boolean = false) =
  SPStaticUtils.clear(isCommit)