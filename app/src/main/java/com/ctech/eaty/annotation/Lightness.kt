package com.ctech.eaty.annotation

import android.support.annotation.LongDef

const val IS_LIGHT = 0L
const val IS_DARK = 1L
const val LIGHTNESS_UNKNOWN = 2L

@Retention(AnnotationRetention.SOURCE)
@LongDef(IS_LIGHT, IS_DARK, LIGHTNESS_UNKNOWN)
annotation class Lightness