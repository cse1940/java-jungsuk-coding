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
