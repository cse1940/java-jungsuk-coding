package ch04;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		
		int num = 0, sum = 0;
		System.out.print("���ڸ� �Է��ϼ���(��:12345)> ");
		
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ temp�� ����
		num = Integer.parseInt(temp);     // �Է¹��� ���ڿ�(temp)�� ���ڷ� ��ȯ
		
		while(num!=0) {
//			num�� 10���� ���� �������� sum�� ����
			sum += num%10; // sum = sum + num%10;
			System.out.printf("sum=%3d num=%d\n", sum, num);
			
			num /= 10; // num = num / 10; num�� 10���� ���� ���� �ٽ� num�� ����
		}
		System.out.println("�� �ڸ����� ��:"+sum);

	}

}
