@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.graphics.Bitmap
import android.os.Build
import androidx.annotation.*
import androidx.annotation.IntRange
import com.blankj.utilcode.util.ImageUtils
import java.io.File
import java.io.FileDescriptor
import java.io.InputStream

/**
 * @author Dylan Cai
 */

/**
 * Returns a [Bitmap] with the drawable id. This is equivalent to calling:
 * ```
 * ImageUtils.getBitmap(resId)
 * ```
 */
inline fun bitmapOf(@DrawableRes resId: Int): Bitmap = ImageUtils.getBitmap(resId)

/**
 * Returns a [Bitmap] with the drawable id and the specified width and height. This is equivalent to calling:
 * ```
 * ImageUtils.getBitmap(resId, maxWidth, maxHeight)
 * ```
 */
inline fun bitmapOf(@DrawableRes resId: Int, maxWidth: Int, maxHeight: Int): Bitmap =
  ImageUtils.getBitmap(resId, maxWidth, maxHeight)

/**
 * Returns a [Bitmap] with the file. This is equivalent to calling:
 * ```
 * ImageUtils.getBitmap(file)
 * ```
 */
inline fun bitmapOf(file: File): Bitmap = ImageUtils.getBitmap(file)

/**
 * Returns a [Bitmap] with the file and the specified width and height. This is equivalent to calling:
 * ```
 * ImageUtils.getBitmap(file, maxWidth, maxHeight)
 * ```
 */
inline fun bitmapOf(file: File, maxWidth: Int, maxHeight: Int): Bitmap =
  ImageUtils.getBitmap(file, maxWidth, maxHeight)

/**
 * Returns a [Bitmap] with the file. This is equivalent to calling:
 * ```
 * ImageUtils.getBitmap(filePath)
 * ```
 */
inline fun bitmapOf(filePath: String): Bitmap = ImageUtils.getBitmap(filePath)

/**
 * Returns a [Bitmap] with the file and the specified width and height. This is equivalent to calling:
 * ```
 * ImageUtils.getBitmap(filePath, maxWidth, maxHeight)
 * ```
 */
inline fun bitmapOf(filePath: String, maxWidth: Int, maxHeight: Int): Bitmap =
  ImageUtils.getBitmap(filePath, maxWidth, maxHeight)

/**
 * Returns a [Bitmap] with the inputStream. This is equivalent to calling:
 * ```
 * ImageUtils.getBitmap(inputStream)
 * ```
 */
inline fun bitmapOf(inputStream: InputStream): Bitmap = ImageUtils.getBitmap(inputStream)

/**
 * Returns a [Bitmap] with the inputStream and the specified width and height. This is equivalent to calling:
 * ```
 * ImageUtils.getBitmap(inputStream, maxWidth, maxHeight)
 * ```
 */
inline fun bitmapOf(inputStream: InputStream, maxWidth: Int, maxHeight: Int): Bitmap =
  ImageUtils.getBitmap(inputStream, maxWidth, maxHeight)

/**
 * Returns a [Bitmap] with the bytes. This is equivalent to calling:
 * ```
 * ImageUtils.getBitmap(data, offset)
 * ```
 */
inline fun bitmapOf(data: ByteArray, offset: Int): Bitmap = ImageUtils.getBitmap(data, offset)

/**
 * Returns a [Bitmap] with the bytes and the specified width and height. This is equivalent to calling:
 * ```
 * ImageUtils.getBitmap(data, offset, maxWidth, maxHeight)
 * ```
 */
inline fun bitmapOf(data: ByteArray, offset: Int, maxWidth: Int, maxHeight: Int): Bitmap =
  ImageUtils.getBitmap(data, offset, maxWidth, maxHeight)

/**
 * Returns a [Bitmap] with the file descriptor. This is equivalent to calling:
 * ```
 * ImageUtils.getBitmap(fileDescriptor)
 * ```
 */
inline fun bitmapOf(fileDescriptor: FileDescriptor): Bitmap = ImageUtils.getBitmap(fileDescriptor)

