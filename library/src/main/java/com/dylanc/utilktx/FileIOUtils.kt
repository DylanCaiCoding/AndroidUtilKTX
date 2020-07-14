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

//fun readFile() =
//  FileIOUtils.readFile2List()