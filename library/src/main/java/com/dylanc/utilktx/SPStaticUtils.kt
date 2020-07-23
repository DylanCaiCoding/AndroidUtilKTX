@file:Suppress("ObjectPropertyName", "unused")

package com.dylanc.utilktx

import android.content.Context
import com.blankj.utilcode.util.SPStaticUtils
import com.blankj.utilcode.util.SPUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
private var _defaultSpUtils: SPUtils? = null

var defaultSpUtils: SPUtils
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) {
    _defaultSpUtils = value
    SPStaticUtils.setDefaultSPUtils(value)
  }

fun spUtilsOf(spName: String = "", mode: Int = Context.MODE_PRIVATE): SPUtils =
  SPUtils.getInstance(spName, mode)

val allSP: Map<String, *> =
  SPStaticUtils.getAll()

fun putSP(key: String, value: String, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

fun putSP(key: String, value: Int, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

fun putSP(key: String, value: Boolean, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

fun putSP(key: String, value: Long, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

fun putSP(key: String, value: Float, isCommit: Boolean = false) =
  SPStaticUtils.put(key, value, isCommit)

fun spValueOf(key: String, defaultValue: Boolean = false): Boolean =
  SPStaticUtils.getBoolean(key, defaultValue)

fun spValueOf(key: String, defaultValue: String? = null): String? =
  SPStaticUtils.getString(key, defaultValue)

fun spValueOf(key: String, defaultValue: Int = -1): Int =
  SPStaticUtils.getInt(key, defaultValue)

fun spValueOf(key: String, defaultValue: Long = -1L): Long =
  SPStaticUtils.getLong(key, defaultValue)

fun spValueOf(key: String, defaultValue: Float = -1f): Float =
  SPStaticUtils.getFloat(key, defaultValue)

fun containSp(key: String): Boolean =
  SPStaticUtils.contains(key)

fun removeSp(key: String, isCommit: Boolean = false) =
  SPStaticUtils.remove(key, isCommit)

fun clearSp(isCommit: Boolean = false) =
  SPStaticUtils.clear(isCommit)