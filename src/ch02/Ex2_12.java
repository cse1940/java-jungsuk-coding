package ch02;

public class Ex2_12 {

	public static void main(String[] args) {
		
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');	   // 1. 문자열을 문자로 반환
		System.out.println('3' - '0' + 1);			   // 2. 문자를 숫자로 변환 - 문자에서 '0'을 뺀다
		System.out.println(Integer.parseInt("3") + 1); // 3. 문자열을 숫자로 변환
		System.out.println("3" + 1);				   // 4. 숫자를 문자열로 변환
		System.out.println((char)(3 + '0'));		   // 5. 숫자를 문자로 변환 - 숫자에 '0'을 더한다
	}

}
