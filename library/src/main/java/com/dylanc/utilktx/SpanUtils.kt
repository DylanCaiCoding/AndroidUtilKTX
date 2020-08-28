@file:Suppress("unused")

package com.dylanc.utilktx

import android.graphics.*
import android.graphics.drawable.Drawable
import android.net.Uri
import android.text.Layout
import android.text.SpannableStringBuilder
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.FloatRange
import androidx.annotation.IntRange
import com.blankj.utilcode.util.SpanUtils

/**
 * @author Dylan Cai
 */

private val LINE_SEPARATOR: String = System.getProperty("line.separator")!!

/**
 * Sets the spannable string to the text view. This is equivalent to calling:
 * ```
 * SpanUtils.with(textView)...create()
 * ```
 */
inline fun TextView.setText(block: com.dylanc.utilktx.SpannableStringBuilder.() -> Unit): SpannableStringBuilder =
  SpanUtils.with(this).apply { SpannableStringBuilder(this).apply(block) }.create()

class SpannableStringBuilder(private val spanUtils: SpanUtils) {

  fun text(text: CharSequence, block: (SpanBuilder.() -> Unit)? = null) {
    spanUtils.append(text)
    block?.let { SpanBuilder(spanUtils).apply(it) }
  }

  fun textLine(text: CharSequence, block: (SpanBuilder.() -> Unit)? = null) {
    spanUtils.appendLine(text)
    block?.let { SpanBuilder(spanUtils).apply(it) }
  }

  fun lineFeed() {
    spanUtils.appendLine()
  }

  fun image(bitmap: Bitmap, align: Int = SpanUtils.ALIGN_BOTTOM, block: (SpanBuilder.() -> Unit)? = null) {
    spanUtils.appendImage(bitmap, align)
    block?.let { SpanBuilder(spanUtils).apply(it) }
  }

  fun image(drawable: Drawable, align: Int = SpanUtils.ALIGN_BOTTOM, block: (SpanBuilder.() -> Unit)? = null) {
    spanUtils.appendImage(drawable, align)
    block?.let { SpanBuilder(spanUtils).apply(it) }
  }

  fun image(uri: Uri, align: Int = SpanUtils.ALIGN_BOTTOM, block: (SpanBuilder.() -> Unit)? = null) {
    spanUtils.appendImage(uri, align)
    block?.let { SpanBuilder(spanUtils).apply(it) }
  }

  fun image(@DrawableRes resourceId: Int, align: Int = SpanUtils.ALIGN_BOTTOM, block: (SpanBuilder.() -> Unit)? = null) {
    spanUtils.appendImage(resourceId, align)
    block?.let { SpanBuilder(spanUtils).apply(it) }
  }

  fun space(@IntRange(from = 0) size: Int, @ColorInt color: Int = Color.TRANSPARENT) {
    spanUtils.appendSpace(size, color)
  }

}

class SpanBuilder(private val spanUtils: SpanUtils) {
  fun flag(flag: Int) {
    spanUtils.setFlag(flag)
  }

  fun foregroundColor(@ColorInt color: Int) {
    spanUtils.setForegroundColor(color)
  }

  fun backgroundColor(@ColorInt color: Int) {
    spanUtils.setBackgroundColor(color)
  }

  fun lineHeight(@IntRange(from = 0) lineHeight: Int, align: Int = SpanUtils.ALIGN_CENTER) {
    spanUtils.setLineHeight(lineHeight, align)
  }

  fun quoteColor(@ColorInt color: Int) {
    spanUtils.setQuoteColor(color)
  }

  fun leadingMargin(@IntRange(from = 0) first: Int, @IntRange(from = 0) rest: Int) {
    spanUtils.setLeadingMargin(first, rest)
  }

  fun bullet(@IntRange(from = 0) gapWidth: Int) {
    spanUtils.setBullet(gapWidth)
  }

  fun bullet(@ColorInt color: Int, @IntRange(from = 0) radius: Int, @IntRange(from = 0) gapWidth: Int) {
    spanUtils.setBullet(color, radius, gapWidth)
  }

  fun fontSize(@IntRange(from = 0) size: Int, isSp: Boolean = false) {
    spanUtils.setFontSize(size, isSp)
  }

  fun fontProportion(proportion: Float) {
    spanUtils.setFontProportion(proportion)
  }

  fun fontXProportion(proportion: Float) {
    spanUtils.setFontXProportion(proportion)
  }

  fun strikethrough() {
    spanUtils.setStrikethrough()
  }

  fun underline() {
    spanUtils.setUnderline()
  }

  fun superscript() {
    spanUtils.setSuperscript()
  }

  fun subscript() {
    spanUtils.setSubscript()
  }

  fun bold() {
    spanUtils.setBold()
  }

  fun italic() {
    spanUtils.setItalic()
  }

  fun boldItalic() {
    spanUtils.setBoldItalic()
  }

  fun fontFamily(fontFamily: String) {
    spanUtils.setFontFamily(fontFamily)
  }

  fun typeface(typeface: Typeface) {
    spanUtils.setTypeface(typeface)
  }

  fun verticalAlign(align: Int) {
    spanUtils.setVerticalAlign(align)
  }

  fun horizontalAlign(alignment: Layout.Alignment) {
    spanUtils.setHorizontalAlign(alignment)
  }

  fun clickSpan(clickableSpan: ClickableSpan) {
    spanUtils.setClickSpan(clickableSpan)
  }

  fun clickSpan(@ColorInt color: Int, underlineText: Boolean, listener: (View) -> Unit) {
    spanUtils.setClickSpan(color, underlineText, listener)
  }

  fun url(url: String) {
    spanUtils.setUrl(url)
  }

  fun blur(@FloatRange(from = 0.0, fromInclusive = false) radius: Float, style: BlurMaskFilter.Blur) {
    spanUtils.setBlur(radius, style)
  }

  fun shader(shader: Shader) {
    spanUtils.setShader(shader)
  }

  fun shadow(@FloatRange(from = 0.0, fromInclusive = false) radius: Float, dx: Float, dy: Float, shadowColor: Int) {
    spanUtils.setShadow(radius, dx, dy, shadowColor)
  }

  fun spans(vararg spans: Any) {
    spanUtils.setSpans(*spans)
  }

}