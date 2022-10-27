# java-jungsuk-coding
[도우출판] Java의 정석 전체 소스코드 저장소입니다.

## Chapter 2. 변수(Variable)

### 1. 변수(Variable)란?

- 변하는 수?
- 하나의 값을 저장할 수 있는 기억공간

### 2. 변수의 타입(Data type)

- 기본형(Primitive type)
  - 8개 (boolean, char, byte, short, int, long, float, double)
  - 실제 값을 저장
    - 논리형 - true와 false중 하나를 값으로 갖으며, 조건식과 논리적 계산에 사용한다.
    - 문자형 - 문자를 저장하는데 사용되며, 변수 당 하나의 문자만을 저장할 수 있다.
    - 정수형 - 정수 값을 저장하는데 사용된다. 주로 사용하는 것은 int와 long이며, byte는 이진데이터를 다루는데 사용된다.
    - 실수형 - 실수 값을 저장하는데 사용된다. float와 double이 있다.
- 참조형(Reference type) 
  - 기본형을 제외한 나머지(String, System 등)
  - 객체의 주소를 저장

### 3. 변수의 선언방법

- 타입 변수명;

```java
int score = 100;
String str = new String("abc");
```

### 4. 명명규칙(Naming convention)

1. 대소문자가 구분되며 길이에 제한이 없다.
   - True와 true는 서로 다른 것으로 간주된다.
2. 예약어(Reserver word)를 사용해서는 안 된다.
   - true는 예약어라 사용할 수 없지만, True는 가능하다.
3. 숫자로 시작해서는 안 된다.
   - top10은 허용하지만, 7up은 허용되지 않는다.
4. 특수문자는 '-'와 '$'만을 허용한다.
   - $harp은 허용되지만 S$arp는 허용되지 않는다.

#### 4.1 명명규칙 - 권장사항

1. 클래스 이름의 첫 글자는 항상 대문자로 한다.
   - 변수와 메서드 이름의 첫 글자는 항상 소문자로 한다.
2. 여러 단어 이름은 단어의 첫 글자를 대문자로 한다.
   - lastIndexOf, StringBuffer
3. 상수의 이름은 대문자로 한다. 단어는 '-'로 구분한다.
   - PI, MAX_NUMBER

### 5. 변수, 상수, 리터럴

- 변수(variable) - 하나의 값을 저장하기 위한 공간
- 상수(constant) - 한 번만 값을 저장할 수 있는 공간
- 리터럴(literal) - 그 자체로 값을 의미하는 것

### 6. 리터럴과 접미사

```java
boolean power = true;
char ch = 'A';
long l = 100000000000000L;
int oct = 0100;
```

### 7. 변수의 기본값과 초기화

- 변수의 초기화 : 변수에 처음으로 값을 저장하는 것

```java
boolean isGood = false;
```

### 8. 문자와 문자열

- 문자열 + any type -> 문자열

  ```java 
  "7" + 7 -> "77"
  ```

- any type + 문자열 -> 문자열

  ```java
  14 + "" -> "14"
  ```

###  9. 정수의 오버플로우(Overflow)

```java
byte b = 127;
byte b = 128; // error
```

### 10. 형변환(Casting)

- 값의 타입을 다른 타입으로 변환하는 것

- boolean을 제외한 7개의 기본형은 서로 형변환이 가능

  |     변환     |    수식    | 결과  |
  | :----------: | :--------: | :---: |
  | int -> char  | (char) 65  |  'A'  |
  | char -> int  | (int) 'A'  |  65   |
  | float -> int | (int) 1.6f |   1   |
  | int -> float | (float) 10 | 10.0f |

### 11. 형식화된 출력 - printf()

- println()의 단점 - 출력형식 지정불가

  1. 실수의 자리수 조절불가 - 소수점 n자리만 출력하려면?

  ```java
  System.out.println(10.0 / 3); // 3.3333..
  ```

  2. 10진수로만 출력된다 - 8진수, 16진수로 출력하려면?

  ```java
  System.out.println(0x1A); // 26
  ```

- printf()로 출력형식 지정가능

```java
System.out.printf("%.2f", 10.0 / 3); // 3.33
```

### 12. printf()의 지시자

| 지시자 |            설명             |
| :----: | :-------------------------: |
|   %b   |    boolean 형식으로 출력    |
|   %d   |  10진 정수의 형식으로 출력  |
|   %o   |  8진 정수의 형식으로 출력   |
| %x, %X |  16진 정수의 형식으로 출력  |
|   %f   | 부동 소수점의 형식으로 출력 |
| %e, %E | 지수 표현식의 형식으로 출력 |
|   %c   |         문자로 출력         |
|   %s   |        문자열로 출력        |

### 13. 화면에서 입력받기

- Scanner란?

  : 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스

- Scanner를 사용하려면..

  1. import문 추가

  ```java
  import java.util.*;
  ```

  2. Scanner객체의 생성

  ```java
  Scanner scanner = new Scanner(System.in);
  ```

  3. Scanner객체를 사용

  ```java
  int num = scanner.nextInt(); // 화면에서 입력받은 정수를 num에 저장
  int num2 = Integer.parseInt(input); // 문자열(input)을 숫자(num)으로 변환
  ```

## Chapter 2. 연산자(Operator)

### 1. 연산자(Operator)란?

- 연산자

  : 어떠한 기능을 수행하는 기호(+, -, *, / 등)

- 피연산자(Operand)

  : 연산자의 작업 대상(변수, 상수, 리터럴, 수식)

### 2. 연산자의 종류

1. 단항 연산자 : +  -  ++  --  ~  !

2. 이항 연산자

   2-1 산술 : ``` +  -  *  /  %  <<  >>  >>>```

   2-2 비교 : ```>  <  >=  <=  ==  !=```

   2-3 논리 : ```&&  ||  &  ^  |```

3. 삼항 연산자 : ```? : ```

4. 대입 연산자 : ```=```

### 3. 연산자의 우선순위

- 괄호의 우선순위가 제일 높다.

- 산술 > 비교 > 논리 > 대입

- 단항 > 이항 > 삼항

- 연산자의 연산 진행방향은 왼쪽에서 오른쪽(->)이다.

  단, 단항, 대입 연산자만 오른쪽에서 왼쪽(<-)이다.

### 4. 증감연산자 - ++,  --

- 증가연산자(++) : 피연산자의 값을 1 증가시킨다.
- 감소연산자(--) : 피연산자의 값을 1 감소시킨다.

### 5. 부호연산자(+, -)와 논리부정연산자(!)

- 부호연산자(+, -) : ```+```는 피연산자에 1을 곱하고 ```-```는 피연산자에 -1을 곱한다.
- 논리부정연산자(!) : true는 false로, false는 true로 피연산자가 boolean일 때만 사용가능

### 6. 비트전환연산자 - ~

- 정수를 2진수로 표현했을 때, 1을 0으로 0은 1로 바꾼다. 정수형에만 사용가능

### 7. 이항연산자의 특징

- 이항연산자는 연산을 수행하기 전에 피연산자의 타입을 일치시킨다.

1. int보다 크기가 작은 타입은 int로 변환한다. (byte, char, short -> int)
2. 피연산자 중 표현범위가 큰 타입으로 형변환 한다.

```java
char + int -> int + int -> int
float + int -> float + float -> float
float + double -> double + double -> double
```

3. Math.round() : 소수점 첫째자리에서 반올림한 값을 반환

### 8. 나머지연산자 - %

- 나누기한 나머지를 반환한다.
- 홀수, 짝수 등 배수검사에 주로 사용

