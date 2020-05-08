package com.dylanc.utilktx

import android.view.View
import androidx.annotation.LayoutRes
import com.blankj.utilcode.util.ToastUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
fun toast(text: String?) = ToastUtils.showShort(text)

fun toast(view: View):View = ToastUtils.showCustomShort(view)

fun toast(@LayoutRes layoutId: Int):View = ToastUtils.showCustomShort(layoutId)

fun longToast(text: String) = ToastUtils.showLong(text)

fun longToast(view: View):View = ToastUtils.showCustomLong(view)

fun longToast(@LayoutRes layoutId: Int):View = ToastUtils.showCustomLong(layoutId)

fun cancelToast() = ToastUtils.cancel()