@file:Suppress("unused")

package com.dylanc.utilktx

import android.content.ServiceConnection
import com.blankj.utilcode.util.ServiceUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
val allRunningServiceNames: Set<String>
  get() {
    val set = mutableSetOf<String>()
    for (serviceName in ServiceUtils.getAllRunningServices()) {
      set.add(serviceName as String)
    }
    return set
  }

inline fun <reified T> startService() =
  ServiceUtils.startService(T::class.java)

fun startService(className: String) =
  ServiceUtils.startService(className)

inline fun <reified T> stopService() =
  ServiceUtils.stopService(T::class.java)

fun stopService(className: String) =
  ServiceUtils.stopService(className)

inline fun <reified T> bindService(conn: ServiceConnection, flags: Int) =
  ServiceUtils.bindService(T::class.java, conn, flags)

fun bindService(className: String, conn: ServiceConnection, flags: Int) =
  ServiceUtils.bindService(className, conn, flags)

fun unbindService(conn: ServiceConnection) =
  ServiceUtils.unbindService(conn)

inline fun <reified T> isServiceRunning() =
  ServiceUtils.isServiceRunning(T::class.java)

fun isServiceRunning(className: String) =
  ServiceUtils.isServiceRunning(className)