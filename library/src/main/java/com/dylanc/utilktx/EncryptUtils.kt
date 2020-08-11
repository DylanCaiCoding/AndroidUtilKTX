@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.EncryptUtils
import java.io.File

/**
 * @author Dylan Cai
 */

/**
 * Returns the bytes of the MD2 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptMD2(data)
 * ```
 */
inline fun ByteArray.encryptMD2(): ByteArray = EncryptUtils.encryptMD2(this)

/**
 * Returns the hex string of the MD2 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptMD2ToString(data)
 * ```
 */
inline fun String.encryptMD2(): String = EncryptUtils.encryptMD2ToString(this)

/**
 * Returns the bytes of the MD5 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptMD5(data)
 * ```
 */
inline fun ByteArray.encryptMD5(): ByteArray = EncryptUtils.encryptMD5(this)

/**
 * Returns the bytes of the MD5 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptMD5ToString(data， salt)
 * ```
 */
inline fun ByteArray.encryptMD5ToString(salt: ByteArray): String = EncryptUtils.encryptMD5ToString(this, salt)

/**
 * Returns the hex string of the MD5 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptMD5ToString(data)
 * ```
 */
inline fun String.encryptMD5(): String = EncryptUtils.encryptMD5ToString(this)

/**
 * Returns the hex string of the MD5 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptMD5ToString(data, salt)
 * ```
 */
inline fun String.encryptMD5(salt: String): String = EncryptUtils.encryptMD5ToString(this, salt)

/**
 * Returns the bytes of the file's MD5 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptMD5File(data)
 * ```
 */
inline fun File.encryptMD5(): ByteArray = EncryptUtils.encryptMD5File(this)

/**
 * Returns the bytes of the file's MD5 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptMD5File(data)
 * ```
 */
inline fun encryptMD5File(filePath: String): ByteArray = EncryptUtils.encryptMD5File(filePath)

/**
 * Returns the bytes of the SHA1 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptSHA1(data)
 * ```
 */
inline fun ByteArray.encryptSHA1(): ByteArray = EncryptUtils.encryptSHA1(this)

/**
 * Returns the hex string of the SHA1 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptSHA1ToString(data)
 * ```
 */
inline fun String.encryptSHA1(): String = EncryptUtils.encryptSHA1ToString(this)

/**
 * Returns the bytes of the SHA224 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptSHA224(data)
 * ```
 */
inline fun ByteArray.encryptSHA224(): ByteArray = EncryptUtils.encryptSHA224(this)

/**
 * Returns the hex string of the SHA224 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptSHA224ToString(data)
 * ```
 */
inline fun String.encryptSHA224(): String = EncryptUtils.encryptSHA224ToString(this)

/**
 * Returns the bytes of the SHA256 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptSHA256(data)
 * ```
 */
inline fun ByteArray.encryptSHA256(): ByteArray = EncryptUtils.encryptSHA256(this)

/**
 * Returns the hex string of the SHA256 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptSHA256ToString(data)
 * ```
 */
inline fun String.encryptSHA256(): String = EncryptUtils.encryptSHA256ToString(this)

/**
 * Returns the bytes of the SHA384 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptSHA384(data)
 * ```
 */
inline fun ByteArray.encryptSHA384(): ByteArray = EncryptUtils.encryptSHA384(this)

/**
 * Returns the hex string of the SHA384 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptSHA384ToString(data)
 * ```
 */
inline fun String.encryptSHA384(): String = EncryptUtils.encryptSHA1ToString(this)

/**
 * Returns the bytes of the SHA512 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptSHA512(data)
 * ```
 */
inline fun ByteArray.encryptSHA512(): ByteArray = EncryptUtils.encryptSHA512(this)

/**
 * Returns the hex string of the SHA512 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptSHA512ToString(data)
 * ```
 */
inline fun String.encryptSHA512(): String = EncryptUtils.encryptSHA512ToString(this)

/**
 * Returns the bytes of the HmacMD5 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptHmacMD5(data, key)
 * ```
 */
inline fun ByteArray.encryptHmacMD5(key: ByteArray): ByteArray = EncryptUtils.encryptHmacMD5(this, key)

/**
 * Returns the hex string of the HmacMD5 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptHmacMD5ToString(data, key)
 * ```
 */
inline fun String.encryptHmacMD5(key: String): String = EncryptUtils.encryptHmacMD5ToString(this, key)

/**
 * Returns the bytes of the HmacSHA1 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptHmacSHA1(data, key)
 * ```
 */
inline fun ByteArray.encryptHmacSHA1(key: ByteArray): ByteArray = EncryptUtils.encryptHmacSHA1(this, key)

/**
 * Returns the hex string of the HmacSHA1 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptHmacSHA1ToString(data, key)
 * ```
 */
inline fun String.encryptHmacSHA1(key: String): String = EncryptUtils.encryptHmacSHA1ToString(this, key)

/**
 * Returns the bytes of the HmacSHA224 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptHmacSHA224(data, key)
 * ```
 */