### 9. 쉬프트연산자 - <<.  >>,  >>>

- 2^n으로 곱하거나 나눈 결과를 반환한다.
- 곱셈, 나눗셈보다 빠르다.

```java
x << n 은 x * 2^n과 같다.
x >> n 은 x / 2^n과 같다.
```

### 10. 비교연산자 - >  <  >=  <=  ==  !=

- 피연산자를 같은 타입으로 변환한 후에 비교한다.

  결과 값은 true 또는 false이다.

- 기본형(boolean 제외)과 참조형에 사용할 수 있으나 참조형에는 ==와 !=만 사용할 수 있다.

### 11. 비트연산자 - &  |  ^

- 피연산자를 비트단위로 연산한다. 실수형(float, double)
  - OR연산자(|) : 피연산자 중 어느 한 쪽이 1이면 1이다.
  - AND연산자(&) : 피연산자 양 쪽 모두 1이면 1이다.
  - XOR연산자(^) : 피연산자가 서로 다를 때 1이다.

### 12. 논리연산자 - &&  ||

- 피연산자가 반드시 boolean이어야 하며 연산결과도 boolean이다.

  &&가 ||보다 우선순위가 높다. 같이 사용되는 경우 괄호를 사용하자

  - OR연산자(||) : 피연산자 중 어느 한 쪽이 true면 true이다.
  - AND연산자(&&) : 피연산자 양 쪽 모두 true이면 true이다.

### 13. 삼항 연산자 - ?  :

- 조건식의 연산결과가 true이면 '식1'의 결과를 반환하고 false이면 '식2'의 결과를 반환한다.

  ```(조건식) ? 식1 : 식2```

  ```java
  int x = -10;
  int absX = x >= 10 ? x : -x;
  ```

### 14. 대입연산자 - =

- 오른쪽 피연산자의 값을 왼쪽 피연산자에 저장한다. 단, 왼쪽 피연산자는 상수가 아니어야 한다.

```java
int i = 0;
i = i + 3;

final int MAX = 3;
MAX = 10; // error
```

## Chapter 4. 조건문과 반복문

### 1. 조건문(if, switch)

#### 1.1 조건문 - if, switch

- 조건문은 조건식과 실행될 하나의 문장 또는 블럭{}으로 구성

  ```java
  if(조건식) {
      문장들
  }
  ```

- Java에서 조건문은 if문과 switch문 두 가지 뿐이다.
- if문이 주로 사용되며, 경우의 수가 많은 경우 switch문을 사용할 것을 고려한다.
- 모든 switch문은 if문으로 변경이 가능하지만, if문은 switch문으로 변경할 수없는 경우가 많다.

#### 1.2 if문

- if문은 if, if-else, if-else if의 세가지 형태가 있다.
- 조건식의 결과는 반드시 true 또는 false이어야 한다.

```java
if(score >= 90) {
    System.out.println("A등급");
} else if(score >= 80) {
    System.out.println("B등급");
} else if(score >= 70) {
    System.out.println("C등급");
} else {
    System.out.println("F등급");
}
```

#### 1.3 중첩 if문

- if문 안에 또 다른 if문을 중첩해서 넣을 수 있다.
- if문의 중첩횟수에는 거의 제한이 없다.

```java
if(score >= 90) { // score가 90점 보다 같거나 크면 A학점
	grade = "A";
	
    if(score >= 98) { // 90점 이상 중에서도 98점 이상은 A+
        grade += "+"; // grade = grade + "+";
    } else if(score < 94) {
        grade += "-";
    }
} else if(score >= 80) { // score가 80점 보다 같거나 크면 B학점
    grade = "B";
    
    if(score >= 88) {
        grade += "+";
    } else if(score < 84) {
        grade += "-";
    }
} else { // 나머지는 C학점
    grade = "C";
}
```

#### 1.4 switch문

- if문의 조건식과 달리, 조건식의 계산결과가 int타입의 정수와 문자열만 가능
- 조건식의 계산결과가 일치하는 case문으로 이동 후 break문을 만날 때까지 문장들을 수행한다.(break문이 없으면 switch문의 끝까지 진행한다.)
- 일치하는 case문의 값이 없는 경우 default문으로 이동한다.(default문 생략가능)
- case문의 값으로 변수를 사용할 수 없다.(리터럴, 상수, 문자열 상수만 가능)

```java
int level = 3;

switch(level) {
    case 3 :
        grantDelete(); // 삭제권한을 준다.
    case 2 :
        grantWrite(); // 쓰기권한을 준다.
    case 1 :
        grantRead(); // 읽기권한을 준다.
}
```

#### 1.5 중첩 switch문

- switch문 안에 또 다른 switch문을 중첩해서 넣을 수 있다.
- switch문의 중첩횟수에는 거의 제한이 없다.

#### 1.6 if문과 switch문의 비교

- if문이 주로 사용되며, 경우의 수가 많은 경우 switch문을 사용할 것을 고려한다.
- 모든 switch문은 if문으로 변경이 가능하지만, if문은 switch문으로 변경할 수 없는 경우가 많다.
- if문 보다 switch문이 더 간결하고 효율적이다.

```java
if(num==1) {
    System.out.println("SK");
} else if(num==6) {
    System.out.println("KTF");
} else if(num==9) {
    System.out.println("LG");
} else {
    System.out.println("UNKNOWN");
}
```

```java
switch(num) {
    case 1:
        System.out.println("SK");
        break;
    case 2:
        System.out.println("KTF");
        break;
    case 3:
        System.out.println("LG");
        break;
    default:
        System.out.println("UNKNOWN");
}
```

#### 1.7 Math.random()

- Math클래스에 정의된 난수 발생함수
- 0.0과 1.0사이의 double값을 반환한다.(0.0 <= Math.random() <= 1.0)

```java
예) 1~10범위의 임의의 정수를 얻는 식 만들기
    int score = (int)(Math.random() * 10) + 1;
```

### 2. 반복문(for, while, do-while)

#### 2.1 반복문 - for, while, do-while

- 문장 또는 문장들을 반복해서 수행할 때 사용
- 조건식과 수행할 블럭{} 또는 문장으로 구성
- 반복회수가 중요한 경우에 for문을 그 외에는 while문을 사용한다.
- for문과 while문은 서로 변경가능하다.
- do-while문은 while문의 변형으로 블럭{}이 최소한 한번은 수행될 것을 보장한다.

#### 2.2 for문

- 초기화, 조건식, 증감식 그리고 수행할 블럭{} 또는 문장으로 구성

```java
예) 1부터 10까지의 정수를 더하기
    int sum = 0;

	for(int i=1; i<10; i++) {
        sum += i; // sum = sum + i;
    }
```

#### 2.3 중첩 for문

- for문 안에 또 다른 for문을 포함시킬 수 있다.
- for문의 중첩횟수에는 거의 제한이 없다.

```java
for(int i=2; i<=9; i++) {
    for(int j=1; j<=9; j++) {
        System.out.println(i + "*" + j + "=" + i*j);
    }
}
```

#### 2.4 while문

- 조건식과 수행할 블럭{} 또는 문장으로 구성

```java
int i = 10;

while(i >= 0) {
    System.out.println(i--);
}
```

#### 2.5 중첩 while문

- while문 안에 또 다른 while문을 포함시킬 수 있다.
- while문의 중첩횟수에는 거의 제한이 없다.

```java
int i = 2;

while(i <= 9) {
    int j = 1;
    while(j <= 9) {
        System.out.println(i + "*" + j + "=" + i*j);
        j++;
    }
    i++;
}
```

