@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission.REQUEST_DELETE_PACKAGES
import android.Manifest.permission.REQUEST_INSTALL_PACKAGES
import android.app.Application
import android.content.pm.Signature
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.AppUtils
import com.blankj.utilcode.util.Utils
import java.io.File

/**
 * @author Dylan Cai
 */

/**
 * Return the Application object. Main process get app by UtilsFileProvider,
 * and other process get app by reflect.. This is equivalent to calling:
 * ```
 * Utils.getApp()
 * ```
 */
inline val application: Application get() = Utils.getApp()

/**
 * Register the status of application changed listener. This is equivalent to calling:
 * ```
 * AppUtils.registerAppStatusChangedListener(listener)
 * ```
 */
inline fun registerAppStatusChangedListener(listener: Utils.OnAppStatusChangedListener) =
  AppUtils.registerAppStatusChangedListener(listener)

/**
 * Unregister the status of application changed listener. This is equivalent to calling:
 * ```
 * AppUtils.unregisterAppStatusChangedListener(listener)
 * ```
 */
inline fun unregisterAppStatusChangedListener(listener: Utils.OnAppStatusChangedListener) =
  AppUtils.unregisterAppStatusChangedListener(listener)

/**
 * Install the app. This is equivalent to calling:
 * ```
 * AppUtils.installApp(file)
 * ```
 */
@RequiresApi(Build.VERSION_CODES.M)
@RequiresPermission(REQUEST_INSTALL_PACKAGES)
inline fun installApp(file: File) = AppUtils.installApp(file)

/**
 * Install the app. This is equivalent to calling:
 * ```
 * AppUtils.installApp(filePath)
 * ```
 */
@RequiresApi(Build.VERSION_CODES.M)
@RequiresPermission(REQUEST_INSTALL_PACKAGES)
inline fun installApp(filePath: String) = AppUtils.installApp(filePath)

/**
 * Uninstall the app. This is equivalent to calling:
 * ```
 * AppUtils.uninstallApp(packageName)
 * ```
 */
@RequiresApi(Build.VERSION_CODES.O)
@RequiresPermission(REQUEST_DELETE_PACKAGES)
inline fun uninstallApp(packageName: String) = AppUtils.uninstallApp(packageName)

/**
 * Return whether the app is installed. This is equivalent to calling:
 * ```
 * AppUtils.isAppInstalled(packageName)
 * ```
 */
inline fun isAppInstalled(packageName: String): Boolean = AppUtils.isAppInstalled(packageName)

/**
 * Return whether the application with root permission. This is equivalent to calling:
 * ```
 * AppUtils.isAppRoot()
 * ```
 */
inline val isAppRoot: Boolean get() = AppUtils.isAppRoot()

/**
 * Return whether it is a debug application. This is equivalent to calling:
 * ```
 * AppUtils.isAppDebug()
 * ```
 */
inline val isAppDebug: Boolean get() = AppUtils.isAppDebug()

/**
 * Return whether it is a debug application. This is equivalent to calling:
 * ```
 * AppUtils.isAppDebug(packageName)
 * ```
 */
inline fun isAppDebug(packageName: String): Boolean = AppUtils.isAppDebug(packageName)

/**
 * Return whether it is a system application. This is equivalent to calling:
 * ```
 * AppUtils.isAppSystem()
 * ```
 */
inline val isAppSystem: Boolean get() = AppUtils.isAppSystem()

/**
 * Return whether it is a system application. This is equivalent to calling:
 * ```
 * AppUtils.isAppSystem(packageName)
 * ```
 */
inline fun isAppSystem(packageName: String): Boolean = AppUtils.isAppSystem(packageName)

/**
 * Return whether application is foreground. This is equivalent to calling:
 * ```
 * AppUtils.isAppForeground()
 * ```
 */
inline val isAppForeground: Boolean get() = AppUtils.isAppForeground()

/**
 * Return whether application is foreground. This is equivalent to calling:
 * ```
 * AppUtils.isAppForeground(packageName)
 * ```
 */
inline fun isAppForeground(packageName: String): Boolean = AppUtils.isAppForeground(packageName)

/**
 * Return whether application is running. This is equivalent to calling:
 * ```
 * AppUtils.isAppRunning(packageName)
 * ```
 */
inline fun isAppRunning(packageName: String): Boolean = AppUtils.isAppRunning(packageName)

/**
 * Launch the application. This is equivalent to calling:
 * ```
 * AppUtils.launchApp(packageName)
 * ```
 */
inline fun launchApp(packageName: String) = AppUtils.launchApp(packageName)

/**
 * Relaunch the application. This is equivalent to calling:
 * ```
 * AppUtils.relaunchApp(isKillProcess)
 * ```
 */
inline fun relaunchApp(isKillProcess: Boolean = false) = AppUtils.relaunchApp(isKillProcess)

/**
 * Launch the details settings of application. This is equivalent to calling:
 * ```
 * AppUtils.launchAppDetailsSettings(packageName)
 * ```
 */
