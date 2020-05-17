@file:Suppress("unused")

package com.dylanc.utilktx

import android.app.Application
import android.content.pm.Signature
import android.graphics.drawable.Drawable
import com.blankj.utilcode.util.AppUtils
import com.blankj.utilcode.util.Utils
import java.io.File

/**
 * @author Dylan Cai
 * @since 2020/5/8
 */
val application: Application
  get() = Utils.getApp()

fun registerAppStatusChangedListener(listener: Utils.OnAppStatusChangedListener) =
  AppUtils.registerAppStatusChangedListener(listener)

fun unregisterAppStatusChangedListener(listener: Utils.OnAppStatusChangedListener) =
  AppUtils.unregisterAppStatusChangedListener(listener)

fun installApp(file: File) =
  AppUtils.installApp(file)

fun installApp(filePath: String) =
  AppUtils.installApp(filePath)

fun uninstallApp(packageName: String) =
  AppUtils.uninstallApp(packageName)

fun isAppInstalled(packageName: String): Boolean =
  AppUtils.isAppInstalled(packageName)

val isAppRoot: Boolean
  get() = AppUtils.isAppRoot()

val isAppDebug: Boolean
  get() = AppUtils.isAppDebug()

fun isAppDebug(packageName: String): Boolean =
  AppUtils.isAppDebug(packageName)

val isAppSystem: Boolean
  get() = AppUtils.isAppSystem()

fun isAppSystem(packageName: String): Boolean =
  AppUtils.isAppSystem(packageName)

val isAppForeground: Boolean
  get() = AppUtils.isAppForeground()

fun isAppForeground(packageName: String): Boolean =
  AppUtils.isAppForeground(packageName)

fun isAppRunning(packageName: String): Boolean =
  AppUtils.isAppRunning(packageName)

fun launchApp(packageName: String) =
  AppUtils.launchApp(packageName)

fun relaunchApp(isKillProcess: Boolean = false) =
  AppUtils.relaunchApp(isKillProcess)

fun launchAppDetailsSettings() =
  AppUtils.launchAppDetailsSettings()

fun launchAppDetailsSettings(packageName: String) =
  AppUtils.launchAppDetailsSettings(packageName)

fun exitApp() =
  AppUtils.exitApp()

val appIcon: Drawable
  get() = AppUtils.getAppIcon()

fun appIconOf(packageName: String): Drawable =
  AppUtils.getAppIcon(packageName)

val packageName: String
  get() = AppUtils.getAppPackageName()

val appName: String
  get() = AppUtils.getAppName()

fun appNameOf(packageName: String): String =
  AppUtils.getAppName(packageName)

val appPath: String
  get() = AppUtils.getAppPath()

fun appPathOf(packageName: String): String =
  AppUtils.getAppPath(packageName)

val appVersionName: String
  get() = AppUtils.getAppVersionName()

fun appVersionNameOf(packageName: String): String =
  AppUtils.getAppVersionName(packageName)

val appVersionCode: Int
  get() = AppUtils.getAppVersionCode()

fun appVersionCodeOf(packageName: String): Int =
  AppUtils.getAppVersionCode(packageName)

val appSignature: Array<Signature>
  get() = AppUtils.getAppSignature()

fun appSignatureOf(packageName: String): Array<Signature> =
  AppUtils.getAppSignature(packageName)

val appSignatureSHA1: String
  get() = AppUtils.getAppSignatureSHA1()

fun appSignatureSHA1Of(packageName: String): String =
  AppUtils.getAppSignatureSHA1(packageName)

val appSignatureSHA256: String
  get() = AppUtils.getAppSignatureSHA256()

fun appSignatureSHA256Of(packageName: String): String =
  AppUtils.getAppSignatureSHA256(packageName)

val appSignatureMD5: String
  get() = AppUtils.getAppSignatureMD5()

fun appSignatureMD5Of(packageName: String): String =
  AppUtils.getAppSignatureMD5(packageName)

val appInfo: AppUtils.AppInfo
  get() = AppUtils.getAppInfo()

fun appInfoOf(packageName: String): AppUtils.AppInfo =
  AppUtils.getAppInfo(packageName)

val appsInfo: List<AppUtils.AppInfo>
  get() = AppUtils.getAppsInfo()

val File.apkInfo: AppUtils.AppInfo
  get() = AppUtils.getApkInfo(this)

val String.apkInfo: AppUtils.AppInfo
  get() = AppUtils.getApkInfo(this)