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

/**
 * Adds the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.add(fm, fragment, containerId, tag, isHide, isAddStack)
 * ```
 */
inline fun FragmentManager.add(
  fragment: Fragment, @IdRes containerId: Int, tag: String? = null, isHide: Boolean = false, isAddStack: Boolean = false
) =
  FragmentUtils.add(this, fragment, containerId, tag, isHide, isAddStack)

/**
 * Adds the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.add(fm, fragment, containerId, tag, isAddStack, enterAnim, exitAnim, popEnterAnim, popExitAnim)
 * ```
 */
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
  FragmentUtils.add(this, fragment, containerId, tag, isAddStack, enterAnim, exitAnim, popEnterAnim, popExitAnim)

/**
 * Shows the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.show(fm)
 * ```
 */
inline fun FragmentManager.show() = FragmentUtils.show(this)

/**
 * Shows the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.show(fragment)
 * ```
 */
inline fun Fragment.show() = FragmentUtils.show(this)

/**
 * Hide the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.show(fm)
 * ```
 */
inline fun FragmentManager.hide() = FragmentUtils.hide(this)

/**
 * Hide the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.show(fragment)
 * ```
 */
inline fun Fragment.hide() = FragmentUtils.hide(this)

/**
 * Shows the fragment then hide other fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.showHide(showIndex, hideFragments)
 * ```
 */
inline fun showFragment(showIndex: Int, hideFragments: List<Fragment>) = FragmentUtils.showHide(showIndex, hideFragments)

/**
 * Shows the fragment then hide other fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.showHide(showIndex, hideFragments)
 * ```
 */
inline fun showFragment(showIndex: Int, vararg hideFragments: Fragment) = FragmentUtils.showHide(showIndex, *hideFragments)

/**
 * Shows the fragment then hide other fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.showHide(showFragment, hideFragments)
 * ```
 */
inline fun Fragment.show(vararg hide: Fragment) = FragmentUtils.showHide(this, *hide)

/**
 * Shows the fragment then hide other fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.showHide(showFragment, hideFragment)
 * ```
 */
inline fun Fragment.show(hide: Fragment) = FragmentUtils.showHide(this, hide)

/**
 * Shows the fragment then hide other fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.showHide(showFragment, hideFragments)
 * ```
 */
inline fun Fragment.show(hide: List<Fragment>) = FragmentUtils.showHide(this, hide)

/**
 * Replaces the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.replace(srcFragment, destFragment, destTag, isAddStack)
 * ```
 */
inline fun Fragment.replace(destFragment: Fragment, destTag: String? = null, isAddStack: Boolean = false) =
  FragmentUtils.replace(this, destFragment, destTag, isAddStack)

/**
 * Replaces the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.replace(srcFragment, destFragment, isAddStack, enterAnim, exitAnim, popEnterAnim, popExitAnim)
 * ```
 */
inline fun Fragment.replace(
  destFragment: Fragment,
  isAddStack: Boolean = false,
  @AnimatorRes @AnimRes enterAnim: Int,
  @AnimatorRes @AnimRes exitAnim: Int,
  @AnimatorRes @AnimRes popEnterAnim: Int = 0,
  @AnimatorRes @AnimRes popExitAnim: Int = 0
) =
  FragmentUtils.replace(this, destFragment, isAddStack, enterAnim, exitAnim, popEnterAnim, popExitAnim)

/**
 * Pops the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.pop(fm, isImmediate)
 * ```
 */
inline fun FragmentManager.pop(isImmediate: Boolean = true) = FragmentUtils.pop(this, isImmediate)

/**
 * Pops to the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.pop(fm, popClazz, isIncludeSelf, isImmediate)
 * ```
 */
inline fun <reified T : Fragment> FragmentManager.popTo(isIncludeSelf: Boolean, isImmediate: Boolean = true) =
  FragmentUtils.popTo(this, T::class.java, isIncludeSelf, isImmediate)

/**
 * Pops all fragments. This is equivalent to calling:
 * ```
 * FragmentUtils.popAll(fm, isImmediate)
 * ```
 */
