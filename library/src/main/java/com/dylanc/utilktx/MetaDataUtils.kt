@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Activity
import android.app.Service
import android.content.BroadcastReceiver
import com.blankj.utilcode.util.MetaDataUtils

/**
 * @author Dylan Cai
 */

inline fun appMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInApp(key)

inline fun <reified T : Activity> activityMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInActivity(T::class.java, key)

inline fun Activity.metaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInActivity(this, key)

inline fun <reified T : Service> serviceMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInService(T::class.java, key)

inline fun Service.metaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInService(this, key)

inline fun <reified T : BroadcastReceiver> receiverMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInReceiver(T::class.java, key)

inline fun BroadcastReceiver.metaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInReceiver(this, key)