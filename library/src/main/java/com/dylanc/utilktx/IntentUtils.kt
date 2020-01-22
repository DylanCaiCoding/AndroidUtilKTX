package com.dylanc.utilktx

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.core.os.bundleOf

/**
 * @author Dylan Cai
 * @since 2020/1/16
 */
inline fun <reified T : Activity> Context.intentOf(bundle: Bundle) =
  Intent(this, T::class.java).apply { putExtras(bundle) }

inline fun <reified T : Activity> Context.intentOf(vararg pairs: Pair<String, *>) =
  Intent(this, T::class.java).apply { putExtras(bundleOf(*pairs)) }

fun Intent.clearTask(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK) }

fun Intent.clearTop(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) }

fun Intent.newDocument(): Intent = apply {
  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
    addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT)
  } else {
    @Suppress("DEPRECATION")
    addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET)
  }
}

fun Intent.excludeFromRecents(): Intent =
  apply { addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS) }

fun Intent.multipleTask(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK) }

fun Intent.newTask(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) }

fun Intent.noAnimation(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION) }

fun Intent.noHistory(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY) }

fun Intent.singleTop(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP) }