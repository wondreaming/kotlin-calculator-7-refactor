class CalculatorController(
    private val userInteractionController: UserInteractionController = UserInteractionController(),
) {
    fun run() {
        userInteractionController.handleUserInput()
    }
}