@file:Suppress("unused")

package com.dylanc.utilktx

import android.app.Activity
import android.app.Service
import android.content.BroadcastReceiver
import com.blankj.utilcode.util.MetaDataUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
fun appMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInApp(key)

inline fun <reified T : Activity> activityMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInActivity(T::class.java, key)

fun Activity.activityMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInActivity(this, key)

inline fun <reified T : Service> serviceMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInService(T::class.java, key)

fun Service.serviceMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInService(this, key)

inline fun <reified T : BroadcastReceiver> receiverMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInReceiver(T::class.java, key)

fun BroadcastReceiver.receiverMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInReceiver(this, key)