/**
 * Returns a [Bitmap] with the file descriptor and the specified width and height. This is equivalent to calling:
 * ```
 * ImageUtils.getBitmap(fileDescriptor, maxWidth, maxHeight)
 * ```
 */
inline fun bitmapOf(fileDescriptor: FileDescriptor, maxWidth: Int, maxHeight: Int): Bitmap =
  ImageUtils.getBitmap(fileDescriptor, maxWidth, maxHeight)

/**
 * Returns the scaled bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.scale(src, newWidth, newHeight, recycle)
 * ```
 */
inline fun Bitmap.createScaledBitmap(newWidth: Int, newHeight: Int, recycle: Boolean = false): Bitmap =
  ImageUtils.scale(this, newWidth, newHeight, recycle)

/**
 * Returns the scaled bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.scale(src, scaleWidth, scaleHeight, recycle)
 * ```
 */
inline fun Bitmap.createScaledBitmap(scaleWidth: Float, scaleHeight: Float, recycle: Boolean = false): Bitmap =
  ImageUtils.scale(this, scaleWidth, scaleHeight, recycle)

/**
 * Returns the clipped bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.clip(src, x, y, width, height, recycle)
 * ```
 */
inline fun Bitmap.createClippedBitmap(x: Int, y: Int, width: Int, height: Int, recycle: Boolean = false): Bitmap =
  ImageUtils.clip(this, x, y, width, height, recycle)

/**
 * Returns the skewed bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.skew(src, kx, ky, recycle)
 * ```
 */
inline fun Bitmap.createSkewedBitmap(kx: Float, ky: Float, recycle: Boolean = false): Bitmap =
  ImageUtils.skew(this, kx, ky, recycle)

/**
 * Returns the skewed bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.skew(src, kx, ky, px, py, recycle)
 * ```
 */
inline fun Bitmap.createSkewedBitmap(kx: Float, ky: Float, px: Float, py: Float, recycle: Boolean = false): Bitmap =
  ImageUtils.skew(this, kx, ky, px, py, recycle)

/**
 * Returns the rotated bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.rotate(src, degree, px, py, recycle)
 * ```
 */
inline fun Bitmap.createRotatedBitmap(degree: Int, px: Float, py: Float, recycle: Boolean = false): Bitmap =
  ImageUtils.rotate(this, degree, px, py, recycle)

/**
 * Returns the rotated degree. This is equivalent to calling:
 * ```
 * ImageUtils.getRotateDegree(path)
 * ```
 */
inline val File.imageRotateDegree: Int get() = ImageUtils.getRotateDegree(path)

/**
 * Returns the round bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.toRound(src, borderSize, borderColor, recycle)
 * ```
 */
inline fun Bitmap.createRoundBitmap(@IntRange(from = 0) borderSize: Int = 0, @ColorInt borderColor: Int = 0, recycle: Boolean = false): Bitmap =
  ImageUtils.toRound(this, borderSize, borderColor, recycle)

/**
 * Returns the round corner bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.toRoundCorner(src, radius, borderSize, borderColor, recycle)
 * ```
 */
inline fun Bitmap.createRoundCornerBitmap(
  radius: Float, @IntRange(from = 0) borderSize: Int = 0, @ColorInt borderColor: Int = 0, recycle: Boolean = false
): Bitmap =
  ImageUtils.toRoundCorner(this, radius, borderSize, borderColor, recycle)

/**
 * Returns the round corner bitmap with border. This is equivalent to calling:
 * ```
 * ImageUtils.addCornerBorder(src, borderSize, borderColor, cornerRadius, recycle)
 * ```
 */
inline fun Bitmap.createCornerBorderBitmap(
  @IntRange(from = 1) borderSize: Int, @ColorInt borderColor: Int, @FloatRange(from = 0.0) cornerRadius: Float, recycle: Boolean = false
): Bitmap =
  ImageUtils.addCornerBorder(this, borderSize, borderColor, cornerRadius, recycle)

/**
 * Returns the round bitmap with border. This is equivalent to calling:
 * ```
 * ImageUtils.addCircleBorder(src, borderSize, color, recycle)
 * ```
 */