inline fun FragmentManager.popAll(isImmediate: Boolean = true) = FragmentUtils.popAll(this, isImmediate)

/**
 * Removes the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.remove(fragment)
 * ```
 */
inline fun Fragment.remove() = FragmentUtils.remove(this)

/**
 * Removes to the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.removeTo(fragment, isIncludeSelf)
 * ```
 */
inline fun Fragment.removeTo(isIncludeSelf: Boolean) = FragmentUtils.removeTo(this, isIncludeSelf)

/**
 * Removes all fragments. This is equivalent to calling:
 * ```
 * FragmentUtils.removeAll(fm)
 * ```
 */
inline fun FragmentManager.removeAll() = FragmentUtils.removeAll(this)

/**
 * Returns the top the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.getTop(fm)
 * ```
 */
inline val FragmentManager.topFragment: Fragment get() = FragmentUtils.getTop(this)

/**
 * Returns the top fragment in stack. This is equivalent to calling:
 * ```
 * FragmentUtils.getTopInStack(fm)
 * ```
 */
inline val FragmentManager.topFragmentInStack: Fragment get() = FragmentUtils.getTopInStack(this)

/**
 * Returns the top fragment which is shown. This is equivalent to calling:
 * ```
 * FragmentUtils.getTopShow(fm)
 * ```
 */
inline val FragmentManager.topShowFragment: Fragment get() = FragmentUtils.getTopShow(this)

/**
 * Returns the top fragment which is shown. This is equivalent to calling:
 * ```
 * FragmentUtils.getTopShow(fm)
 * ```
 */
inline val FragmentManager.topShowFragmentInStack: Fragment get() = FragmentUtils.getTopShowInStack(this)

/**
 * Returns the fragments in stack in manager. This is equivalent to calling:
 * ```
 * FragmentUtils.getFragmentsInStack(fm)
 * ```
 */
inline val FragmentManager.fragmentsInStack: List<Fragment> get() = FragmentUtils.getFragmentsInStack(this)

/**
 * Returns all [FragmentUtils.FragmentNode] in manager. This is equivalent to calling:
 * ```
 * FragmentUtils.getAllFragments(fm)
 * ```
 */
inline val FragmentManager.allFragments: List<FragmentUtils.FragmentNode> get() = FragmentUtils.getAllFragments(this)

/**
 * Returns all [FragmentUtils.FragmentNode] in stack in manager. This is equivalent to calling:
 * ```
 * FragmentUtils.getAllFragments(fm)
 * ```
 */
inline val FragmentManager.allFragmentsInStack: List<FragmentUtils.FragmentNode>
  get() = FragmentUtils.getAllFragmentsInStack(this)

/**
 * Finds the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.findFragment(fm, findClazz)
 * ```
 */
inline fun <reified T : Fragment> FragmentManager.findFragment(): Fragment? = FragmentUtils.findFragment(this, T::class.java)

/**
 * Dispatches the back press for the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.dispatchBackPress(fragment)
 * ```
 */
inline fun Fragment.dispatchBackPress(): Boolean = FragmentUtils.dispatchBackPress(this)

/**
 * Dispatches the back press for the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.dispatchBackPress(fm)
 * ```
 */
inline fun FragmentManager.dispatchBackPress(): Boolean = FragmentUtils.dispatchBackPress(this)

/**
 * Set the background color for the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.setBackgroundColor(fragment, value)
 * ```
 */
inline var Fragment.backgroundColor: Int
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = FragmentUtils.setBackgroundColor(this, value)

/**
 * Set the background resource for the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.setBackgroundResource(fragment, value)
 * ```
 */
inline var Fragment.backgroundResource: Int
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = FragmentUtils.setBackgroundResource(this, value)

/**
 * Set the background drawable for the fragment. This is equivalent to calling:
 * ```
 * FragmentUtils.setBackground(fragment, value)
 * ```
 */
inline var Fragment.backgroundDrawable: Drawable
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = FragmentUtils.setBackground(this, value)