inline fun ByteArray.encryptHmacSHA224(key: ByteArray): ByteArray = EncryptUtils.encryptHmacSHA224(this, key)

/**
 * Returns the hex string of the HmacSHA224 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptHmacSHA224ToString(data, key)
 * ```
 */
inline fun String.encryptHmacSHA224(key: String): String = EncryptUtils.encryptHmacSHA224ToString(this, key)

/**
 * Returns the bytes of the HmacSHA256 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptHmacSHA256(data, key)
 * ```
 */
inline fun ByteArray.encryptHmacSHA256(key: ByteArray): ByteArray = EncryptUtils.encryptHmacSHA256(this, key)

/**
 * Returns the hex string of the HmacSHA256 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptHmacSHA256ToString(data, key)
 * ```
 */
inline fun String.encryptHmacSHA256(key: String): String = EncryptUtils.encryptHmacSHA256ToString(this, key)

/**
 * Returns the bytes of the HmacSHA384 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptHmacSHA384(data, key)
 * ```
 */
inline fun ByteArray.encryptHmacSHA384(key: ByteArray): ByteArray = EncryptUtils.encryptHmacSHA384(this, key)

/**
 * Returns the hex string of the HmacSHA384 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptHmacSHA384ToString(data, key)
 * ```
 */
inline fun String.encryptHmacSHA384(key: String): String = EncryptUtils.encryptHmacSHA384ToString(this, key)

/**
 * Returns the bytes of the HmacSHA512 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptHmacSHA512(data, key)
 * ```
 */
inline fun ByteArray.encryptHmacSHA512(key: ByteArray): ByteArray = EncryptUtils.encryptHmacSHA512(this, key)

/**
 * Returns the hex string of the HmacSHA512 encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptHmacSHA512ToString(data, key)
 * ```
 */
inline fun String.encryptHmacSHA512(key: String): String = EncryptUtils.encryptHmacSHA512ToString(this, key)

/**
 * Returns the bytes of the DES encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptDES(data, key, transformation, iv)
 * ```
 */
inline fun ByteArray.encryptDES(key: ByteArray, transformation: String, iv: ByteArray?): ByteArray? =
  EncryptUtils.encryptDES(this, key, transformation, iv)

/**
 * Returns the bytes of the DES decryption. This is equivalent to calling:
 * ```
 * EncryptUtils.decryptDES(data, key, transformation, iv)
 * ```
 */
inline fun ByteArray.decryptDES(key: ByteArray, transformation: String, iv: ByteArray?): ByteArray? =
  EncryptUtils.decryptDES(this, key, transformation, iv)

/**
 * Returns the bytes of the 3DES encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encrypt3DES(data, key, transformation, iv)
 * ```
 */
inline fun ByteArray.encrypt3DES(key: ByteArray, transformation: String, iv: ByteArray?): ByteArray? =
  EncryptUtils.encrypt3DES(this, key, transformation, iv)

/**
 * Returns the bytes of the 3DES decryption. This is equivalent to calling:
 * ```
 * EncryptUtils.decrypt3DES(data, key, transformation, iv)
 * ```
 */
inline fun ByteArray.decrypt3DES(key: ByteArray, transformation: String, iv: ByteArray?): ByteArray? =
  EncryptUtils.decrypt3DES(this, key, transformation, iv)

/**
 * Returns the bytes of the AES encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptAES(data, key, transformation, iv)
 * ```
 */
inline fun ByteArray.encryptAES(key: ByteArray, transformation: String, iv: ByteArray?): ByteArray? =
  EncryptUtils.encryptAES(this, key, transformation, iv)

/**
 * Returns the bytes of the AES decryption. This is equivalent to calling:
 * ```
 * EncryptUtils.decryptAES(data, key, transformation, iv)
 * ```
 */
inline fun ByteArray.decryptAES(key: ByteArray, transformation: String, iv: ByteArray?): ByteArray? =
  EncryptUtils.decryptAES(this, key, transformation, iv)

/**
 * Returns the bytes of the RSA encryption. This is equivalent to calling:
 * ```
 * EncryptUtils.encryptRSA(data, key, transformation, iv)
 * ```
 */
inline fun ByteArray.encryptRSA(publicKey: ByteArray, keySize: Int, transformation: String): ByteArray? =
  EncryptUtils.encryptRSA(this, publicKey, keySize, transformation)

/**
 * Returns the bytes of the RSA decryption. This is equivalent to calling:
 * ```
 * EncryptUtils.decryptRSA(data, key, transformation, iv)
 * ```
 */
inline fun ByteArray.decryptRSA(publicKey: ByteArray, keySize: Int, transformation: String): ByteArray? =
  EncryptUtils.decryptRSA(this, publicKey, keySize, transformation)

/**
 * Returns the bytes of the RC4 encryption/decryption. This is equivalent to calling:
 * ```
 * EncryptUtils.rc4(data, key)
 * ```
 */
inline fun ByteArray.rc4(key: ByteArray): ByteArray = EncryptUtils.rc4(this, key)