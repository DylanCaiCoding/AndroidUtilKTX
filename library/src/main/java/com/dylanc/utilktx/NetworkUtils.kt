package com.dylanc.utilktx

import android.Manifest.permission.ACCESS_NETWORK_STATE
import android.Manifest.permission.INTERNET
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.NetworkUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
fun openWirelessSettings() = NetworkUtils.openWirelessSettings()

val isNetworkConnected
  @RequiresPermission(ACCESS_NETWORK_STATE)
  get() = NetworkUtils.isConnected()

val isNetworkAvailable
  @RequiresPermission(INTERNET)
  get() = NetworkUtils.isAvailable()

val isNetworkAvailableByPing
  @RequiresPermission(INTERNET)
  get() = NetworkUtils.isAvailableByPing()

val isNetworkAvailableByDns
  @RequiresPermission(INTERNET)
  get() = NetworkUtils.isAvailableByDns()

@RequiresPermission(INTERNET)
fun isNetworkAvailable(callback: (Boolean) -> Unit) = NetworkUtils.isAvailableAsync(callback)

@RequiresPermission(INTERNET)
fun isNetworkAvailableByPing(ip: String? = null, callback: (Boolean) -> Unit) =
  NetworkUtils.isAvailableByPingAsync(ip, callback)

//todo

