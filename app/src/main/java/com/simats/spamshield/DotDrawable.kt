package com.simats.spamshield

import android.graphics.drawable.GradientDrawable

object DotDrawable {
    fun active(): GradientDrawable {
        return GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            cornerRadius = 1000f
            setColor(0xFF8B5CF6.toInt()) // Electric Violet
        }
    }

    fun inactive(): GradientDrawable {
        return GradientDrawable().apply {
            shape = GradientDrawable.OVAL
            setColor(0xFF1E293B.toInt()) // Midnight/Slate 800
        }
    }
}
