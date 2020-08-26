@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission.*
import androidx.annotation.RequiresPermission
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import com.blankj.utilcode.util.NetworkUtils
import com.blankj.utilcode.util.Utils

/**
 * @author Dylan Cai
 */

/**
 * Opens the settings of wireless. This is equivalent to calling:
 * ```
 * NetworkUtils.openWirelessSettings()
 * ```
 */
inline fun openWirelessSettings() = NetworkUtils.openWirelessSettings()

/**
 * Returns whether network is connected. This is equivalent to calling:
 * ```
 * NetworkUtils.isConnected()
 * ```
 */
inline val isNetworkConnected: Boolean
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.isConnected()

/**
 * Returns whether network is available. This is equivalent to calling:
 * ```
 * NetworkUtils.isAvailable()
 * ```
 */
inline val isNetworkAvailable: Boolean
  @RequiresPermission(INTERNET)
  get() = NetworkUtils.isAvailable()

/**
 * Returns whether network is available. This is equivalent to calling:
 * ```
 * NetworkUtils.isAvailableAsync(callback)
 * ```
 */
@RequiresPermission(INTERNET)
inline fun isNetworkAvailable(noinline callback: (Boolean) -> Unit): Utils.Task<Boolean> =
  NetworkUtils.isAvailableAsync(callback)

/**
 * Returns whether network is available using ping. This is equivalent to calling:
 * ```
 * NetworkUtils.isAvailableByPing()
 * ```
 */
inline val isNetworkAvailableByPing: Boolean
  @RequiresPermission(INTERNET)
  get() = NetworkUtils.isAvailableByPing()

/**
 * Returns whether network is available using ping. This is equivalent to calling:
 * ```
 * NetworkUtils.isAvailableByPingAsync(ip, callback)
 * ```
 */
@RequiresPermission(INTERNET)
inline fun isNetworkAvailableByPing(ip: String = "", noinline callback: (Boolean) -> Unit): Utils.Task<Boolean> =
  NetworkUtils.isAvailableByPingAsync(ip, callback)

/**
 * Returns whether network is available using domain. This is equivalent to calling:
 * ```
 * NetworkUtils.isAvailableByDns(domain)
 * ```
 */
@RequiresPermission(INTERNET)
inline fun isNetworkAvailableByDns(domain: String = ""): Boolean =
  NetworkUtils.isAvailableByDns(domain)

/**
 * Returns whether network is available using domain. This is equivalent to calling:
 * ```
 * NetworkUtils.isAvailableByDnsAsync(domain, callback)
 * ```
 */
@RequiresPermission(INTERNET)
inline fun isNetworkAvailableByDns(domain: String = "", noinline callback: (Boolean) -> Unit): Utils.Task<Any> =
  NetworkUtils.isAvailableByDnsAsync(domain, callback)

/**
 * Returns whether mobile data is enabled. This is equivalent to calling:
 * ```
 * NetworkUtils.getMobileDataEnabled()
 * ```
 */
inline val isMobileDataEnabled: Boolean get() = NetworkUtils.getMobileDataEnabled()

/**
 * Returns whether using mobile data. This is equivalent to calling:
 * ```
 * NetworkUtils.isMobileData()
 * ```
 */
inline val isMobileDataNetwork: Boolean
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.isMobileData()

/**
 * Returns whether using 4G. This is equivalent to calling:
 * ```
 * NetworkUtils.is4G()
 * ```
 */
inline val is4G: Boolean
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.is4G()

/**
 * Returns whether wifi is enabled or enables wifi. This is equivalent to calling:
 * ```
 * NetworkUtils.getWifiEnabled()
 * ```
 * or
 * ```
 * NetworkUtils.setWifiEnabled(enabled)
 * ```
 */
inline var isWifiEnabled: Boolean
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getWifiEnabled()
  @RequiresPermission(CHANGE_WIFI_STATE)
  set(value) = NetworkUtils.setWifiEnabled(value)

/**
 * Returns whether wifi is connected. This is equivalent to calling:
 * ```
 * NetworkUtils.isWifiConnected()
 * ```
 */
inline val isWifiConnected: Boolean
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.isWifiConnected()

/**
 * Returns whether wifi is available. This is equivalent to calling:
 * ```
 * NetworkUtils.isWifiAvailable()
 * ```
 */
inline val isWifiAvailable: Boolean
  @RequiresPermission(allOf = [ACCESS_WIFI_STATE, INTERNET])
  get() = NetworkUtils.isWifiAvailable()

/**
 * Returns whether wifi is available. This is equivalent to calling:
 * ```
 * NetworkUtils.isWifiAvailableAsync(callback)
 * ```
 */
@RequiresPermission(allOf = [ACCESS_WIFI_STATE, INTERNET])
inline fun isWifiAvailable(noinline callback: (Boolean) -> Unit): Utils.Task<Boolean> =
  NetworkUtils.isWifiAvailableAsync(callback)

