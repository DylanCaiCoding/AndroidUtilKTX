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
fun openWirelessSettings() =
  NetworkUtils.openWirelessSettings()

@RequiresPermission(ACCESS_NETWORK_STATE)
fun isNetworkConnected(): Boolean =
  NetworkUtils.isConnected()

@RequiresPermission(INTERNET)
fun isNetworkAvailable(): Boolean =
  NetworkUtils.isAvailable()

@RequiresPermission(INTERNET)
fun isNetworkAvailable(callback: (Boolean) -> Unit): Utils.Task<Boolean> =
  NetworkUtils.isAvailableAsync(callback)

@RequiresPermission(INTERNET)
fun isNetworkAvailableByPing(): Boolean =
  NetworkUtils.isAvailableByPing()

@RequiresPermission(INTERNET)
fun isNetworkAvailableByPing(ip: String = "", callback: (Boolean) -> Unit): Utils.Task<Boolean> =
  NetworkUtils.isAvailableByPingAsync(ip, callback)

@RequiresPermission(INTERNET)
fun isNetworkAvailableByDns(domain: String = ""): Boolean =
  NetworkUtils.isAvailableByDns(domain)

@RequiresPermission(INTERNET)
fun isNetworkAvailableByDns(domain: String = "", callback: (Boolean) -> Unit): Utils.Task<Any> =
  NetworkUtils.isAvailableByDnsAsync(domain, callback)

val isMobileDataEnabled: Boolean
  get() = NetworkUtils.getMobileDataEnabled()

val isMobileDataNetwork: Boolean
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.isMobileData()

var isWifiEnabled: Boolean
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getWifiEnabled()
  @RequiresPermission(CHANGE_WIFI_STATE)
  set(value) = NetworkUtils.setWifiEnabled(value)

val isWifiConnected: Boolean
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.isWifiConnected()

val isWifiAvailable: Boolean
  @RequiresPermission(allOf = [ACCESS_WIFI_STATE, INTERNET])
  get() = NetworkUtils.isWifiAvailable()

@RequiresPermission(allOf = [ACCESS_WIFI_STATE, INTERNET])
fun isWifiAvailable(callback: (Boolean) -> Unit): Utils.Task<Boolean> =
  NetworkUtils.isWifiAvailableAsync(callback)

val networkOperatorName: String
  get() = NetworkUtils.getNetworkOperatorName()

val networkType: NetworkUtils.NetworkType
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.getNetworkType()

@RequiresPermission(INTERNET)
fun ipAddressOf(useIPv4: Boolean): String =
  NetworkUtils.getIPAddress(useIPv4)

@RequiresPermission(INTERNET)
fun ipAddressOf(useIPv4: Boolean, callback: (String) -> Unit): Utils.Task<String> =
  NetworkUtils.getIPAddressAsync(useIPv4, callback)

@RequiresPermission(INTERNET)
fun domainAddressOf(domain: String): String =
  NetworkUtils.getDomainAddress(domain)

@RequiresPermission(INTERNET)
fun domainAddressOf(domain: String, callback: (String) -> Unit): Utils.Task<String> =
  NetworkUtils.getDomainAddressAsync(domain, callback)

val ipAddressByWifi: String
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getIpAddressByWifi()

val gatewayByWifi: String
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getGatewayByWifi()

val netMaskByWifi: String
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getNetMaskByWifi()

val serverAddressByWifi: String
  @RequiresPermission(ACCESS_WIFI_STATE)
  get() = NetworkUtils.getServerAddressByWifi()

fun registerNetworkStatusChangedListener(listener: NetworkUtils.OnNetworkStatusChangedListener) =
  NetworkUtils.registerNetworkStatusChangedListener(listener)

fun unregisterNetworkStatusChangedListener(listener: NetworkUtils.OnNetworkStatusChangedListener) =
  NetworkUtils.unregisterNetworkStatusChangedListener(listener)

fun observeNetworkStatusChanged(
  owner: LifecycleOwner,
  listener: NetworkUtils.OnNetworkStatusChangedListener
) {
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

val NetworkUtils.OnNetworkStatusChangedListener.isRegistered: Boolean
  get() = NetworkUtils.isRegisteredNetworkStatusChangedListener(this)