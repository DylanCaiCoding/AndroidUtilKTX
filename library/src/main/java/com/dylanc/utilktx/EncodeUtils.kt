@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.EncodeUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns the urlencoded string. This is equivalent to calling:
 * ```
 * EncodeUtils.urlEncode(input, charsetName)
 * ```
 */
inline fun String.urlEncode(charsetName: String = "UTF-8"): String =
  EncodeUtils.urlEncode(this, charsetName)

/**
 * Returns the string of decode urlencoded string. This is equivalent to calling:
 * ```
 * EncodeUtils.urlDecode(input, charsetName)
 * ```
 */
inline fun String.urlDecode(charsetName: String = "UTF-8"): String =
  EncodeUtils.urlDecode(this, charsetName)

/**
 * Returns Base64-encode bytes. This is equivalent to calling:
 * ```
 * EncodeUtils.base64Encode(input)
 * ```
 */
inline fun String.base64Encode(): ByteArray = EncodeUtils.base64Encode(this)

/**
 * Returns Base64-encode bytes. This is equivalent to calling:
 * ```
 * EncodeUtils.base64Encode(input)
 * ```
 */
inline fun ByteArray.base64Encode(): ByteArray = EncodeUtils.base64Encode(this)

/**
 * Returns the bytes of decode Base64-encode string. This is equivalent to calling:
 * ```
 * EncodeUtils.base64Decode(input)
 * ```
 */
inline fun String.base64Decode(): ByteArray = EncodeUtils.base64Decode(this)

/**
 * Returns the bytes of decode Base64-encode string. This is equivalent to calling:
 * ```
 * EncodeUtils.base64Decode(input)
 * ```
 */
inline fun ByteArray.base64Decode(): ByteArray = EncodeUtils.base64Decode(this)

/**
 * Returns html-encode string. This is equivalent to calling:
 * ```
 * EncodeUtils.htmlEncode(input)
 * ```
 */
inline fun String.htmlEncode(): String = EncodeUtils.htmlEncode(this)

/**
 * Returns the string of decode html-encode string. This is equivalent to calling:
 * ```
 * EncodeUtils.htmlDecode(input)
 * ```
 */
inline fun String.htmlDecode(): CharSequence = EncodeUtils.htmlDecode(this)

/**
 * Returns the binary encoded string padded with one space. This is equivalent to calling:
 * ```
 * EncodeUtils.binaryEncode(input)
 * ```
 */
inline fun String.binaryEncode(): String = EncodeUtils.binaryEncode(this)

/**
 * Returns UTF-8 String from binary. This is equivalent to calling:
 * ```
 * EncodeUtils.binaryDecode(input)
 * ```
 */
inline fun String.binaryDecode(): String = EncodeUtils.binaryDecode(this)