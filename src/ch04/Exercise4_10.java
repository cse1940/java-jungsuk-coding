package ch04;

import java.util.Scanner;

public class Exercise4_10 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 100) + 1; // 1~100������ ������ ���� �� answer�� �����Ѵ�
		int input = 0;								 // ������Է��� ������ ����
		int count = 0;								 // �õ�Ƚ���� �������� ����
		
		Scanner scanner = new Scanner(System.in);    // ȭ������ ���� ������Է��� �ޱ� ���ؼ� ScannerŬ���� ���
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ���> ");
			input = scanner.nextInt(); // �Է¹��� ���� ���� input�� �����Ѵ�
			
			if(input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else if(input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else {
				System.out.println("�������ϴ�.");
				System.out.printf("�õ� Ƚ���� %d���Դϴ�.", count);
				break;
			}
		} while(true); // ���ѹݺ���

	}

}
