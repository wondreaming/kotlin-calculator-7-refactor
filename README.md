# kotlin-calculator-precourse

<hr style="border: 1.5px solid white;">

## 🧑‍💻 프로젝트 정의와 주요기능

### 문자열 덧셈 계산기

- 입력한 문자열에서 숫자를 추출하여 더하는 계산기

### 주요 기능

- 숫자의 합 구하는 계산기

## 📋 기능 구현 목록

### 🙋 입력

- [X] 구분자와 양수로 구성된 문자열


### 🖥 출력

- [X] 시작 안내 메시지 : "덧셈할 문자열을 입력해 주세요."
- [X] 숫자의 합 출력 : "결과 : 6"

### 🌈 로직

- [X] 커스텀 구분자 지정 : "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용
- [X] 구분자로 구분 - 커스텀 구분자, 클론(:), 쉼표(,)
- [ ] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException 발생

<hr style="border: 1px solid white;">

## 고려해야하는 케이스 
- "" => 0
- "1,2" => 3
- "1,2,3" => 6
- "1,2:3" => 6
- //;\n1;2;3 => 6

<hr style="border: 1px solid white;">

## 🚫 예외 상황
<table>
   <tr>
      <td>대상</td>
      <td>구현 여부</td>
      <td>상황</td>
   </tr>
    <tr>
      <td rowspan="5">문자열 입력</td>
      <td></td>
      <td>음수가 포함된 경우</td>
    </tr>
    <tr>
      <td></td>
      <td>문자가 포함된 경우</td>
    </tr>
  <tr>
      <td></td>
      <td>Int 범위를 초과하는 경우</td>
    </tr>
    <tr>
      <td></td>
      <td>커스텀 구분자가 2글자이상인 경우</td>
    </tr>
   <tr>
      <td></td>
      <td>커스텀 구분자에 입력을 안한 경우</td>
    </tr>
</table>
