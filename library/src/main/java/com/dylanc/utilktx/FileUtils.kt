@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.FileUtils
import java.io.File

/**
 * @author Dylan Cai
 */

/**
 * Returns the file by path. This is equivalent to calling:
 * ```
 * FileUtils.getFileByPath(filePath)
 * ```
 */
inline fun fileOf(filePath: String): File = FileUtils.getFileByPath(filePath)

/**
 * Returns whether the file exists. This is equivalent to calling:
 * ```
 * FileUtils.isFileExists(file)
 * ```
 */
inline val File.isExists: Boolean get() = FileUtils.isFileExists(this)

/**
 * Returns whether the file exists. This is equivalent to calling:
 * ```
 * FileUtils.isFileExists(filePath)
 * ```
 */
inline fun isFileExists(filePath: String): Boolean = FileUtils.isFileExists(filePath)

/**
 * Rename the file. This is equivalent to calling:
 * ```
 * FileUtils.rename(file, newName)
 * ```
 */
inline fun File.rename(newName: String): Boolean = FileUtils.rename(this, newName)

/**
 * Rename the file. This is equivalent to calling:
 * ```
 * FileUtils.rename(filePath, newName)
 * ```
 */
inline fun renameFile(filePath: String, newName: String): Boolean = FileUtils.rename(filePath, newName)

/**
 * Returns whether it is a directory. This is equivalent to calling:
 * ```
 * FileUtils.isDir(file)
 * ```
 */
inline val File.isDir: Boolean get() = FileUtils.isDir(this)

/**
 * Returns whether it is a directory. This is equivalent to calling:
 * ```
 * FileUtils.isDir(filePath)
 * ```
 */
inline fun isDir(filePath: String): Boolean = FileUtils.isDir(filePath)

/**
 * Returns whether it is a file. This is equivalent to calling:
 * ```
 * FileUtils.isFile(file)
 * ```
 */
inline fun File.isFile(requireExists: Boolean): Boolean =
  if (requireExists) FileUtils.isFile(this) else isFile

/**
 * Returns whether it is a file. This is equivalent to calling:
 * ```
 * FileUtils.isFile(filePath)
 * ```
 */
inline fun isFile(filePath: String): Boolean = FileUtils.isFile(filePath)

/**
 * Creates a directory if it doesn't exist, otherwise do nothing. This is equivalent to calling:
 * ```
 * FileUtils.createOrExistsDir(filePath)
 * ```
 */
inline fun File.createOrExistsDir(): Boolean = FileUtils.createOrExistsDir(this)

/**
 * Creates a directory if it doesn't exist, otherwise do nothing. This is equivalent to calling:
 * ```
 * FileUtils.createOrExistsDir(filePath)
 * ```
 */
inline fun createOrExistsDir(filePath: String): Boolean = FileUtils.createOrExistsDir(filePath)

/**
 * Creates a file if it doesn't exist, otherwise do nothing. This is equivalent to calling:
 * ```
 * FileUtils.createOrExistsFile(file)
 * ```
 */
inline fun File.createOrExistsFile(): Boolean = FileUtils.createOrExistsFile(this)

/**
 * Creates a file if it doesn't exist, otherwise do nothing. This is equivalent to calling:
 * ```
 * FileUtils.createOrExistsFile(filePath)
 * ```
 */
inline fun createOrExistsFile(filePath: String): Boolean = FileUtils.createOrExistsFile(filePath)

/**
 * Creates a file if it doesn't exist, otherwise delete old file before creating. This is equivalent to calling:
 * ```
 * FileUtils.createFileByDeleteOldFile(file)
 * ```
 */
inline fun File.createFileByDeleteOldFile(): Boolean = FileUtils.createFileByDeleteOldFile(this)

/**
 * Creates a file if it doesn't exist, otherwise delete old file before creating. This is equivalent to calling:
 * ```
 * FileUtils.createFileByDeleteOldFile(filePath)
 * ```
 */
inline fun createFileByDeleteOldFile(filePath: String): Boolean = FileUtils.createFileByDeleteOldFile(filePath)

/**
 * Copies the directory or file. This is equivalent to calling:
 * ```
 * FileUtils.copy(src, destPath, listener)
 * ```
 */
inline fun File.copy(dest: File, noinline listener: ((File, File) -> Boolean)? = null): Boolean =
  FileUtils.copy(this, dest, listener)

/**
 * Copies the directory or file. This is equivalent to calling:
 * ```
 * FileUtils.copy(srcPath, destPath, listener)
 * ```
 */
inline fun copyFile(srcPath: String, destPath: String, noinline listener: ((File, File) -> Boolean)? = null): Boolean =
  FileUtils.copy(srcPath, destPath, listener)

