package ch02;

import java.util.Scanner; // Scanner�� ����ϱ� ���� �߰�

public class Ex2_10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Scanner Ŭ������ ����ϱ� ���� �߰�

		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���> ");
		String input = scanner.nextLine(); // �Է¹��� ������ input�� ����
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d\n", num);
	}

}
