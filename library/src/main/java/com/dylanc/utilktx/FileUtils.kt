package com.dylanc.utilktx

import com.blankj.utilcode.util.FileUtils
import java.io.File

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
fun fileOf(filePath: String): File? =
  FileUtils.getFileByPath(filePath)

fun isFileExists(filePath: String): Boolean =
  FileUtils.isFileExists(filePath)

fun File?.isExists(): Boolean =
  FileUtils.isFileExists(this)

fun renameFile(filePath: String, newName: String): Boolean =
  FileUtils.rename(filePath, newName)

fun File?.rename(newName: String): Boolean =
  FileUtils.rename(this, newName)

fun isFileDir(filePath: String): Boolean =
  FileUtils.isDir(filePath)

fun File?.isDir(): Boolean =
  FileUtils.isDir(this)

fun isFile(filePath: String): Boolean =
  FileUtils.isFile(filePath)

fun File?.isFile(): Boolean =
  FileUtils.isFile(this)

fun createFileOrExistsDir(filePath: String): Boolean =
  FileUtils.createOrExistsDir(filePath)

fun File?.createOrExistsDir(): Boolean =
  FileUtils.createOrExistsDir(this)

fun createFileOrExistsFile(filePath: String): Boolean =
  FileUtils.createOrExistsFile(filePath)

fun File?.createOrExistsFile(): Boolean =
  FileUtils.createOrExistsFile(this)

fun createFileByDeleteOldFile(filePath: String): Boolean =
  FileUtils.createFileByDeleteOldFile(filePath)

fun File?.createFileByDeleteOldFile(): Boolean =
  FileUtils.createFileByDeleteOldFile(this)

fun copyFile(
  srcPath: String,
  destPath: String,
  listener: ((File, File) -> Boolean)? = null
): Boolean =
  FileUtils.copy(srcPath, destPath, listener)

fun File?.copy(
  dest: File,
  listener: ((File, File) -> Boolean)? = null
): Boolean =
  FileUtils.copy(this, dest, listener)

fun moveFile(
  srcPath: String,
  destPath: String,
  listener: ((File, File) -> Boolean)? = null
): Boolean =
  FileUtils.move(srcPath, destPath, listener)

fun File?.move(
  dest: File,
  listener: ((File, File) -> Boolean)? = null
): Boolean =
  FileUtils.move(this, dest, listener)

fun deleteFile(srcPath: String): Boolean =
  FileUtils.delete(srcPath)

fun File?.delete(): Boolean =
  FileUtils.delete(this)

fun deleteAllFileInDir(srcPath: String): Boolean =
  FileUtils.deleteAllInDir(srcPath)

fun File?.deleteAllInDir(): Boolean =
  FileUtils.deleteAllInDir(this)