package ch04;

import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {
		
		int menu = 0, num = 0;
		Scanner scanner = new Scanner(System.in);
		
		outer: // while���� outer��� �̸��� ���δ�
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���(����:0)> ");
			
			String temp = scanner.nextLine(); // ȭ�鿡�� �Է¹��� ������ temp�� ����
			menu = Integer.parseInt(temp); 	  // �Է¹��� ���ڿ�(temp)�� ���ڷ� ��ȯ
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue;
			}
			for(;;) {
				System.out.print("����� ���� �Է��ϼ���.(��� ����:0, ��ü ����:99)> ");
				temp = scanner.nextLine(); 	  // ȭ�鿡�� �Է¹��� ������ temp�� ����
				num = Integer.parseInt(temp); // �Է¹��� ���ڿ�(temp)�� ���ڷ� ��ȯ
				
				if(num==0) {
					break;		 // ��� ����, for���� �����
				}
				if(num==99) {
					break outer; // ��ü ����, for���� while���� ��� �����
				}
				switch(menu) {
					case 1:
						System.out.println("result="+ num*num);
						break;
					case 2:
						System.out.println("result="+ Math.sqrt(num));
						break;
					case 3:
						System.out.println("result="+ Math.log(num));
				}
			} // for(;;)
		} // while�� ��
	} // main�� ��

}
