package ch04;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요(예:12345)> ");
		
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 temp에 저장
		num = Integer.parseInt(temp);     // 입력받은 문자열(temp)을 숫자로 변환
		
		while(num!=0) {
//			num을 10으로 나눈 나머지는 sum에 더함
			sum += num%10; // sum = sum + num%10;
			System.out.printf("sum=%3d num=%d\n", sum, num);
			
			num /= 10; // num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
		}
		System.out.println("각 자리수의 합:"+sum);

	}

}
