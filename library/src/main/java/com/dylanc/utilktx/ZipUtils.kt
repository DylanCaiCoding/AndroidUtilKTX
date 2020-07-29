@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.ZipUtils
import java.io.File

/**
 * @author Dylan Cai
 */

inline fun zipFiles(srcFilesPath: Collection<String>, zipFilePath: String, comment: String? = null) =
  ZipUtils.zipFiles(srcFilesPath, zipFilePath, comment)

inline fun Collection<File>.zip(zipFile: File, comment: String? = null) =
  ZipUtils.zipFiles(this, zipFile, comment)

inline fun unzipFile(srcFilesPath: String, zipFilePath: String, keyword: String? = null): List<File> =
  ZipUtils.unzipFileByKeyword(srcFilesPath, zipFilePath, keyword)

inline fun File.unzip( zipFile: File, keyword: String? = null): List<File> =
  ZipUtils.unzipFileByKeyword(this, zipFile, keyword)

inline val File.zipFilesPath: List<String>
  get() = ZipUtils.getFilesPath(this)

inline fun zipFilesPathOf(zipFilePath: String): List<String> =
  ZipUtils.getFilesPath(zipFilePath)

inline val File.zipFileComments: List<String>
  get() = ZipUtils.getComments(this)

inline fun zipFileCommentsOf(zipFilePath: String): List<String> =
  ZipUtils.getComments(zipFilePath)
