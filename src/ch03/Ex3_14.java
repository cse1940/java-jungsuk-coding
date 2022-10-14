package ch03;

public class Ex3_14 {

	public static void main(String[] args) {
		
		String str1 = "abc";			 // 아래의 문장을 간단히 표현
		String str2 = new String("abc"); // String클래스의 객체를 생성
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); // 객체가 달라도 내용이 같으면 true를 반환, 문자열을 비교할 때 사용
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); 
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); // 대소문자를 구별하지 않고 비교하고 싶을 때 사용

	}

}
