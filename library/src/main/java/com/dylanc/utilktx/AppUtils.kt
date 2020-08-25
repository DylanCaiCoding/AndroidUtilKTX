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
 * Returns the Application object. Main process get app by UtilsFileProvider,
 * and other process get app by reflect.. This is equivalent to calling:
 * ```
 * Utils.getApp()
 * ```
 */
inline val application: Application get() = Utils.getApp()

/**
 * Registers the status of application changed listener. This is equivalent to calling:
 * ```
 * AppUtils.registerAppStatusChangedListener(listener)
 * ```
 */
inline fun registerAppStatusChangedListener(listener: Utils.OnAppStatusChangedListener) =
  AppUtils.registerAppStatusChangedListener(listener)

/**
 * Unregisters the status of application changed listener. This is equivalent to calling:
 * ```
 * AppUtils.unregisterAppStatusChangedListener(listener)
 * ```
 */
inline fun unregisterAppStatusChangedListener(listener: Utils.OnAppStatusChangedListener) =
  AppUtils.unregisterAppStatusChangedListener(listener)

/**
 * Installs the app. This is equivalent to calling:
 * ```
 * AppUtils.installApp(file)
 * ```
 */
@RequiresApi(Build.VERSION_CODES.M)
@RequiresPermission(REQUEST_INSTALL_PACKAGES)
inline fun installApp(file: File) = AppUtils.installApp(file)

/**
 * Installs the app. This is equivalent to calling:
 * ```
 * AppUtils.installApp(filePath)
 * ```
 */
@RequiresApi(Build.VERSION_CODES.M)
@RequiresPermission(REQUEST_INSTALL_PACKAGES)
inline fun installApp(filePath: String) = AppUtils.installApp(filePath)

/**
 * Uninstalls the app. This is equivalent to calling:
 * ```
 * AppUtils.uninstallApp(packageName)
 * ```
 */
@RequiresApi(Build.VERSION_CODES.O)
@RequiresPermission(REQUEST_DELETE_PACKAGES)
inline fun uninstallApp(packageName: String) = AppUtils.uninstallApp(packageName)

/**
 * Returns whether the app is installed. This is equivalent to calling:
 * ```
 * AppUtils.isAppInstalled(packageName)
 * ```
 */
inline fun isAppInstalled(packageName: String): Boolean = AppUtils.isAppInstalled(packageName)

/**
 * Returns whether the application with root permission. This is equivalent to calling:
 * ```
 * AppUtils.isAppRoot()
 * ```
 */
inline val isAppRoot: Boolean get() = AppUtils.isAppRoot()

/**
 * Returns whether it is a debug application. This is equivalent to calling:
 * ```
 * AppUtils.isAppDebug()
 * ```
 */
inline val isAppDebug: Boolean get() = AppUtils.isAppDebug()

/**
 * Returns whether it is a debug application. This is equivalent to calling:
 * ```
 * AppUtils.isAppDebug(packageName)
 * ```
 */
inline fun isAppDebug(packageName: String): Boolean = AppUtils.isAppDebug(packageName)

/**
 * Returns whether it is a system application. This is equivalent to calling:
 * ```
 * AppUtils.isAppSystem()
 * ```
 */
inline val isAppSystem: Boolean get() = AppUtils.isAppSystem()

/**
 * Returns whether it is a system application. This is equivalent to calling:
 * ```
 * AppUtils.isAppSystem(packageName)
 * ```
 */
inline fun isAppSystem(packageName: String): Boolean = AppUtils.isAppSystem(packageName)

/**
 * Returns whether application is foreground. This is equivalent to calling:
 * ```
 * AppUtils.isAppForeground()
 * ```
 */
inline val isAppForeground: Boolean get() = AppUtils.isAppForeground()

/**
 * Returns whether application is foreground. This is equivalent to calling:
 * ```
 * AppUtils.isAppForeground(packageName)
 * ```
 */
inline fun isAppForeground(packageName: String): Boolean = AppUtils.isAppForeground(packageName)

/**
 * Returns whether application is running. This is equivalent to calling:
 * ```
 * AppUtils.isAppRunning(packageName)
 * ```
 */
inline fun isAppRunning(packageName: String): Boolean = AppUtils.isAppRunning(packageName)

/**
 * Launches the application. This is equivalent to calling:
 * ```
 * AppUtils.launchApp(packageName)
 * ```
 */
inline fun launchApp(packageName: String) = AppUtils.launchApp(packageName)

/**
 * Relaunches the application. This is equivalent to calling:
 * ```
 * AppUtils.relaunchApp(isKillProcess)
 * ```
 */
inline fun relaunchApp(isKillProcess: Boolean = false) = AppUtils.relaunchApp(isKillProcess)

/**
 * Launches the details settings of application. This is equivalent to calling:
 * ```
 * AppUtils.launchAppDetailsSettings(packageName)
 * ```
 */
inline fun launchAppDetailsSettings(packageName: String) =
  AppUtils.launchAppDetailsSettings(packageName)

