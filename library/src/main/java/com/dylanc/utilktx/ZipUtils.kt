@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.ZipUtils
import java.io.File

/**
 * @author Dylan Cai
 */

/**
 * Zips the files. This is equivalent to calling:
 * ```
 * ZipUtils.zipFiles(srcFilesPath, zipFilePath, comment)
 * ```
 */
inline fun zipFiles(srcFilesPath: Collection<String>, zipFilePath: String, comment: String? = null) =
  ZipUtils.zipFiles(srcFilesPath, zipFilePath, comment)

/**
 * Zips the files. This is equivalent to calling:
 * ```
 * ZipUtils.zipFiles(srcFiles, zipFile, comment)
 * ```
 */
inline fun Collection<File>.zip(zipFile: File, comment: String? = null) =
  ZipUtils.zipFiles(this, zipFile, comment)

/**
 * Unzips the file by keyword. This is equivalent to calling:
 * ```
 * ZipUtils.unzipFileByKeyword(srcFilesPath, zipFilePath, keyword)
 * ```
 */
inline fun unzipFile(srcFilesPath: String, zipFilePath: String, keyword: String? = null): List<File> =
  ZipUtils.unzipFileByKeyword(srcFilesPath, zipFilePath, keyword)

/**
 * Unzips the file by keyword. This is equivalent to calling:
 * ```
 * ZipUtils.unzipFileByKeyword(srcFiles, zipFile, keyword)
 * ```
 */
inline fun File.unzip( zipFile: File, keyword: String? = null): List<File> =
  ZipUtils.unzipFileByKeyword(this, zipFile, keyword)

/**
 * Returns the files' path in the ZIP file. This is equivalent to calling:
 * ```
 * ZipUtils.getFilesPath(zipFile)
 * ```
 */
inline val File.zipFilesPath: List<String> get() = ZipUtils.getFilesPath(this)

/**
 * Returns the files' path in the ZIP file. This is equivalent to calling:
 * ```
 * ZipUtils.getFilesPath(zipFilePath)
 * ```
 */
inline fun zipFilesPathOf(zipFilePath: String): List<String> = ZipUtils.getFilesPath(zipFilePath)

/**
 * Returns the files' comment in the ZIP file. This is equivalent to calling:
 * ```
 * ZipUtils.getComments(zipFile)
 * ```
 */
inline val File.zipFileComments: List<String> get() = ZipUtils.getComments(this)

/**
 * Returns the files' comment in the ZIP file. This is equivalent to calling:
 * ```
 * ZipUtils.getComments(zipFilePath)
 * ```
 */
inline fun zipFileCommentsOf(zipFilePath: String): List<String> = ZipUtils.getComments(zipFilePath)
