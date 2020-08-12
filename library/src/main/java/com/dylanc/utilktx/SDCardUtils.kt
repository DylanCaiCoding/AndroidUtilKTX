@file:Suppress("unused")

package com.dylanc.utilktx

import com.blankj.utilcode.util.SDCardUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns whether sdcard is enabled by environment. This is equivalent to calling:
 * ```
 * SDCardUtils.isSDCardEnableByEnvironment()
 * ```
 */
inline val isSDCardEnable: Boolean get() = SDCardUtils.isSDCardEnableByEnvironment()

/**
 * Returns the path of sdcard by environment. This is equivalent to calling:
 * ```
 * SDCardUtils.getSDCardPathByEnvironment()
 * ```
 */
inline val sdCardPath: String get() = SDCardUtils.getSDCardPathByEnvironment()

/**
 * Returns the information of sdcard. This is equivalent to calling:
 * ```
 * SDCardUtils.getSDCardInfo()
 * ```
 */
inline val sdCardInfo: List<SDCardUtils.SDCardInfo> get() = SDCardUtils.getSDCardInfo()

/**
 * Returns the ptah of mounted sdcard. This is equivalent to calling:
 * ```
 * SDCardUtils.getMountedSDCardPath()
 * ```
 */
inline val mountedSDCardPath: List<String> get() = SDCardUtils.getMountedSDCardPath()

/**
 * Returns the total size of external storage. This is equivalent to calling:
 * ```
 * SDCardUtils.getExternalTotalSize()
 * ```
 */
inline val externalTotalSize: Long get() = SDCardUtils.getExternalTotalSize()

/**
 * Returns the available size of external storage. This is equivalent to calling:
 * ```
 * SDCardUtils.getExternalAvailableSize()
 * ```
 */
inline val externalAvailableSize: Long get() = SDCardUtils.getExternalAvailableSize()

/**
 * Returns the total size of internal storage. This is equivalent to calling:
 * ```
 * SDCardUtils.getInternalTotalSize()
 * ```
 */
inline val internalTotalSize: Long get() = SDCardUtils.getInternalTotalSize()

/**
 * Returns the available size of internal storage. This is equivalent to calling:
 * ```
 * DCardUtils.getInternalAvailableSize()
 * ```
 */
inline val internalAvailableSize: Long get() = SDCardUtils.getInternalAvailableSize()