@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.CleanUtils

/**
 * @author Dylan Cai
 */

inline fun cleanInternalCache(): Boolean =
  CleanUtils.cleanInternalCache()

inline fun cleanInternalFiles(): Boolean =
  CleanUtils.cleanInternalFiles()

inline fun cleanInternalDbs(): Boolean =
  CleanUtils.cleanInternalDbs()

inline fun cleanInternalDb(dbName: String): Boolean =
  CleanUtils.cleanInternalDbByName(dbName)

inline fun cleanInternalSp(): Boolean =
  CleanUtils.cleanInternalSp()

inline fun cleanExternalCache(): Boolean =
  CleanUtils.cleanExternalCache()

inline fun cleanCustomDir(dirPath: String): Boolean =
  CleanUtils.cleanCustomDir(dirPath)