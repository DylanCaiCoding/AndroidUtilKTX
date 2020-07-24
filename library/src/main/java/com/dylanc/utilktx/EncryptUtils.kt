package com.dylanc.utilktx

import com.blankj.utilcode.util.EncryptUtils
import java.io.File

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */

fun ByteArray.encryptMD2(): ByteArray =
  EncryptUtils.encryptMD2(this)

fun ByteArray.encryptMD2ToString(): String =
  EncryptUtils.encryptMD2ToString(this)

fun String.encryptMD2(): String =
  EncryptUtils.encryptMD2ToString(this)

fun ByteArray.encryptMD5(): ByteArray =
  EncryptUtils.encryptMD5(this)

fun ByteArray.encryptMD5ToString(): String =
  EncryptUtils.encryptMD5ToString(this)

fun ByteArray.encryptMD5ToString(salt: ByteArray): String =
  EncryptUtils.encryptMD5ToString(this, salt)

fun String.encryptMD5(): String =
  EncryptUtils.encryptMD5ToString(this)

fun String.encryptMD5(salt: String): String =
  EncryptUtils.encryptMD5ToString(this, salt)

fun File.encryptMD5(): ByteArray =
  EncryptUtils.encryptMD5File(this)

fun encryptMD5File(filePath: String): ByteArray =
  EncryptUtils.encryptMD5File(filePath)

fun File.encryptMD5ToString(): String =
  EncryptUtils.encryptMD5File2String(this)

fun encryptMD5File2String(filePath: String): String =
  EncryptUtils.encryptMD5File2String(filePath)

fun ByteArray.encryptSHA1(): ByteArray =
  EncryptUtils.encryptSHA1(this)

fun ByteArray.encryptSHA1ToString(): String =
  EncryptUtils.encryptSHA1ToString(this)

fun String.encryptSHA1(): String =
  EncryptUtils.encryptSHA1ToString(this)

fun ByteArray.encryptSHA224(): ByteArray =
  EncryptUtils.encryptSHA224(this)

fun ByteArray.encryptSHA224ToString(): String =
  EncryptUtils.encryptSHA224ToString(this)

fun String.encryptSHA224(): String =
  EncryptUtils.encryptSHA224ToString(this)

fun ByteArray.encryptSHA256(): ByteArray =
  EncryptUtils.encryptSHA256(this)

fun ByteArray.encryptSHA256ToString(): String =
  EncryptUtils.encryptSHA256ToString(this)

fun String.encryptSHA256(): String =
  EncryptUtils.encryptSHA256ToString(this)

fun ByteArray.encryptSHA384(): ByteArray =
  EncryptUtils.encryptSHA384(this)

fun ByteArray.encryptSHA384ToString(): String =
  EncryptUtils.encryptSHA384ToString(this)

fun String.encryptSHA384(): String =
  EncryptUtils.encryptSHA1ToString(this)

fun ByteArray.encryptSHA512(): ByteArray =
  EncryptUtils.encryptSHA512(this)

fun ByteArray.encryptSHA512ToString(): String =
  EncryptUtils.encryptSHA512ToString(this)

fun String.encryptSHA512(): String =
  EncryptUtils.encryptSHA512ToString(this)

fun ByteArray.encryptHmacMD5(key: ByteArray): ByteArray =
  EncryptUtils.encryptHmacMD5(this, key)

fun ByteArray.encryptHmacMD5ToString(key: ByteArray): String =
  EncryptUtils.encryptHmacMD5ToString(this, key)

fun String.encryptHmacMD5(key: String): String =
  EncryptUtils.encryptHmacMD5ToString(this, key)

fun ByteArray.encryptHmacSHA1(key: ByteArray): ByteArray =
  EncryptUtils.encryptHmacSHA1(this, key)

fun ByteArray.encryptHmacSHA1ToString(key: ByteArray): String =
  EncryptUtils.encryptHmacSHA1ToString(this, key)

fun String.encryptHmacSHA1(key: String): String =
  EncryptUtils.encryptHmacSHA1ToString(this, key)

fun ByteArray.encryptHmacSHA224(key: ByteArray): ByteArray =
  EncryptUtils.encryptHmacSHA224(this, key)

fun ByteArray.encryptHmacSHA224ToString(key: ByteArray): String =
  EncryptUtils.encryptHmacSHA224ToString(this, key)

fun String.encryptHmacSHA224(key: String): String =
  EncryptUtils.encryptHmacSHA224ToString(this, key)

fun ByteArray.encryptHmacSHA256(key: ByteArray): ByteArray =
  EncryptUtils.encryptHmacSHA256(this, key)

fun ByteArray.encryptHmacSHA256ToString(key: ByteArray): String =
  EncryptUtils.encryptHmacSHA256ToString(this, key)

fun String.encryptHmacSHA256(key: String): String =
  EncryptUtils.encryptHmacSHA256ToString(this, key)

fun ByteArray.encryptHmacSHA384(key: ByteArray): ByteArray =
  EncryptUtils.encryptHmacSHA384(this, key)

fun ByteArray.encryptHmacSHA384ToString(key: ByteArray): String =
  EncryptUtils.encryptHmacSHA384ToString(this, key)

fun String.encryptHmacSHA384(key: String): String =
  EncryptUtils.encryptHmacSHA384ToString(this, key)

fun ByteArray.encryptHmacSHA512(key: ByteArray): ByteArray =
  EncryptUtils.encryptHmacSHA512(this, key)

fun ByteArray.encryptHmacSHA512ToString(key: ByteArray): String =
  EncryptUtils.encryptHmacSHA512ToString(this, key)

fun String.encryptHmacSHA512(key: String): String =
  EncryptUtils.encryptHmacSHA512ToString(this, key)

fun ByteArray.encryptDES(
  key: ByteArray,
  transformation: String,
  iv: ByteArray?
): ByteArray? =
  EncryptUtils.encryptDES(this, key, transformation, iv)

fun ByteArray.decryptDES(
  key: ByteArray,
  transformation: String,
  iv: ByteArray?
): ByteArray? =
  EncryptUtils.decryptDES(this, key, transformation, iv)

fun ByteArray.encrypt3DES(
  key: ByteArray,
  transformation: String,
  iv: ByteArray?
): ByteArray? =
  EncryptUtils.encrypt3DES(this, key, transformation, iv)

fun ByteArray.decrypt3DES(
  key: ByteArray,
  transformation: String,
  iv: ByteArray?
): ByteArray? =
  EncryptUtils.decrypt3DES(this, key, transformation, iv)

fun ByteArray.encryptAES(
  key: ByteArray,
  transformation: String,
  iv: ByteArray?
): ByteArray? =
  EncryptUtils.encryptAES(this, key, transformation, iv)

fun ByteArray.decryptAES(
  key: ByteArray,
  transformation: String,
  iv: ByteArray?
): ByteArray? =
  EncryptUtils.decryptAES(this, key, transformation, iv)

fun ByteArray.encryptRSA(
  publicKey: ByteArray,
  keySize: Int,
  transformation: String
): ByteArray? =
  EncryptUtils.encryptRSA(this, publicKey, keySize, transformation)

fun ByteArray.decryptRSA(
  publicKey: ByteArray,
  keySize: Int,
  transformation: String
): ByteArray? =
  EncryptUtils.decryptRSA(this, publicKey, keySize, transformation)

fun ByteArray.rc4(key: ByteArray): ByteArray =
  EncryptUtils.rc4(this, key)