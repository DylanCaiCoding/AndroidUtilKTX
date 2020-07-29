@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.FileIOUtils
import java.io.File
import java.io.InputStream

/**
 * @author Dylan Cai
 */

inline fun InputStream.writeFile(
  filePath: String,
  append: Boolean = false,
  noinline listener: ((Double) -> Unit)? = null
): Boolean =
  FileIOUtils.writeFileFromIS(filePath, this, append, listener)

inline fun InputStream.writeFile(
  file: File,
  append: Boolean = false,
  noinline listener: ((Double) -> Unit)? = null
): Boolean =
  FileIOUtils.writeFileFromIS(file, this, append, listener)

inline fun ByteArray.writeFile(
  filePath: String,
  append: Boolean = false,
  noinline listener: ((Double) -> Unit)? = null
): Boolean =
  FileIOUtils.writeFileFromBytesByStream(filePath, this, append, listener)

inline fun ByteArray.writeFile(
  file: File,
  append: Boolean = false,
  noinline listener: ((Double) -> Unit)? = null
): Boolean =
  FileIOUtils.writeFileFromBytesByStream(file, this, append, listener)

inline fun ByteArray.writeFileByChannel(
  filePath: String,
  isForce: Boolean,
  append: Boolean = false
): Boolean =
  FileIOUtils.writeFileFromBytesByChannel(filePath, this, append, isForce)

inline fun ByteArray.writeFileByChannel(
  file: File,
  isForce: Boolean,
  append: Boolean = false
): Boolean =
  FileIOUtils.writeFileFromBytesByChannel(file, this, append, isForce)

inline fun ByteArray.writeFileByMap(
  filePath: String,
  isForce: Boolean,
  append: Boolean = false
): Boolean =
  FileIOUtils.writeFileFromBytesByMap(filePath, this, append, isForce)

inline fun ByteArray.writeFileByMap(
  file: File,
  isForce: Boolean,
  append: Boolean = false
): Boolean =
  FileIOUtils.writeFileFromBytesByMap(file, this, append, isForce)

inline fun String.writeFile(
  filePath: String,
  append: Boolean = false
): Boolean =
  FileIOUtils.writeFileFromString(filePath, this, append)

inline fun String.writeFile(
  file: File,
  append: Boolean = false
): Boolean =
  FileIOUtils.writeFileFromString(file, this, append)

inline fun readFile2List(
  filePath: String,
  st: Int = 0,
  end: Int = 0x7FFFFFFF,
  charsetName: String? = null
): List<String> =
  FileIOUtils.readFile2List(filePath, st, end, charsetName)

inline fun File.readList(
  st: Int = 0,
  end: Int = 0x7FFFFFFF,
  charsetName: String? = null
): List<String> =
  FileIOUtils.readFile2List(this, st, end, charsetName)

inline fun readFile2String(
  filePath: String,
  charsetName: String? = null
): String =
  FileIOUtils.readFile2String(filePath, charsetName)

inline fun File.readString(charsetName: String? = null): String =
  FileIOUtils.readFile2String(this, charsetName)

inline fun readFile2BytesByStream(
  filePath: String,
  noinline listener: ((Double) -> Unit)? = null
): ByteArray =
  FileIOUtils.readFile2BytesByStream(filePath, listener)

inline fun File.readBytesByStream(
  noinline listener: ((Double) -> Unit)? = null
): ByteArray =
  FileIOUtils.readFile2BytesByStream(this, listener)

inline fun readFile2BytesByChannel(filePath: String): ByteArray =
  FileIOUtils.readFile2BytesByChannel(filePath)

inline fun File.readBytesByChannel(): ByteArray =
  FileIOUtils.readFile2BytesByChannel(this)

inline fun readFile2BytesByMap(filePath: String): ByteArray =
  FileIOUtils.readFile2BytesByMap(filePath)

inline fun File.readBytesByMap(): ByteArray =
  FileIOUtils.readFile2BytesByMap(this)

inline var fileIOBufferSize: Int
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = FileIOUtils.setBufferSize(value)