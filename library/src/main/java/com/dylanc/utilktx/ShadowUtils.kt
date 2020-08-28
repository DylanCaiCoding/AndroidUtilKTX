@file:Suppress("unused", "NOTHING_TO_INLINE", "MemberVisibilityCanBePrivate")

package com.dylanc.utilktx

import android.view.View
import com.blankj.utilcode.util.ShadowUtils
import com.dylanc.utilktx.Internals.NO_GETTER
import com.dylanc.utilktx.Internals.noGetter

/**
 * @author Dylan Cai
 */

/**
 * Sets the shadow for the view. This is equivalent to calling:
 * ```
 * ShadowUtils.apply(this, ShadowBuilder().apply(block).build())
 * ```
 */
inline fun View.setShadow(noinline block: ShadowBuilder.() -> Unit) =
  ShadowUtils.apply(this, ShadowBuilder().apply(block).build())

private const val SHADOW_COLOR_DEFAULT = 0x44000000

class ShadowBuilder {
  private val config: ShadowUtils.Config = ShadowUtils.Config()
  var radius: Float
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = throw noGetter()
    set(value) {
      config.setShadowRadius(value)
    }

  var circle: Boolean
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = throw noGetter()
    set(value) {
      if (value) config.setCircle()
    }

  var size: Int = -1
    set(value) {
      field = value
      if (pressedSize < 0) {
        config.setShadowSize(value)
      } else {
        config.setShadowSize(value, pressedSize)
      }
    }

  var pressedSize: Int = -1
    set(value) {
      field = value
      if (size < 0) {
        config.setShadowSize(value, value)
      } else {
        config.setShadowSize(size, value)
      }
    }

  var maxSize: Int = -1
    set(value) {
      field = value
      if (pressedMaxSize < 0) {
        config.setShadowMaxSize(value)
      } else {
        config.setShadowMaxSize(value, pressedMaxSize)
      }
    }

  var pressedMaxSize: Int = -1
    set(value) {
      field = value
      if (maxSize < 0) {
        config.setShadowMaxSize(value, value)
      } else {
        config.setShadowMaxSize(maxSize, value)
      }
    }

  var color: Int = SHADOW_COLOR_DEFAULT
    set(value) {
      field = value
      if (pressedColor < 0) {
        config.setShadowColor(value)
      } else {
        config.setShadowColor(value, pressedColor)
      }
    }

  var pressedColor: Int = SHADOW_COLOR_DEFAULT
    set(value) {
      field = value
      if (color < 0) {
        config.setShadowColor(value)
      } else {
        config.setShadowColor(color, value)
      }
    }

  fun build() = config
}