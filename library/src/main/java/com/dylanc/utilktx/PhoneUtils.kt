package com.dylanc.utilktx

import android.Manifest.permission
import android.Manifest.permission.CALL_PHONE
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.PhoneUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
val isPhone
  get() = PhoneUtils.isPhone()

val deviceId:String
  @RequiresPermission(permission.READ_PHONE_STATE)
  get() = PhoneUtils.getDeviceId()

val serialNumber:String
  @RequiresPermission(permission.READ_PHONE_STATE)
  get() = PhoneUtils.getSerial()

val IMEI:String
  @RequiresPermission(permission.READ_PHONE_STATE)
  get() = PhoneUtils.getIMEI()

val MEID:String
  @RequiresPermission(permission.READ_PHONE_STATE)
  get() = PhoneUtils.getMEID()

val phoneType
  get() = PhoneUtils.getPhoneType()

val isSimCardReady
  get() = PhoneUtils.isSimCardReady()

val simOperatorName:String
  get() = PhoneUtils.getSimOperatorName()

val simOperatorByMnc:String
  get() = PhoneUtils.getSimOperatorByMnc()

fun dial(phoneNumber: String) = PhoneUtils.dial(phoneNumber)

@RequiresPermission(CALL_PHONE)
fun call(phoneNumber: String) = PhoneUtils.call(phoneNumber)

fun sendSms(phoneNumber: String, content: String) = PhoneUtils.sendSms(phoneNumber, content)