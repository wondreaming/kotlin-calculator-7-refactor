package calculator.controller.validation

class UserInputValidator {
    fun validateUserInput(numbers: List<String>): List<Int> {
        val newNumbers = checkIsEmpty(numbers)
        checkIsInteger(newNumbers)
        val allNumbers = changeInteger(newNumbers)
        changeNegativeNumber(allNumbers)
        return allNumbers
    }

    private fun checkIsEmpty(numbers: List<String>): List<String> {
        return numbers.map { it.ifEmpty { "0" } }
    }

    private fun checkIsInteger(newNumbers: List<String>) {
        newNumbers.map {
            if (it.toIntOrNull() == null) {
                throw IllegalArgumentException(UserInputErrorType.NOT_INTEGER.errorMessage)
            }
        }
    }

    private fun changeInteger(newNumbers: List<String>): List<Int> {
        return newNumbers.map { it.toInt() }
    }

    private fun changeNegativeNumber(allNumbers: List<Int>) {
        allNumbers.forEach {
            if (it < 0) {
                throw IllegalArgumentException(UserInputErrorType.NEGATIVE_NUMBER.errorMessage)
            }
        }
    }
}