@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Activity
import android.app.Service
import android.content.BroadcastReceiver
import com.blankj.utilcode.util.MetaDataUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns the value of meta-data in application. This is equivalent to calling:
 * ```
 * MetaDataUtils.getMetaDataInApp(key)
 * ```
 */
inline fun appMetaDataOf(key: String): String = MetaDataUtils.getMetaDataInApp(key)

/**
 * Returns the value of meta-data in activity. This is equivalent to calling:
 * ```
 * MetaDataUtils.getMetaDataInActivity(activityClazz, key)
 * ```
 */
inline fun <reified T : Activity> activityMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInActivity(T::class.java, key)

/**
 * Returns the value of meta-data in activity. This is equivalent to calling:
 * ```
 * MetaDataUtils.getMetaDataInActivity(activity, key)
 * ```
 */
inline fun Activity.metaDataOf(key: String): String = MetaDataUtils.getMetaDataInActivity(this, key)

/**
 * Returns the value of meta-data in service. This is equivalent to calling:
 * ```
 * MetaDataUtils.getMetaDataInService(serviceClazz, key)
 * ```
 */
inline fun <reified T : Service> serviceMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInService(T::class.java, key)

/**
 * Returns the value of meta-data in service. This is equivalent to calling:
 * ```
 * MetaDataUtils.getMetaDataInService(service, key)
 * ```
 */
inline fun Service.metaDataOf(key: String): String = MetaDataUtils.getMetaDataInService(this, key)

/**
 * Returns the value of meta-data in receiver. This is equivalent to calling:
 * ```
 * MetaDataUtils.getMetaDataInReceiver(broadcastReceiverClazz, key)
 * ```
 */
inline fun <reified T : BroadcastReceiver> receiverMetaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInReceiver(T::class.java, key)

/**
 * Returns the value of meta-data in receiver. This is equivalent to calling:
 * ```
 * MetaDataUtils.getMetaDataInReceiver(broadcastReceiver, key)
 * ```
 */
inline fun BroadcastReceiver.metaDataOf(key: String): String =
  MetaDataUtils.getMetaDataInReceiver(this, key)