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

/**
 * Returns whether the device is rooted. This is equivalent to calling:
 * ```
 * DeviceUtils.isDeviceRooted()
 * ```
 */
inline val isDeviceRooted: Boolean get() = DeviceUtils.isDeviceRooted()

/**
 * Returns whether the ADB is enabled. This is equivalent to calling:
 * ```
 * DeviceUtils.isAdbEnabled()
 * ```
 */
@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
inline fun isAdbEnabled(): Boolean = DeviceUtils.isAdbEnabled()

/**
 * Returns the version name of device's system. This is equivalent to calling:
 * ```
 * DeviceUtils.getSDKVersionName()
 * ```
 */
inline val sdkVersionName: String get() = DeviceUtils.getSDKVersionName()

/**
 * Returns the version code of device's system. This is equivalent to calling:
 * ```
 * DeviceUtils.getSDKVersionCode()
 * ```
 */
inline val sdkVersionCode get() = DeviceUtils.getSDKVersionCode()

/**
 * Returns the MAC address. This is equivalent to calling:
 * ```
 * DeviceUtils.getMacAddress()
 * ```
 */
@get:RequiresPermission(allOf = [permission.ACCESS_WIFI_STATE, permission.INTERNET, permission.CHANGE_WIFI_STATE])
inline val macAddress: String get() = DeviceUtils.getMacAddress()

/**
 * Returns the manufacturer of the product/hardware. This is equivalent to calling:
 * ```
 * DeviceUtils.getManufacturer()
 * ```
 */
inline val manufacturer: String get() = DeviceUtils.getManufacturer()

/**
 * Returns the model of device. This is equivalent to calling:
 * ```
 * DeviceUtils.getModel()
 * ```
 */
inline val deviceModel: String get() = DeviceUtils.getModel()

/**
 * Returns an ordered list of ABIs supported by this device. The most preferred ABI is the first
 * element in the list. This is equivalent to calling:
 * ```
 * DeviceUtils.getABIs()
 * ```
 */
inline val deviceABIs: Array<String> get() = DeviceUtils.getABIs()

/**
 * Returns whether the device is tablet. This is equivalent to calling:
 * ```
 * DeviceUtils.isTablet()
 * ```
 */
inline val isTablet: Boolean get() = DeviceUtils.isTablet()

/**
 * Returns whether the device is emulator. This is equivalent to calling:
 * ```
 * DeviceUtils.isEmulator()
 * ```
 */
inline val isEmulator: Boolean get() = DeviceUtils.isEmulator()

/**
 * Returns the unique device id.
 *
 * {1}{UUID(macAddress)}
 *
 * {2}{UUID(androidId )}
 *
 * {9}{UUID(random    )}.
 *
 * This is equivalent to calling:
 * ```
 * DeviceUtils.getUniqueDeviceId()
 * ```
 */
inline val uniqueDeviceId: String get() = DeviceUtils.getUniqueDeviceId()

/**
 * Returns whether the device is the same. This is equivalent to calling:
 * ```
 * DeviceUtils.isSameDevice(uniqueDeviceId)
 * ```
 */
inline fun isSameDevice(uniqueDeviceId: String): Boolean = DeviceUtils.isSameDevice(uniqueDeviceId)