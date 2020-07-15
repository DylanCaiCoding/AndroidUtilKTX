package com.dylanc.utilktx

import com.blankj.utilcode.util.FileIOUtils
import java.io.File
import java.io.InputStream

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
fun InputStream.writeFile(
  filePath: String,
  append: Boolean = false,
  listener: ((Double) -> Unit)? = null
): Boolean =
  FileIOUtils.writeFileFromIS(filePath, this, append, listener)

fun InputStream.writeFile(
  file: File,
  append: Boolean = false,
  listener: ((Double) -> Unit)? = null
): Boolean =
  FileIOUtils.writeFileFromIS(file, this, append, listener)

fun ByteArray.writeFile(
  filePath: String,
  append: Boolean = false,
  listener: ((Double) -> Unit)? = null
): Boolean =
  FileIOUtils.writeFileFromBytesByStream(filePath, this, append, listener)

fun ByteArray.writeFile(
  file: File,
  append: Boolean = false,
  listener: ((Double) -> Unit)? = null
): Boolean =
  FileIOUtils.writeFileFromBytesByStream(file, this, append, listener)

fun ByteArray.writeFileByChannel(
  filePath: String,
  isForce: Boolean,
  append: Boolean = false
): Boolean =
  FileIOUtils.writeFileFromBytesByChannel(filePath, this, append, isForce)

fun ByteArray.writeFileByChannel(
  file: File,
  isForce: Boolean,
  append: Boolean = false
): Boolean =
  FileIOUtils.writeFileFromBytesByChannel(file, this, append, isForce)

fun ByteArray.writeFileByMap(
  filePath: String,
  isForce: Boolean,
  append: Boolean = false
): Boolean =
  FileIOUtils.writeFileFromBytesByMap(filePath, this, append, isForce)

fun ByteArray.writeFileByMap(
  file: File,
  isForce: Boolean,
  append: Boolean = false
): Boolean =
  FileIOUtils.writeFileFromBytesByMap(file, this, append, isForce)

fun String.writeFile(
  filePath: String,
  append: Boolean = false
): Boolean =
  FileIOUtils.writeFileFromString(filePath, this, append)

fun String.writeFile(
  file: File,
  append: Boolean = false
): Boolean =
  FileIOUtils.writeFileFromString(file, this, append)

fun readFile2List(
  filePath: String,
  st: Int = 0,
  end: Int = 0x7FFFFFFF,
  charsetName: String? = null
): List<String> =
  FileIOUtils.readFile2List(filePath, st, end, charsetName)

fun File.readList(
  st: Int = 0,
  end: Int = 0x7FFFFFFF,
  charsetName: String? = null
): List<String> =
  FileIOUtils.readFile2List(this, st, end, charsetName)

fun readFile2String(
  filePath: String,
  charsetName: String? = null
): String =
  FileIOUtils.readFile2String(filePath, charsetName)

fun File.readString(charsetName: String? = null): String =
  FileIOUtils.readFile2String(this, charsetName)

fun readFile2BytesByStream(
  filePath: String,
  listener: ((Double) -> Unit)? = null
): ByteArray =
  FileIOUtils.readFile2BytesByStream(filePath, listener)

fun File.readBytesByStream(
  listener: ((Double) -> Unit)? = null
): ByteArray =
  FileIOUtils.readFile2BytesByStream(this, listener)

fun readFile2BytesByChannel(filePath: String): ByteArray =
  FileIOUtils.readFile2BytesByChannel(filePath)

fun File.readBytesByChannel(): ByteArray =
  FileIOUtils.readFile2BytesByChannel(this)

fun readFile2BytesByMap(filePath: String): ByteArray =
  FileIOUtils.readFile2BytesByMap(filePath)

fun File.readBytesByMap(): ByteArray =
  FileIOUtils.readFile2BytesByMap(this)

fun setFileIOBufferSize(bufferSize: Int) =
  FileIOUtils.setBufferSize(bufferSize)