@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.FileIOUtils
import java.io.File
import java.io.InputStream

/**
 * @author Dylan Cai
 */

/**
 * Writes to a file from the input stream. This is equivalent to calling:
 * ```
 * FileIOUtils.writeFileFromIS(filePath, inputStream, append, listener)
 * ```
 */
inline fun InputStream.writeFile(filePath: String, append: Boolean = false, noinline listener: ((Double) -> Unit)? = null): Boolean =
  FileIOUtils.writeFileFromIS(filePath, this, append, listener)

/**
 * Writes to a file from the input stream. This is equivalent to calling:
 * ```
 * FileIOUtils.writeFileFromIS(file, inputStream, append, listener)
 * ```
 */
inline fun InputStream.writeFile(file: File, append: Boolean = false, noinline listener: ((Double) -> Unit)? = null): Boolean =
  FileIOUtils.writeFileFromIS(file, this, append, listener)

/**
 * Writes to a file from the bytes by stream. This is equivalent to calling:
 * ```
 * FileIOUtils.writeFileFromIS(filePath, bytes, append, listener)
 * ```
 */
inline fun ByteArray.writeFile(filePath: String, append: Boolean = false, noinline listener: ((Double) -> Unit)? = null): Boolean =
  FileIOUtils.writeFileFromBytesByStream(filePath, this, append, listener)

/**
 * Writes to a file from the bytes by stream. This is equivalent to calling:
 * ```
 * FileIOUtils.writeFileFromIS(file, bytes, append, listener)
 * ```
 */
inline fun ByteArray.writeFile(file: File, append: Boolean = false, noinline listener: ((Double) -> Unit)? = null): Boolean =
  FileIOUtils.writeFileFromBytesByStream(file, this, append, listener)

/**
 * Writes to a file from the bytes by channel. This is equivalent to calling:
 * ```
 * FileIOUtils.writeFileFromBytesByChannel(filePath, bytes, append, isForce)
 * ```
 */
inline fun ByteArray.writeFileByChannel(filePath: String, isForce: Boolean, append: Boolean = false): Boolean =
  FileIOUtils.writeFileFromBytesByChannel(filePath, this, append, isForce)

/**
 * Writes to a file from the bytes by channel. This is equivalent to calling:
 * ```
 * FileIOUtils.writeFileFromBytesByChannel(file, bytes, append, isForce)
 * ```
 */
inline fun ByteArray.writeFileByChannel(file: File, isForce: Boolean, append: Boolean = false): Boolean =
  FileIOUtils.writeFileFromBytesByChannel(file, this, append, isForce)

/**
 * Writes to a file from the bytes by map. This is equivalent to calling:
 * ```
 * FileIOUtils.writeFileFromBytesByMap(filePath, bytes, append, isForce)
 * ```
 */
inline fun ByteArray.writeFileByMap(filePath: String, isForce: Boolean, append: Boolean = false): Boolean =
  FileIOUtils.writeFileFromBytesByMap(filePath, this, append, isForce)

/**
 * Writes to a file from the bytes by map. This is equivalent to calling:
 * ```
 * FileIOUtils.writeFileFromBytesByMap(file, bytes, append, isForce)
 * ```
 */
inline fun ByteArray.writeFileByMap(file: File, isForce: Boolean, append: Boolean = false): Boolean =
  FileIOUtils.writeFileFromBytesByMap(file, this, append, isForce)

/**
 * Writes to a file from the string. This is equivalent to calling:
 * ```
 * FileIOUtils.writeFileFromString(filePath, content, append)
 * ```
 */
inline fun String.writeFile(filePath: String, append: Boolean = false): Boolean =
  FileIOUtils.writeFileFromString(filePath, this, append)

/**
 * Writes to a file from the string. This is equivalent to calling:
 * ```
 * FileIOUtils.writeFileFromString(file, content, append)
 * ```
 */
inline fun String.writeFile(file: File, append: Boolean = false): Boolean =
  FileIOUtils.writeFileFromString(file, this, append)

/**
 * Reads the file into the lines of strings. This is equivalent to calling:
 * ```
 * FileIOUtils.readFile2List(filePath, startIndex, endIndex, charsetName)
 * ```
 */
inline fun readFile2Lines(filePath: String, startIndex: Int = 0, endIndex: Int = 0x7FFFFFFF, charsetName: String? = null): List<String> =
  FileIOUtils.readFile2List(filePath, startIndex, endIndex, charsetName)

/**
 * Reads the file into the lines of strings. This is equivalent to calling:
 * ```
 * FileIOUtils.readFile2List(file, startIndex, endIndex, charsetName)
 * ```
 */
inline fun File.readLines(startIndex: Int = 0, endIndex: Int = 0x7FFFFFFF, charsetName: String? = null): List<String> =
  FileIOUtils.readFile2List(this, startIndex, endIndex, charsetName)

/**
 * Reads the file into a string. This is equivalent to calling:
 * ```
 * FileIOUtils.readFile2String(filePath, charsetName)
 * ```
 */
inline fun readFile2String(filePath: String, charsetName: String? = null): String = FileIOUtils.readFile2String(filePath, charsetName)

/**
 * Reads the file into a string. This is equivalent to calling:
 * ```
 * FileIOUtils.readFile2String(file, charsetName)
 * ```
 */
inline fun File.readString(charsetName: String? = null): String = FileIOUtils.readFile2String(this, charsetName)

/**
 * Reads the file into the bytes by stream. This is equivalent to calling:
 * ```
 * FileIOUtils.readFile2BytesByStream(filePath, listener)
 * ```
 */
inline fun readFile2BytesByStream(filePath: String, noinline listener: ((Double) -> Unit)? = null): ByteArray =
  FileIOUtils.readFile2BytesByStream(filePath, listener)

/**
 * Reads the file into the bytes by stream. This is equivalent to calling:
 * ```
 * FileIOUtils.readFile2BytesByStream(file, listener)
 * ```
 */
inline fun File.readBytesByStream(noinline listener: ((Double) -> Unit)? = null): ByteArray =
  FileIOUtils.readFile2BytesByStream(this, listener)

/**
 * Reads the file into the bytes by channel. This is equivalent to calling:
 * ```
 * FileIOUtils.readFile2BytesByChannel(filePath)
 * ```
 */
inline fun readFile2BytesByChannel(filePath: String): ByteArray = FileIOUtils.readFile2BytesByChannel(filePath)

/**
 * Reads the file into the bytes by channel. This is equivalent to calling:
 * ```
 * FileIOUtils.readFile2BytesByChannel(file)
 * ```
 */
inline fun File.readBytesByChannel(): ByteArray = FileIOUtils.readFile2BytesByChannel(this)

/**
 * Reads the file into the bytes by map. This is equivalent to calling:
 * ```
 * FileIOUtils.readFile2BytesByMap(filePath)
 * ```
 */
inline fun readFile2BytesByMap(filePath: String): ByteArray = FileIOUtils.readFile2BytesByMap(filePath)

/**
 * Reads the file into the bytes by map. This is equivalent to calling:
 * ```
 * FileIOUtils.readFile2BytesByMap(file)
 * ```
 */
inline fun File.readBytesByMap(): ByteArray = FileIOUtils.readFile2BytesByMap(this)

/**
 * Sets the size of buffer in [FileIOUtils]. This is equivalent to calling:
 * ```
 * FileIOUtils.setBufferSize(bufferSize)
 * ```
 */
inline var fileIOBufferSize: Int
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = FileIOUtils.setBufferSize(value)