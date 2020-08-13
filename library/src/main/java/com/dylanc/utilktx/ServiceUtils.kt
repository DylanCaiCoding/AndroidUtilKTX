@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Service
import android.content.ServiceConnection
import com.blankj.utilcode.util.ServiceUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns all of the services are running. This is equivalent to calling:
 * ```
 * ServiceUtils.getAllRunningServices()
 * ```
 */
inline val allRunningServiceNames: Set<String>
  get() = mutableSetOf<String>().apply {
    for (serviceName in ServiceUtils.getAllRunningServices()) {
      if (serviceName is String) add(serviceName)
    }
  }

/**
 * Starts the service. This is equivalent to calling:
 * ```
 * ServiceUtils.startService(serviceClazz)
 * ```
 */
inline fun <reified T : Service> startService() = ServiceUtils.startService(T::class.java)

/**
 * Starts the service. This is equivalent to calling:
 * ```
 * ServiceUtils.startService(className)
 * ```
 */
inline fun startService(className: String) = ServiceUtils.startService(className)

/**
 * Stops the service. This is equivalent to calling:
 * ```
 * ServiceUtils.stopService(serviceClazz)
 * ```
 */
inline fun <reified T : Service> stopService() = ServiceUtils.stopService(T::class.java)

/**
 * Stops the service. This is equivalent to calling:
 * ```
 * ServiceUtils.stopService(className)
 * ```
 */
inline fun stopService(className: String) = ServiceUtils.stopService(className)

/**
 * Binds the service. This is equivalent to calling:
 * ```
 * ServiceUtils.bindService(serviceClazz, connection, flags)
 * ```
 */
inline fun <reified T : Service> bindService(connection: ServiceConnection, flags: Int) =
  ServiceUtils.bindService(T::class.java, connection, flags)

/**
 * Binds the service. This is equivalent to calling:
 * ```
 * ServiceUtils.bindService(className, connection, flags)
 * ```
 */
inline fun bindService(className: String, conn: ServiceConnection, flags: Int) =
  ServiceUtils.bindService(className, conn, flags)

/**
 * Unbinds the service. This is equivalent to calling:
 * ```
 * ServiceUtils.unbindService(connection)
 * ```
 */
inline fun unbindService(conn: ServiceConnection) = ServiceUtils.unbindService(conn)

/**
 * Returns whether the service is running. This is equivalent to calling:
 * ```
 * ServiceUtils.isServiceRunning(serviceClazz)
 * ```
 */
inline fun <reified T : Service> isServiceRunning() = ServiceUtils.isServiceRunning(T::class.java)

/**
 * Returns whether the service is running. This is equivalent to calling:
 * ```
 * ServiceUtils.isServiceRunning(className)
 * ```
 */
inline fun isServiceRunning(className: String) = ServiceUtils.isServiceRunning(className)