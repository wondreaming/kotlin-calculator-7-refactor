package calculator.constants

enum class Delimiter(
    val value: String
) {
    COMMA(","),
    CLONE(":"),
    CUSTOM_DELIMITER_PREFIX("//"),
    CUSTOM_DELIMITER_SUFFIX("\\n");
}