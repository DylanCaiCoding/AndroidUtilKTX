package com.dylanc.utilktx

import com.blankj.utilcode.util.SPStaticUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
val allSP = SPStaticUtils.getAll()

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

fun removeSp(key: String, isCommit: Boolean = false) = SPStaticUtils.remove(key,isCommit)

fun spValueOf(key: String, defaultValue: Boolean = false): Boolean = SPStaticUtils.getBoolean(key, defaultValue)

fun spValueOf(key: String, defaultValue: String? = null):String? = SPStaticUtils.getString(key, defaultValue)

fun spValueOf(key: String, defaultValue: Int = -1): Int = SPStaticUtils.getInt(key, defaultValue)

fun spValueOf(key: String, defaultValue: Long = -1L): Long = SPStaticUtils.getLong(key, defaultValue)

fun spValueOf(key: String, defaultValue: Float = -1f): Float = SPStaticUtils.getFloat(key, defaultValue)