@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.net.Uri
import com.blankj.utilcode.util.UriUtils
import java.io.File

/**
 * @author Dylan Cai
 */

inline fun File.toUri():Uri = UriUtils.file2Uri(this)

inline fun Uri.toFile(): File? = UriUtils.uri2File(this)

inline fun Uri.toPath(): String? = toFile()?.path
