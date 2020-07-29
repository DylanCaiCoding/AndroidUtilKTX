@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.content.ServiceConnection
import com.blankj.utilcode.util.ServiceUtils

/**
 * @author Dylan Cai
 */

inline val allRunningServiceNames: Set<String>
  get() = mutableSetOf<String>().apply {
    for (serviceName in ServiceUtils.getAllRunningServices()) {
      add(serviceName as String)
    }
  }

inline fun <reified T> startService() =
  ServiceUtils.startService(T::class.java)

inline fun startService(className: String) =
  ServiceUtils.startService(className)

inline fun <reified T> stopService() =
  ServiceUtils.stopService(T::class.java)

inline fun stopService(className: String) =
  ServiceUtils.stopService(className)

inline fun <reified T> bindService(conn: ServiceConnection, flags: Int) =
  ServiceUtils.bindService(T::class.java, conn, flags)

inline fun bindService(className: String, conn: ServiceConnection, flags: Int) =
  ServiceUtils.bindService(className, conn, flags)

inline fun unbindService(conn: ServiceConnection) =
  ServiceUtils.unbindService(conn)

inline fun <reified T> isServiceRunning() =
  ServiceUtils.isServiceRunning(T::class.java)

inline fun isServiceRunning(className: String) =
  ServiceUtils.isServiceRunning(className)