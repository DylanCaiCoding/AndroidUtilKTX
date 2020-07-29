@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
import com.blankj.utilcode.util.ResourceUtils

/**
 * @author Dylan Cai
 */

inline fun drawableOf(@DrawableRes id: Int): Drawable =
  ResourceUtils.getDrawable(id)

inline fun idOf(name: String) =
  ResourceUtils.getIdByName(name)

inline fun stringIdOf(name: String): Int =
  ResourceUtils.getStringIdByName(name)

inline fun colorIdOf(name: String): Int =
  ResourceUtils.getColorIdByName(name)

inline fun dimenIdOf(name: String): Int =
  ResourceUtils.getDimenIdByName(name)

inline fun drawableIdOf(name: String): Int =
  ResourceUtils.getDrawableIdByName(name)

inline fun mipmapIdOf(name: String): Int =
  ResourceUtils.getMipmapIdByName(name)

inline fun layoutIdOf(name: String): Int =
  ResourceUtils.getLayoutIdByName(name)

inline fun styleIdOf(name: String): Int =
  ResourceUtils.getStyleIdByName(name)

inline fun animIdOf(name: String): Int =
  ResourceUtils.getAnimIdByName(name)

inline fun menuIdOf(name: String): Int =
  ResourceUtils.getMenuIdByName(name)

inline fun copyFileFromAssets(assetsFilePath: String, destFilePath: String): Boolean =
  ResourceUtils.copyFileFromAssets(assetsFilePath, destFilePath)

inline fun readAssets2String(assetsFilePath: String, charsetName: String? = null): String =
  ResourceUtils.readAssets2String(assetsFilePath, charsetName)

inline fun readAssets2List(assetsFilePath: String, charsetName: String? = null): List<String> =
  ResourceUtils.readAssets2List(assetsFilePath, charsetName)

inline fun copyFileFromAssets(@RawRes rawId: Int, destFilePath: String): Boolean =
  ResourceUtils.copyFileFromRaw(rawId, destFilePath)

inline fun readAssets2String(@RawRes rawId: Int, charsetName: String? = null): String =
  ResourceUtils.readRaw2String(rawId, charsetName)

inline fun readAssets2List(@RawRes rawId: Int, charsetName: String? = null): List<String> =
  ResourceUtils.readRaw2List(rawId, charsetName)
