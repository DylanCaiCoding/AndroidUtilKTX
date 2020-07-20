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
 * @since 2020/5/9
 */

fun Int.toHexString(): String =
  ConvertUtils.int2HexString(this)

fun String?.hexString2Int(): Int =
  ConvertUtils.hexString2Int(this)

fun ByteArray?.toBits(): String =
  ConvertUtils.bytes2Bits(this)

fun String?.bits2Bytes(): ByteArray =
  ConvertUtils.bits2Bytes(this)

fun ByteArray?.toChars(): CharArray =
  ConvertUtils.bytes2Chars(this)

fun CharArray?.toBytes(): ByteArray =
  ConvertUtils.chars2Bytes(this)

fun ByteArray?.toHexString(): String =
  ConvertUtils.bytes2HexString(this)

fun String?.hexString2Bytes(): ByteArray =
  ConvertUtils.hexString2Bytes(this)

fun ByteArray?.toString(charsetName: String = ""): String =
  ConvertUtils.bytes2String(this, charsetName)

fun String?.toBytes(charsetName: String = ""): ByteArray =
  ConvertUtils.string2Bytes(this, charsetName)

fun ByteArray?.toJSONObject(): JSONObject =
  ConvertUtils.bytes2JSONObject(this)

fun JSONObject?.toBytes(): ByteArray =
  ConvertUtils.jsonObject2Bytes(this)

fun ByteArray?.toJSONArray(): JSONArray =
  ConvertUtils.bytes2JSONArray(this)

fun JSONArray?.toBytes(): ByteArray =
  ConvertUtils.jsonArray2Bytes(this)

fun <T> ByteArray?.toInstance(creator: Parcelable.Creator<T>): T =
  ConvertUtils.bytes2Parcelable(this, creator)

fun Parcelable?.toBytes(): ByteArray =
  ConvertUtils.parcelable2Bytes(this)

fun ByteArray?.toAny(): Any =
  ConvertUtils.bytes2Object(this)

fun Serializable?.toBytes(): ByteArray =
  ConvertUtils.serializable2Bytes(this)

fun ByteArray?.toBitmap(): Bitmap =
  ImageUtils.bytes2Bitmap(this)

fun Bitmap?.toBytes(): ByteArray =
  ImageUtils.bitmap2Bytes(this)

fun Long.byte2MemorySize(unit: Int): Double =
  ConvertUtils.byte2MemorySize(this, unit)

fun Long.memorySize2Byte(unit: Int): Long =
  ConvertUtils.memorySize2Byte(this, unit)

fun Long.byte2FitMemorySize(precision: Int = 3): String =
  ConvertUtils.byte2FitMemorySize(this, precision)

fun Long.timeSpan2Millis(unit: Int): Long =
  ConvertUtils.timeSpan2Millis(this, unit)

fun Long.millis2TimeSpan(unit: Int): Long =
  ConvertUtils.millis2TimeSpan(this, unit)

fun Long.millis2FitTimeSpan(precision: Int): String =
  ConvertUtils.millis2FitTimeSpan(this, precision)

fun InputStream?.toOutputStream(): OutputStream? =
  ConvertUtils.input2OutputStream(this)

//fun OutputStream?.toInputStream(): InputStream =
//  ConvertUtils.output2InputStream(this)

fun InputStream?.toBytes(): ByteArray =
  ConvertUtils.inputStream2Bytes(this)

fun ByteArray?.toInputStream(): InputStream =
  ConvertUtils.bytes2InputStream(this)

fun OutputStream?.toBytes(): ByteArray =
  ConvertUtils.outputStream2Bytes(this)

fun ByteArray?.toOutputStream(): OutputStream =
  ConvertUtils.bytes2OutputStream(this)

fun InputStream?.toString(charsetName: String): String =
  ConvertUtils.inputStream2String(this, charsetName)

fun String?.toInputStream(charsetName: String): InputStream =
  ConvertUtils.string2InputStream(this, charsetName)

fun OutputStream?.toString(charsetName: String): String =
  ConvertUtils.outputStream2String(this, charsetName)

fun String?.toOutputStream(charsetName: String): OutputStream =
  ConvertUtils.string2OutputStream(this, charsetName)

fun InputStream?.toLine(charsetName: String): List<String> =
  ConvertUtils.inputStream2Lines(this, charsetName)

fun Drawable.toBitmap(): Bitmap =
  ImageUtils.drawable2Bitmap(this)

fun Bitmap?.toDrawable(): Drawable =
  ImageUtils.bitmap2Drawable(this)

fun Drawable?.toBytes(): ByteArray =
  ImageUtils.drawable2Bytes(this)

fun ByteArray?.toDrawable(): Drawable =
  ImageUtils.bytes2Drawable(this)

fun View.toBitmap(): Bitmap =
  ImageUtils.view2Bitmap(this)