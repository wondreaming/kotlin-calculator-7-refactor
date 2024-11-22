class CalculatorController(
    private val userInteractionController: UserInteractionController = UserInteractionController(),
) {
    fun run() {
        userInteractionController.handleUserInput()
        val result = 0
        userInteractionController.handleResult(result)
    }
}