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

fun deleteFilesInDir(srcPath: String): Boolean =
  FileUtils.deleteFilesInDir(srcPath)

fun File?.deleteFilesInDir(): Boolean =
  FileUtils.deleteFilesInDir(this)

fun deleteFilesInDirWithFilter(srcPath: String, filter: (File) -> Boolean): Boolean =
  FileUtils.deleteFilesInDirWithFilter(srcPath, filter)

fun File?.deleteFilesInDirWithFilter(filter: (File) -> Boolean): Boolean =
  FileUtils.deleteFilesInDirWithFilter(this, filter)

fun filesOf(
  dirPath: String,
  isRecursive: Boolean,
  comparator: (File, File) -> Int
): List<File> =
  FileUtils.listFilesInDir(dirPath, isRecursive, comparator)

fun File.filesOf(
  isRecursive: Boolean,
  comparator: (File, File) -> Int
): List<File> =
  FileUtils.listFilesInDir(this, isRecursive, comparator)

fun filesOf(
  dirPath: String,
  filter: (File) -> Boolean,
  isRecursive: Boolean,
  comparator: (File, File) -> Int
): List<File> =
  FileUtils.listFilesInDirWithFilter(dirPath, filter, isRecursive, comparator)

fun File.filesOf(
  isRecursive: Boolean,
  filter: (File) -> Boolean,
  comparator: (File, File) -> Int
): List<File> =
  FileUtils.listFilesInDirWithFilter(this, filter, isRecursive, comparator)

fun fileLastModifiedTimestampOf(filePath: String): Long =
  FileUtils.getFileLastModified(filePath)

val File?.lastModifiedTimestamp: Long
  get() = FileUtils.getFileLastModified(this)

fun fileCharsetSimpleOf(filePath: String): String =
  FileUtils.getFileCharsetSimple(filePath)

val File?.charsetSimple: String
  get() = FileUtils.getFileCharsetSimple(this)

fun fileSizeOf(filePath: String): String =
  FileUtils.getSize(filePath)

val File?.size: String
  get() = FileUtils.getSize(this)

fun fileLengthOf(filePath: String): Long =
  FileUtils.getLength(filePath)

val File?.length: Long
  get() = FileUtils.getLength(this)

fun fileMD5Of(filePath: String): ByteArray =
  FileUtils.getFileMD5(filePath)

val File?.MD5: ByteArray
  get() = FileUtils.getFileMD5(this)

fun fileMD5StringOf(filePath: String): String =
  FileUtils.getFileMD5ToString(filePath)

val File?.MD5String: String
  get() = FileUtils.getFileMD5ToString(this)

fun dirNameOf(filePath: String): String =
  FileUtils.getDirName(filePath)

val File?.dirName: String
  get() = FileUtils.getDirName(this)

fun fileNameOf(filePath: String): String =
  FileUtils.getFileName(filePath)

val File?.fileName: String
  get() = FileUtils.getFileName(this)

fun fileNameNoExtensionOf(filePath: String): String =
  FileUtils.getFileNameNoExtension(filePath)

val File?.fileNameNoExtension: String
  get() = FileUtils.getFileNameNoExtension(this)

fun fileExtensionOf(filePath: String): String =
  FileUtils.getFileExtension(filePath)

val File?.fileExtension: String
  get() = FileUtils.getFileExtension(this)

fun notifySystemToScanFile(filePath: String) =
  FileUtils.notifySystemToScan(filePath)

fun File?.notifySystemToScan() =
  FileUtils.notifySystemToScan(this)

fun fileSystemTotalSizeOf(anyPathInFs: String): Long =
  FileUtils.getFsTotalSize(anyPathInFs)

fun fileSystemAvailableSizeOf(anyPathInFs: String): Long =
  FileUtils.getFsAvailableSize(anyPathInFs)
