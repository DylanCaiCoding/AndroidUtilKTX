@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import androidx.annotation.ArrayRes
import androidx.annotation.StringRes
import com.blankj.utilcode.util.StringUtils

/**
 * @author Dylan Cai
*/

/**
 * Return whether string1 is equals to string2, ignoring case considerations. This is equivalent to calling:
 * ```
 * StringUtils.equalsIgnoreCase(s1, s2)
 * ```
 */
inline fun String.contentEqualsIgnoreCase(string: String): Boolean =
  StringUtils.equalsIgnoreCase(this, string)

/**
 * Return "" if string equals null. This is equivalent to calling:
 * ```
 * StringUtils.null2Length0(string)
 * ```
 */
inline fun String?.toNotNull(): String = StringUtils.null2Length0(this)

/**
 * Set the first letter of string upper. This is equivalent to calling:
 * ```
 * StringUtils.upperFirstLetter(string)
 * ```
 */
inline fun String.upperFirstLetter(): String = StringUtils.upperFirstLetter(this)

/**
 * Set the first letter of string lower. This is equivalent to calling:
 * ```
 * StringUtils.lowerFirstLetter(string)
 * ```
 */
inline fun String.lowerFirstLetter(): String = StringUtils.lowerFirstLetter(this)

/**
 * Reverse the string. This is equivalent to calling:
 * ```
 * StringUtils.reverse(string)
 * ```
 */
inline fun String.reverse(): String = StringUtils.reverse(this)

/**
 * Convert string to DBC. This is equivalent to calling:
 * ```
 * StringUtils.toDBC(string)
 * ```
 */
inline fun String.toDBC(): String = StringUtils.toDBC(this)

/**
 * Convert string to SBC. This is equivalent to calling:
 * ```
 * StringUtils.toDBC(string)
 * ```
 */
inline fun String.toSBC(): String = StringUtils.toSBC(this)

/**
 * Return the string value associated with a particular resource ID. This is equivalent to calling:
 * ```
 * StringUtils.getString(id)
 * ```
 */
inline fun stringOf(@StringRes id: Int): String = StringUtils.getString(id)

/**
 * Return the string value associated with a particular resource ID. This is equivalent to calling:
 * ```
 * StringUtils.getString(id, formatArgs)
 * ```
 */
inline fun stringOf(@StringRes id: Int, vararg formatArgs: Any): String =
  StringUtils.getString(id, *formatArgs)

/**
 * Return the string array associated with a particular resource ID. This is equivalent to calling:
 * ```
 * StringUtils.getStringArray(id)
 * ```
 */
inline fun stringArrayOf(@ArrayRes id:Int): Array<String> = StringUtils.getStringArray(id)