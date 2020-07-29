@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission
import android.Manifest.permission.CALL_PHONE
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.PhoneUtils

/**
 * @author Dylan Cai
 */

inline val isPhone
  get() = PhoneUtils.isPhone()

inline val deviceId: String
  @RequiresPermission(permission.READ_PHONE_STATE)
  get() = PhoneUtils.getDeviceId()

inline val serialNumber: String
  @RequiresPermission(permission.READ_PHONE_STATE)
  get() = PhoneUtils.getSerial()

inline val phoneIMEI: String
  @RequiresPermission(permission.READ_PHONE_STATE)
  get() = PhoneUtils.getIMEI()

inline val phoneMEID: String
  @RequiresPermission(permission.READ_PHONE_STATE)
  get() = PhoneUtils.getMEID()

inline val phoneType
  get() = PhoneUtils.getPhoneType()

inline val isSimCardReady
  get() = PhoneUtils.isSimCardReady()

inline val simOperatorName: String
  get() = PhoneUtils.getSimOperatorName()

inline val simOperatorByMnc: String
  get() = PhoneUtils.getSimOperatorByMnc()

inline fun dial(phoneNumber: String) = PhoneUtils.dial(phoneNumber)

@RequiresPermission(CALL_PHONE)
inline fun call(phoneNumber: String) = PhoneUtils.call(phoneNumber)

inline fun sendSms(phoneNumber: String, content: String) = PhoneUtils.sendSms(phoneNumber, content)