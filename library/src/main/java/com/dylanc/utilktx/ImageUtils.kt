@file:Suppress("unused")

package com.dylanc.utilktx

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View
import androidx.annotation.*
import androidx.annotation.IntRange
import com.blankj.utilcode.util.ImageUtils
import java.io.File
import java.io.FileDescriptor
import java.io.InputStream

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */

fun bitmapOf(@DrawableRes resId: Int): Bitmap =
  ImageUtils.getBitmap(resId)

fun bitmapOf(@DrawableRes resId: Int, maxWidth: Int, maxHeight: Int): Bitmap =
  ImageUtils.getBitmap(resId, maxWidth, maxHeight)

fun bitmapOf(file: File): Bitmap =
  ImageUtils.getBitmap(file)

fun bitmapOf(file: File, maxWidth: Int, maxHeight: Int): Bitmap =
  ImageUtils.getBitmap(file, maxWidth, maxHeight)

fun bitmapOf(filePath: String): Bitmap =
  ImageUtils.getBitmap(filePath)

fun bitmapOf(filePath: String, maxWidth: Int, maxHeight: Int): Bitmap =
  ImageUtils.getBitmap(filePath, maxWidth, maxHeight)

fun bitmapOf(inputStream: InputStream): Bitmap =
  ImageUtils.getBitmap(inputStream)

fun bitmapOf(inputStream: InputStream, maxWidth: Int, maxHeight: Int): Bitmap =
  ImageUtils.getBitmap(inputStream, maxWidth, maxHeight)

fun bitmapOf(data: ByteArray, offset: Int): Bitmap =
  ImageUtils.getBitmap(data, offset)

fun bitmapOf(data: ByteArray, offset: Int, maxWidth: Int, maxHeight: Int): Bitmap =
  ImageUtils.getBitmap(data, offset, maxWidth, maxHeight)

fun bitmapOf(fileDescriptor: FileDescriptor): Bitmap =
  ImageUtils.getBitmap(fileDescriptor)

fun bitmapOf(fileDescriptor: FileDescriptor, maxWidth: Int, maxHeight: Int): Bitmap =
  ImageUtils.getBitmap(fileDescriptor, maxWidth, maxHeight)

