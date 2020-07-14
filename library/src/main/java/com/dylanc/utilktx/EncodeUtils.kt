package com.dylanc.utilktx

import com.blankj.utilcode.util.EncodeUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
fun String.urlEncode(charsetName: String = "UTF-8"): String =
  EncodeUtils.urlEncode(this, charsetName)

fun String.urlDecode(charsetName: String = "UTF-8"): String =
  EncodeUtils.urlDecode(this, charsetName)

fun String.base64Encode(): ByteArray =
  EncodeUtils.base64Encode(this)

fun ByteArray.base64Encode(): ByteArray =
  EncodeUtils.base64Encode(this)

fun String.base64Decode(): ByteArray =
  EncodeUtils.base64Decode(this)

fun ByteArray.base64Decode(): ByteArray =
  EncodeUtils.base64Decode(this)

fun ByteArray.base64Encode2String(): String =
  EncodeUtils.base64Encode2String(this)

fun CharSequence.htmlEncode(): String =
  EncodeUtils.htmlEncode(this)

fun String.htmlDecode(): CharSequence =
  EncodeUtils.htmlDecode(this)

fun String.binaryEncode(): String =
  EncodeUtils.binaryEncode(this)

fun String.binaryDecode(): String =
  EncodeUtils.binaryDecode(this)