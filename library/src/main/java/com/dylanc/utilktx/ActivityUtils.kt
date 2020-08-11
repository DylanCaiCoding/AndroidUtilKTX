@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.SparseArray
import android.view.View
import androidx.annotation.AnimRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.blankj.utilcode.util.ActivityUtils

/**
 * @author Dylan Cai
 */

/**
 * Return the activity by context. This is equivalent to calling:
 * ```
 * ActivityUtils.getActivityByContext(context)
 * ```
 */
inline val Context.activity: Activity? get() = ActivityUtils.getActivityByContext(this)

/**
 * Return whether the activity exists in activity's stack. This is equivalent to calling:
 * ```
 * ActivityUtils.isActivityExistsInStack(activity)
 * ```
 */
inline val Activity.isExistsInStack: Boolean get() = ActivityUtils.isActivityExistsInStack(this)

/**
 * Launch a new Activity with extras or options. This is equivalent to calling:
 * ```
 * ActivityUtils.startActivity(clz, intent, options)
 * ```
 *
 * @param extras  The Bundle of extras to add to this intent.
 * @param options Additional options for how the Activity should be started.
 */
inline fun <reified T : Activity> startActivity(vararg extras: Pair<String, *>, options: Bundle? = null) =
  ActivityUtils.startActivity(bundleOf(*extras), T::class.java, options)

/**
 * Launch a new Activity with extras or options. This is equivalent to calling:
 * ```
 * ActivityUtils.startActivity(clz, extras, options)
 * ```
 *
 * @param extras  The Bundle of extras to add to this intent.
 * @param options Additional options for how the Activity should be started.
 */
inline fun <reified T : Activity> startActivity(extras: Bundle? = null, options: Bundle? = null) =
  if (extras == null) {
    ActivityUtils.startActivity(T::class.java, options)
  } else {
    ActivityUtils.startActivity(extras, T::class.java, options)
  }

/**
 * Launch a new Activity with an explicit transition animation. This is equivalent to calling:
 * ```
 * ActivityUtils.startActivity(clz, enterAnim, exitAnim)
 * ```
 */
inline fun <reified T : Activity> startActivity(@AnimRes enterAnim: Int, @AnimRes exitAnim: Int) =
  ActivityUtils.startActivity(T::class.java, enterAnim, exitAnim)

/**
 * Launch a new Activity with extras or options. This is equivalent to calling:
 * ```
 * ActivityUtils.startActivity(activity, clz, extras, options)
 * ```
 *
 * @param extras  The Bundle of extras to add to this intent.
 * @param options Additional options for how the Activity should be started.
 */
inline fun <reified T : Activity> Activity.startActivity(extras: Bundle? = null, options: Bundle? = null) =
  if (extras == null) {
    ActivityUtils.startActivity(this, T::class.java, options)
  } else {
    ActivityUtils.startActivity(this, intentOf<T>(extras), options)
  }

/**
 * Launch a new Activity with extras or options. This is equivalent to calling:
 * ```
 * ActivityUtils.startActivity(clz, intent, options)
 * ```
 *
 * @param extras  The Bundle of extras to add to this intent.
 * @param options Additional options for how the Activity should be started.
 */
inline fun <reified T : Activity> Activity.startActivity(vararg extras: Pair<String, *>, options: Bundle? = null) =
  ActivityUtils.startActivity(this, intentOf<T>(*extras), options)

/**
 * Launch a new Activity with an explicit transition animation. This is equivalent to calling:
 * ```
 * ActivityUtils.startActivity(activity, clz, enterAnim, exitAnim)
 * ```
 */
inline fun <reified T : Activity> Activity.startActivity(@AnimRes enterAnim: Int, @AnimRes exitAnim: Int) =
  ActivityUtils.startActivity(this, T::class.java, enterAnim, exitAnim)

/**
 * Launch a new Activity with shared elements. This is equivalent to calling:
 * ```
 * ActivityUtils.startActivity(activity, intent, sharedElements)
 * ```
 */
inline fun Activity.startActivity(intent: Intent, vararg sharedElements: View) =
  ActivityUtils.startActivity(this, intent, *sharedElements)

/**
 * Launch activities. This is equivalent to calling:
 * ```
 * ActivityUtils.startActivities(intents, options)
 * ```
 */
inline fun startActivities(intents: Array<Intent>, options: Bundle? = null) =
  ActivityUtils.startActivities(intents, options)

/**
 * Launch activities. This is equivalent to calling:
 * ```
 * ActivityUtils.startActivities(activity, intents, options)
 * ```
 */
inline fun Activity.startActivities(intents: Array<Intent>, options: Bundle? = null, newTask: Boolean = true) =
  if (newTask) {
    ActivityUtils.startActivities(this, intents, options)
  } else {
    startActivities(intents, options)
  }

/**
 * Launch activities with an explicit transition animation. This is equivalent to calling:
 * ```
 * ActivityUtils.startActivities(activity, intents, enterAnim, exitAnim)
 * ```
 */
inline fun Activity.startActivities(intents: Array<Intent>, @AnimRes enterAnim: Int, @AnimRes exitAnim: Int) =
  ActivityUtils.startActivities(this, intents, enterAnim, exitAnim)

/**
 * Launch a new Activity of home. This is equivalent to calling:
 * ```
 * ActivityUtils.startHomeActivity()
 * ```
 */
inline fun startHomeActivity() = ActivityUtils.startHomeActivity()

