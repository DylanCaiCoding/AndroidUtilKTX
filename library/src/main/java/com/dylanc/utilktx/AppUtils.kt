@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Application
import android.content.pm.Signature
import android.graphics.drawable.Drawable
import com.blankj.utilcode.util.AppUtils
import com.blankj.utilcode.util.Utils
import java.io.File

/**
 * @author Dylan Cai
 */

inline val application: Application
  get() = Utils.getApp()

inline fun registerAppStatusChangedListener(listener: Utils.OnAppStatusChangedListener) =
  AppUtils.registerAppStatusChangedListener(listener)

inline fun unregisterAppStatusChangedListener(listener: Utils.OnAppStatusChangedListener) =
  AppUtils.unregisterAppStatusChangedListener(listener)

inline fun installApp(file: File) =
  AppUtils.installApp(file)

inline fun installApp(filePath: String) =
  AppUtils.installApp(filePath)

inline fun uninstallApp(packageName: String) =
  AppUtils.uninstallApp(packageName)

inline fun isAppInstalled(packageName: String): Boolean =
  AppUtils.isAppInstalled(packageName)

inline val isAppRoot: Boolean
  get() = AppUtils.isAppRoot()

inline val isAppDebug: Boolean
  get() = AppUtils.isAppDebug()

inline fun isAppDebug(packageName: String): Boolean =
  AppUtils.isAppDebug(packageName)

inline val isAppSystem: Boolean
  get() = AppUtils.isAppSystem()

inline fun isAppSystem(packageName: String): Boolean =
  AppUtils.isAppSystem(packageName)

inline val isAppForeground: Boolean
  get() = AppUtils.isAppForeground()

inline fun isAppForeground(packageName: String): Boolean =
  AppUtils.isAppForeground(packageName)

inline fun isAppRunning(packageName: String): Boolean =
  AppUtils.isAppRunning(packageName)

inline fun launchApp(packageName: String) =
  AppUtils.launchApp(packageName)

inline fun relaunchApp(isKillProcess: Boolean = false) =
  AppUtils.relaunchApp(isKillProcess)

inline fun launchAppDetailsSettings(packageName: String) =
  AppUtils.launchAppDetailsSettings(packageName)

inline fun exitApp() =
  AppUtils.exitApp()

inline val appIcon: Drawable
  get() = AppUtils.getAppIcon()

inline fun appIconOf(packageName: String): Drawable =
  AppUtils.getAppIcon(packageName)

inline val packageName: String
  get() = AppUtils.getAppPackageName()

inline val appName: String
  get() = AppUtils.getAppName()

inline fun appNameOf(packageName: String): String =
  AppUtils.getAppName(packageName)

inline val appPath: String
  get() = AppUtils.getAppPath()

inline fun appPathOf(packageName: String): String =
  AppUtils.getAppPath(packageName)

inline val appVersionName: String
  get() = AppUtils.getAppVersionName()

inline fun appVersionNameOf(packageName: String): String =
  AppUtils.getAppVersionName(packageName)

inline val appVersionCode: Int
  get() = AppUtils.getAppVersionCode()

inline fun appVersionCodeOf(packageName: String): Int =
  AppUtils.getAppVersionCode(packageName)

inline val appSignature: Array<Signature>
  get() = AppUtils.getAppSignature()

inline fun appSignatureOf(packageName: String): Array<Signature> =
  AppUtils.getAppSignature(packageName)

inline val appSignatureSHA1: String
  get() = AppUtils.getAppSignatureSHA1()

inline fun appSignatureSHA1Of(packageName: String): String =
  AppUtils.getAppSignatureSHA1(packageName)

inline val appSignatureSHA256: String
  get() = AppUtils.getAppSignatureSHA256()

inline fun appSignatureSHA256Of(packageName: String): String =
  AppUtils.getAppSignatureSHA256(packageName)

inline val appSignatureMD5: String
  get() = AppUtils.getAppSignatureMD5()

inline fun appSignatureMD5Of(packageName: String): String =
  AppUtils.getAppSignatureMD5(packageName)

inline val appInfo: AppUtils.AppInfo
  get() = AppUtils.getAppInfo()

inline fun appInfoOf(packageName: String): AppUtils.AppInfo =
  AppUtils.getAppInfo(packageName)

inline val appsInfo: List<AppUtils.AppInfo>
  get() = AppUtils.getAppsInfo()

inline val File.apkInfo: AppUtils.AppInfo
  get() = AppUtils.getApkInfo(this)

inline val String.apkInfo: AppUtils.AppInfo
  get() = AppUtils.getApkInfo(this)