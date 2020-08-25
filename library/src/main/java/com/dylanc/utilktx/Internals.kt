package com.dylanc.utilktx

object Internals {
  const val NO_GETTER: String = "Property does not have a getter"

  fun noGetter(): Nothing = throw NotImplementedError(NO_GETTER)
}