/**
 * Returns the name of network operate. This is equivalent to calling:
 * ```
 * NetworkUtils.getNetworkOperatorName()
 * ```
 */
inline val networkOperatorName: String get() = NetworkUtils.getNetworkOperatorName()

/**
 * Returns type of network. This is equivalent to calling:
 * ```
 * NetworkUtils.getNetworkType()
 * ```
 *
 * @return type of network
 * - [NetworkUtils.NetworkType.NETWORK_ETHERNET]
 * - [NetworkUtils.NetworkType.NETWORK_WIFI]
 * - [NetworkUtils.NetworkType.NETWORK_4G]
 * - [NetworkUtils.NetworkType.NETWORK_3G]
 * - [NetworkUtils.NetworkType.NETWORK_2G]
 * - [NetworkUtils.NetworkType.NETWORK_UNKNOWN]
 * - [NetworkUtils.NetworkType.NETWORK_NO]
 */
inline val networkType: NetworkUtils.NetworkType
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.getNetworkType()

/**
 * Returns the ip address. This is equivalent to calling:
 * ```
 * NetworkUtils.getIPAddress(useIPv4)
 * ```
 */
@RequiresPermission(INTERNET)
inline fun ipAddressOf(useIPv4: Boolean): String = NetworkUtils.getIPAddress(useIPv4)

/**
 * Returns the ip address. This is equivalent to calling:
 * ```
 * NetworkUtils.getIPAddressAsync(useIPv4, callback)
 * ```
 */
@RequiresPermission(INTERNET)
inline fun ipAddressOf(useIPv4: Boolean, noinline callback: (String) -> Unit): Utils.Task<String> =
  NetworkUtils.getIPAddressAsync(useIPv4, callback)

/**
 * Returns the domain address. This is equivalent to calling:
 * ```
 * NetworkUtils.getDomainAddress(domain)
 * ```
 */
@RequiresPermission(INTERNET)
inline fun domainAddressOf(domain: String): String = NetworkUtils.getDomainAddress(domain)

/**
 * Returns the domain address. This is equivalent to calling:
 * ```
 * NetworkUtils.getDomainAddressAsync(domain, callback)
 * ```
 */
@RequiresPermission(INTERNET)
inline fun domainAddressOf(domain: String, noinline callback: (String) -> Unit): Utils.Task<String> =
  NetworkUtils.getDomainAddressAsync(domain, callback)

/**
 * Returns the ip address by wifi. This is equivalent to calling:
 * ```
 * NetworkUtils.getIpAddressByWifi()
 * ```
 */
inline val ipAddressByWifi: String
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getIpAddressByWifi()

/**
 * Returns the gate way by wifi. This is equivalent to calling:
 * ```
 * NetworkUtils.getGatewayByWifi()
 * ```
 */
inline val gatewayByWifi: String
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getGatewayByWifi()

/**
 * Returns the net mask by wifi. This is equivalent to calling:
 * ```
 * NetworkUtils.getNetMaskByWifi()
 * ```
 */
inline val netMaskByWifi: String
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getNetMaskByWifi()

/**
 * Returns the server address by wifi. This is equivalent to calling:
 * ```
 * NetworkUtils.getServerAddressByWifi()
 * ```
 */
inline val serverAddressByWifi: String
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getServerAddressByWifi()

/**
 * Registers the status of network changed listener. This is equivalent to calling:
 * ```
 * NetworkUtils.registerNetworkStatusChangedListener(listener)
 * ```
 */
inline fun registerNetworkStatusChangedListener(listener: NetworkUtils.OnNetworkStatusChangedListener) =
  NetworkUtils.registerNetworkStatusChangedListener(listener)

/**
 * Unregisters the status of network changed listener. This is equivalent to calling:
 * ```
 * NetworkUtils.unregisterNetworkStatusChangedListener(listener)
 * ```
 */
inline fun unregisterNetworkStatusChangedListener(listener: NetworkUtils.OnNetworkStatusChangedListener) =
  NetworkUtils.unregisterNetworkStatusChangedListener(listener)

/**
 * Returns whether the status of network changed listener has been registered. This is equivalent to calling:
 * ```
 * NetworkUtils.isRegisteredNetworkStatusChangedListener(listener)
 * ```
 */
inline val NetworkUtils.OnNetworkStatusChangedListener.isRegistered: Boolean
  get() = NetworkUtils.isRegisteredNetworkStatusChangedListener(this)

inline fun observeNetworkStatusChanged(owner: LifecycleOwner, listener: NetworkUtils.OnNetworkStatusChangedListener) {
  owner.lifecycle.addObserver(object : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
      registerNetworkStatusChangedListener(listener)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
      unregisterNetworkStatusChangedListener(listener)
    }
  })
}