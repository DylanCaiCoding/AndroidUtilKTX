@file:Suppress("unused")

package com.dylanc.utilktx

import com.blankj.utilcode.util.SDCardUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
fun isSDCardEnable(): Boolean =
  SDCardUtils.isSDCardEnableByEnvironment()

val sdCardPath: String
  get() = SDCardUtils.getSDCardPathByEnvironment()

val sdCardInfo: List<SDCardUtils.SDCardInfo>
  get() = SDCardUtils.getSDCardInfo()

val mountedSDCardPath: List<String>
  get() = SDCardUtils.getMountedSDCardPath()

val externalTotalSize: Long
  get() = SDCardUtils.getExternalTotalSize()

val externalAvailableSize: Long
  get() = SDCardUtils.getExternalAvailableSize()

val internalTotalSize: Long
  get() = SDCardUtils.getInternalTotalSize()

val internalAvailableSize: Long
  get() = SDCardUtils.getInternalAvailableSize()