#### 2.6 do-while문

- while문의 변형, 블럭{}을 먼저 수행한 다음에 조건식을 계산한다.
- 블럭{}이 최소한 1번 이상 수행될 것을 보장한다.

```java
do {
    // 조건식의 연산결과가 true일 때 수행될 문장들을 적는다.
} while(조건식);
```

#### 2.7 break문

- 자신이 포함된 하나의 반복문 또는 switch문을 빠져 나온다.
- 주로 if문과 함께 사용해서 특정 조건을 만족하면 반복문을 벗어나게 한다.

#### 2.8 continue문

- 자신이 포함된 반복문의 끝으로 이동한다.(다음 반복으로 넘어간다.)
- continue문 이후의 문장들은 수행되지 않는다.

#### 2.9 이름 붙은 반복문과 break, continue

- 반복문 앞에 이름을 붙이고, 그 이름을 break, continue와 같이 사용함으로써 둘 이상의 반복문을 벗어나거나 반복을 건너뛰는 것이 가능하다.

## Chapter 5. 배열

### 1. 배열(array)

#### 1.1 배열이란?

- 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
- 많은 양의 값(데이터)을 다룰 때 유용하다.
- 배열의 각 요소는 서로 연속적이다.

#### 1.2 배열의 선언과 생성

- 타입 또는 변수이름 뒤에 대괄호[]를 붙여서 배열을 선언한다.

|     선언방법     |   선언 예    |
| :--------------: | :----------: |
| 타입[] 변수이름; | int[] score; |
| 타입 변수이름[]; | int score[]; |

- 배열을 선언한다고 해서 값을 저장할 공간이 생성되는 것이 아니라 배열을 다루는데 필요한 변수가 생성된다.

```java
int[] score; // 배열을 선언한다. (생성된 배열을 다루는데 사용될 참조변수 선언)
score = new int[5]; // 배열을 생성한다. (5개의 int값을 저장할 수 있는 공간생성)
```

#### 1.3 배열의 초기화

- 생성된 배열에 처음으로 값을 저장하는 것

```java
int[] score;
score = new int[] {100, 90, 80, 70, 60};
```

#### 1.4 배열의 활용

- 배열의 값을 저장하고 읽어오기

```java
score[3] = 100; // 배열 score의 4번째 요소에 100을 저장한다.
int value = score[3]; // 배열 score의 4번째 요소에 저장된 값을 읽어서 value에 저장
```

- '배열이름.length'는 배열의 길이를 알려준다.

```java
int[] score = {100, 90, 80, 70, 60};

for(int i=0; i<score.length; i++) {
    System.out.println(score[i]);
}
```

#### 1.5 다차원 배열의 선언과 생성

- '[]'의 개수가 차원의 수를 의미한다.

```java
int[][] score = new int[5][3]; // 5행 3열의 2차원 배열을 생성한다.
```

#### 1.6 가변배열

- 다차원 배열에서 마지막 차수의 크기를 지정하지 않고 각각 다르게 지정

#### 1.7 배열의 복사

- for문을 이용한 배열의 복사

```java
int[] number = {1, 2, 3, 4, 5};
int[] newNumber = new int[10];

for(int i=0; i<number.length; i++) {
    newNumber[i] = number[i]; // 배열 number의 값을 newNumber에 저장한다.
}
```

- System.arraycopy()를 이용한 배열의 복사

```java
System.arraycopy(arr1, 0, arr2, 0, arr1.length);
				-> arr1[0]에서 arr2[0]으로 arr1.length개의 데이터를 복사
```

#### 1.8 사용자 입력받기 - 커맨드라인

- 커맨드라인에서 입력된 값들은 문자열 배열에 담겨 main메서드에 전달된다.

#### 1.9 사용자 입력받기 - 입력창(InputDialog)

- Swing패키지의 JOptionPane.showInputDialog()를 사용

## Chapter 6. 객체지향개념 Ⅰ

### 1. 객체지향언어란?

#### 1.1 객체지향언어의 역사

- 과학, 군사적 모의실험을 위해 컴퓨터를 이용한 가상세계를 구현하려는 노력으로부터 객체지향이론이 시작됨
- 1960년대 최초의 객체지향언어 Simula탄생
- 1980년대 절차방식의 프로그래밍의 한계를 객체지향방식으로 극복하려고 노력함
- 1995년 말 Java탄생, 객체지향언어가 프로그래밍 언어의 주류가 됨

#### 1.2 객체지향언어의 특징

1. 기존의 프로그래밍언어와 크게 다르지 않다.
   - 기존의 프로그래밍 언어에 몇가지 규칙을 추가한 것일 뿐이다.
2. 코드의 재사용성이 높다.
   - 새로운 코드를 작성할 때 기존의 코드를 이용해서 쉽게 작성할 수 있다.
3. 코드의 관리가 쉬워졌다.
   - 코드간의 관계를 맺어줌으로써 보다 적은 노력으로 코드변경이 가능하다.
4. 신뢰성이 높은 프로그램의 개발을 가능하게 한다.
   - 제어자와 메서드를 이용해서 데이터를 보호하고, 코드의 중복을 제거하여 코드의 불일치로 인한 오류를 방지할 수 있다.

### 2. 클래스와 객체

#### 2.1 클래스와 객체의 정의와 용도

- 클래스의 정의 - 클래스란 객체를 정의해 놓은 것이다.
- 클래스의 용도 - 클래스는 객체를 생성하는데 사용된다.



- 객체의 정의 - 실제로 존재하는 것, 사물 또는 개념
- 객체의 용도 - 객체의 속성과 기능에 따라 다름.

|   클래스    |  객체  |
| :---------: | :----: |
| 제품 설계도 |  제품  |
|  TV설계도   |   TV   |
| 붕어빵기계  | 붕어빵 |

#### 2.2 객체와 인스턴스

- 객체 ≒ 인스턴스

  - 객체(object)는 인스턴스(instance)를 포함하는 일반적인 의미

  ```java
  책상은 인스턴스다.		-> 책상은 책상 클래스의 객체다.
  책상은 객체다.		  -> 책상은 책상 클래스의 인스턴스다. 
  ```

- 인스턴스화(instantiate)

  - 클래스로부터 인스턴스를 생성하는 것.

  ```java
  클래스 ---------> 인스턴스(객체)
        (인스턴스화)
  ```

#### 2.3 객체의 구성요소 - 속성과 기능

- 객체는 속성과 기능으로 이루어져 있다.
  - 객체는 속성과 기능의 집합이며, 속성과 기능을 객체의 멤버라고 한다.
- 속성은 변수로, 기능은 메서드로 정의한다.
  - 클래스를 정의할 때 객체의 속성은 변수로, 기능은 메서드로 정의한다.

| 속성(변수)   | 크기, 길이, 높이, 색상, 볼륨, 채널 등                |
| ------------ | ---------------------------------------------------- |
| 기능(메서드) | 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 높이기 등 |

```java
class Tv {
    String color; // 색깔
    boolean power; // 전원상태(on/off)
    int channel; // 채널
    
    void power() { power = !power } // 전원on/off
    void channelUp(channel++:) // 채널 높이기
    void channelDown(channel--;) // 채널 낮추기
}
```

#### 2.4 인스턴스의 생성과 사용

- 인스턴스의 생성방법

```java
클래스명 참조변수명; // 객체를 다루기 위한 참조변수 선언
참조변수명 = new 클래스명(): // 객체생성 후, 생서된 객체의 주소를 참조변수에 저장
```

