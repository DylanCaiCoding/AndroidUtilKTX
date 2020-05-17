package com.dylanc.utilktx

import android.view.View
import com.blankj.utilcode.util.ShadowUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
fun View.setShadow(block: (ShadowBuilder.() -> Unit)? = null) =
  ShadowUtils.apply(this, ShadowUtils.Config().apply {
    block?.let { ShadowBuilder(this).apply(block) }
  })

class ShadowBuilder(private val config: ShadowUtils.Config) {

  fun radius(radius: Float) {
    config.setShadowRadius(radius)
  }

  fun circle() {
    config.setCircle()
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

}