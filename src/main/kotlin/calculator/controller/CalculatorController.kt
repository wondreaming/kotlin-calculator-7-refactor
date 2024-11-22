import calculator.controller.domain.DelimiterController

class CalculatorController(
    private val userInteractionController: UserInteractionController = UserInteractionController(),
) {
    fun run() {
        val userInput = userInteractionController.handleUserInput()
        val demlimiterController = DelimiterController(userInput)
        val numbers: List<Int?> = demlimiterController.checkDelimiter()

        val result = 0
        userInteractionController.handleResult(result)
    }
}