```java
Tv t1 = new Tv();
Tv t2 = new Tv();
t2 = t1; // t1의 값을 t2에 저장
t.channel = 7;
t.channelDown();
System.out.println(t.channel);
```

#### 2.5 클래스의 또 다른 정의

1. 클래스 - 데이터와 함수의 결합
   - 변수 - 하나의 데이터를 저장할 수 있는 공간
   - 배열 - 같은 타입의 여러 데이터를 저장할 수 있는 공간
   - 구조체 - 타입에 관계없이 서로 관련된 데이터들을 저장할 수 있는 공간
   - 클래스 - 데이터와 함수의 결합(구조체 + 함수)
2. 클래스 - 사용자 정의 타입
   - 프로그래머가 직접 새로운 타입을 정의할 수 있다.
   - 서로 관련된 값을 묶어서 하나의 타입으로 정의한다.

### 3. 변수의 메서드

#### 3.1 선언위치에 따른 변수의 종류

"변수의 선언위치가 변수의 종류와 범위(scope)를 결정한다."

```java
class Variables {
    int iv;            // 인스턴스변수
    static int cv;     // 클래스변수(static변수, 공유변수) -> 클래스영역
    
    void method() {
        int lv = 0;    // 지역변수 -> 메서드영역
    }
}
```

- 인스턴스변수(instance variable)
  - 각 인스턴스의 개별적인 저장공간, 인스턴스마다 다른 값 저장가능
  - 인스턴스 생성 후, '참조변수.인스턴스변수명' 으로 접근
  - 인스턴스를 생성할 때 생성되고, 참조변수가 없을 때 가비지컬렉터에 의해 자동제거됨
- 클래스변수(class variable)
  - 같은 클래스의 모든 인스턴스들이 공유하는 변수
  - 인스턴스 생성없이 '클래스이름.클래스변수명' 으로 접근
  - 클래스가 로딩될 때 생성되고 프로그램이 종료될 때 소멸
- 지역변수(local variable)
  - ```메서드 내```에 선언되며, 메서드의 종료와 함께 소멸
  - 조건문, 반복문의 블럭{} 내에 선언된 지역변수는 블럭을 벗어나면 소멸

#### 3.2 클래스변수와 인스턴스변수

"인스턴스변수는 인스턴스가 생성될 때마다 생성되므로 인스턴스마다 각기 다른 값을 유지할 수 있지만, 클래스변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다."

```java
class Card {
    String kind; // 무늬
    int number;  // 숫자
    
    static int width = 100;  // 폭
    static int height = 250; // 높이
}
```

#### 3.3 메서드(method)

- 메서드란?

  - 작업을 수행하기 위한 명령문의 집합

  - 어떤 값을 입력받아서 처리하고 그 결과를 돌려준다.

    (입력받는 값이 없을 수도 있고 결과를 돌려주지 않을 수도 있다.)

- 메서드의 장점과 작성지침

  1. 반복적인 코드를 줄이고 코드의 관리가 용이하다.
  2. 반복적으로 수행되는 여러 문장을 메서드로 작성한다.
  3. 하나의 메서드는 한 가지 기능만 수행하도록 작성하자.
  4. 관련된 여러 문장을 메서드로 작성한다.

- 메서드를 정의하는 방법 - 클래스 영역에만 정의할 수 있음

#### 3.4 return문

- 메서드가 정상적으로 종료되는 경우

  - 메서드의 블럭{}의 끝에 도달했을 때
  - 메서드의 블럭{}을 수행 도중 return문을 만났을 때

- return문

  - 현재 실행 중인 메서드를 종료하고 호출한 메서드를 되돌아간다.

  ```java
  1. 반환값이 없는 경우 - return문만 써주면 된다.
      	   return;
  2. 반환값이 있는 경우 - return문 뒤에 반환값을 지정해 주어야 한다.
      	   return 반환값;
  ```

- 주의사항

  1. 반환값이 있는 메서드는 모든 경우에 return문이 있어야 한다.
  2. return문을 적절히 사용하면 코드가 간결해 진다.

#### 3.5 메서드의 호출

- 메서드의 호출방법

```java
참조변수.메서드 이름(); // 메서드에 선언된 매개변수가 없는 경우
참조변수.메서드 이름(값1, 값2, ...); // 메서드에 선언된 매개변수가 있는 경우
```

#### 3.6 JVM의 메모리 구조

1. 메서드영역(Method Area)

   - 클래스 정보와 클래스변수가 저장되는 곳

2. 호출스택(Call Stack)

   - 메서드의 작업공간, 메서드가 호출되면 메서드 수행에 필요한 메모리공간을 할당받고 메서드가 종료되면 사용하던 메모리를 반환한다.

     - 특징

       1. 메서드가 호출되면 수행에 필요한 메모리를 스택에 할당받는다.
       2. 메서드가 수행을 마치면 사용했던 메모리를 반환한다.
       3. 호출스택의 제일 위에 있는 메서드가 현재 실행중인 메서드다.
       4. 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드다.

       ```java
       class CallStackTest {
           public static void main(String[] args) {
               firstMethod();
           }
           static void firstMethod() {
               secondMethod();
           }
           static void secondMethod() {
               System.out.println("secondMethod()");
           }
       }
       ```

3. 힙(Heap)

   - 인스턴스가 생성되는 공간, new연산자에 의해서 생성되는 배열과 객체는 모두 여기에 생성된다.

#### 3.7 기본형 매개변수와 참조형 매개변수

- 기본형 매개변수 - 변수의 값을 읽기만 할 수 있다.(read only)
- 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다.(read & write)

#### 3.8 재귀호출(recursive call)

- 재귀호출이란?
  - 메서드 내에서 자기자신을 반복적으로 호출하는 것
  - 재귀호출은 반복문으로 바꿀 수 있으며 반복문보다 성능이 나쁨
  - 이해하기 쉽고 간결한 코드를 작성할 수 있다
- 재귀호출의 예
  - 팩토리얼, 제곱, 트리운행, 폴더목록표시 등

#### 3.9 클래스메서드(static메서드)와 인스턴스메서드

- 인스턴스메서드
  - 인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
  - 인스턴스변수나 인스턴스메서드와 관련된 작업을 하는 메서드
  - 메서드 내에서 인스턴스변수 사용가능
- 클래스메서드
  - 객체생성없이 '클래스이름.메서드이름()'으로 호출
  - 인스턴스변수나 인스턴스메서드와 관련없는 작업을 하는 메서드
  - 메서드 내에서 인스턴스변수 사용불가
  - 메서드 내에서 인스턴스변수를 사용하지 않는다면 static을 붙이는 것을 고려한다.

#### 3.10.1 멤버간의 참조와 호출 - 메서드의 호출

"같은 클래스의 멤버간에는 객체생성이나 참조변수 없이 참조할 수 있다. 그러나 static멤버들은 인스턴스멤버들을 참조할 수 없다."

```java
class TestClass {
    void instanceMethod() {} // 인스턴스메서드
    static void staticMethod() {} // static메서드
    
    void instanceMethod2() {} // 인스턴스메서드
    	instanceMethod(); // 다른 인스턴스메서드를 호출한다.
    	staticMethod(); // static메서드를 호출한다.
	}
	static void staticMethod2() { // static메서드
    	instanceMethod(); // error, 인스턴스메서드를 호출할 수 없다.
        staticMethod(); // static메서드는 호출할 수 있다.
    }
}
```

#### 3.10.2 멤버간의 참조와 호출 - 변수의 접근

