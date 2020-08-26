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

/**
 * Converts the integer to the hex string. This is equivalent to calling:
 * ```
 * ConvertUtils.int2HexString(num)
 * ```
 */
inline fun Int.toHexString(): String = ConvertUtils.int2HexString(this)

/**
 * Converts the hex string to the integer. This is equivalent to calling:
 * ```
 * ConvertUtils.hexString2Int(hexString)
 * ```
 */
inline fun String.toHexInt(): Int = ConvertUtils.hexString2Int(this)

/**
 * Converts the bytes to the bits. This is equivalent to calling:
 * ```
 * ConvertUtils.bytes2Bits(bytes)
 * ```
 */
inline fun ByteArray.toBitsString(): String = ConvertUtils.bytes2Bits(this)

/**
 * Converts the bits to the bytes. This is equivalent to calling:
 * ```
 * ConvertUtils.bits2Bytes(bits)
 * ```
 */
inline fun String.toBytes(): ByteArray = ConvertUtils.bits2Bytes(this)

/**
 * Converts the bytes to the chars. This is equivalent to calling:
 * ```
 * ConvertUtils.bytes2Chars(bytes)
 * ```
 */
inline fun ByteArray.toChars(): CharArray = ConvertUtils.bytes2Chars(this)

/**
 * Converts the chars to the bytes. This is equivalent to calling:
 * ```
 * ConvertUtils.chars2Bytes(chars)
 * ```
 */
inline fun CharArray.toBytes(): ByteArray = ConvertUtils.chars2Bytes(this)

/**
 * Converts the bytes to the hex string. This is equivalent to calling:
 * ```
 * ConvertUtils.bytes2HexString(bytes)
 * ```
 */
inline fun ByteArray.toHexString(): String = ConvertUtils.bytes2HexString(this)

/**
 * Converts the hex string to the bytes. This is equivalent to calling:
 * ```
 * ConvertUtils.hexString2Bytes(hexString)
 * ```
 */
inline fun String.toHexBytes(): ByteArray = ConvertUtils.hexString2Bytes(this)

/**
 * Converts the bytes to the string. This is equivalent to calling:
 * ```
 * ConvertUtils.bytes2String(bytes)
 * ```
 */
inline fun ByteArray.toString(charsetName: String = ""): String = ConvertUtils.bytes2String(this, charsetName)

/**
 * Converts the string to the bytes. This is equivalent to calling:
 * ```
 * ConvertUtils.string2Bytes(string)
 * ```
 */
inline fun String.toBytes(charsetName: String = ""): ByteArray = ConvertUtils.string2Bytes(this, charsetName)

/**
 * Converts the bytes to the [JSONObject]. This is equivalent to calling:
 * ```
 * ConvertUtils.bytes2JSONObject(bytes)
 * ```
 */
inline fun ByteArray.toJSONObject(): JSONObject = ConvertUtils.bytes2JSONObject(this)

/**
 * Converts the [JSONObject] to the bytes. This is equivalent to calling:
 * ```
 * ConvertUtils.jsonObject2Bytes(jsonObject)
 * ```
 */
inline fun JSONObject.toBytes(): ByteArray = ConvertUtils.jsonObject2Bytes(this)

/**
 * Converts the bytes to the [JSONArray]. This is equivalent to calling:
 * ```
 * ConvertUtils.bytes2JSONArray(bytes)
 * ```
 */
inline fun ByteArray.toJSONArray(): JSONArray = ConvertUtils.bytes2JSONArray(this)

/**
 * Converts the [JSONArray] to the bytes. This is equivalent to calling:
 * ```
 * ConvertUtils.jsonArray2Bytes(jsonArray)
 * ```
 */
inline fun JSONArray.toBytes(): ByteArray = ConvertUtils.jsonArray2Bytes(this)

