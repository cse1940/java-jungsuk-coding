package ch04;

public class Exercise4_7 {

	public static void main(String[] args) {
		
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println("sum="+sum);

	}

}

//	charAt(int i)을 이용해서 반복문으로 각 문자열의 문자를 하나씩 읽어서 숫자로 변환한 다음 sum에 계속 더하면 된다
//	예시로 문자'3'을 숫자 3로 바꾸는 방법은 문자'3'에서 문자'0'을 빼주는 것이다
