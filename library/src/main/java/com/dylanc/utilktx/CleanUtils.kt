package com.dylanc.utilktx

import com.blankj.utilcode.util.CleanUtils

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */
fun cleanInternalCache() =
  CleanUtils.cleanInternalCache()

fun cleanInternalFiles() =
  CleanUtils.cleanInternalFiles()

fun cleanInternalDbs() =
  CleanUtils.cleanInternalDbs()

fun cleanInternalDbByName(dbName: String) =
  CleanUtils.cleanInternalDbByName(dbName)

fun cleanInternalSp() =
  CleanUtils.cleanInternalSp()

fun cleanExternalCache() =
  CleanUtils.cleanExternalCache()

fun cleanCustomDir(dirPath: String) =
  CleanUtils.cleanCustomDir(dirPath)