inline fun launchAppDetailsSettings(packageName: String) =
  AppUtils.launchAppDetailsSettings(packageName)

/**
 * Exit the application. This is equivalent to calling:
 * ```
 * AppUtils.exitApp()
 * ```
 */
inline fun exitApp() = AppUtils.exitApp()

/**
 * Return the icon of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppIcon()
 * ```
 */
inline val appIcon: Drawable get() = AppUtils.getAppIcon()

/**
 * Return the icon of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppIcon(packageName)
 * ```
 */
inline fun appIconOf(packageName: String): Drawable = AppUtils.getAppIcon(packageName)

/**
 * Return the package name of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppPackageName()
 * ```
 */
inline val packageName: String get() = AppUtils.getAppPackageName()

/**
 * Return the name of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppName()
 * ```
 */
inline val appName: String get() = AppUtils.getAppName()

/**
 * Return the name of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppName(packageName)
 * ```
 */
inline fun appNameOf(packageName: String): String = AppUtils.getAppName(packageName)

/**
 * Return the path of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppPath()
 * ```
 */
inline val appPath: String get() = AppUtils.getAppPath()

/**
 * Return the path of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppPath(packageName)
 * ```
 */
inline fun appPathOf(packageName: String): String = AppUtils.getAppPath(packageName)

/**
 * Return the version name of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppVersionName()
 * ```
 */
inline val appVersionName: String get() = AppUtils.getAppVersionName()

/**
 * Return the version name of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppVersionName(packageName)
 * ```
 */
inline fun appVersionNameOf(packageName: String): String = AppUtils.getAppVersionName(packageName)

/**
 * Return the version code of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppVersionCode()
 * ```
 */
inline val appVersionCode: Int get() = AppUtils.getAppVersionCode()

/**
 * Return the version code of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppVersionCode(packageName)
 * ```
 */
inline fun appVersionCodeOf(packageName: String): Int = AppUtils.getAppVersionCode(packageName)

/**
 * Return the signature of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppSignature()
 * ```
 */
inline val appSignature: Array<Signature> get() = AppUtils.getAppSignature()

/**
 * Return the signature of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppSignature(packageName)
 * ```
 */
inline fun appSignatureOf(packageName: String): Array<Signature> = AppUtils.getAppSignature(packageName)

/**
 * Return the signature of application for SHA1 value. This is equivalent to calling:
 * ```
 * AppUtils.getAppSignatureSHA1()
 * ```
 */
inline val appSignatureSHA1: String get() = AppUtils.getAppSignatureSHA1()

/**
 * Return the signature of application for SHA1 value. This is equivalent to calling:
 * ```
 * AppUtils.getAppSignatureSHA1(packageName)
 * ```
 */
inline fun appSignatureSHA1Of(packageName: String): String = AppUtils.getAppSignatureSHA1(packageName)

/**
 * Return the signature of application for SHA256 value. This is equivalent to calling:
 * ```
 * AppUtils.getAppSignatureSHA256()
 * ```
 */
inline val appSignatureSHA256: String get() = AppUtils.getAppSignatureSHA256()

/**
 * Return the signature of application for SHA256 value. This is equivalent to calling:
 * ```
 * AppUtils.getAppSignatureSHA256(packageName)
 * ```
 */
inline fun appSignatureSHA256Of(packageName: String): String = AppUtils.getAppSignatureSHA256(packageName)

/**
 * Return the signature of application for MD5 value. This is equivalent to calling:
 * ```
 *  AppUtils.getAppSignatureMD5()
 * ```
 */
inline val appSignatureMD5: String get() = AppUtils.getAppSignatureMD5()

/**
 * Return the signature of application for MD5 value. This is equivalent to calling:
 * ```
 *  AppUtils.getAppSignatureMD5(packageName)
 * ```
 */
inline fun appSignatureMD5Of(packageName: String): String = AppUtils.getAppSignatureMD5(packageName)

/**
 * Return the information of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppInfo()
 * ```
 */
inline val appInfo: AppUtils.AppInfo get() = AppUtils.getAppInfo()

/**
 * Return the information of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppInfo(packageName)
 * ```
 */
inline fun appInfoOf(packageName: String): AppUtils.AppInfo = AppUtils.getAppInfo(packageName)

/**
 * Return the information of applications. This is equivalent to calling:
 * ```
 * AppUtils.getAppsInfo()
 * ```
 */
inline val appsInfo: List<AppUtils.AppInfo> get() = AppUtils.getAppsInfo()

/**
 * Return the package information of application. This is equivalent to calling:
 * ```
 * AppUtils.getApkInfo(apkFile)
 * ```
 */
inline fun apkInfo(apkFile: File): AppUtils.AppInfo = AppUtils.getApkInfo(apkFile)

/**
 * Return the package information of application. This is equivalent to calling:
 * ```
 * AppUtils.getApkInfo(apkFilePath)
 * ```
 */
inline fun apkInfo(apkFilePath: String): AppUtils.AppInfo = AppUtils.getApkInfo(apkFilePath)