@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.PathUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns the path of file. This is equivalent to calling:
 * ```
 * PathUtils.join(parent, child)
 * ```
 */
inline fun pathOf(parent: String, child: String): String = PathUtils.join(parent, child)

/**
 * Returns the path of /system. This is equivalent to calling:
 * ```
 * PathUtils.getRootPath()
 * ```
 */
inline val rootPath: String get() = PathUtils.getRootPath()

/**
 * Returns the path of /data. This is equivalent to calling:
 * ```
 * PathUtils.getDataPath()
 * ```
 */
inline val dataPath: String get() = PathUtils.getDataPath()

/**
 * Returns the path of /cache. This is equivalent to calling:
 * ```
 * PathUtils.getDownloadCachePath()
 * ```
 */
inline val downloadCachePath: String get() = PathUtils.getDownloadCachePath()

/**
 * Returns the path of /data/data/package. This is equivalent to calling:
 * ```
 * PathUtils.getInternalAppDataPath()
 * ```
 */
inline val internalAppDataPath: String get() = PathUtils.getInternalAppDataPath()

/**
 * Returns the path of /data/data/package/code_cache. This is equivalent to calling:
 * ```
 * PathUtils.getInternalAppCodeCacheDir()
 * ```
 */
inline val internalAppCodeCacheDir: String get() = PathUtils.getInternalAppCodeCacheDir()

/**
 * Returns the path of /data/data/package/cache. This is equivalent to calling:
 * ```
 * PathUtils.getInternalAppCachePath()
 * ```
 */
inline val internalAppCachePath: String get() = PathUtils.getInternalAppCachePath()

/**
 * Returns the path of /data/data/package/databases. This is equivalent to calling:
 * ```
 * PathUtils.getInternalAppDbsPath()
 * ```
 */
inline val internalAppDbsPath: String get() = PathUtils.getInternalAppDbsPath()

/**
 * Returns the path of /data/data/package/databases/name. This is equivalent to calling:
 * ```
 * PathUtils.getInternalAppDbsPath(name)
 * ```
 */
inline fun internalAppDbPathOf(name: String): String = PathUtils.getInternalAppDbPath(name)

/**
 * Returns the path of /data/data/package/files. This is equivalent to calling:
 * ```
 * PathUtils.getInternalAppFilesPath()
 * ```
 */
inline val internalAppFilesPath: String get() = PathUtils.getInternalAppFilesPath()

/**
 * Returns the path of /data/data/package/shared_prefs. This is equivalent to calling:
 * ```
 * PathUtils.getInternalAppSpPath()
 * ```
 */
inline val internalAppSpPath: String get() = PathUtils.getInternalAppSpPath()

/**
 * Returns the path of /data/data/package/no_backup. This is equivalent to calling:
 * ```
 * PathUtils.getInternalAppNoBackupFilesPath()
 * ```
 */
inline val internalAppNoBackupFilesPath: String get() = PathUtils.getInternalAppNoBackupFilesPath()

/**
 * Returns the path of /storage/emulated/0. This is equivalent to calling:
 * ```
 * PathUtils.getExternalStoragePath()
 * ```
 */
inline val externalStoragePath: String get() = PathUtils.getExternalStoragePath()

/**
 * Returns the path of /storage/emulated/0/Music. This is equivalent to calling:
 * ```
 * PathUtils.getExternalMusicPath()
 * ```
 */
inline val externalMusicPath: String get() = PathUtils.getExternalMusicPath()

/**
 * Returns the path of /storage/emulated/0/Podcasts. This is equivalent to calling:
 * ```
 * PathUtils.getExternalPodcastsPath()
 * ```
 */
inline val externalPodcastsPath: String get() = PathUtils.getExternalPodcastsPath()

/**
 * Returns the path of /storage/emulated/0/Ringtones. This is equivalent to calling:
 * ```
 * PathUtils.getExternalRingtonesPath()
 * ```
 */
inline val externalRingtonesPath: String get() = PathUtils.getExternalRingtonesPath()

/**
 * Returns the path of /storage/emulated/0/Alarms. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAlarmsPath()
 * ```
 */
inline val externalAlarmsPath: String get() = PathUtils.getExternalAlarmsPath()

/**
 * Returns the path of /storage/emulated/0/Notifications. This is equivalent to calling:
 * ```
 * PathUtils.getExternalNotificationsPath()
 * ```
 */
inline val externalNotificationsPath: String get() = PathUtils.getExternalNotificationsPath()