"같은 클래스의 멤버간에는 객체생성이나 참조변수 없이 참조할 수 있다. 그러나 static멤버들은 인스턴스멤버들을 참조할 수 없다."

```java
class TestClass2 {
    int iv; // 인스턴스변수
    static int cv; // 클래스변수
    
    void instanceMethod() { // 인스턴스메서드
    	System.out.println(iv); // 인스턴스변수를 사용할 수 있다.
    	System.out.println(cv); // 클래스변수를 사용할 수 있다.
    }
    static void staticMethod() { // static메서드
    	System.out.println(iv); // error, 인스턴스변수를 사용할 수 없다.
    	System.out.println(cv); // 클래스변수를 사용할 수 있다.
    }
}
```

### 4. 메서드 오버로딩

#### 4.1 메서드 오버로딩이란?

"하나의 클래스에 같은 이름의 메서드를 여러 개 정의하는 것을 메서드 오버로딩, 간단히 오버로딩이라고 한다."

#### 4.2 오버로딩의 조건

1. 메서드의 이름이 같아야 한다.

2. 매개변수의 개수 또는 타입이 달라야 한다.

3. 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않음

   (리턴타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다.)

#### 4.3 오버로딩의 예

- System.out.println메서드

  - 다양하게 오버로딩된 메서드를 제공함으로써 모든 타입의 변수를 출력할 수 있도록 설계

  ```java
  void println()
  void println(boolean x)
  void println(char x)
  void println(char[] x)
  ```

- 매개변수의 이름이 다른 것은 오버로딩이 아니다.

```java
int add(int a, int b) { return a+b; }
int add(int x, int y) { return x+y; }
```

- 리턴타입은 오버로딩의 성립조건이 아니다.

```java
int add(int a, int b) { return a+b; }
int add(int a, int b) { return (long)(a+b); }
```

- 매개변수의 타입이 다르므로 오버로딩이 성립한다.

```java
long add(int a, int b) { return a+b; }
long add(long a, long b) { return a+b; }
```

- 오버로딩의 올바른 예 - 매개변수는 다르지만 같은 의미의 기능수행

```java
int add(int a, int b) { return a+b; }
long add(long a, long b) { return a+b; }
int add(int[] a) {
    int result = 0;
    
    for(int i=0; i<a.length; i++) {
        result += a[i];
    }
    return result;
}
```

### 5. 생성자

#### 5.1 생성자란?

- 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
- 인스턴스 변수의 초기화 또는 인스턴스 생성시 수행할 작업에 사용
- 몇가지 조건을 제외하고는 메서드와 같다.
- 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.

```java
Card c = new Card();

1. 연산자 new에 의해서 메모리(heap)에 Card클래스의 인스턴스가 생성된다.
2. 생성자 Card()가 호출되어 수행된다.
3. 연산자 new의 결과로, 생성된 Card인스턴스의 주소가 반환되어 참조변수 c에 저장된다.
```

#### 5.2 생성자의 조건

1. 생성자의 이름은 클래스의 이름과 같아야 한다.
2. 생성자는 리턴값이 없다. (하지만 void를 쓰지 않는다.)

#### 5.3 기본 생성자(default constructor)

- 매개변수가 없는 생성자

- 클래스에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가한다.

  (생성자가 하나라도 있으면 컴파일러는 기본 생성자를 추가하지 않는다.)

"모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다."

```java
class Data1 {
    int value;
}

class Data2 {
    int value;
    Data2(int x) { // 매개변수가 있는 생성자
    	value = x;
    }
}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1;
        Data2 d2 = new Data2; // 컴파일 error 발생
    }
}
```

#### 5.4 매개변수가 있는 생성자

```java
class Car {
    String color; // 색상
    String gearType; // 변속기 종류 - auto(자동), manual(수동)
    int door; // 문의 개수
    
    Car() {} // 생성자
    Car(String c, String g, int d) { // 생성자
    	color = c;
    	gearType = g;
   		door = d;
    }
}
```

#### 5.5 생성자에서 다른 생성자 호출하기 - this()

- 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용
- 다른 생성자 호출은 생성자의 첫 문장에서만 가능

#### 5.6 참조변수 this

- 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어있음
- 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재

#### 5.7 생성자를 이용한 인스턴스의 복사

- 인스턴스간의 차이는 인스턴스변수의 값 뿐 나머지는 동일하다.
- 생성자에서 참조변수를 매개변수로 받아서 인스턴스변수들의 값을 복사한다.
- 똑같은 속성값을 갖는 독립적인 인스턴스가 하나 더 만들어진다.

### 6. 변수의 초기화

#### 6.1 변수의 초기화

- 변수를 선언하고 처음으로 값을 저장하는 것
- 멤버변수(인스턴스변수, 클래스변수)와 배열은 각 타입의 기본값으로 자동초기화되므로 초기화를 생략할 수 있다.
- 지역변수는 사용전에 꼭! 초기화를 해주어야 한다.

```java
class InitTest {
    int x; // 인스턴스변수
    int y = x; // 인스턴스변수
    
    void method1() {
        int i; // 지역변수
        int j = i; // 컴파일 에러, 지역변수를 초기화하지 않고 사용했음
    }
}
```

#### 6.2 멤버변수의 초기화

- 멤버변수의 초기화 방법

  1. 명시적 초기화

  ```java
  class Car {
      int door = 4; // 기본형 변수의 초기화
      Engine e = new Engine(); // 참조형 변수의 초기화
  }
  ```

  2. 생성자(constructor)

  ```java
  Car(String color, String gearType, int door) {
      this.color = color;
      this.gearType = gearType;
      this.door = door;
  }
  ```

  3. 초기화 블럭(initialization block)
     - 인스턴스 초기화 블럭 : {}, 생성자에서 공통적으로 수행되는 작업에 사용되며 인스턴스가 생성될 때 마다 (생성자보다 먼저) 실행된다.
     - 클래스 초기화 블럭 : static {}, 클래스변수의 복잡한 초기화에 사용되며 클래스가 로딩될 때 실행된다.

#### 6.4 멤버변수의 초기화 시기와 순서

- 클래스변수 초기화 시점 : 클래스가 처음 로딩될 때 단 한번
- 인스턴스변수 초기화 시점 : 인스턴스가 생성될 때 마다

## Chapter 7. 객체지향개념 Ⅱ

### 1. 상속(inheritance)

#### 1.1 상속의 정의와 장점

- 기존의 클래스를 재사용해서 새로운 클래스를 작성하는 것
- 두 클래스를 조상과 자손으로 관계를 맺어주는 것
- 자손은 조상의 모든 멤버를 상속받는다. (생성자, 초기화블럭 제외)
- 자손의 멤버개수는 조상보다 적을 수 없다. (같거나 많다.)

```java
class Point {
    int x, y;
}

class Point3D extends Point { // class 자손클래스 extends 조상클래스
    int z;
}
```

#### 1.2.1 클래스간의 관계 - 상속관계

- 공통부분은 조상에서 관리하고 개별부분은 자손에서 관리한다.
- 조상의 변경은 자손에 영향을 미치지만, 자손의 변경은 조상에 아무런 영향을 미치지 않는다.

#### 1.2.2 클래스관의 관계 - 포함관계(composite)

- 한 클래스의 멤버변수로 다른 클래스를 선언하는 것
- 작은 단위의 클래스를 먼저 만들고, 이 들을 조합해서 하나의 커다란 클래스를 만든다.

```java
class Circle {
    Point c = new Point(); // 원점
    int r; // 반지름(radius)
}
```

