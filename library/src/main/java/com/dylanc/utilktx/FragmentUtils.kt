@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.graphics.drawable.Drawable
import androidx.annotation.AnimRes
import androidx.annotation.AnimatorRes
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.blankj.utilcode.util.FragmentUtils

/**
 * @author Dylan Cai
 */

inline fun FragmentManager.add(
  fragment: Fragment, @IdRes containerId: Int,
  tag: String? = null,
  isHide: Boolean = false,
  isAddStack: Boolean = false
) =
  FragmentUtils.add(this, fragment, containerId, tag, isHide, isAddStack)

inline fun FragmentManager.add(
  fragment: Fragment,
  @IdRes containerId: Int,
  tag: String? = null,
  isAddStack: Boolean = false,
  @AnimatorRes @AnimRes enterAnim: Int,
  @AnimatorRes @AnimRes exitAnim: Int,
  @AnimatorRes @AnimRes popEnterAnim: Int = 0,
  @AnimatorRes @AnimRes popExitAnim: Int = 0
) =
  FragmentUtils.add(
    this, fragment, containerId, tag, isAddStack,
    enterAnim, exitAnim, popEnterAnim, popExitAnim
  )

inline fun FragmentManager.show() =
  FragmentUtils.show(this)

inline fun Fragment.show() =
  FragmentUtils.show(this)

inline fun FragmentManager.hide() =
  FragmentUtils.hide(this)

inline fun Fragment.hide() =
  FragmentUtils.hide(this)

inline fun showFragment(showIndex: Int, fragments: List<Fragment>) =
  FragmentUtils.showHide(showIndex, fragments)

inline fun showFragment(showIndex: Int, vararg fragments: Fragment) =
  FragmentUtils.showHide(showIndex, *fragments)

inline fun Fragment.show(vararg hide: Fragment) =
  FragmentUtils.showHide(this, *hide)

inline fun Fragment.show(hide: Fragment) =
  FragmentUtils.showHide(this, hide)

inline fun Fragment.show(hide: List<Fragment>) =
  FragmentUtils.showHide(this, hide)

inline fun Fragment.replace(
  destFragment: Fragment,
  destTag: String? = null,
  isAddStack: Boolean = false
) =
  FragmentUtils.replace(this, destFragment, destTag, isAddStack)

inline fun Fragment.replace(
  destFragment: Fragment,
  isAddStack: Boolean = false,
  @AnimatorRes @AnimRes enterAnim: Int,
  @AnimatorRes @AnimRes exitAnim: Int,
  @AnimatorRes @AnimRes popEnterAnim: Int = 0,
  @AnimatorRes @AnimRes popExitAnim: Int = 0
) =
  FragmentUtils.replace(
    this, destFragment, isAddStack,
    enterAnim, exitAnim, popEnterAnim, popExitAnim
  )

inline fun FragmentManager.pop(isImmediate: Boolean = true) =
  FragmentUtils.pop(this, isImmediate)

inline fun <reified T : Fragment> FragmentManager.popTo(
  isIncludeSelf: Boolean,
  isImmediate: Boolean = true
) =
  FragmentUtils.popTo(this, T::class.java, isIncludeSelf, isImmediate)

inline fun FragmentManager.popAll(isImmediate: Boolean = true) =
  FragmentUtils.popAll(this, isImmediate)

inline fun Fragment.remove() =
  FragmentUtils.remove(this)

//
inline fun Fragment.removeTo(isIncludeSelf: Boolean) =
  FragmentUtils.removeTo(this, isIncludeSelf)

inline fun FragmentManager.removeAll() =
  FragmentUtils.removeAll(this)

inline val FragmentManager.topFragment: Fragment
  get() = FragmentUtils.getTop(this)

inline val FragmentManager.topFragmentInStack: Fragment
  get() = FragmentUtils.getTopInStack(this)

inline val FragmentManager.topShowFragment: Fragment
  get() = FragmentUtils.getTopShow(this)

//inline val FragmentManager.fragments: List<Fragment>
//  get() = FragmentUtils.getFragments(this)

inline val FragmentManager.fragmentsInStack: List<Fragment>
  get() = FragmentUtils.getFragmentsInStack(this)

inline val FragmentManager.allFragments: List<FragmentUtils.FragmentNode>
  get() = FragmentUtils.getAllFragments(this)

inline val FragmentManager.allFragmentsInStack: List<FragmentUtils.FragmentNode>
  get() = FragmentUtils.getAllFragmentsInStack(this)

inline fun FragmentManager.fragmentOf(tag: String): Fragment? =
  FragmentUtils.findFragment(this, tag)

inline fun <reified T : Fragment> FragmentManager.fragmentOf(): Fragment? =
  FragmentUtils.findFragment(this, T::class.java)

inline fun Fragment.dispatchBackPress() =
  FragmentUtils.dispatchBackPress(this)

inline fun FragmentManager.dispatchBackPress() =
  FragmentUtils.dispatchBackPress(this)

inline var Fragment.backgroundColor: Int
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = FragmentUtils.setBackgroundColor(this, value)

inline var Fragment.backgroundResource: Int
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = FragmentUtils.setBackgroundResource(this, value)

inline var Fragment.background: Drawable
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = FragmentUtils.setBackground(this, value)



