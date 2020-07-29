@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.EncodeUtils

/**
 * @author Dylan Cai
 */

inline fun String.urlEncode(charsetName: String = "UTF-8"): String =
  EncodeUtils.urlEncode(this, charsetName)

inline fun String.urlDecode(charsetName: String = "UTF-8"): String =
  EncodeUtils.urlDecode(this, charsetName)

inline fun String.base64Encode(): ByteArray =
  EncodeUtils.base64Encode(this)

inline fun ByteArray.base64Encode(): ByteArray =
  EncodeUtils.base64Encode(this)

inline fun String.base64Decode(): ByteArray =
  EncodeUtils.base64Decode(this)

inline fun ByteArray.base64Decode(): ByteArray =
  EncodeUtils.base64Decode(this)

inline fun ByteArray.base64Encode2String(): String =
  EncodeUtils.base64Encode2String(this)

inline fun CharSequence.htmlEncode(): String =
  EncodeUtils.htmlEncode(this)

inline fun String.htmlDecode(): CharSequence =
  EncodeUtils.htmlDecode(this)

inline fun String.binaryEncode(): String =
  EncodeUtils.binaryEncode(this)

inline fun String.binaryDecode(): String =
  EncodeUtils.binaryDecode(this)