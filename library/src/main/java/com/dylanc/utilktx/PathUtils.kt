@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.PathUtils

/**
 * @author Dylan Cai
 */

inline fun pathOf(parent: String, child: String): String = PathUtils.join(parent, child)

inline val rootPath: String get() = PathUtils.getRootPath()

inline val dataPath: String get() = PathUtils.getDataPath()

inline val downloadCachePath: String get() = PathUtils.getDownloadCachePath()

inline val internalAppDataPath: String get() = PathUtils.getInternalAppDataPath()

inline val internalAppCodeCacheDir: String get() = PathUtils.getInternalAppCodeCacheDir()

inline val internalAppCachePath: String get() = PathUtils.getInternalAppCachePath()

inline val internalAppDbsPath: String get() = PathUtils.getInternalAppDbsPath()

inline fun internalAppDbPathOf(name: String): String = PathUtils.getInternalAppDbPath(name)

inline val internalAppFilesPath: String get() = PathUtils.getInternalAppFilesPath()

inline val internalAppSpPath: String get() = PathUtils.getInternalAppSpPath()

inline val internalAppNoBackupFilesPath: String get() = PathUtils.getInternalAppNoBackupFilesPath()

inline val externalStoragePath: String get() = PathUtils.getExternalStoragePath()

inline val externalMusicPath: String get() = PathUtils.getExternalMusicPath()

inline val externalPodcastsPath: String get() = PathUtils.getExternalPodcastsPath()

inline val externalRingtonesPath: String get() = PathUtils.getExternalRingtonesPath()

inline val externalAlarmsPath: String get() = PathUtils.getExternalAlarmsPath()

inline val externalNotificationsPath: String get() = PathUtils.getExternalNotificationsPath()

inline val externalPicturesPath: String get() = PathUtils.getExternalPicturesPath()

inline val externalMoviesPath: String get() = PathUtils.getExternalMoviesPath()

inline val externalDownloadsPath: String get() = PathUtils.getExternalDownloadsPath()

inline val externalDcimPath: String get() = PathUtils.getExternalDcimPath()

inline val externalAppDataPath: String get() = PathUtils.getExternalAppDataPath()

inline val externalAppCachePath: String get() = PathUtils.getExternalAppCachePath()

inline val externalAppFilesPath: String get() = PathUtils.getExternalAppFilesPath()

inline val externalAppMusicPath: String get() = PathUtils.getExternalAppMusicPath()

inline val externalAppPodcastsPath: String get() = PathUtils.getExternalAppPodcastsPath()

inline val externalAppRingtonesPath: String get() = PathUtils.getExternalAppRingtonesPath()

inline val externalAppAlarmsPath: String get() = PathUtils.getExternalAppAlarmsPath()

inline val externalAppNotificationsPath: String get() = PathUtils.getExternalAppNotificationsPath()

inline val externalAppPicturesPath: String get() = PathUtils.getExternalAppPicturesPath()

inline val externalAppMoviesPath: String get() = PathUtils.getExternalAppMoviesPath()

inline val externalAppDownloadPath: String get() = PathUtils.getExternalAppDownloadPath()

inline val externalAppDcimPath: String get() = PathUtils.getExternalAppDcimPath()

inline val externalAppObbPath: String get() = PathUtils.getExternalAppObbPath()

inline val rootPathExternalFirst: String get() = PathUtils.getRootPathExternalFirst()

inline val appDataPathExternalFirst: String get() = PathUtils.getAppDataPathExternalFirst()

inline val filesPathExternalFirst: String get() = PathUtils.getFilesPathExternalFirst()

inline val cachePathExternalFirst: String get() = PathUtils.getCachePathExternalFirst()