/**
 * Moves the directory or file. This is equivalent to calling:
 * ```
 * FileUtils.move(src, destPath, listener)
 * ```
 */
inline fun File.move(dest: File, noinline listener: ((File, File) -> Boolean)? = null): Boolean =
  FileUtils.move(this, dest, listener)

/**
 * Moves the directory or file. This is equivalent to calling:
 * ```
 * FileUtils.move(srcPath, destPath, listener)
 * ```
 */
inline fun moveFile(srcPath: String, destPath: String, noinline listener: ((File, File) -> Boolean)? = null): Boolean =
  FileUtils.move(srcPath, destPath, listener)

/**
 * Deletes the directory or file. This is equivalent to calling:
 * ```
 * FileUtils.delete(file)
 * ```
 */
inline fun File.delete(deleteDir: Boolean = true): Boolean = if (deleteDir) FileUtils.delete(this) else delete()

/**
 * Deletes the directory or file. This is equivalent to calling:
 * ```
 * FileUtils.delete(srcPath)
 * ```
 */
inline fun deleteFile(filePath: String): Boolean = FileUtils.delete(filePath)

/**
 * Deletes the all in directory. This is equivalent to calling:
 * ```
 * FileUtils.deleteAllInDir(dir)
 * ```
 */
inline fun File.deleteAllInDir(): Boolean = FileUtils.deleteAllInDir(this)

/**
 * Deletes the all in directory. This is equivalent to calling:
 * ```
 * FileUtils.deleteAllInDir(dirPath)
 * ```
 */
inline fun deleteAllInDir(dirPath: String): Boolean = FileUtils.deleteAllInDir(dirPath)

/**
 * Deletes all files in directory. This is equivalent to calling:
 * ```
 * FileUtils.deleteFilesInDir(dir)
 * ```
 */
inline fun File.deleteFilesInDir(): Boolean = FileUtils.deleteFilesInDir(this)

/**
 * Deletes all files in directory. This is equivalent to calling:
 * ```
 * FileUtils.deleteFilesInDir(dirPath)
 * ```
 */
inline fun deleteFilesInDir(dirPath: String): Boolean = FileUtils.deleteFilesInDir(dirPath)

/**
 * Deletes all files that satisfy the filter in directory. This is equivalent to calling:
 * ```
 * FileUtils.deleteFilesInDirWithFilter(dir, filter)
 * ```
 */
inline fun File.deleteFilesInDirWithFilter(noinline filter: (File) -> Boolean): Boolean =
  FileUtils.deleteFilesInDirWithFilter(this, filter)

/**
 * Deletes all files that satisfy the filter in directory. This is equivalent to calling:
 * ```
 * FileUtils.deleteFilesInDirWithFilter(dirPath, filter)
 * ```
 */
inline fun deleteFilesInDirWithFilter(dirPath: String, noinline filter: (File) -> Boolean): Boolean =
  FileUtils.deleteFilesInDirWithFilter(dirPath, filter)

/**
 * Returns the files in directory. This is equivalent to calling:
 * ```
 * FileUtils.listFilesInDir(dir, filter, isRecursive, comparator)
 * ```
 */
inline fun File.filesOf(
  isRecursive: Boolean, noinline filter: (File) -> Boolean = { true }, noinline comparator: (File, File) -> Int
): List<File> =
  FileUtils.listFilesInDirWithFilter(this, filter, isRecursive, comparator)

/**
 * Returns the files in directory. This is equivalent to calling:
 * ```
 * FileUtils.listFilesInDir(dirPath, filter, isRecursive, comparator)
 * ```
 */
inline fun filesInDirOf(
  dirPath: String, isRecursive: Boolean, noinline filter: (File) -> Boolean = { true }, noinline comparator: (File, File) -> Int
): List<File> =
  FileUtils.listFilesInDirWithFilter(dirPath, filter, isRecursive, comparator)

/**
 * Returns the time that the file was last modified. This is equivalent to calling:
 * ```
 * FileUtils.getFileLastModified(file)
 * ```
 */
inline val File.lastModifiedTimestamp: Long get() = FileUtils.getFileLastModified(this)

/**
 * Returns the time that the file was last modified. This is equivalent to calling:
 * ```
 * FileUtils.getFileLastModified(filePath)
 * ```
 */
inline fun fileLastModifiedTimestampOf(filePath: String): Long = FileUtils.getFileLastModified(filePath)

/**
 * Returns the charset of file simply. This is equivalent to calling:
 * ```
 * FileUtils.getFileCharsetSimple(file)
 * ```
 */
inline val File.charsetSimple: String get() = FileUtils.getFileCharsetSimple(this)

