package com.dylanc.utilktx

import android.net.Uri
import com.blankj.utilcode.util.UriUtils
import java.io.File

/**
 * @author Dylan Caia
 * @since 2019/11/7
 */
fun File.toUri() = UriUtils.file2Uri(this)

fun Uri.toFile(): File? = UriUtils.uri2File(this)

fun Uri.toPath(): String? = toFile()?.path
