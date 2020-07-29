@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.EncryptUtils
import java.io.File

/**
 * @author Dylan Cai
 */

inline fun ByteArray.encryptMD2(): ByteArray =
  EncryptUtils.encryptMD2(this)

inline fun ByteArray.encryptMD2ToString(): String =
  EncryptUtils.encryptMD2ToString(this)

inline fun String.encryptMD2(): String =
  EncryptUtils.encryptMD2ToString(this)

inline fun ByteArray.encryptMD5(): ByteArray =
  EncryptUtils.encryptMD5(this)

inline fun ByteArray.encryptMD5ToString(salt: ByteArray): String =
  EncryptUtils.encryptMD5ToString(this, salt)

inline fun String.encryptMD5(): String =
  EncryptUtils.encryptMD5ToString(this)

inline fun String.encryptMD5(salt: String): String =
  EncryptUtils.encryptMD5ToString(this, salt)

inline fun File.encryptMD5(): ByteArray =
  EncryptUtils.encryptMD5File(this)

inline fun encryptMD5File(filePath: String): ByteArray =
  EncryptUtils.encryptMD5File(filePath)

inline fun ByteArray.encryptSHA1(): ByteArray =
  EncryptUtils.encryptSHA1(this)

inline fun String.encryptSHA1(): String =
  EncryptUtils.encryptSHA1ToString(this)

inline fun ByteArray.encryptSHA224(): ByteArray =
  EncryptUtils.encryptSHA224(this)

inline fun String.encryptSHA224(): String =
  EncryptUtils.encryptSHA224ToString(this)

inline fun ByteArray.encryptSHA256(): ByteArray =
  EncryptUtils.encryptSHA256(this)

inline fun String.encryptSHA256(): String =
  EncryptUtils.encryptSHA256ToString(this)

inline fun ByteArray.encryptSHA384(): ByteArray =
  EncryptUtils.encryptSHA384(this)

inline fun String.encryptSHA384(): String =
  EncryptUtils.encryptSHA1ToString(this)

inline fun ByteArray.encryptSHA512(): ByteArray =
  EncryptUtils.encryptSHA512(this)

inline fun String.encryptSHA512(): String =
  EncryptUtils.encryptSHA512ToString(this)

inline fun ByteArray.encryptHmacMD5(key: ByteArray): ByteArray =
  EncryptUtils.encryptHmacMD5(this, key)

inline fun String.encryptHmacMD5(key: String): String =
  EncryptUtils.encryptHmacMD5ToString(this, key)

inline fun ByteArray.encryptHmacSHA1(key: ByteArray): ByteArray =
  EncryptUtils.encryptHmacSHA1(this, key)

inline fun String.encryptHmacSHA1(key: String): String =
  EncryptUtils.encryptHmacSHA1ToString(this, key)

inline fun ByteArray.encryptHmacSHA224(key: ByteArray): ByteArray =
  EncryptUtils.encryptHmacSHA224(this, key)

inline fun String.encryptHmacSHA224(key: String): String =
  EncryptUtils.encryptHmacSHA224ToString(this, key)

inline fun ByteArray.encryptHmacSHA256(key: ByteArray): ByteArray =
  EncryptUtils.encryptHmacSHA256(this, key)

inline fun String.encryptHmacSHA256(key: String): String =
  EncryptUtils.encryptHmacSHA256ToString(this, key)

inline fun ByteArray.encryptHmacSHA384(key: ByteArray): ByteArray =
  EncryptUtils.encryptHmacSHA384(this, key)

inline fun String.encryptHmacSHA384(key: String): String =
  EncryptUtils.encryptHmacSHA384ToString(this, key)

inline fun ByteArray.encryptHmacSHA512(key: ByteArray): ByteArray =
  EncryptUtils.encryptHmacSHA512(this, key)

inline fun String.encryptHmacSHA512(key: String): String =
  EncryptUtils.encryptHmacSHA512ToString(this, key)

inline fun ByteArray.encryptDES(
  key: ByteArray,
  transformation: String,
  iv: ByteArray?
): ByteArray? =
  EncryptUtils.encryptDES(this, key, transformation, iv)

inline fun ByteArray.decryptDES(
  key: ByteArray,
  transformation: String,
  iv: ByteArray?
): ByteArray? =
  EncryptUtils.decryptDES(this, key, transformation, iv)

inline fun ByteArray.encrypt3DES(
  key: ByteArray,
  transformation: String,
  iv: ByteArray?
): ByteArray? =
  EncryptUtils.encrypt3DES(this, key, transformation, iv)

inline fun ByteArray.decrypt3DES(
  key: ByteArray,
  transformation: String,
  iv: ByteArray?
): ByteArray? =
  EncryptUtils.decrypt3DES(this, key, transformation, iv)

inline fun ByteArray.encryptAES(
  key: ByteArray,
  transformation: String,
  iv: ByteArray?
): ByteArray? =
  EncryptUtils.encryptAES(this, key, transformation, iv)

inline fun ByteArray.decryptAES(
  key: ByteArray,
  transformation: String,
  iv: ByteArray?
): ByteArray? =
  EncryptUtils.decryptAES(this, key, transformation, iv)

inline fun ByteArray.encryptRSA(
  publicKey: ByteArray,
  keySize: Int,
  transformation: String
): ByteArray? =
  EncryptUtils.encryptRSA(this, publicKey, keySize, transformation)

inline fun ByteArray.decryptRSA(
  publicKey: ByteArray,
  keySize: Int,
  transformation: String
): ByteArray? =
  EncryptUtils.decryptRSA(this, publicKey, keySize, transformation)

inline fun ByteArray.rc4(key: ByteArray): ByteArray =
  EncryptUtils.rc4(this, key)