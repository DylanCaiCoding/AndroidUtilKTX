package com.dylanc.utilktx

import android.graphics.Bitmap
import android.os.Parcelable
import com.blankj.utilcode.util.ConvertUtils
import org.json.JSONArray
import org.json.JSONObject
import java.io.Serializable

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */

fun Int.toHexString(): String =
  ConvertUtils.int2HexString(this)

fun String.hexString2Int(): Int =
  ConvertUtils.hexString2Int(this)

fun ByteArray.toBits(): String =
  ConvertUtils.bytes2Bits(this)

fun String.bits2Bytes(): ByteArray =
  ConvertUtils.bits2Bytes(this)

fun ByteArray.toChars(): CharArray =
  ConvertUtils.bytes2Chars(this)

fun CharArray.toBytes(): ByteArray =
  ConvertUtils.chars2Bytes(this)

fun ByteArray.toHexString(): String =
  ConvertUtils.bytes2HexString(this)

fun String.hexString2Bytes(): ByteArray =
  ConvertUtils.hexString2Bytes(this)

fun ByteArray.toString(charsetName: String = ""): String =
  ConvertUtils.bytes2String(this, charsetName)

fun String.toBytes(charsetName: String = ""): ByteArray =
  ConvertUtils.string2Bytes(this, charsetName)

fun ByteArray.toJSONObject(): JSONObject =
  ConvertUtils.bytes2JSONObject(this)

fun JSONObject.toBytes(): ByteArray =
  ConvertUtils.jsonObject2Bytes(this)

fun ByteArray.toJSONArray(): JSONArray =
  ConvertUtils.bytes2JSONArray(this)

fun JSONArray.toBytes(): ByteArray =
  ConvertUtils.jsonArray2Bytes(this)

fun <T> ByteArray.toInstance(creator: Parcelable.Creator<T>): T =
  ConvertUtils.bytes2Parcelable(this, creator)

fun Parcelable.toBytes(): ByteArray =
  ConvertUtils.parcelable2Bytes(this)

fun ByteArray.toAny(): Any =
  ConvertUtils.bytes2Object(this)

fun Serializable.toBytes(): ByteArray =
  ConvertUtils.serializable2Bytes(this)

//fun ByteArray.toBitmap(): Bitmap =
//  ConvertUtils.bytes2Bitmap(this)
//
//fun Bitmap.toBytes(): ByteArray =
//  ConvertUtils.bitmap2Bytes(this)