/**
 * Returns the charset of file simply. This is equivalent to calling:
 * ```
 * FileUtils.getFileCharsetSimple(filePath)
 * ```
 */
inline fun fileCharsetSimpleOf(filePath: String): String = FileUtils.getFileCharsetSimple(filePath)

/**
 * Returns the size of file. This is equivalent to calling:
 * ```
 * FileUtils.getSize(file)
 * ```
 */
inline val File.size: String get() = FileUtils.getSize(this)

/**
 * Returns the size of file. This is equivalent to calling:
 * ```
 * FileUtils.getSize(filePath)
 * ```
 */
inline fun fileSizeOf(filePath: String): String = FileUtils.getSize(filePath)

/**
 * Returns the length of file. This is equivalent to calling:
 * ```
 * FileUtils.getLength(file)
 * ```
 */
inline val File.length: Long get() = FileUtils.getLength(this)

/**
 * Returns the length of file. This is equivalent to calling:
 * ```
 * FileUtils.getLength(filePath)
 * ```
 */
inline fun fileLengthOf(filePath: String): Long = FileUtils.getLength(filePath)

/**
 * Returns the MD5 of file. This is equivalent to calling:
 * ```
 * FileUtils.getFileMD5(file)
 * ```
 */
inline val File.MD5: ByteArray get() = FileUtils.getFileMD5(this)

/**
 * Returns the MD5 of file. This is equivalent to calling:
 * ```
 * FileUtils.getFileMD5(filePath)
 * ```
 */
inline fun fileMD5Of(filePath: String): ByteArray = FileUtils.getFileMD5(filePath)

/**
 * Returns the file's path of directory. This is equivalent to calling:
 * ```
 * FileUtils.getDirName(file)
 * ```
 */
inline val File.dirName: String get() = FileUtils.getDirName(this)

/**
 * Returns the file's path of directory. This is equivalent to calling:
 * ```
 * FileUtils.getDirName(filePath)
 * ```
 */
inline fun dirNameOf(filePath: String): String = FileUtils.getDirName(filePath)

/**
 * Returns the name of file. This is equivalent to calling:
 * ```
 * FileUtils.getFileName(file)
 * ```
 */
inline val File.fileName: String get() = FileUtils.getFileName(this)

/**
 * Returns the name of file. This is equivalent to calling:
 * ```
 * FileUtils.getFileName(filePath)
 * ```
 */
inline fun fileNameOf(filePath: String): String = FileUtils.getFileName(filePath)

/**
 * Returns the name of file without extension. This is equivalent to calling:
 * ```
 * FileUtils.getFileNameNoExtension(file)
 * ```
 */
inline val File.fileNameNoExtension: String get() = FileUtils.getFileNameNoExtension(this)

/**
 * Returns the name of file without extension. This is equivalent to calling:
 * ```
 * FileUtils.getFileNameNoExtension(filePath)
 * ```
 */
inline fun fileNameNoExtensionOf(filePath: String): String = FileUtils.getFileNameNoExtension(filePath)

/**
 * Returns the extension of file. This is equivalent to calling:
 * ```
 * FileUtils.getFileExtension(file)
 * ```
 */
inline val File.fileExtension: String get() = FileUtils.getFileExtension(this)

/**
 * Returns the extension of file. This is equivalent to calling:
 * ```
 * FileUtils.getFileExtension(filePath)
 * ```
 */
inline fun fileExtensionOf(filePath: String): String = FileUtils.getFileExtension(filePath)

/**
 * Notifies system to scan the file. This is equivalent to calling:
 * ```
 * FileUtils.notifySystemToScan(file)
 * ```
 */
inline fun File.notifySystemToScan() = FileUtils.notifySystemToScan(this)

/**
 * Notifies system to scan the file. This is equivalent to calling:
 * ```
 * FileUtils.notifySystemToScan(filePath)
 * ```
 */
inline fun notifySystemToScanFile(filePath: String) = FileUtils.notifySystemToScan(filePath)

/**
 * Returns the total size of file system. This is equivalent to calling:
 * ```
 * FileUtils.getFsTotalSize(anyPathInFs)
 * ```
 *
 * @param anyPathInFs Any path in file system
 */
inline fun fileSystemTotalSizeOf(anyPathInFs: String): Long = FileUtils.getFsTotalSize(anyPathInFs)

/**
 * Returns the available size of file system. This is equivalent to calling:
 * ```
 * FileUtils.fileSystemAvailableSizeOf(anyPathInFs)
 * ```
 *
 * @param anyPathInFs Any path in file system
 */
inline fun fileSystemAvailableSizeOf(anyPathInFs: String): Long = FileUtils.getFsAvailableSize(anyPathInFs)
