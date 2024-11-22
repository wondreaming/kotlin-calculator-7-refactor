package calculator.controller.domain

import calculator.constants.Delimiter.CLONE
import calculator.constants.Delimiter.COMMA
import calculator.constants.Delimiter.CUSTOM_DELIMITER_PREFIX
import calculator.constants.Delimiter.CUSTOM_DELIMITER_SUFFIX

class DelimiterController(
    private val input: String
) {
    fun checkDelimiter(): List<Int?> {
        if (hasCustomDelimiter()) {
            val customDelimiter = getCustomDelimiter()
            val noCustomDelimiter = deleteCustomDelimiter()
            val numbers = splitCustomDelimiter(noCustomDelimiter, customDelimiter)
            return numbers
        }
        val numbers = splitDelimiter()
        return numbers
    }

    private fun hasCustomDelimiter(): Boolean {
        return input.startsWith(CUSTOM_DELIMITER_PREFIX.value) && input.indexOf(CUSTOM_DELIMITER_SUFFIX.value) == 3
    }

    private fun getCustomDelimiter(): String {
        val customDelimiter = input.substring(2, 3)
        return customDelimiter
    }

    private fun deleteCustomDelimiter(): String {
        val noCustomDelimiter = input.substring(5)
        return noCustomDelimiter
    }

    private fun splitDelimiter(): List<Int?> {
        val numbers = input.split(COMMA.value, CLONE.value).map { it.toIntOrNull() }
        return numbers
    }

    private fun splitCustomDelimiter(noCustomDelimiter: String, customDelimiter: String): List<Int?> {
        val numbers = noCustomDelimiter.split(COMMA.value, CLONE.value, customDelimiter).map { it.toIntOrNull() }
        return numbers
    }
}