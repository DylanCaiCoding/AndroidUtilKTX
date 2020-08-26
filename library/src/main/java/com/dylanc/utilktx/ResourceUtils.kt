@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
import com.blankj.utilcode.util.ResourceUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns the drawable by identifier. This is equivalent to calling:
 * ```
 * ResourceUtils.getDrawable(id)
 * ```
 */
inline fun drawableOf(@DrawableRes id: Int): Drawable = ResourceUtils.getDrawable(id)

/**
 * Returns the id identifier by name. This is equivalent to calling:
 * ```
 * ResourceUtils.getIdByName(name)
 * ```
 */
inline fun idOf(name: String) = ResourceUtils.getIdByName(name)

/**
 * Returns the string identifier by name. This is equivalent to calling:
 * ```
 * ResourceUtils.getStringIdByName(name)
 * ```
 */
inline fun stringIdOf(name: String): Int = ResourceUtils.getStringIdByName(name)

/**
 * Returns the color identifier by name. This is equivalent to calling:
 * ```
 * getColorIdByName(name)
 * ```
 */
inline fun colorIdOf(name: String): Int = ResourceUtils.getColorIdByName(name)

/**
 * Returns the dimen identifier by name. This is equivalent to calling:
 * ```
 * ResourceUtils.getDimenIdByName(name)
 * ```
 */
inline fun dimenIdOf(name: String): Int = ResourceUtils.getDimenIdByName(name)

/**
 * Returns the drawable identifier by name. This is equivalent to calling:
 * ```
 * ResourceUtils.getDrawableIdByName(name)
 * ```
 */
inline fun drawableIdOf(name: String): Int = ResourceUtils.getDrawableIdByName(name)

/**
 * Returns the mipmap identifier by name. This is equivalent to calling:
 * ```
 * ResourceUtils.getMipmapIdByName(name)
 * ```
 */
inline fun mipmapIdOf(name: String): Int = ResourceUtils.getMipmapIdByName(name)

/**
 * Returns the layout identifier by name. This is equivalent to calling:
 * ```
 * ResourceUtils.getLayoutIdByName(name)
 * ```
 */
inline fun layoutIdOf(name: String): Int = ResourceUtils.getLayoutIdByName(name)

/**
 * Returns the style identifier by name. This is equivalent to calling:
 * ```
 * ResourceUtils.getStyleIdByName(name)
 * ```
 */
inline fun styleIdOf(name: String): Int = ResourceUtils.getStyleIdByName(name)

/**
 * Returns the anim identifier by name. This is equivalent to calling:
 * ```
 * ResourceUtils.getAnimIdByName(name)
 * ```
 */
inline fun animIdOf(name: String): Int = ResourceUtils.getAnimIdByName(name)

/**
 * Returns the menu identifier by name. This is equivalent to calling:
 * ```
 * ResourceUtils.getMenuIdByName(name)
 * ```
 */
inline fun menuIdOf(name: String): Int = ResourceUtils.getMenuIdByName(name)

/**
 * Copy the file from assets. This is equivalent to calling:
 * ```
 * ResourceUtils.copyFileFromAssets(assetsFilePath, destFilePath)
 * ```
 */
inline fun copyFileFromAssets(assetsFilePath: String, destFilePath: String): Boolean =
  ResourceUtils.copyFileFromAssets(assetsFilePath, destFilePath)

/**
 * Returns the content of assets. This is equivalent to calling:
 * ```
 * ResourceUtils.readAssets2String(assetsFilePath, charsetName)
 * ```
 */
inline fun readAssetsToString(assetsFilePath: String, charsetName: String? = null): String =
  ResourceUtils.readAssets2String(assetsFilePath, charsetName)

/**
 * Returns the content of file in assets. This is equivalent to calling:
 * ```
 * ResourceUtils.readAssets2List(assetsFilePath, charsetName)
 * ```
 */
inline fun readAssetsToLines(assetsFilePath: String, charsetName: String? = null): List<String> =
  ResourceUtils.readAssets2List(assetsFilePath, charsetName)

/**
 * Copy the file from raw. This is equivalent to calling:
 * ```
 * ResourceUtils.copyFileFromRaw(rawId, destFilePath)
 * ```
 */
inline fun copyFileFromRaw(@RawRes rawId: Int, destFilePath: String): Boolean =
  ResourceUtils.copyFileFromRaw(rawId, destFilePath)

/**
 * Returns the content of resource in raw. This is equivalent to calling:
 * ```
 * ResourceUtils.readRaw2String(rawId, charsetName)
 * ```
 */
inline fun readRawToString(@RawRes rawId: Int, charsetName: String? = null): String =
  ResourceUtils.readRaw2String(rawId, charsetName)

/**
 * Returns the content of resource in raw. This is equivalent to calling:
 * ```
 * ResourceUtils.readRaw2List(rawId, charsetName)
 * ```
 */
inline fun readRawToLines(@RawRes rawId: Int, charsetName: String? = null): List<String> =
  ResourceUtils.readRaw2List(rawId, charsetName)
