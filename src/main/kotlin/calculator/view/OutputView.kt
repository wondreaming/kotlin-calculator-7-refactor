package calculator.view

class OutputView {
    fun showMessage() {
        println("덧셈할 문자열을 입력해 주세요.")
    }

    fun showResult(result: Int) {
        println("결과 : $result")
    }
}