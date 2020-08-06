@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.CleanUtils

/**
 * @author Dylan Cai
 */

/**
 * Clean the internal cache.
 *
 * directory: /data/data/package/cache
 *
 * This is equivalent to calling:
 * ```
 * CleanUtils.cleanInternalCache()
 * ```
 */
inline fun cleanInternalCache(): Boolean = CleanUtils.cleanInternalCache()

/**
 * Clean the internal files.
 *
 * directory: /data/data/package/files
 *
 * This is equivalent to calling:
 * ```
 * CleanUtils.cleanInternalFiles()
 * ```
 */
inline fun cleanInternalFiles(): Boolean = CleanUtils.cleanInternalFiles()

/**
 * Clean the internal databases.
 *
 * directory: /data/data/package/databases
 *
 * This is equivalent to calling:
 * ```
 * CleanUtils.cleanInternalDbs()
 * ```
 */
inline fun cleanInternalDbs(): Boolean = CleanUtils.cleanInternalDbs()

/**
 * Clean the internal database by name.
 *
 * directory: /data/data/package/databases/dbName
 *
 * This is equivalent to calling:
 * ```
 * CleanUtils.cleanInternalDb(dbName)
 * ```
 */
inline fun cleanInternalDb(dbName: String): Boolean = CleanUtils.cleanInternalDbByName(dbName)

/**
 * Clean the internal shared preferences.
 *
 * directory: /data/data/package/shared_prefs
 *
 * This is equivalent to calling:
 * ```
 * CleanUtils.cleanInternalSp()
 * ```
 */
inline fun cleanInternalSp(): Boolean = CleanUtils.cleanInternalSp()

/**
 * Clean the external cache.
 *
 * directory: /storage/emulated/0/android/data/package/cache
 *
 * This is equivalent to calling:
 * ```
 * CleanUtils.cleanExternalCache()
 * ```
 */
inline fun cleanExternalCache(): Boolean = CleanUtils.cleanExternalCache()


/**
 * Clean the directory. This is equivalent to calling:
 * ```
 * CleanUtils.cleanCustomDir(dirPath)
 * ```
 */
inline fun cleanDir(dirPath: String): Boolean = CleanUtils.cleanCustomDir(dirPath)