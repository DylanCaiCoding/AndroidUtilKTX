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

inline fun openWirelessSettings() = NetworkUtils.openWirelessSettings()

inline val isNetworkConnected: Boolean
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.isConnected()

inline val isNetworkAvailable: Boolean
  @RequiresPermission(INTERNET)
  get() = NetworkUtils.isAvailable()

@RequiresPermission(INTERNET)
inline fun isNetworkAvailable(noinline callback: (Boolean) -> Unit): Utils.Task<Boolean> =
  NetworkUtils.isAvailableAsync(callback)

inline val isNetworkAvailableByPing: Boolean
  @RequiresPermission(INTERNET)
  get() = NetworkUtils.isAvailableByPing()

@RequiresPermission(INTERNET)
inline fun isNetworkAvailableByPing(ip: String = "", noinline callback: (Boolean) -> Unit): Utils.Task<Boolean> =
  NetworkUtils.isAvailableByPingAsync(ip, callback)

@RequiresPermission(INTERNET)
inline fun isNetworkAvailableByDns(domain: String = ""): Boolean =
  NetworkUtils.isAvailableByDns(domain)

@RequiresPermission(INTERNET)
inline fun isNetworkAvailableByDns(domain: String = "", noinline callback: (Boolean) -> Unit): Utils.Task<Any> =
  NetworkUtils.isAvailableByDnsAsync(domain, callback)

inline val isMobileDataEnabled: Boolean
  get() = NetworkUtils.getMobileDataEnabled()

inline val isMobileDataNetwork: Boolean
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.isMobileData()

inline var isWifiEnabled: Boolean
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getWifiEnabled()
  @RequiresPermission(CHANGE_WIFI_STATE)
  set(value) = NetworkUtils.setWifiEnabled(value)

inline val isWifiConnected: Boolean
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.isWifiConnected()

inline val isWifiAvailable: Boolean
  @RequiresPermission(allOf = [ACCESS_WIFI_STATE, INTERNET])
  get() = NetworkUtils.isWifiAvailable()

@RequiresPermission(allOf = [ACCESS_WIFI_STATE, INTERNET])
inline fun isWifiAvailable(noinline callback: (Boolean) -> Unit): Utils.Task<Boolean> =
  NetworkUtils.isWifiAvailableAsync(callback)

inline val networkOperatorName: String get() = NetworkUtils.getNetworkOperatorName()

inline val networkType: NetworkUtils.NetworkType
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.getNetworkType()

@RequiresPermission(INTERNET)
inline fun ipAddressOf(useIPv4: Boolean): String = NetworkUtils.getIPAddress(useIPv4)

@RequiresPermission(INTERNET)
inline fun ipAddressOf(useIPv4: Boolean, noinline callback: (String) -> Unit): Utils.Task<String> =
  NetworkUtils.getIPAddressAsync(useIPv4, callback)

@RequiresPermission(INTERNET)
inline fun domainAddressOf(domain: String): String = NetworkUtils.getDomainAddress(domain)

@RequiresPermission(INTERNET)
inline fun domainAddressOf(domain: String, noinline callback: (String) -> Unit): Utils.Task<String> =
  NetworkUtils.getDomainAddressAsync(domain, callback)

inline val ipAddressByWifi: String
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getIpAddressByWifi()

inline val gatewayByWifi: String
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getGatewayByWifi()

inline val netMaskByWifi: String
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getNetMaskByWifi()

inline val serverAddressByWifi: String
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getServerAddressByWifi()

inline fun registerNetworkStatusChangedListener(listener: NetworkUtils.OnNetworkStatusChangedListener) =
  NetworkUtils.registerNetworkStatusChangedListener(listener)

inline fun unregisterNetworkStatusChangedListener(listener: NetworkUtils.OnNetworkStatusChangedListener) =
  NetworkUtils.unregisterNetworkStatusChangedListener(listener)

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

inline val NetworkUtils.OnNetworkStatusChangedListener.isRegistered: Boolean
  get() = NetworkUtils.isRegisteredNetworkStatusChangedListener(this)