package com.dylanc.utilktx

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Parcelable
import com.blankj.utilcode.util.CacheMemoryStaticUtils
import org.json.JSONArray
import org.json.JSONObject
import java.io.Serializable

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */
fun putMemoryCache(key: String, value: ByteArray) =
  CacheMemoryStaticUtils.put(key, value)

fun putMemoryCache(key: String, value: String) =
  CacheMemoryStaticUtils.put(key, value)

fun putMemoryCache(key: String, value: JSONObject) =
  CacheMemoryStaticUtils.put(key, value)

fun putMemoryCache(key: String, value: JSONArray) =
  CacheMemoryStaticUtils.put(key, value)

fun putMemoryCache(key: String, value: Bitmap) =
  CacheMemoryStaticUtils.put(key, value)

fun putMemoryCache(key: String, value: Drawable) =
  CacheMemoryStaticUtils.put(key, value)

fun putMemoryCache(key: String, value: Parcelable) =
  CacheMemoryStaticUtils.put(key, value)

fun putMemoryCache(key: String, value: Serializable) =
  CacheMemoryStaticUtils.put(key, value)

fun <T> memoryCacheOf(key: String, defaultValue: T? = null): T? =
  CacheMemoryStaticUtils.get(key, defaultValue)

val memoryCacheCount: Int
  get() = CacheMemoryStaticUtils.getCacheCount()

fun removeMemoryCache(key: String): Any =
  CacheMemoryStaticUtils.remove(key)

fun clearMemoryCache() =
  CacheMemoryStaticUtils.clear()
