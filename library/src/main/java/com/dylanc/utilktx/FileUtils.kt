@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.FileUtils
import java.io.File

/**
 * @author Dylan Cai
 */

inline fun fileOf(filePath: String): File? =
  FileUtils.getFileByPath(filePath)

inline fun isFileExists(filePath: String): Boolean =
  FileUtils.isFileExists(filePath)

inline val File.isExists: Boolean
  get() = FileUtils.isFileExists(this)

inline fun renameFile(filePath: String, newName: String): Boolean =
  FileUtils.rename(filePath, newName)

inline fun File.rename(newName: String): Boolean =
  FileUtils.rename(this, newName)

inline fun isFileDir(filePath: String): Boolean =
  FileUtils.isDir(filePath)

inline val File.isDir: Boolean
  get() = FileUtils.isDir(this)

inline fun isFile(filePath: String): Boolean =
  FileUtils.isFile(filePath)

inline fun File.isFile(requireExists: Boolean): Boolean =
  if (requireExists) FileUtils.isFile(this) else isFile

inline fun createFileOrExistsDir(filePath: String): Boolean =
  FileUtils.createOrExistsDir(filePath)

inline fun File.createOrExistsDir(): Boolean =
  FileUtils.createOrExistsDir(this)

inline fun createFileOrExistsFile(filePath: String): Boolean =
  FileUtils.createOrExistsFile(filePath)

inline fun File.createOrExistsFile(): Boolean =
  FileUtils.createOrExistsFile(this)

inline fun createFileByDeleteOldFile(filePath: String): Boolean =
  FileUtils.createFileByDeleteOldFile(filePath)

inline fun File.createFileByDeleteOldFile(): Boolean =
  FileUtils.createFileByDeleteOldFile(this)

inline fun copyFile(
  srcPath: String,
  destPath: String,
  noinline listener: ((File, File) -> Boolean)? = null
): Boolean =
  FileUtils.copy(srcPath, destPath, listener)

inline fun File.copy(
  dest: File,
  noinline listener: ((File, File) -> Boolean)? = null
): Boolean =
  FileUtils.copy(this, dest, listener)

inline fun moveFile(
  srcPath: String,
  destPath: String,
  noinline listener: ((File, File) -> Boolean)? = null
): Boolean =
  FileUtils.move(srcPath, destPath, listener)

inline fun File.move(
  dest: File,
  noinline listener: ((File, File) -> Boolean)? = null
): Boolean =
  FileUtils.move(this, dest, listener)

inline fun deleteFile(srcPath: String): Boolean =
  FileUtils.delete(srcPath)

inline fun File.delete(deleteDir: Boolean = true): Boolean =
  if (deleteDir) FileUtils.delete(this) else delete()

inline fun deleteAllFileInDir(srcPath: String): Boolean =
  FileUtils.deleteAllInDir(srcPath)

inline fun File.deleteAllInDir(): Boolean =
  FileUtils.deleteAllInDir(this)

inline fun deleteFilesInDir(srcPath: String): Boolean =
  FileUtils.deleteFilesInDir(srcPath)

inline fun File.deleteFilesInDir(): Boolean =
  FileUtils.deleteFilesInDir(this)

inline fun deleteFilesInDirWithFilter(
  srcPath: String,
  noinline filter: (File) -> Boolean
): Boolean =
  FileUtils.deleteFilesInDirWithFilter(srcPath, filter)

inline fun File.deleteFilesInDirWithFilter(noinline filter: (File) -> Boolean): Boolean =
  FileUtils.deleteFilesInDirWithFilter(this, filter)

inline fun filesOf(
  dirPath: String,
  isRecursive: Boolean,
  noinline comparator: (File, File) -> Int
): List<File> =
  FileUtils.listFilesInDir(dirPath, isRecursive, comparator)

inline fun File.filesOf(
  isRecursive: Boolean,
  noinline comparator: (File, File) -> Int
): List<File> =
  FileUtils.listFilesInDir(this, isRecursive, comparator)

inline fun filesOf(
  dirPath: String,
  noinline filter: (File) -> Boolean,
  isRecursive: Boolean,
  noinline comparator: (File, File) -> Int
): List<File> =
  FileUtils.listFilesInDirWithFilter(dirPath, filter, isRecursive, comparator)

inline fun File.filesOf(
  isRecursive: Boolean,
  noinline filter: (File) -> Boolean,
  noinline comparator: (File, File) -> Int
): List<File> =
  FileUtils.listFilesInDirWithFilter(this, filter, isRecursive, comparator)

inline fun fileLastModifiedTimestampOf(filePath: String): Long =
  FileUtils.getFileLastModified(filePath)

inline val File.lastModifiedTimestamp: Long
  get() = FileUtils.getFileLastModified(this)

inline fun fileCharsetSimpleOf(filePath: String): String =
  FileUtils.getFileCharsetSimple(filePath)

inline val File.charsetSimple: String
  get() = FileUtils.getFileCharsetSimple(this)

inline fun fileSizeOf(filePath: String): String =
  FileUtils.getSize(filePath)

inline val File.size: String
  get() = FileUtils.getSize(this)

inline fun fileLengthOf(filePath: String): Long =
  FileUtils.getLength(filePath)

inline val File.length: Long
  get() = FileUtils.getLength(this)

inline fun fileMD5Of(filePath: String): ByteArray =
  FileUtils.getFileMD5(filePath)

inline val File.MD5: ByteArray
  get() = FileUtils.getFileMD5(this)

inline fun fileMD5StringOf(filePath: String): String =
  FileUtils.getFileMD5ToString(filePath)

inline val File.MD5String: String
  get() = FileUtils.getFileMD5ToString(this)

inline fun dirNameOf(filePath: String): String =
  FileUtils.getDirName(filePath)

inline val File.dirName: String
  get() = FileUtils.getDirName(this)

inline fun fileNameOf(filePath: String): String =
  FileUtils.getFileName(filePath)

inline val File.fileName: String
  get() = FileUtils.getFileName(this)

inline fun fileNameNoExtensionOf(filePath: String): String =
  FileUtils.getFileNameNoExtension(filePath)

inline val File.fileNameNoExtension: String
  get() = FileUtils.getFileNameNoExtension(this)

inline fun fileExtensionOf(filePath: String): String =
  FileUtils.getFileExtension(filePath)

inline val File.fileExtension: String
  get() = FileUtils.getFileExtension(this)

inline fun notifySystemToScanFile(filePath: String) =
  FileUtils.notifySystemToScan(filePath)

inline fun File.notifySystemToScan() =
  FileUtils.notifySystemToScan(this)

inline fun fileSystemTotalSizeOf(anyPathInFs: String): Long =
  FileUtils.getFsTotalSize(anyPathInFs)

inline fun fileSystemAvailableSizeOf(anyPathInFs: String): Long =
  FileUtils.getFsAvailableSize(anyPathInFs)
