package ch04;

import java.util.Scanner;

public class Exercise4_10 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 100) + 1; // 1~100사이의 임의의 값을 얻어서 answer에 저장한다
		int input = 0;								 // 사용자입력을 저장할 공간
		int count = 0;								 // 시도횟수를 세기위한 변수
		
		Scanner scanner = new Scanner(System.in);    // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요> ");
			input = scanner.nextInt(); // 입력받은 값을 변수 input에 저장한다
			
			if(input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if(input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				System.out.println("맞혔습니다.");
				System.out.printf("시도 횟수는 %d번입니다.", count);
				break;
			}
		} while(true); // 무한반복문

	}

}
