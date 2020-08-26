@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Parcelable
import com.blankj.utilcode.util.CacheDiskStaticUtils
import com.blankj.utilcode.util.CacheDiskUtils
import org.json.JSONArray
import org.json.JSONObject
import java.io.Serializable

/**
 * @author Dylan Cai
 */

/**
 * Sets the default instance of [CacheDiskUtils]. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.setDefaultCacheDiskUtils(cacheDiskUtils)
 * ```
 */
inline var defaultCacheDiskUtils: CacheDiskUtils
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = CacheDiskStaticUtils.setDefaultCacheDiskUtils(value)

/**
 * Returns the single [CacheDiskUtils] instance. This is equivalent to calling:
 * ```
 * CacheDiskUtils.getInstance(cacheName, maxSize, maxCount)
 * ```
 */
inline fun cacheDiskUtilsOf(cacheName: String = "", maxSize: Long = Long.MAX_VALUE, maxCount: Int = Int.MAX_VALUE): CacheDiskUtils =
  CacheDiskUtils.getInstance(cacheName, maxSize, maxCount)

/**
 * Puts the bytes in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDiskCache(key: String, value: ByteArray, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

/**
 * Puts the string value in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDiskCache(key: String, value: String, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

/**
 * Puts the [JSONObject] in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDiskCache(key: String, value: JSONObject, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

/**
 * Puts the [JSONArray] in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDiskCache(key: String, value: JSONArray, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

/**
 * Puts the bitmap in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDiskCache(key: String, value: Bitmap, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

/**
 * Puts the drawable in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDiskCache(key: String, value: Drawable, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

/**
 * Puts the parcelable in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDiskCache(key: String, value: Parcelable, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

/**
 * Puts the serializable in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDiskCache(key: String, value: Serializable, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

/**
 * Returns the bytes in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.getBytes(key, defaultValue)
 * ```
 */
inline fun diskCacheBytesOf(key: String, defaultValue: ByteArray? = null): ByteArray? =
  CacheDiskStaticUtils.getBytes(key, defaultValue)

/**
 * Returns the string value in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.getString(key, defaultValue)
 * ```
 */
inline fun diskCacheStringOf(key: String, defaultValue: String? = null): String? =
  CacheDiskStaticUtils.getString(key, defaultValue)

/**
 * Returns the [JSONObject] in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.getJSONObject(key, defaultValue)
 * ```
 */
inline fun diskCacheJSONObjectOf(key: String, defaultValue: JSONObject? = null): JSONObject? =
  CacheDiskStaticUtils.getJSONObject(key, defaultValue)

/**
 * Returns the [JSONArray] in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.getJSONArray(key, defaultValue)
 * ```
 */
inline fun diskCacheJSONArrayOf(key: String, defaultValue: JSONArray? = null): JSONArray? =
  CacheDiskStaticUtils.getJSONArray(key, defaultValue)

/**
 * Returns the bitmap in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.getBitmap(key, defaultValue)
 * ```
 */
inline fun diskCacheBitmapOf(key: String, defaultValue: Bitmap? = null): Bitmap? =
  CacheDiskStaticUtils.getBitmap(key, defaultValue)

/**
 * Returns the drawable in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.getDrawable(key, defaultValue)
 * ```
 */
inline fun diskCacheDrawableOf(key: String, defaultValue: Drawable? = null): Drawable? =
  CacheDiskStaticUtils.getDrawable(key, defaultValue)

/**
 * Returns the parcelable in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.getParcelable(key, defaultValue)
 * ```
 */
inline fun <T> diskCacheParcelableOf(key: String, creator: Parcelable.Creator<T>, defaultValue: T? = null): T
    = CacheDiskStaticUtils.getParcelable(key, creator, defaultValue)

/**
 * Returns the serializable in the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.getSerializable(key, defaultValue)
 * ```
 */
@Suppress("UNCHECKED_CAST")
inline fun <T> diskCacheSerializableOf(key: String, defaultValue: T? = null): T =
  CacheDiskStaticUtils.getSerializable(key, defaultValue) as T

/**
 * Returns the size of the disk cache, in bytes. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.getCacheSize()
 * ```
 */
inline val diskCacheSize: Long get() = CacheDiskStaticUtils.getCacheSize()

/**
 * Returns the count of the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.getCacheCount()
 * ```
 */
inline val diskCacheCount: Int get() = CacheDiskStaticUtils.getCacheCount()

/**
 * Removes the disk cache by key. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.remove(key)
 * ```
 */
inline fun removeDiskCache(key: String) = CacheDiskStaticUtils.remove(key)

/**
 * Clear all of the disk cache. This is equivalent to calling:
 * ```
 * CacheDiskStaticUtils.clear()
 * ```
 */
inline fun clearDiskCache() = CacheDiskStaticUtils.clear()