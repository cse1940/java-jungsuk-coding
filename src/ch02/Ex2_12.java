package ch02;

public class Ex2_12 {

	public static void main(String[] args) {
		
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');	   // 1. ���ڿ��� ���ڷ� ��ȯ
		System.out.println('3' - '0' + 1);			   // 2. ���ڸ� ���ڷ� ��ȯ - ���ڿ��� '0'�� ����
		System.out.println(Integer.parseInt("3") + 1); // 3. ���ڿ��� ���ڷ� ��ȯ
		System.out.println("3" + 1);				   // 4. ���ڸ� ���ڿ��� ��ȯ
		System.out.println((char)(3 + '0'));		   // 5. ���ڸ� ���ڷ� ��ȯ - ���ڿ� '0'�� ���Ѵ�
	}

}