/**
 * Converts the bytes to the [Parcelable]. This is equivalent to calling:
 * ```
 * ConvertUtils.bytes2Parcelable(bytes, creator)
 * ```
 */
inline fun <T> ByteArray.toParcelable(creator: Parcelable.Creator<T>): T = ConvertUtils.bytes2Parcelable(this, creator)

/**
 * Converts the [Parcelable] to the bytes. This is equivalent to calling:
 * ```
 * ConvertUtils.parcelable2Bytes(parcelable)
 * ```
 */
inline fun Parcelable.toBytes(): ByteArray = ConvertUtils.parcelable2Bytes(this)

/**
 * Converts the bytes to the [Serializable]. This is equivalent to calling:
 * ```
 * ConvertUtils.bytes2Object(bytes)
 * ```
 */
@Suppress("UNCHECKED_CAST")
inline fun <T> ByteArray.toSerializable(): T = ConvertUtils.bytes2Object(this) as T

/**
 * Converts the [Serializable] to the bytes. This is equivalent to calling:
 * ```
 * ConvertUtils.serializable2Bytes(serializable)
 * ```
 */
inline fun Serializable.toBytes(): ByteArray = ConvertUtils.serializable2Bytes(this)

/**
 * Converts the bytes to the bitmap. This is equivalent to calling:
 * ```
 * ConvertUtils.bytes2Bitmap(bytes)
 * ```
 */
inline fun ByteArray.toBitmap(): Bitmap = ImageUtils.bytes2Bitmap(this)

/**
 * Converts the bitmap to the bytes. This is equivalent to calling:
 * ```
 * ConvertUtils.bitmap2Bytes(bitmap)
 * ```
 */
inline fun Bitmap.toBytes(): ByteArray = ImageUtils.bitmap2Bytes(this)

/**
 * Converts the size of memory to the size of byte in unit. This is equivalent to calling:
 * ```
 * ConvertUtils.memorySize2Byte(memorySize)
 * ```
 */
inline fun Long.memorySizeToByte(unit: Int): Long = ConvertUtils.memorySize2Byte(this, unit)

/**
 * Converts the size of byte to the size of memory in unit. This is equivalent to calling:
 * ```
 * ConvertUtils.byte2MemorySize(byteSize, unit)
 * ```
 */
inline fun Long.byteToMemorySize(unit: Int): Double = ConvertUtils.byte2MemorySize(this, unit)

/**
 * Converts the size of byte to the fix size of memory. This is equivalent to calling:
 * ```
 * ConvertUtils.byte2FitMemorySize(byteSize, precision)
 * ```
 */
inline fun Long.byteToFitMemorySize(precision: Int = 3): String = ConvertUtils.byte2FitMemorySize(this, precision)

/**
 * Converts the time span in unit to milliseconds. This is equivalent to calling:
 * ```
 * ConvertUtils.timeSpan2Millis(timeSpan, unit)
 * ```
 */
inline fun Long.timeSpanToMillis(unit: Int): Long = ConvertUtils.timeSpan2Millis(this, unit)

/**
 * Converts milliseconds to the time span in unit. This is equivalent to calling:
 * ```
 * ConvertUtils.millis2TimeSpan(millis, unit)
 * ```
 */
inline fun Long.millisToTimeSpan(unit: Int): Long = ConvertUtils.millis2TimeSpan(this, unit)

/**
 * Converts milliseconds to the fit time span. This is equivalent to calling:
 * ```
 * ConvertUtils.millis2TimeSpan(millis, unit)
 * ```
 */
inline fun Long.millisToFitTimeSpan(precision: Int): String = ConvertUtils.millis2FitTimeSpan(this, precision)

/**
 * Converts the input stream to the output stream. This is equivalent to calling:
 * ```
 * ConvertUtils.input2OutputStream(inputStream)
 * ```
 */
inline fun InputStream.toOutputStream(): OutputStream? = ConvertUtils.input2OutputStream(this)

