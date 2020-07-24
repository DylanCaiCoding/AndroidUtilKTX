package com.dylanc.utilktx

import com.blankj.utilcode.util.PathUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */

fun joinPath(parent: String, child: String): String =
  PathUtils.join(parent, child)

val rootPath: String
  get() = PathUtils.getRootPath()

val dataPath: String
  get() = PathUtils.getDataPath()

val downloadCachePath: String
  get() = PathUtils.getDownloadCachePath()

val internalAppDataPath: String
  get() = PathUtils.getInternalAppDataPath()

val internalAppCodeCacheDir: String
  get() = PathUtils.getInternalAppCodeCacheDir()

val internalAppCachePath: String
  get() = PathUtils.getInternalAppCachePath()

val internalAppDbsPath: String
  get() = PathUtils.getInternalAppDbsPath()

fun internalAppDbPathOf(name:String): String =
  PathUtils.getInternalAppDbPath(name)

val internalAppFilesPath: String
  get() = PathUtils.getInternalAppFilesPath()

val internalAppSpPath: String
  get() = PathUtils.getInternalAppSpPath()

val internalAppNoBackupFilesPath: String
  get() = PathUtils.getInternalAppNoBackupFilesPath()

val externalStoragePath: String
  get() = PathUtils.getExternalStoragePath()

val externalMusicPath: String
  get() = PathUtils.getExternalMusicPath()

val externalPodcastsPath: String
  get() = PathUtils.getExternalPodcastsPath()

val externalRingtonesPath: String
  get() = PathUtils.getExternalRingtonesPath()

val externalAlarmsPath: String
  get() = PathUtils.getExternalAlarmsPath()

val externalNotificationsPath: String
  get() = PathUtils.getExternalNotificationsPath()

val externalPicturesPath: String
  get() = PathUtils.getExternalPicturesPath()

val externalMoviesPath: String
  get() = PathUtils.getExternalMoviesPath()

val externalDownloadsPath: String
  get() = PathUtils.getExternalDownloadsPath()

val externalDcimPath: String
  get() = PathUtils.getExternalDcimPath()

val externalAppDataPath: String
  get() = PathUtils.getExternalAppDataPath()

val externalAppCachePath: String
  get() = PathUtils.getExternalAppCachePath()

val externalAppFilesPath: String
  get() = PathUtils.getExternalAppFilesPath()

val externalAppMusicPath: String
  get() = PathUtils.getExternalAppMusicPath()

val externalAppPodcastsPath: String
  get() = PathUtils.getExternalAppPodcastsPath()

val externalAppRingtonesPath: String
  get() = PathUtils.getExternalAppRingtonesPath()

val externalAppAlarmsPath: String
  get() = PathUtils.getExternalAppAlarmsPath()

val externalAppNotificationsPath: String
  get() = PathUtils.getExternalAppNotificationsPath()

val externalAppPicturesPath: String
  get() = PathUtils.getExternalAppPicturesPath()

val externalAppMoviesPath: String
  get() = PathUtils.getExternalAppMoviesPath()

val externalAppDownloadPath: String
  get() = PathUtils.getExternalAppDownloadPath()

val externalAppDcimPath: String
  get() = PathUtils.getExternalAppDcimPath()

val externalAppObbPath: String
  get() = PathUtils.getExternalAppObbPath()

val rootPathExternalFirst: String
  get() = PathUtils.getRootPathExternalFirst()

val appDataPathExternalFirst: String
  get() = PathUtils.getAppDataPathExternalFirst()

val filesPathExternalFirst: String
  get() = PathUtils.getFilesPathExternalFirst()

val cachePathExternalFirst: String
  get() = PathUtils.getCachePathExternalFirst()