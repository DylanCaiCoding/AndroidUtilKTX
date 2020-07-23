package com.dylanc.utilktx

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Parcelable
import com.blankj.utilcode.util.CacheDoubleStaticUtils
import com.blankj.utilcode.util.CacheDoubleUtils
import com.blankj.utilcode.util.CacheMemoryStaticUtils
import com.blankj.utilcode.util.CacheMemoryUtils
import org.json.JSONArray
import org.json.JSONObject
import java.io.Serializable

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */

var defaultCacheDoubleUtils: CacheDoubleUtils
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = CacheDoubleStaticUtils.setDefaultCacheDoubleUtils(value)

fun putDoubleCache(key: String, value: ByteArray) =
  CacheDoubleStaticUtils.put(key, value)

fun putDoubleCache(key: String, value: String) =
  CacheDoubleStaticUtils.put(key, value)

fun putDoubleCache(key: String, value: JSONObject) =
  CacheDoubleStaticUtils.put(key, value)

fun putDoubleCache(key: String, value: JSONArray) =
  CacheDoubleStaticUtils.put(key, value)

fun putDoubleCache(key: String, value: Bitmap) =
  CacheDoubleStaticUtils.put(key, value)

fun putDoubleCache(key: String, value: Drawable) =
  CacheDoubleStaticUtils.put(key, value)

fun putDoubleCache(key: String, value: Parcelable) =
  CacheDoubleStaticUtils.put(key, value)

fun putDoubleCache(key: String, value: Serializable) =
  CacheDoubleStaticUtils.put(key, value)

fun doubleCacheBytesOf(key: String, defaultValue: ByteArray? = null): ByteArray? =
  CacheDoubleStaticUtils.getBytes(key, defaultValue)

fun doubleCacheStringOf(key: String, defaultValue: String? = null): String? =
  CacheDoubleStaticUtils.getString(key, defaultValue)

fun doubleCacheJSONObjectOf(key: String, defaultValue: JSONObject? = null): JSONObject? =
  CacheDoubleStaticUtils.getJSONObject(key, defaultValue)

fun doubleCacheBitmapOf(key: String, defaultValue: Bitmap? = null): Bitmap? =
  CacheDoubleStaticUtils.getBitmap(key, defaultValue)

fun doubleCacheDrawableOf(key: String, defaultValue: Drawable? = null): Drawable? =
  CacheDoubleStaticUtils.getDrawable(key, defaultValue)

fun <T> doubleCacheParcelableOf(
  key: String,
  creator: Parcelable.Creator<T>,
  defaultValue: T? = null
): T =
  CacheDoubleStaticUtils.getParcelable(key, creator, defaultValue)

@Suppress("UNCHECKED_CAST")
fun <T> doubleCacheSerializableOf(
  key: String,
  defaultValue: T? = null
): T =
  CacheDoubleStaticUtils.getSerializable(key, defaultValue) as T

val doubleDoubleCacheSize: Long
  get() = CacheDoubleStaticUtils.getCacheDiskSize()

val doubleDoubleCacheCount: Int
  get() = CacheDoubleStaticUtils.getCacheDiskCount()

fun removeDoubleCache(key: String) =
  CacheDoubleStaticUtils.remove(key)

fun clearDoubleCache() =
  CacheDoubleStaticUtils.clear()