#### 1.3 클래스간의 관계결정하기 - 상속 vs 포함

- 가능한 한 많은 관계를 맺어주어 재사용성을 높이고 관리하기 쉽게 한다.
- 'is-a'와 'has-a'를 가지고 문장을 만들어 본다.

```java
상속관계 - '~은 ~이다.(is-a)'				 -> 원(Circle)은 도형(Shape)이다.
포함관계 - '~은 ~을 가지고 있다.(has-a)'	   -> 원(Circle)은 점(Point)을 가지고 있다. 
```

#### 1.4 단일상속(single inheritance)

- Java는 단일상속만을 허용한다.
- 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 한다.

#### 1.5 Object 클래스 - 모든 클래스의 최고조상

- 조상이 없는 클래스는 자동적으로 Object 클래스를 상속받게 된다.

- 상속계층도의 최상위에는 Object 클래스가 위치한다.

- 모든 클래스는 Object 클래스에 정의된 11개의 메서드를 상속받는다.

  ex) toString(), equals(Object obj), hashCode(), ...

### 2. 오버라이딩(overriding)

#### 2.1 오버리이딩이란?

- 조상클래스로부터 ```상속받은 메서드의 내용을``` 상속받는 클래스에 맞게 ```변경하는 것```을 오버라이딩이라고 한다.

```java
class Point {
    int x, y;
    
    String getLocation() {
        return "x:" + x + ", y:" + y;
    }
}

class Point3D extends Point {
    int z;
    
    String getLocation() { // 오버라이딩
        return "x:" + x + ", y:" + y + ", z:" + z;
    }
}
```

#### 2.2 오버라이딩의 조건

1. 선언부가 같아야 한다. (이름, 매개변수, 리턴타입)
2. 접근제어자를 좁은 범위로 변경할 수 없다.
   	- 조상의 메서드가 protected라면, 범위가 같거나 넓은 protected나 public으로만 변경할 수 있다.

3. 조상클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.

#### 2.3 오버로딩 vs 오버라이딩

- 오버로딩 - 기존에 없는 새로운 메서드를 정의하는 것 (new)
- 오버라이딩 - 상속받은 메서드의 내용을 변경하는 것 (change, modify)

#### 2.4 super - 참조변수

- this - 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어있음

  ​          모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재

- super - this와 같음, 조상의 멤버와 자신의 멤버를 구별하는 데 사용

#### 2.5 super() - 조상의 생성자

  - 자손클래스의 인스턴스를 생성하면, 자손의 멤버와 조상의 멤버가 합쳐진 하나의 인스턴스가 생성된다.

		- 조상의 멤버들도 초기화되어야 하기 때문에 자손의 생성자의 첫 문장에서 조상의 생성자를 호출해야 한다.

### 3. package와 import

#### 3.1 패키지

- 서로 관련된 클래스와 인터페이스의 묶음

- 클래스가 물리적으로 클래스파일(*.class)인 것처럼, 패키지는 물리적으로 폴더이다.

  패키지는 서브패키지를 가질 수 있으며, '.'으로 구분한다.

- 클래스의 실제 이름은 패키지명이 포함된 것이다. (String클래스의 full name은 java.lang.String)

#### 3.2 패키지의 선언

- 패키지는 소스파일에 첫 번째 문장(주석 제외)으로 단 한번 선언한다.

- 하나의 소스파일에 둘 이상의 클래스가 포함된 경우, 모두 같은 패키지에 속하게 된다.

  (하나의 소스파일에 단 하나의 public클래스만 허용한다.)

- 모든 클래스는 하나의 패키지에 속하며, 패키지가 선언되지 않은 클래스는 자동적으로 이름없는(default) 패키지에 속하게 된다.

#### 3.3 클래스패스(classpath) 설정

- 클래스패스는 클래스파일(*.class)를 찾는 경로, 구분자는 ';'

#### 3.4 import문

- 사용할 클래스가 속한 패키지를 지정하는데 사용
- import문을 사용하면 클래스를 사용할 때 패키지명을 생략할 수 있다.

#### 3.5 import문의 선언

- import문은 패키지문과 클래스선언의 사이에 선언한다.
- import문을 선언하는 방법은 다음과 같다.

```java
import 패키지명. 클래스명;
	or
import 패키지명.*;
```

#### 3.6 import문의 선언 - 선언예

- import문은 컴파일 시에 처리되므로 프로그램의 성능에 아무런 영향을 미치지 않는다.
- 이름이 같은 클래스가 속한 두 패키지를 import할 때는 클래스 앞에 패키지명을 붙여줘야 한다.

```java
import java.sql.*;
import java.util.*;
```

### 4. 제어자(modifiers)

#### 4.1 제어자란?

- 클래스, 변수, 메서드의 선언부에 사용되어 부가적인 의미를 부여한다.
- 제어자는 크게 접근 제어자와 그 외의 제어자로 나뉜다.
- 하나의 대상에 여러 개의 제어자를 조합해서 사용할 수 있으나, 접근제어자는 단 하나만 사용할 수 있다.

```java
접근 제어자 - public, protected, dafault, private
그      외 - static, final, abstract, native, transient, strictfp 등
```

#### 4.2 static - 클래스의, 공통적인

- static이 사용될 수 있는 곳 - 멤버변수, 메서드, 초기화 블럭

#### 4.3 final - 마지막의, 변경될 수 없는

- final이 사용될 수 있는 곳 - 클래스, 메서드, 멤버변수, 지역변수

#### 4.4 생성자를 이용한 final 멤버변수 초기화

- final이 붙은 변수는 상수이므로 보통은 선언과 초기화를 동시에 하지만, 인스턴스마다 고정값을 갖는 인스턴스 변수의 경우 생성자에서 초기화한다.

#### 4.5 abstract - 추상의, 미완성의

- abstract가 사용될 수 있는 곳 - 클래스, 메서드

#### 4.6 접근 제어자(access modifier)

- 멤버 또는 클래스에 사용되어, 외부로부터의 접근을 제한한다.

|  제어자   | 같은 클래스 | 같은 패키지 | 자손클래스 | 전체 |
| :-------: | :---------: | :---------: | :--------: | :--: |
|  public   |      O      |      O      |     O      |  O   |
| protected |      O      |      O      |     O      |      |
|  default  |      O      |      O      |            |      |
|  private  |      O      |             |            |      |

#### 4.7 접근 제어자를 이용한 캡슐화

- 접근 제어자를 사용하는 이유
  1. 외부로부터 데이터를 보호하기 위해서
  2. 외부에는 불필요한, 내부적으로만 사용되는, 부분을 감추기 위해서

#### 4.8 생성자의 접근 제어자

- 일반적으로 생성자의 접근 제어자는 클래스의 접근 제어자와 일치한다.
- 생성자에 접근 제어자를 사용함으로써 인스턴스의 생성을 제한할 수 있다.

#### 4.9 제어자의 조합

|   대상   |             사용가능한 제어자             |
| :------: | :---------------------------------------: |
|  클래스  |    public, (default), final, abstract     |
|  메서드  | 모든 접근 제어자, final, abstract, static |
| 멤버변수 |      모든 접근 제어자, final, static      |
| 지역변수 |                   final                   |

### 5. 다형성(polymorphism)

#### 5.1 다형성이란?

- "여러 가지 형태를 가질 수 있는 능력"

- "하나의 참조변수로 여러 타입의 객체를 참조할 수 있는 것"

  즉, 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것이 다형성

