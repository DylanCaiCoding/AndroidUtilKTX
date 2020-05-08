@file:Suppress("unused")

package com.dylanc.utilktx

import com.blankj.utilcode.util.DeviceUtils

/**
 * @author Dylan Cai
 * @since 2019/12/12
 */
val isDeviceRooted
  get() = DeviceUtils.isDeviceRooted()

val isAdbEnabled
  get() = DeviceUtils.isAdbEnabled()

val sdkVersionName: String
  get() = DeviceUtils.getSDKVersionName()

val sdkVersionCode
  get() = DeviceUtils.getSDKVersionCode()

val macAddress: String
  get() = DeviceUtils.getMacAddress()

val manufacturer: String
  get() = DeviceUtils.getManufacturer()

val deviceModel: String
  get() = DeviceUtils.getModel()

val deviceABIs: Array<String>
  get() = DeviceUtils.getABIs()

val isTablet
  get() = DeviceUtils.isTablet()

val isEmulator
  get() = DeviceUtils.isEmulator()

val uniqueDeviceId: String
  get() = DeviceUtils.getUniqueDeviceId()

fun isSameDevice(uniqueDeviceId: String) = DeviceUtils.isSameDevice(uniqueDeviceId)