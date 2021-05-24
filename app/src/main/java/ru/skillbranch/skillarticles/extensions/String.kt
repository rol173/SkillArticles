package ru.skillbranch.skillarticles.extensions

import android.util.Log

fun String?.indexesOf(
    substr: String,
    ignoreCase: Boolean = true
): List<Int> {

    this?.let {
        val regex = if (ignoreCase) Regex(substr, RegexOption.IGNORE_CASE) else Regex(substr)
        return regex.findAll(this).map { it.range.first }.toList()
    }

    return emptyList()

}