inline fun Bitmap.createCircleBorderBitmap(@IntRange(from = 1) borderSize: Int, @ColorInt color: Int, recycle: Boolean = false): Bitmap =
  ImageUtils.addCircleBorder(this, borderSize, color, recycle)

/**
 * Returns the bitmap with reflection. This is equivalent to calling:
 * ```
 * ImageUtils.addReflection(src, reflectionHeight, recycle)
 * ```
 */
inline fun Bitmap.createReflectionBitmap(reflectionHeight: Int, recycle: Boolean = false): Bitmap =
  ImageUtils.addReflection(this, reflectionHeight, recycle)

/**
 * Returns the bitmap with text watermarking. This is equivalent to calling:
 * ```
 * ImageUtils.addTextWatermark(src, content, textSize, color, x, y)
 * ```
 */
inline fun Bitmap.createTextWatermarkBitmap(content: String, textSize: Int, @ColorInt color: Int, x: Float, y: Float): Bitmap =
  ImageUtils.addTextWatermark(this, content, textSize, color, x, y)

/**
 * Returns the bitmap with text watermarking. This is equivalent to calling:
 * ```
 * ImageUtils.addTextWatermark(src, content, textSize, color, x, y, recycle)
 * ```
 */
inline fun Bitmap.createTextWatermarkBitmap(
  content: String, textSize: Float = 0f, @ColorInt color: Int = 0, x: Float, y: Float, recycle: Boolean = false
): Bitmap =
  ImageUtils.addTextWatermark(this, content, textSize, color, x, y, recycle)

/**
 * Returns the bitmap with image watermarking. This is equivalent to calling:
 * ```
 * ImageUtils.addImageWatermark(src, watermark, x, y, alpha, recycle)
 * ```
 */
inline fun Bitmap.createImageWatermarkBitmap(watermark: Bitmap, x: Int, y: Int, alpha: Int, recycle: Boolean = false): Bitmap =
  ImageUtils.addImageWatermark(this, watermark, x, y, alpha, recycle)

/**
 * Returns the alpha bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.toAlpha(src, recycle)
 * ```
 */
inline fun Bitmap.createAlphaBitmap(recycle: Boolean = false): Bitmap = ImageUtils.toAlpha(this, recycle)

/**
 * Returns the gray bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.toGray(src, recycle)
 * ```
 */
inline fun Bitmap.createGrayBitmap(recycle: Boolean = false): Bitmap = ImageUtils.toGray(this, recycle)

/**
 * Returns the blur bitmap fast.
 *
 * zoom out, blur, zoom in.
 *
 * This is equivalent to calling:
 * ```
 * ImageUtils.fastBlur(src, scale, radius, recycle, isReturnScale)
 * ```
 */
inline fun Bitmap.createFastBlurBitmap(
  @FloatRange(from = 0.0, to = 1.0, fromInclusive = false) scale: Float,
  @FloatRange(from = 0.0, to = 25.0, fromInclusive = false) radius: Float,
  recycle: Boolean = false,
  isReturnScale: Boolean = false
): Bitmap =
  ImageUtils.fastBlur(this, scale, radius, recycle, isReturnScale)

/**
 * Returns the blur bitmap using render script. This is equivalent to calling:
 * ```
 * ImageUtils.renderScriptBlur(src, radius, recycle)
 * ```
 */
@RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
inline fun Bitmap.createRenderScriptBlurBitmap(
  @FloatRange(from = 0.0, to = 25.0, fromInclusive = false) radius: Float, recycle: Boolean = false
): Bitmap =
  ImageUtils.renderScriptBlur(this, radius, recycle)

/**
 * Returns the blur bitmap using stack. This is equivalent to calling:
 * ```
 * ImageUtils.stackBlur(src, radius, recycle)
 * ```
 */
inline fun Bitmap.createStackBlurBitmap(radius: Int, recycle: Boolean = false): Bitmap =
  ImageUtils.stackBlur(this, radius, recycle)

/**
 * Save the bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.save(src, filePath, format, recycle)
 * ```
 */
inline fun Bitmap.save(filePath: String, format: Bitmap.CompressFormat, recycle: Boolean = false): Boolean =
  ImageUtils.save(this, filePath, format, recycle)

