package com.dylanc.utilktx

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Binder
import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.util.Size
import android.util.SizeF
import android.util.SparseArray
import android.view.View
import androidx.annotation.AnimRes
import androidx.core.app.BundleCompat.putBinder
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.blankj.utilcode.util.ActivityUtils
import java.io.Serializable

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
val View.activity: Activity?
  get() = ActivityUtils.getActivityByView(this)

val Context.activity: Activity?
  get() = ActivityUtils.getActivityByContext(this)

val Activity.isActivityExists
  get() = ActivityUtils.isActivityExistsInStack(this)

inline fun <reified T : Activity> startActivity() =
  ActivityUtils.startActivity(T::class.java)

inline fun <reified T : Activity> startActivity(extra: Bundle) =
  ActivityUtils.startActivity(extra, T::class.java)

inline fun <reified T : Activity> startActivity(extra: Bundle, options: Bundle) =
  ActivityUtils.startActivity(extra, T::class.java, options)

inline fun <reified T : Activity> startActivity(vararg extra: Pair<String, *>) =
  ActivityUtils.startActivity(bundleOf(*extra), T::class.java)

inline fun <reified T : Activity> startActivity(
  vararg extra: Pair<String, *>,
  options: Bundle
) =
  ActivityUtils.startActivity(bundleOf(*extra), T::class.java, options)

inline fun <reified T : Activity> startActivity(@AnimRes enterAnim: Int, @AnimRes exitAnim: Int) =
  ActivityUtils.startActivity(T::class.java, enterAnim, exitAnim)

inline fun <reified T : Activity> Activity.startActivity() =
  ActivityUtils.startActivity(this, T::class.java)

inline fun <reified T : Activity> Activity.startActivity(extra: Bundle) =
  ActivityUtils.startActivity(this, intentOf<T>(extra))

inline fun <reified T : Activity> Activity.startActivity(extra: Bundle, options: Bundle) =
  ActivityUtils.startActivity(this, intentOf<T>(extra), options)

inline fun <reified T : Activity> Activity.startActivity(vararg extra: Pair<String, *>) =
  ActivityUtils.startActivity(this, intentOf<T>(*extra))

inline fun <reified T : Activity> Activity.startActivity(
  vararg extra: Pair<String, *>,
  options: Bundle
) =
  ActivityUtils.startActivity(this, intentOf<T>(*extra), options)

inline fun <reified T : Activity> Activity.startActivity(@AnimRes enterAnim: Int, @AnimRes exitAnim: Int) =
  ActivityUtils.startActivity(this, T::class.java, enterAnim, exitAnim)

fun Activity.startActivity(intent: Intent, vararg sharedElements: View) =
  ActivityUtils.startActivity(this, intent, *sharedElements)

fun <T : Intent> Array<T>.start(options: Bundle? = null) =
  ActivityUtils.startActivities(this, options)

fun <T : Intent> Array<T>.start(activity: Activity, options: Bundle? = null) =
  ActivityUtils.startActivities(activity, this, options)

fun startHomeActivity() =
  ActivityUtils.startHomeActivity()

val activityList
  get() = ActivityUtils.getActivityList()

val Context.isActivityAlive
  get() = ActivityUtils.isActivityAlive(this)

val Activity.isActivityAlive
  get() = ActivityUtils.isActivityAlive(this)

val topActivity: Activity
  get() = ActivityUtils.getTopActivity()

val launchActivityName: String
  get() = ActivityUtils.getLauncherActivity()

fun launchActivityNameOf(pkg: String): String = ActivityUtils.getLauncherActivity(pkg)

inline fun <reified T : Activity> finishOtherActivities(isLoadAnim: Boolean = false) =
  ActivityUtils.finishOtherActivities(T::class.java, isLoadAnim)

fun finishAllActivities(isLoadAnim: Boolean = false) =
  ActivityUtils.finishAllActivities(isLoadAnim)

fun finishAllActivitiesExceptNewest(isLoadAnim: Boolean = false) =
  ActivityUtils.finishAllActivitiesExceptNewest(isLoadAnim)

inline fun <reified T : Activity> FragmentActivity.startActivityForResult(
  requestCode: Int,
  vararg extra: Pair<String, *>,
  noinline callback: (resultCode: Int, data: Intent?) -> Unit
) = startActivityForResult(intentOf<T>(*extra), requestCode, callback)

fun FragmentActivity.startActivityForResult(
  intent: Intent,
  requestCode: Int,
  callback: (resultCode: Int, data: Intent?) -> Unit
) = dispatchResultFragment.startForResult(intent, requestCode, callback)

private val FragmentActivity.dispatchResultFragment: DispatchResultFragment
  get() = run {
    val fragmentManager = this.supportFragmentManager
    var fragment: DispatchResultFragment? =
      fragmentManager.findFragmentByTag(DispatchResultFragment.TAG) as DispatchResultFragment?
    if (fragment == null) {
      fragment = DispatchResultFragment()
      fragmentManager
        .beginTransaction()
        .add(fragment, DispatchResultFragment.TAG)
        .commitAllowingStateLoss()
      fragmentManager.executePendingTransactions()
    }
    fragment
  }

internal class DispatchResultFragment : Fragment() {

  companion object {
    internal const val TAG = "dispatch_result"
  }

  private val callbacks = SparseArray<(resultCode: Int, data: Intent?) -> Unit>()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    retainInstance = true
  }

  fun startForResult(
    intent: Intent,
    requestCode: Int,
    callback: (resultCode: Int, data: Intent?) -> Unit
  ) {
    callbacks.put(requestCode, callback)
    startActivityForResult(intent, requestCode)
  }

  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    val callback = callbacks.get(requestCode)
    if (callback != null) {
      callback.invoke(resultCode, data)
      callbacks.remove(requestCode)
    }
  }
}