@file:Suppress("unused")

package com.dylanc.utilktx

import com.blankj.utilcode.util.SDCardUtils

/**
 * @author Dylan Cai
 */

inline val isSDCardEnable: Boolean
  get() = SDCardUtils.isSDCardEnableByEnvironment()

inline val sdCardPath: String
  get() = SDCardUtils.getSDCardPathByEnvironment()

inline val sdCardInfo: List<SDCardUtils.SDCardInfo>
  get() = SDCardUtils.getSDCardInfo()

inline val mountedSDCardPath: List<String>
  get() = SDCardUtils.getMountedSDCardPath()

inline val externalTotalSize: Long
  get() = SDCardUtils.getExternalTotalSize()

inline val externalAvailableSize: Long
  get() = SDCardUtils.getExternalAvailableSize()

inline val internalTotalSize: Long
  get() = SDCardUtils.getInternalTotalSize()

inline val internalAvailableSize: Long
  get() = SDCardUtils.getInternalAvailableSize()