/**
 * Exits the application. This is equivalent to calling:
 * ```
 * AppUtils.exitApp()
 * ```
 */
inline fun exitApp() = AppUtils.exitApp()

/**
 * Returns the icon of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppIcon()
 * ```
 */
inline val appIcon: Drawable get() = AppUtils.getAppIcon()

/**
 * Returns the icon of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppIcon(packageName)
 * ```
 */
inline fun appIconOf(packageName: String): Drawable = AppUtils.getAppIcon(packageName)

/**
 * Returns the package name of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppPackageName()
 * ```
 */
inline val packageName: String get() = AppUtils.getAppPackageName()

/**
 * Returns the name of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppName()
 * ```
 */
inline val appName: String get() = AppUtils.getAppName()

/**
 * Returns the name of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppName(packageName)
 * ```
 */
inline fun appNameOf(packageName: String): String = AppUtils.getAppName(packageName)

/**
 * Returns the path of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppPath()
 * ```
 */
inline val appPath: String get() = AppUtils.getAppPath()

/**
 * Returns the path of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppPath(packageName)
 * ```
 */
inline fun appPathOf(packageName: String): String = AppUtils.getAppPath(packageName)

/**
 * Returns the version name of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppVersionName()
 * ```
 */
inline val appVersionName: String get() = AppUtils.getAppVersionName()

/**
 * Returns the version name of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppVersionName(packageName)
 * ```
 */
inline fun appVersionNameOf(packageName: String): String = AppUtils.getAppVersionName(packageName)

/**
 * Returns the version code of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppVersionCode()
 * ```
 */
inline val appVersionCode: Int get() = AppUtils.getAppVersionCode()

/**
 * Returns the version code of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppVersionCode(packageName)
 * ```
 */
inline fun appVersionCodeOf(packageName: String): Int = AppUtils.getAppVersionCode(packageName)

/**
 * Returns the signature of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppSignature()
 * ```
 */
inline val appSignature: Array<Signature> get() = AppUtils.getAppSignature()

/**
 * Returns the signature of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppSignature(packageName)
 * ```
 */
inline fun appSignatureOf(packageName: String): Array<Signature> = AppUtils.getAppSignature(packageName)

/**
 * Returns the signature of application for SHA1 value. This is equivalent to calling:
 * ```
 * AppUtils.getAppSignatureSHA1()
 * ```
 */
inline val appSignatureSHA1: String get() = AppUtils.getAppSignatureSHA1()

/**
 * Returns the signature of application for SHA1 value. This is equivalent to calling:
 * ```
 * AppUtils.getAppSignatureSHA1(packageName)
 * ```
 */
inline fun appSignatureSHA1Of(packageName: String): String = AppUtils.getAppSignatureSHA1(packageName)

/**
 * Returns the signature of application for SHA256 value. This is equivalent to calling:
 * ```
 * AppUtils.getAppSignatureSHA256()
 * ```
 */
inline val appSignatureSHA256: String get() = AppUtils.getAppSignatureSHA256()

/**
 * Returns the signature of application for SHA256 value. This is equivalent to calling:
 * ```
 * AppUtils.getAppSignatureSHA256(packageName)
 * ```
 */
inline fun appSignatureSHA256Of(packageName: String): String = AppUtils.getAppSignatureSHA256(packageName)

/**
 * Returns the signature of application for MD5 value. This is equivalent to calling:
 * ```
 *  AppUtils.getAppSignatureMD5()
 * ```
 */
inline val appSignatureMD5: String get() = AppUtils.getAppSignatureMD5()

/**
 * Returns the signature of application for MD5 value. This is equivalent to calling:
 * ```
 *  AppUtils.getAppSignatureMD5(packageName)
 * ```
 */
inline fun appSignatureMD5Of(packageName: String): String = AppUtils.getAppSignatureMD5(packageName)

/**
 * Returns the information of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppInfo()
 * ```
 */
inline val appInfo: AppUtils.AppInfo get() = AppUtils.getAppInfo()

/**
 * Returns the information of application. This is equivalent to calling:
 * ```
 * AppUtils.getAppInfo(packageName)
 * ```
 */
inline fun appInfoOf(packageName: String): AppUtils.AppInfo = AppUtils.getAppInfo(packageName)

/**
 * Returns the information of applications. This is equivalent to calling:
 * ```
 * AppUtils.getAppsInfo()
 * ```
 */
inline val appsInfo: List<AppUtils.AppInfo> get() = AppUtils.getAppsInfo()

/**
 * Returns the package information of application. This is equivalent to calling:
 * ```
 * AppUtils.getApkInfo(apkFile)
 * ```
 */
inline fun apkInfo(apkFile: File): AppUtils.AppInfo = AppUtils.getApkInfo(apkFile)

/**
 * Returns the package information of application. This is equivalent to calling:
 * ```
 * AppUtils.getApkInfo(apkFilePath)
 * ```
 */
inline fun apkInfo(apkFilePath: String): AppUtils.AppInfo = AppUtils.getApkInfo(apkFilePath)