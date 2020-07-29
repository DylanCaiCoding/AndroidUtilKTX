@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Parcelable
import android.view.View
import com.blankj.utilcode.util.ConvertUtils
import com.blankj.utilcode.util.ImageUtils
import org.json.JSONArray
import org.json.JSONObject
import java.io.InputStream
import java.io.OutputStream
import java.io.Serializable

/**
 * @author Dylan Cai
 */

inline fun Int.toHexString(): String =
  ConvertUtils.int2HexString(this)

inline fun String.toHexInt(): Int =
  ConvertUtils.hexString2Int(this)

inline fun ByteArray.toBitsString(): String =
  ConvertUtils.bytes2Bits(this)

inline fun String.toBit(): ByteArray =
  ConvertUtils.bits2Bytes(this)

inline fun ByteArray.toChars(): CharArray =
  ConvertUtils.bytes2Chars(this)

inline fun CharArray.toBytes(): ByteArray =
  ConvertUtils.chars2Bytes(this)

inline fun ByteArray.toHexString(): String =
  ConvertUtils.bytes2HexString(this)

inline fun String.toHexBytes(): ByteArray =
  ConvertUtils.hexString2Bytes(this)

inline fun ByteArray.toString(charsetName: String = ""): String =
  ConvertUtils.bytes2String(this, charsetName)

inline fun String.toBytes(charsetName: String = ""): ByteArray =
  ConvertUtils.string2Bytes(this, charsetName)

inline fun ByteArray.toJSONObject(): JSONObject =
  ConvertUtils.bytes2JSONObject(this)

inline fun JSONObject.toBytes(): ByteArray =
  ConvertUtils.jsonObject2Bytes(this)

inline fun ByteArray.toJSONArray(): JSONArray =
  ConvertUtils.bytes2JSONArray(this)

inline fun JSONArray.toBytes(): ByteArray =
  ConvertUtils.jsonArray2Bytes(this)

inline fun <T> ByteArray.toInstance(creator: Parcelable.Creator<T>): T =
  ConvertUtils.bytes2Parcelable(this, creator)

inline fun Parcelable.toBytes(): ByteArray =
  ConvertUtils.parcelable2Bytes(this)

inline fun ByteArray.toAny(): Any =
  ConvertUtils.bytes2Object(this)

inline fun Serializable.toBytes(): ByteArray =
  ConvertUtils.serializable2Bytes(this)

inline fun ByteArray.toBitmap(): Bitmap =
  ImageUtils.bytes2Bitmap(this)

inline fun Bitmap.toBytes(): ByteArray =
  ImageUtils.bitmap2Bytes(this)

inline fun Long.byte2MemorySize(unit: Int): Double =
  ConvertUtils.byte2MemorySize(this, unit)

inline fun Long.memorySize2Byte(unit: Int): Long =
  ConvertUtils.memorySize2Byte(this, unit)

inline fun Long.byte2FitMemorySize(precision: Int = 3): String =
  ConvertUtils.byte2FitMemorySize(this, precision)

inline fun Long.timeSpan2Millis(unit: Int): Long =
  ConvertUtils.timeSpan2Millis(this, unit)

inline fun Long.millis2TimeSpan(unit: Int): Long =
  ConvertUtils.millis2TimeSpan(this, unit)

inline fun Long.millis2FitTimeSpan(precision: Int): String =
  ConvertUtils.millis2FitTimeSpan(this, precision)

inline fun InputStream.toOutputStream(): OutputStream? =
  ConvertUtils.input2OutputStream(this)

// 这是非静态方法，没法调用
//inline fun OutputStream?.toInputStream(): InputStream =
//  ConvertUtils.output2InputStream(this)

inline fun InputStream.toBytes(): ByteArray =
  ConvertUtils.inputStream2Bytes(this)

inline fun ByteArray.toInputStream(): InputStream =
  ConvertUtils.bytes2InputStream(this)

inline fun OutputStream.toBytes(): ByteArray =
  ConvertUtils.outputStream2Bytes(this)

inline fun ByteArray.toOutputStream(): OutputStream =
  ConvertUtils.bytes2OutputStream(this)

inline fun InputStream.toString(charsetName: String): String =
  ConvertUtils.inputStream2String(this, charsetName)

inline fun String.toInputStream(charsetName: String): InputStream =
  ConvertUtils.string2InputStream(this, charsetName)

inline fun OutputStream.toString(charsetName: String): String =
  ConvertUtils.outputStream2String(this, charsetName)

inline fun String.toOutputStream(charsetName: String): OutputStream =
  ConvertUtils.string2OutputStream(this, charsetName)

inline fun InputStream.toLines(charsetName: String): List<String> =
  ConvertUtils.inputStream2Lines(this, charsetName)

inline fun Drawable.toBitmap(): Bitmap =
  ImageUtils.drawable2Bitmap(this)

inline fun Bitmap.toDrawable(): Drawable =
  ImageUtils.bitmap2Drawable(this)

inline fun Drawable.toBytes(): ByteArray =
  ImageUtils.drawable2Bytes(this)

inline fun ByteArray.toDrawable(): Drawable =
  ImageUtils.bytes2Drawable(this)

inline fun View.toBitmap(): Bitmap =
  ImageUtils.view2Bitmap(this)