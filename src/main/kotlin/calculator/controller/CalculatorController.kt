import calculator.controller.domain.DelimiterController
import calculator.controller.validation.UserInputValidator

class CalculatorController(
    private val userInteractionController: UserInteractionController = UserInteractionController(),
    private val userInputValidator: UserInputValidator = UserInputValidator(),
) {
    fun run() {
        val userInput = userInteractionController.handleUserInput()
        val demlimiterController = DelimiterController(userInput)
        val numbers: List<String> = demlimiterController.checkDelimiter()
        val allNumbers = userInputValidator.validateUserInput(numbers)
        val result = 0
        userInteractionController.handleResult(result)
    }
}