// 这是非静态方法，没法调用
//inline fun OutputStream.toInputStream(): InputStream = ConvertUtils.output2InputStream(this)

/**
 * Converts the input stream to the bytes. This is equivalent to calling:
 * ```
 * ConvertUtils.inputStream2Bytes(inputStream)
 * ```
 */
inline fun InputStream.toBytes(): ByteArray = ConvertUtils.inputStream2Bytes(this)

/**
 * Converts the bytes to the input steam. This is equivalent to calling:
 * ```
 * ConvertUtils.bytes2InputStream(bytes)
 * ```
 */
inline fun ByteArray.toInputStream(): InputStream = ConvertUtils.bytes2InputStream(this)

/**
 * Converts the output stream to the bytes. This is equivalent to calling:
 * ```
 * ConvertUtils.outputStream2Bytes(outputStream)
 * ```
 */
inline fun OutputStream.toBytes(): ByteArray = ConvertUtils.outputStream2Bytes(this)

/**
 * Converts the bytes to the output steam. This is equivalent to calling:
 * ```
 * ConvertUtils.bytes2OutputStream(bytes)
 * ```
 */
inline fun ByteArray.toOutputStream(): OutputStream = ConvertUtils.bytes2OutputStream(this)

/**
 * Converts the input stream to the string. This is equivalent to calling:
 * ```
 * ConvertUtils.inputStream2String(inputStream, charsetName)
 * ```
 */
inline fun InputStream.toString(charsetName: String): String = ConvertUtils.inputStream2String(this, charsetName)

/**
 * Converts the string to the input steam. This is equivalent to calling:
 * ```
 * ConvertUtils.string2InputStream(bytes, charsetName)
 * ```
 */
inline fun String.toInputStream(charsetName: String): InputStream = ConvertUtils.string2InputStream(this, charsetName)

/**
 * Converts the output stream to the string. This is equivalent to calling:
 * ```
 * ConvertUtils.outputStream2String(outputStream, charsetName)
 * ```
 */
inline fun OutputStream.toString(charsetName: String): String = ConvertUtils.outputStream2String(this, charsetName)

/**
 * Converts the string to the output steam. This is equivalent to calling:
 * ```
 * ConvertUtils.string2OutputStream(bytes, charsetName)
 * ```
 */
inline fun String.toOutputStream(charsetName: String): OutputStream = ConvertUtils.string2OutputStream(this, charsetName)

/**
 * Converts the input stream to the lines of strings. This is equivalent to calling:
 * ```
 * ConvertUtils.inputStream2Lines(inputStream, charsetName)
 * ```
 */
inline fun InputStream.toLines(charsetName: String): List<String> = ConvertUtils.inputStream2Lines(this, charsetName)

/**
 * Converts the drawable to the bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.drawable2Bitmap(drawable)
 * ```
 */
inline fun Drawable.toBitmap(): Bitmap = ImageUtils.drawable2Bitmap(this)

/**
 * Converts the bitmap to the drawable. This is equivalent to calling:
 * ```
 * ImageUtils.bitmap2Drawable(bitmap)
 * ```
 */
inline fun Bitmap.toDrawable(): Drawable = ImageUtils.bitmap2Drawable(this)

/**
 * Converts the drawable to the bytes. This is equivalent to calling:
 * ```
 * ImageUtils.drawable2Bytes(drawable)
 * ```
 */
inline fun Drawable.toBytes(): ByteArray = ImageUtils.drawable2Bytes(this)

/**
 * Converts the bytes to the drawable. This is equivalent to calling:
 * ```
 * ImageUtils.bytes2Drawable(bytes)
 * ```
 */
inline fun ByteArray.toDrawable(): Drawable = ImageUtils.bytes2Drawable(this)

/**
 * Converts the view to the bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.view2Bitmap(view)
 * ```
 */
inline fun View.toBitmap(): Bitmap = ImageUtils.view2Bitmap(this)