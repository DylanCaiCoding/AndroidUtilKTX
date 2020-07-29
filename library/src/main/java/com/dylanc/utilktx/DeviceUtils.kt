@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.DeviceUtils

/**
 * @author Dylan Cai
 */

inline fun isDeviceRooted(): Boolean =
  DeviceUtils.isDeviceRooted()

@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
inline fun isAdbEnabled(): Boolean = DeviceUtils.isAdbEnabled()

inline val sdkVersionName: String
  get() = DeviceUtils.getSDKVersionName()

inline val sdkVersionCode
  get() = DeviceUtils.getSDKVersionCode()

@get:RequiresPermission(allOf = [permission.ACCESS_WIFI_STATE, permission.INTERNET, permission.CHANGE_WIFI_STATE])
inline val macAddress: String
  get() = DeviceUtils.getMacAddress()

inline val manufacturer: String
  get() = DeviceUtils.getManufacturer()

inline val deviceModel: String
  get() = DeviceUtils.getModel()

inline val deviceABIs: Array<String>
  get() = DeviceUtils.getABIs()

inline fun isTablet(): Boolean =
  DeviceUtils.isTablet()

inline fun isEmulator(): Boolean =
  DeviceUtils.isEmulator()

inline val uniqueDeviceId: String
  get() = DeviceUtils.getUniqueDeviceId()

inline fun isSameDevice(uniqueDeviceId: String): Boolean =
  DeviceUtils.isSameDevice(uniqueDeviceId)