```java
Tv t = new Tv(); // 부모
CaptionTv c = new CaptionTv(); // 자식

Tv t = new CaptionTv(); 
```

- "조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있지만,

   반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수는 없다."

#### 5.2 참조변수의 형변환

- 서로 상속관계에 있는 타입간의 형변환만 가능하다.
- 자손 타입에서 조상타입으로 형변환하는 경우, 형변환 생략가능

```java
자손타입 -> 조상타입 (Up-casting)   : 형변환 생략가능
자손타입 <- 조상타입 (Down-casting) : 형변환 생략불가
```

#### 5.3 instanceof 연산자

- 참조변수가 참조하는 인스턴스의 실제 타입을 체크하는데 사용
- 이항연산자이며 피연산자는 참조형 변수와 타입, 연산결과는 true/false
- instanceof의 연산결과가 true이면, 해당 타입으로 형변환이 가능하다.

#### 5.4 참조변수와 인스턴스변수의 연결

- 멤버변수가 중복정의된 경우, 참조변수의 타입에 따라 연결되는 멤버변수가 달라진다. (참조변수타입에 영향받음)
- 메서드가 중복정의된 경우, 참조변수의 타입에 관계없이 항상 실제 인스턴스의 타입에 정의된 메서드가 호출된다. (참조변수타입에 영향받지 않음)

#### 5.5 매개변수의 다형성

- 참조형 매개변수는 메서드 호출시, ```자신과 같은 타입 또는 자손타입```의 인스턴스를 넘겨줄 수 있다.

#### 5.6 여러 종류의 객체를 하나의 배열로 다루기

- 조상타입의 배열에 자손들의 객체를 담을 수 있다.

```java
Product p[] = new Product[3];
p[0] = new Tv();
p[1] = new Computer();
p[2] = new Audio();
```

## Chapter 7. 객체지향개념 Ⅲ

### 6. 추상클래스(abstract class)

#### 6.1 추상클래스란?

- 클래스가 설계도라면 추상클래스는 '미완성 설계도'
- 추상메서드(미완성 메서드)를 포함하고 있는 클래스
  - 추상메서드 : 선언부만 있고 구현부(몸통, body)가 없는 메서드

```java
abstract class Player {
    int currentPos; 			 // 현재 Play되고 있는 위치를 저장하기 위한 변수
    Player() {					 // 추상클래스도 생성자가 있어야 한다.
        currentPos = 0;
    }
    
    abstract void play(int pos); // 추상메서드
    abstract void stop();        // 추상메서드
    
    void play() {
        play(currentPos);        // 추상메서드를 사용할 수 있다.
    }
}
```

- 일반메서드가 추상메서드를 호출할 수 있다. (호출할 때 필요한 건 선언부)
- 완성된 설계도가 아니므로 인스턴스를 생성할 수 없다.
- 다른 클래스를 작성하는 데 도움을 줄 목적으로 작성된다.
- 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우에 사용
- 추상클래스를 상속받는 자손클래스에서 추상메서드의 구현부를 완성해야 한다.

#### 6.2 추상클래스의 작성

- 여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나 기존클래스의 공통 부분을 뽑아서 추상클래스를 만든다.

### 7. 인터페이스(interface)

#### 7.1 인터페이스란?

- 일종의 추상클래스, 추상클래스(일종의 설계도)보다 추상화 정도가 높다.
- 실제 구현된 것이 전혀 없는 기본 설계도 (알맹이 없는 껍데기)
- 추상메서드와 상수만을 멤버로 가질 수 있다.
- 인스턴스를 생성할 수 없고, 클래스 작성에 도움을 줄 목적으로 사용된다.
- 미리 정해진 규칙에 맞게 구현하도록 표준을 제시하는데 사용된다.

#### 7.2 인터페이스의 작성

- ```class```대신 ```interface```를 사용한다는 것 외에는 클래스 작성과 동일하다.

```java
interface 인터페이스이름 {
    public static final 타입 상수이름 = 값;
    public abstract 메서드이름(매개변수목록);
}
```

- 하지만, 구성요소(멤버)는 추상메서드와 상수만 가능하다.

```java
- 모든 멤버변수는 public static final 이어야 하며, 이를 생략할 수 있다.
- 모든 메서드는 public abstract 이어야 하며, 이를 생략할 수 있다.
    
interface PlayingCard {
    public static final int SPADE = 4; 
    final int DIAMOND = 3;				// public static final int DIAMOND = 3;
    static int HEART = 2;				// public static final int HEART = 2;
    int CLOVER = 1;						// public static final int CLOVER = 1;
    
    public abstract String getCardNumber();
    String getCardKind();				// public abstract String getCardKind();
}
```

#### 7.3 인터페이스의 상속

- 인터페이스도 클래스처럼 상속이 가능하다.(클래스와 달리 다중상속 허용)
- 인터페이스는 Object클래스와 같은 최고 조상이 없다.

#### 7.4 인터페이스의 구현

- 인터페이스를 구현하는 것은 클래스를 상속받는 것과 같다. 다만 ```extends``` 대신 ```implements```를 사용한다.

```java
class 클래스이름 implements 인터페이스이름 {
    // 인터페이스에 정의된 추상메서드를 구현해야 한다.
}
```

- 인터페이스에 정의된 추상메서드를 완성해야 한다.
- 상속과 구현이 동시에 가능하다.

```java
class Fighter extends Unit implements Fightable {
    public void move(int x, int y) { // 내용 생략 }
    public void attack(Unit u) { // 내용 생략 }
}
```

#### 7.5 인터페이스를 이용한 다형성

- 인터페이스 타입의 변수로 인터페이스를 구현한 클래스의 인스턴스를 참조할 수 있다.

```java
Fighter f = new Fighter();
Fightable f = new Fighter();
```

- 인터페이스를 메서드의 매개변수 타입으로 지정할 수 있다.

```java
void attack(Fightabel f) { // Fightable인터페이스를 구현한 클래스의 인스턴스를 매개변수로 받는 메서드
	...
}
```

- 인터페이스를 메서드의 리턴타입으로 지정할 수 있다.

```java
Fightable method() { // Fightable인터페이스를 구현한 클래스의 인스턴스를 반환
    ...
    return new Fighter();
}
```

#### 7.6 인터페이스의 장점

1. 개발시간을 단축시킬 수 있다.
2. 표준화가 가능하다.
3. 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.
4. 독립적인 프로그래밍이 가능하다.

#### 7.7 인터페이스의 이해

- 인터페이스는..

  - 두 대상(객체) 간의 '연결, 대화, 소통'을 돕는 ```중간 역할```을 한다.
  - 선언(설계)와 구현을 분리시키는 것을 가능하게 한다.

  ```java
  class B {
      public void method() {
          System.out.println("methodInB");
      }
  }
  ```

  ```java
  interface I {
      public void method();
  }
  
  class B implements I {
      public void method() {
          System.out.println("methodInB");
      }
  }
  ```

- 인터페이스를 이해하려면 먼저 두 가지를 기억하자.
  1. 클래스를 사용하는 쪽(User)과 클래스를 제공하는 쪽(Provider)이 있다.
  2. 메서드를 사용(호출)하는 쪽(User)에서는 사용하려는 메서드(Provider)의 선언부만 알면 된다.

#### 7.8 디폴트 메서드(default method)

- 인터페이스에 새로운 메서드(추상 메서드)를 추가하면?

  이 인터페이스를 구현한 기존의 모든 클래스가 이 메서드를 구현해야 함

- 이 문제를 해결하기 위해 ```디폴트 메서드```를 고안

