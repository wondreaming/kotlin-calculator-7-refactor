import calculator.view.InputView
import calculator.view.OutputView

class UserInteractionController(
    private val inputView: InputView = InputView(),
    private val outputView: OutputView = OutputView(),
) {
    fun handleUserInput(): String {
        outputView.showMessage()
        val userInput = inputView.getUserInput()
        return userInput
    }

    fun handleResult(result: Int) {
        outputView.showResult(result)
    }
}