/**
 * Returns the path of /storage/emulated/0/Pictures. This is equivalent to calling:
 * ```
 * PathUtils.getExternalPicturesPath()
 * ```
 */
inline val externalPicturesPath: String get() = PathUtils.getExternalPicturesPath()

/**
 * Returns the path of /storage/emulated/0/Movies. This is equivalent to calling:
 * ```
 * PathUtils.getExternalMoviesPath()
 * ```
 */
inline val externalMoviesPath: String get() = PathUtils.getExternalMoviesPath()

/**
 * Returns the path of /storage/emulated/0/Download. This is equivalent to calling:
 * ```
 * PathUtils.getExternalDownloadsPath()
 * ```
 */
inline val externalDownloadsPath: String get() = PathUtils.getExternalDownloadsPath()

/**
 * Returns the path of /storage/emulated/0/DCIM. This is equivalent to calling:
 * ```
 * PathUtils.getExternalDcimPath()
 * ```
 */
inline val externalDcimPath: String get() = PathUtils.getExternalDcimPath()

/**
 * Returns the path of /storage/emulated/0/Android/data/package. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppDataPath()
 * ```
 */
inline val externalAppDataPath: String get() = PathUtils.getExternalAppDataPath()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/cache. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppCachePath()
 * ```
 */
inline val externalAppCachePath: String get() = PathUtils.getExternalAppCachePath()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/files. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppFilesPath()
 * ```
 */
inline val externalAppFilesPath: String get() = PathUtils.getExternalAppFilesPath()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/files/Music. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppMusicPath()
 * ```
 */
inline val externalAppMusicPath: String get() = PathUtils.getExternalAppMusicPath()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/files/Podcasts. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppPodcastsPath()
 * ```
 */
inline val externalAppPodcastsPath: String get() = PathUtils.getExternalAppPodcastsPath()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/files/Ringtones. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppRingtonesPath()
 * ```
 */
inline val externalAppRingtonesPath: String get() = PathUtils.getExternalAppRingtonesPath()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/files/Alarms. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppAlarmsPath()
 * ```
 */
inline val externalAppAlarmsPath: String get() = PathUtils.getExternalAppAlarmsPath()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/files/Notifications. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppNotificationsPath()
 * ```
 */
inline val externalAppNotificationsPath: String get() = PathUtils.getExternalAppNotificationsPath()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/files/Pictures. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppPicturesPath()
 * ```
 */
inline val externalAppPicturesPath: String get() = PathUtils.getExternalAppPicturesPath()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/files/Movies. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppMoviesPath()
 * ```
 */
inline val externalAppMoviesPath: String get() = PathUtils.getExternalAppMoviesPath()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/files/Download. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppDownloadPath()
 * ```
 */
inline val externalAppDownloadPath: String get() = PathUtils.getExternalAppDownloadPath()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/files/DCIM. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppDcimPath()
 * ```
 */
inline val externalAppDcimPath: String get() = PathUtils.getExternalAppDcimPath()

/**
 * Returns the path of /storage/emulated/0/Android/obb/package. This is equivalent to calling:
 * ```
 * PathUtils.getExternalAppObbPath()
 * ```
 */
inline val externalAppObbPath: String get() = PathUtils.getExternalAppObbPath()

/**
 * Returns the path of /storage/emulated/0 first. If null, returns the path of /system. This is equivalent to calling:
 * ```
 * PathUtils.getRootPathExternalFirst()
 * ```
 */
inline val rootPathForExternalFirst: String get() = PathUtils.getRootPathExternalFirst()

/**
 * Returns the path of /storage/emulated/0/Android/data/package first. If null, returns the path of /data/data/package.
 * This is equivalent to calling:
 * ```
 * PathUtils.getAppDataPathExternalFirst()
 * ```
 */
inline val appDataPathForExternalFirst: String get() = PathUtils.getAppDataPathExternalFirst()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/files first. If null, returns the path of /data/data/package/files.
 * This is equivalent to calling:
 * ```
 * PathUtils.getFilesPathExternalFirst()
 * ```
 */
inline val filesPathForExternalFirst: String get() = PathUtils.getFilesPathExternalFirst()

/**
 * Returns the path of /storage/emulated/0/Android/data/package/cache first. If null, returns the path of /data/data/package/cache.
 * This is equivalent to calling:
 * ```
 * PathUtils.getCachePathExternalFirst()
 * ```
 */
inline val cachePathForExternalFirst: String get() = PathUtils.getCachePathExternalFirst()