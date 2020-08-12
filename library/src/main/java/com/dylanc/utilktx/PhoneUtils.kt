@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission
import android.Manifest.permission.CALL_PHONE
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.PhoneUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns whether the device is phone. This is equivalent to calling:
 * ```
 * PhoneUtils.isPhone()
 * ```
 */
inline val isPhone get() = PhoneUtils.isPhone()

/**
 * Returns the unique device id. If the version of SDK is greater than 28, it will return an empty string.
 * This is equivalent to calling:
 * ```
 * PhoneUtils.getDeviceId()
 * ```
 */
@get:RequiresPermission(permission.READ_PHONE_STATE)
inline val deviceId: String get() = PhoneUtils.getDeviceId()

/**
 * Returns the serial of device. This is equivalent to calling:
 * ```
 * PhoneUtils.getSerial()
 * ```
 */
@get:RequiresPermission(permission.READ_PHONE_STATE)
inline val serialNumber: String get() = PhoneUtils.getSerial()

/**
 * Returns the IMEI. If the version of SDK is greater than 28, it will return an empty string.
 * This is equivalent to calling:
 * ```
 * PhoneUtils.getIMEI()
 * ```
 */
@get:RequiresPermission(permission.READ_PHONE_STATE)
inline val phoneIMEI: String get() = PhoneUtils.getIMEI()

/**
 * Returns the MEID. If the version of SDK is greater than 28, it will return an empty string.
 * This is equivalent to calling:
 * ```
 * PhoneUtils.getMEID()
 * ```
 */
@get:RequiresPermission(permission.READ_PHONE_STATE)
inline val phoneMEID: String get() = PhoneUtils.getMEID()

/**
 * Returns the current phone type. This is equivalent to calling:
 * ```
 * PhoneUtils.getPhoneType()
 * ```
 */
inline val phoneType get() = PhoneUtils.getPhoneType()

/**
 * Returns whether sim card state is ready. This is equivalent to calling:
 * ```
 * PhoneUtils.isSimCardReady()
 * ```
 */
inline val isSimCardReady get() = PhoneUtils.isSimCardReady()

/**
 * Returns the sim operator name. This is equivalent to calling:
 * ```
 * PhoneUtils.getSimOperatorName()
 * ```
 */
inline val simOperatorName: String get() = PhoneUtils.getSimOperatorName()

/**
 * Returns the sim operator using mnc. This is equivalent to calling:
 * ```
 * PhoneUtils.getSimOperatorByMnc()
 * ```
 */
inline val simOperatorByMnc: String get() = PhoneUtils.getSimOperatorByMnc()

/**
 * Skips to dial. This is equivalent to calling:
 * ```
 * PhoneUtils.dial(phoneNumber)
 * ```
 */
inline fun dial(phoneNumber: String) = PhoneUtils.dial(phoneNumber)

/**
 * Makes a phone call. This is equivalent to calling:
 * ```
 * PhoneUtils.call(phoneNumber)
 * ```
 */
@RequiresPermission(CALL_PHONE)
inline fun call(phoneNumber: String) = PhoneUtils.call(phoneNumber)

/**
 * Sends sms. This is equivalent to calling:
 * ```
 * PhoneUtils.sendSms(phoneNumber, content)
 * ```
 */
inline fun sendSms(phoneNumber: String, content: String) = PhoneUtils.sendSms(phoneNumber, content)