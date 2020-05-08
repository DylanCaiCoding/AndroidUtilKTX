package com.dylanc.utilktx

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
  get() = PhoneUtils.getDeviceId()

val serialNumber:String
  get() = PhoneUtils.getSerial()

val IMEI:String
  get() = PhoneUtils.getIMEI()

val MEID:String
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