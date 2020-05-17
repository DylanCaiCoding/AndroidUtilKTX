package com.dylanc.utilktx

import com.blankj.utilcode.util.ZipUtils
import java.io.File

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
fun zipFiles(srcFilesPath: Collection<String>, zipFilePath: String, comment: String? = null) =
  ZipUtils.zipFiles(srcFilesPath, zipFilePath, comment)

fun zipFiles(srcFiles: Collection<File>, zipFile: File, comment: String? = null) =
  ZipUtils.zipFiles(srcFiles, zipFile, comment)

fun unzipFile(srcFilesPath: String, zipFilePath: String, keyword: String? = null): List<File> =
  ZipUtils.unzipFileByKeyword(srcFilesPath, zipFilePath, keyword)

fun unzipFile(srcFiles: File, zipFile: File, keyword: String? = null): List<File> =
  ZipUtils.unzipFileByKeyword(srcFiles, zipFile, keyword)

val File.zipFilesPath: List<String>
  get() = ZipUtils.getFilesPath(this)

fun zipFilesPathOf(zipFile: File): List<String> =
  ZipUtils.getFilesPath(zipFile)

fun zipFilesPathOf(zipFilePath: String): List<String> =
  ZipUtils.getFilesPath(zipFilePath)

val File.zipComments: List<String>
  get() = ZipUtils.getComments(this)

fun zipCommentsOf(zipFile: File): List<String> =
  ZipUtils.getComments(zipFile)

fun zipCommentsOf(zipFilePath: String): List<String> =
  ZipUtils.getComments(zipFilePath)