- 디폴트 메서드는 추상 메서드의 기본 구현을 제공한다. 그래서 몸통{}을 가지고 있으며, 앞에 ```default```를 붙이고 항상 public이다. (생략 가능)

```java
interface MyInterface { 
	void method();
	void newMethod(); // 추상 메서드
}
```

```java
interface MyInterface {
    void method();
    default void newMethod() {}
}
```

1. 여러 인터페이스의 디폴트 메서드 간의 충돌
   - 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩해야 한다.
2. 디폴트 메서드와 조상 클래스의 메서드 간의 충돌
   - 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시된다.

### 8. 내부 클래스(inner class)

#### 8.1 내부 클래스란?

- 클래스 안에 선언된 클래스
- 특정 클래스 내에서만 주로 사용되는 클래스를 내부 클래스로 선언한다.
- GUI어플리케이션의 이벤트처리에 많이 사용된다.

```java
class A { // B의 외부 클래스
    ...
    class B { // A의 내부 클래스
        ...
    }
}
```

- 내부 클래스의 장점
  1. 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
  2. 코드의 복잡성을 줄일 수 있다. (캡슐화)

#### 8.2 내부 클래스의 종류와 특징

- 내부 클래스의 종류는 변수의 선언위치에 따른 종류와 동일하다.
- 유효범위와 성질도 변수와 유사하므로 비교해보면 이해하기 쉽다.

|   내부 클래스   |                            특 징                             |
| :-------------: | :----------------------------------------------------------: |
| 인스턴스 클래스 | 외부 클래스의 멤버변수 선언위치에 선언하며, 외부 클래스의 인스턴스멤버처럼 다루어진다. 주로 외부 클래스의 인스턴스멤버들과 관련된 작업에 사용될 목적으로 선언된다. |
|  스태틱 클래스  | 외부 클래스의 멤버변수 선언위치에 선언하며, 외부 클래스의 static멤버처럼 다루어진다. 주로 외부 클래스의 static멤버, 특히 static메서드에서 사용될 목적으로 선언된다. |
|   지역 클래스   | 외부 클래스의 메서드나 초기화블럭 안에 선언하며, 선언된 영역 내부에서만 사용될 수 있다. |
|   익명 클래스   | 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스(일회용) |

#### 8.3 내부 클래스의 제어자와 접근성

- 내부 클래스의 접근제어자는 변수에 사용할 수 있는 접근제어자와 동일하다

```java
class Outer {
    private int iv = 0;
    protected static int cv = 0;
    
    void myMethod() {
        int iv = 0;
    }
}
```

```java
class Outer {
    private class InstanceInner { }
    protected static class StaticInner { }
    
    void myMethod() {
        class LocalInner { }
    }
}
```

- static클래스만 static멤버를 정의할 수 있다.

```java
class InnerEx1 {
    class InstanceInner {
        int iv = 100;
//      static int cv = 100; // error, static변수를 선언할 수 없다.
        final static in CONST = 100; // final static은 상수이므로 허용한다.
    }
    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }
    void myMethod() {
        class LocalInner {
            int iv = 300;
//          static int cv = 300; // error, static변수를 선언할 수 없다.
            final static int CONST = 300; // final static은 상수이므로 허용한다.
        }
    }
}
```

- 내부 클래스도 외부 클래스의 멤버로 간주되며, 동일한 접근성을 갖는다.
- 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다. 지역 클래스의 인스턴스가 소멸된 지역변수를 참조할 수 있기 때문이다.

```java
class Outer {
    private int outerIv = 0;
    private int outerCv = 0;
    
    class InstanceInner {
        int iiv = outerIv; // 외부 클래스의 private멤버도 접근가능하다.
        int iiv2 = outerCv;
    }
    
    static class StaticInner {
//	스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//		int siv = outerIv;
        static int scv = outerCv;
    }
    
    void myMethod() {
        int lv = 0;
        final int LV = 0; // final 생략 가능
        
        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
//	외부 클래스의 지역변수는 fianl이 붙은 변수(상수)만 접근가능하다.
//			int liv3 = lv; -> error
        	int liv4 = Lv;
        }
    }
}
```

#### 8.4 익명 클래스(anonymous class)

- 이름이 없는 일회용 클래스, 선언과 생성을 동시에, 하나의 객체만 생성가능

```java
class InnerEx6 {
    Object iv = new Object() {
        void method() {}
    }; // 익명클래스
    static Object cv = new Object() {
        void method() {}
    }; // 익명클래스
    
    void myMethod() {
        Object lv = new Object() {
            void method() {}
        }; // 익명클래스
    }
}
```

## Chapter 8. 예외처리(exception handling)

### 1. 예외처리

#### 1.1 프로그램 오류

- 컴파일 에러(complie-time error)와 런타임 에러(runtime error)
  1. 컴파일 에러 - 컴파일할 때 발생하는 에러
  2. 런타임 에러 - 실행할 때 발생하는 에러
  3. 논리적 에러 - 의도와 다르게 동작(실행시)
- Java의 런타임 에러 - 에러(error)와 예외(exception)
  1. 에러(error) - 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
  2. 예외(exception) - 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류

#### 1.2 예외처리의 정의와 목적

- 에러는 어쩔 수 없지만, 예외는 처리해야 한다.
- 예외처리의 정의와 목적

```java
예외처리(exception handling)의
정의 - 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
목적 - 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
```

[참고] 에러와 예외는 모두 실행 시(runtime) 발생하는 오류이다.

#### 1.3 예외처리구문 - ```try-catch```

- 예외를 처리하려면 try-catch문을 사용해야 한다.

```java
try {
    // 예외가 발생할 가능성이 있는 문장들을 넣는다.
} catch(Exception1 e1) {
    // Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
} catch(Exception2 e2) {
    // Exception2가 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
} catch(ExceptionN eN) {
    // ExceptionN이 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
}
```

[참고] if문과 달리 try블럭이나 catch블럭 내에 포함된 문장이 하나라고 해서 괄호{}를 생략할 수는 없다.

#### 1.4 try-catch문에서의 흐름

- try블럭 내에서 예외가 발생한 경우,

  1. 발생한 예외와 일치하는 catch블럭이 있는지 확인한다.

  2. 일치하는 catch블럭을 찾게 되면, 그 catch블럭 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 그 다음 문장을 계속해서 수행한다.

     만일 일치하는 catch블럭을 찾지 못하면, 예외는 처리되지 못한다.

- try블럭 내에서 예외가 발생하지 않은 경우,

  1. catch블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속한다.

#### 1.5 예외 발생시키기

```java
1. 먼저, 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
	Exception e = new Exception("고의로 발생시켰음");

2. 키워드 throw를 이용해서 예외를 발생시킨다.
    throw e;
```

#### 1.6 예외 클래스의 계층구조

- 예외 클래스는 크게 두 그룹으로 나뉜다.

```java
RuntimeException클래스들 - 프로그래머의 실수로 발생하는 예외 (예외처리 선택)
Exception클래스들 - 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외 (예외처리 필수)
```

#### 1.7 예외의 발생과 catch블럭

- try블럭에서 예외가 발생하면, 발생한 예외를 처리할 catch블럭을 찾는다.
- 첫번째 catch블럭부터 순서대로 찾아 내려가며, 일치하는 catch블럭이 없으면 예외는 처리되지 않는다.
- 예외의 최고 조상인 Exception을 처리하는 catch블럭은 모든 종류의 예외를 처리할 수 있다.(반드시 마지막 catch블럭이어야 한다.)
