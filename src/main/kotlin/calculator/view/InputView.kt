package calculator.view

import camp.nextstep.edu.missionutils.Console

class InputView {
    fun getUserInput(): String {
        val userInput = Console.readLine()
        return userInput
    }
}