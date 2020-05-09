package com.dylanc.utilktx

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
import com.blankj.utilcode.util.ResourceUtils

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */
fun drawableOf(@DrawableRes id: Int): Drawable =
  ResourceUtils.getDrawable(id)

fun idOf(name: String) =
  ResourceUtils.getIdByName(name)

fun stringIdOf(name: String): Int =
  ResourceUtils.getStringIdByName(name)

fun colorIdOf(name: String): Int =
  ResourceUtils.getColorIdByName(name)

fun dimenIdOf(name: String): Int =
  ResourceUtils.getDimenIdByName(name)

fun drawableIdOf(name: String): Int =
  ResourceUtils.getDrawableIdByName(name)

fun mipmapIdOf(name: String): Int =
  ResourceUtils.getMipmapIdByName(name)

fun layoutIdOf(name: String): Int =
  ResourceUtils.getLayoutIdByName(name)

fun styleIdOf(name: String): Int =
  ResourceUtils.getStyleIdByName(name)

fun animIdOf(name: String): Int =
  ResourceUtils.getAnimIdByName(name)

fun menuIdOf(name: String): Int =
  ResourceUtils.getMenuIdByName(name)

fun copyFileFromAssets(assetsFilePath: String, destFilePath: String): Boolean =
  ResourceUtils.copyFileFromAssets(assetsFilePath, destFilePath)

fun readAssets2String(assetsFilePath: String, charsetName: String? = null): String =
  ResourceUtils.readAssets2String(assetsFilePath, charsetName)

fun readAssets2List(assetsFilePath: String, charsetName: String? = null): List<String> =
  ResourceUtils.readAssets2List(assetsFilePath, charsetName)

fun copyFileFromAssets(@RawRes rawId: Int, destFilePath: String): Boolean =
  ResourceUtils.copyFileFromRaw(rawId, destFilePath)

fun readAssets2String(@RawRes rawId: Int, charsetName: String? = null): String =
  ResourceUtils.readRaw2String(rawId, charsetName)

fun readAssets2List(@RawRes rawId: Int, charsetName: String? = null): List<String> =
  ResourceUtils.readRaw2List(rawId, charsetName)