/**
 * Save the bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.save(src, file, format, recycle)
 * ```
 */
inline fun Bitmap.save(file: File, format: Bitmap.CompressFormat, recycle: Boolean = false): Boolean =
  ImageUtils.save(this, file, format, recycle)

/**
 * Returns whether it is a image according to the file name. This is equivalent to calling:
 * ```
 * ImageUtils.isImage(file)
 * ```
 */
inline val File.isImage: Boolean get() = ImageUtils.isImage(this)

/**
 * Returns whether it is a image according to the file name. This is equivalent to calling:
 * ```
 * ImageUtils.isImage(filePath)
 * ```
 */
inline fun isImage(filePath: String): Boolean = ImageUtils.isImage(filePath)

/**
 * Returns the type of image. This is equivalent to calling:
 * ```
 * ImageUtils.getImageType(file)
 * ```
 */
inline val File.imageType: ImageUtils.ImageType get() = ImageUtils.getImageType(this)

/**
 * Returns the type of image. This is equivalent to calling:
 * ```
 * ImageUtils.getImageType(filePath)
 * ```
 */
inline fun imageTypeOf(filePath: String): ImageUtils.ImageType = ImageUtils.getImageType(filePath)

/**
 * Returns the compressed bitmap using scale. This is equivalent to calling:
 * ```
 * ImageUtils.compressByScale(src, scaleWidth, scaleHeight, recycle)
 * ```
 */
inline fun Bitmap.createCompressBitmapByScale(scaleWidth: Float, scaleHeight: Float, recycle: Boolean = false): Bitmap =
  ImageUtils.compressByScale(this, scaleWidth, scaleHeight, recycle)

/**
 * Returns the compressed bitmap using scale. This is equivalent to calling:
 * ```
 * ImageUtils.compressByScale(src, newWidth, newHeight, recycle)
 * ```
 */
inline fun Bitmap.createCompressBitmapByScale(newWidth: Int, newHeight: Int, recycle: Boolean = false): Bitmap =
  ImageUtils.compressByScale(this, newWidth, newHeight, recycle)

/**
 * Returns the compressed data using quality. This is equivalent to calling:
 * ```
 * ImageUtils.compressByQuality(src, maxByteSize, recycle)
 * ```
 */
inline fun Bitmap.createCompressBitmapByQuality(maxByteSize: Long, recycle: Boolean = false): ByteArray =
  ImageUtils.compressByQuality(this, maxByteSize, recycle)

/**
 * Returns the compressed data using quality. This is equivalent to calling:
 * ```
 * ImageUtils.compressByQuality(src, quality, recycle)
 * ```
 */
inline fun Bitmap.createCompressBitmapByQuality(@IntRange(from = 0, to = 100) quality: Int, recycle: Boolean = false): ByteArray =
  ImageUtils.compressByQuality(this, quality, recycle)

/**
 * Returns the compressed bitmap using sample size. This is equivalent to calling:
 * ```
 * ImageUtils.compressBySampleSize(src, simpleSize, recycle)
 * ```
 */
inline fun Bitmap.createCompressBitmapBySampleSize(simpleSize: Int, recycle: Boolean = false): Bitmap =
  ImageUtils.compressBySampleSize(this, simpleSize, recycle)

/**
 * Returns the compressed bitmap using sample size. This is equivalent to calling:
 * ```
 * ImageUtils.compressBySampleSize(src, maxWidth, maxHeight, recycle)
 * ```
 */
inline fun Bitmap.createCompressBitmapBySampleSize(maxWidth: Int, maxHeight: Int, recycle: Boolean = false): Bitmap =
  ImageUtils.compressBySampleSize(this, maxWidth, maxHeight, recycle)

/**
 * Returns the size of bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.getSize(file)
 * ```
 */
inline val File.imageSize: IntArray get() = ImageUtils.getSize(this)

/**
 * Returns the size of bitmap. This is equivalent to calling:
 * ```
 * ImageUtils.getSize(filePath)
 * ```
 */
inline fun imageSizeOf(filePath: String): IntArray = ImageUtils.getSize(filePath)