/**
 * Return the list of activity. This is equivalent to calling:
 * ```
 * ActivityUtils.getActivityList()
 * ```
 */
val activityList: List<Activity> get() = ActivityUtils.getActivityList()

/**
 * Return whether the activity is alive. This is equivalent to calling:
 * ```
 * ActivityUtils.isActivityAlive(context)
 * ```
 */
inline val Context.isActivityAlive: Boolean get() = ActivityUtils.isActivityAlive(this)

/**
 * Return whether the activity is alive. This is equivalent to calling:
 * ```
 * ActivityUtils.isActivityAlive(activity)
 * ```
 */
inline val Activity.isAlive: Boolean get() = ActivityUtils.isActivityAlive(this)

/**
 * Return the top activity in activity's stack. This is equivalent to calling:
 * ```
 * ActivityUtils.getTopActivity()
 * ```
 */
val topActivity: Activity get() = ActivityUtils.getTopActivity()

/**
 * Return the name of launcher activity. This is equivalent to calling:
 * ```
 * ActivityUtils.getLauncherActivity()
 * ```
 */
inline val launchActivityName: String get() = ActivityUtils.getLauncherActivity()

/**
 * Return the name of launcher activity. This is equivalent to calling:
 * ```
 * ActivityUtils.getLauncherActivity(pkg)
 * ```
 */
inline fun launchActivityNameOf(pkg: String): String = ActivityUtils.getLauncherActivity(pkg)

/**
 * Finish the activities whose type not equals the activity class. This is equivalent to calling:
 * ```
 * ActivityUtils.finishOtherActivities(clz, isLoadAnim)
 * ```
 *
 * @param isLoadAnim True to use animation for the outgoing activity, false otherwise.
 */
inline fun <reified T : Activity> finishOtherActivities(isLoadAnim: Boolean = false) =
  ActivityUtils.finishOtherActivities(T::class.java, isLoadAnim)

/**
 * Finish the activities whose type not equals the activity class with an explicit transition
 * animation. This is equivalent to calling:
 * ```
 * ActivityUtils.finishOtherActivities(clz, enterAnim, exitAnim)
 * ```
 */
inline fun <reified T : Activity> finishOtherActivities(@AnimRes enterAnim: Int, @AnimRes exitAnim: Int) =
  ActivityUtils.finishOtherActivities(T::class.java, enterAnim, exitAnim)

/**
 * Finish all of activities. This is equivalent to calling:
 * ```
 * ActivityUtils.finishAllActivities(isLoadAnim)
 * ```
 *
 * @param isLoadAnim True to use animation for the outgoing activity, false otherwise.
 */
inline fun finishAllActivities(isLoadAnim: Boolean = false) =
  ActivityUtils.finishAllActivities(isLoadAnim)

/**
 * Finish all of activities with an explicit transition animation. This is equivalent to calling:
 * ```
 * ActivityUtils.finishAllActivities(enterAnim, exitAnim)
 * ```
 */
inline fun finishAllActivities(@AnimRes enterAnim: Int, @AnimRes exitAnim: Int) =
  ActivityUtils.finishAllActivities(enterAnim, exitAnim)

/**
 * Finish all of activities except the newest activity. This is equivalent to calling:
 * ```
 * ActivityUtils.finishAllActivitiesExceptNewest(isLoadAnim)
 * ```
 *
 * @param isLoadAnim True to use animation for the outgoing activity, false otherwise.
 */
inline fun finishAllActivitiesExceptNewest(isLoadAnim: Boolean = false) =
  ActivityUtils.finishAllActivitiesExceptNewest(isLoadAnim)

/**
 * Finish all of activities except the newest activity with an explicit transition animation.
 * This is equivalent to calling:
 * ```
 * ActivityUtils.finishAllActivitiesExceptNewest(isLoadAnim)
 * ```
 */
inline fun finishAllActivitiesExceptNewest(@AnimRes enterAnim: Int, @AnimRes exitAnim: Int) =
  ActivityUtils.finishAllActivitiesExceptNewest(enterAnim, exitAnim)

/**
 * Modifies the standard behavior to allow results to be delivered to fragments.
 * This imposes a restriction that requestCode be <= 0xffff. This is equivalent to calling:
 * ```
 * DispatchResultFragment.newInstance(fragmentActivity).startForResult(intent, requestCode, callback)
 * ```
 *
 * @param extras  The Bundle of extras to add to this intent.
 */
inline fun <reified T : Activity> FragmentActivity.startActivityForResult(
  requestCode: Int,
  vararg extras: Pair<String, *>,
  noinline callback: (resultCode: Int, data: Intent?) -> Unit
) = startActivityForResult(intentOf<T>(*extras), requestCode, callback)

/**
 * Modifies the standard behavior to allow results to be delivered to fragments.
 * This imposes a restriction that requestCode be <= 0xffff. This is equivalent to calling:
 * ```
 * DispatchResultFragment.newInstance(fragmentActivity).startForResult(intent, requestCode, callback)
 * ```
 */
inline fun FragmentActivity.startActivityForResult(intent: Intent, requestCode: Int, noinline callback: (resultCode: Int, data: Intent?) -> Unit) =
  DispatchResultFragment.newInstance(this).startForResult(intent, requestCode, callback)


class DispatchResultFragment : Fragment() {

  companion object {
    private const val TAG = "dispatch_result"

    fun newInstance(activity: FragmentActivity): DispatchResultFragment =
      activity.run {
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

