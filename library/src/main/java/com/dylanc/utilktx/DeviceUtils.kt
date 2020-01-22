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

val sdkVersionName
  get() = DeviceUtils.getSDKVersionName()

val sdkVersionCode
  get() = DeviceUtils.getSDKVersionCode()

val macAddress
  get() = DeviceUtils.getMacAddress()

val manufacturer
  get() = DeviceUtils.getManufacturer()

val deviceModel
  get() = DeviceUtils.getModel()

val deviceABIs
  get() = DeviceUtils.getABIs()

val isTablet
  get() = DeviceUtils.isTablet()

val isEmulator
  get() = DeviceUtils.isEmulator()

val uniqueDeviceId
  get() = DeviceUtils.getUniqueDeviceId()

fun isSameDevice(uniqueDeviceId: String) = DeviceUtils.isSameDevice(uniqueDeviceId)