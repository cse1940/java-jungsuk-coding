package ch04;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���(����:0)> ");
			
			String temp = scanner.nextLine(); // ȭ�鿡�� �Է¹��� ������ temp�� ����
			menu = Integer.parseInt(temp);	  // �Է¹��� ���ڿ���(temp) ���ڷ� ��ȯ

			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue;
			}
			System.out.println("�����Ͻ� �޴��� " + menu + "���Դϴ�.");
		}

	}

}