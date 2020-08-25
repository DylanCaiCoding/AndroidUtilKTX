@file:Suppress("unused", "NOTHING_TO_INLINE")

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

  fun size(sizeNormal: Int, sizePressed: Int = sizeNormal) {
    config.setShadowSize(sizeNormal, sizePressed)
  }

  fun maxSize(sizeNormal: Int, sizePressed: Int = sizeNormal) {
    config.setShadowMaxSize(sizeNormal, sizePressed)
  }

  fun color(sizeNormal: Int, colorPressed: Int = sizeNormal) {
    config.setShadowColor(sizeNormal, colorPressed)
  }

  fun build() = config
}