fun Bitmap.scale(
  newWidth: Int,
  newHeight: Int,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.scale(this, newWidth, newHeight, recycle)

fun Bitmap.scale(
  scaleWidth: Float,
  scaleHeight: Float,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.scale(this, scaleWidth, scaleHeight, recycle)

fun Bitmap.clip(
  x: Int,
  y: Int,
  width: Int,
  height: Int,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.clip(this, x, y, width, height, recycle)

fun Bitmap.skew(
  kx: Float,
  ky: Float,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.skew(this, kx, ky, recycle)

fun Bitmap.skew(
  kx: Float,
  ky: Float,
  px: Float,
  py: Float,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.skew(this, kx, ky, px, py, recycle)

fun Bitmap.rotate(
  degree: Int,
  px: Float,
  py: Float,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.rotate(this, degree, px, py, recycle)

val File.imageRotateDegree: Int
  get() = ImageUtils.getRotateDegree(path)

fun Bitmap.setRound(
  @IntRange(from = 0) borderSize: Int = 0,
  @ColorInt borderColor: Int = 0,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.toRound(this, borderSize, borderColor, recycle)

fun Bitmap.toRoundCorner(
  radius: Float,
  @IntRange(from = 0) borderSize: Int = 0,
  @ColorInt borderColor: Int = 0,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.toRoundCorner(this, radius, borderSize, borderColor, recycle)

fun Bitmap.addCornerBorder(
  @IntRange(from = 1) borderSize: Int,
  @ColorInt borderColor: Int,
  @FloatRange(from = 0.0) cornerRadius: Float,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.addCornerBorder(this, borderSize, borderColor, cornerRadius, recycle)

fun Bitmap.addCircleBorder(
  @IntRange(from = 1) borderSize: Int,
  @ColorInt color: Int,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.addCircleBorder(this, borderSize, color, recycle)

fun Bitmap.addReflection(
  reflectionHeight: Int,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.addReflection(this, reflectionHeight, recycle)

fun Bitmap.addTextWatermark(
  content: String,
  textSize: Int,
  @ColorInt color: Int,
  x: Float,
  y: Float
): Bitmap =
  ImageUtils.addTextWatermark(this, content, textSize, color, x, y)

fun Bitmap.addTextWatermark(
  content: String,
  textSize: Float = 0f,
  @ColorInt color: Int = 0,
  x: Float,
  y: Float,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.addTextWatermark(this, content, textSize, color, x, y, recycle)

fun Bitmap.addReflection(
  watermark: Bitmap,
  x: Int,
  y: Int,
  alpha: Int,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.addImageWatermark(this, watermark, x, y, alpha, recycle)

fun Bitmap.toAlphaBitmap(recycle: Boolean = false): Bitmap =
  ImageUtils.toAlpha(this, recycle)

fun Bitmap.toGrayImage(recycle: Boolean = false): Bitmap =
  ImageUtils.toGray(this, recycle)

fun Bitmap.setFastBlur(
  @FloatRange(from = 0.0, to = 1.0, fromInclusive = false) scale: Float,
  @FloatRange(from = 0.0, to = 25.0, fromInclusive = false) radius: Float,
  recycle: Boolean = false,
  isReturnScale: Boolean = false
): Bitmap =
  ImageUtils.fastBlur(this, scale, radius, recycle, isReturnScale)

@RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
fun Bitmap.setRenderScriptBlur(
  @FloatRange(from = 0.0, to = 25.0, fromInclusive = false) radius: Float,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.renderScriptBlur(this, radius, recycle)

fun Bitmap.setStackBlur(
  radius: Int,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.stackBlur(this, radius, recycle)

fun Bitmap.save(
  filePath: String,
  format: Bitmap.CompressFormat,
  recycle: Boolean = false
): Boolean =
  ImageUtils.save(this, filePath, format, recycle)

fun Bitmap.save(
  file: File,
  format: Bitmap.CompressFormat,
  recycle: Boolean = false
): Boolean =
  ImageUtils.save(this, file, format, recycle)

fun File.isImage(): Boolean =
  ImageUtils.isImage(this)

fun isImage(filePath: String): Boolean =
  ImageUtils.isImage(filePath)

val File.imageType: ImageUtils.ImageType
  get() = ImageUtils.getImageType(this)

fun imageTypeOf(filePath: String): ImageUtils.ImageType =
  ImageUtils.getImageType(filePath)

fun Bitmap.compressByScale(
  scaleWidth: Float,
  scaleHeight: Float,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.compressByScale(this, scaleWidth, scaleHeight, recycle)

fun Bitmap.compressByScale(
  newWidth: Int,
  newHeight: Int,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.compressByScale(this, newWidth, newHeight, recycle)

fun Bitmap.compressByQuality(
  maxByteSize: Long,
  recycle: Boolean = false
): ByteArray =
  ImageUtils.compressByQuality(this, maxByteSize, recycle)

fun Bitmap.compressByQuality(
  @IntRange(from = 0, to = 100) quality: Int,
  recycle: Boolean = false
): ByteArray =
  ImageUtils.compressByQuality(this, quality, recycle)

fun Bitmap.compressByScale(
  simpleSize: Int,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.compressBySampleSize(this, simpleSize, recycle)

fun Bitmap.compressBySampleSize(
  maxWidth: Int,
  maxHeight: Int,
  recycle: Boolean = false
): Bitmap =
  ImageUtils.compressBySampleSize(this, maxWidth, maxHeight, recycle)

val File.imageSize: IntArray
  get() = ImageUtils.getSize(this)

fun imageSizeOf(filePath: String): IntArray =
  ImageUtils.getSize(filePath)