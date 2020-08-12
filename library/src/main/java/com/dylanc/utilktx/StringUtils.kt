@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import androidx.annotation.ArrayRes
import androidx.annotation.StringRes
import com.blankj.utilcode.util.StringUtils

/**
 * @author Dylan Cai
 */

inline fun String.contentEqualsIgnoreCase(string: String): Boolean =
  StringUtils.equalsIgnoreCase(this, string)

inline fun String?.toNotNull(): String = StringUtils.null2Length0(this)

inline fun String.upperFirstLetter(): String = StringUtils.upperFirstLetter(this)

inline fun String.lowerFirstLetter(): String = StringUtils.lowerFirstLetter(this)

inline fun String.reverse(): String = StringUtils.reverse(this)

inline fun String.toDBC(): String = StringUtils.toDBC(this)

inline fun String.toSBC(): String = StringUtils.toSBC(this)

inline fun stringOf(@StringRes id: Int): String = StringUtils.getString(id)

inline fun stringOf(@StringRes id: Int, vararg formatArgs: Any): String =
  StringUtils.getString(id, *formatArgs)

inline fun stringArrayOf(@ArrayRes id:Int): Array<String> = StringUtils.getStringArray(id)