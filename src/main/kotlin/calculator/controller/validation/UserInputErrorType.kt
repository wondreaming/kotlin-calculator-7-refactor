package calculator.controller.validation

enum class UserInputErrorType(
    private val _errorMessage: String,
) {
    NEGATIVE_NUMBER("음수가 포함되어 있습니다."),
    NOT_INTEGER("int 범위를 초과하는 숫자가 들어왔습니다."),
    NOT_ONE_LETTER("커스텀 구분자가 2글자 이상입니다."),
    NO_LETTER("커스텀 구분자를 입력하지 않았습니다.");

    val errorMessage: String
        get() = ERROR + _errorMessage

    companion object {
        const val ERROR = "[ERROR] "
    }
}