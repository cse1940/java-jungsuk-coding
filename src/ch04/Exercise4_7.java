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

//	charAt(int i)�� �̿��ؼ� �ݺ������� �� ���ڿ��� ���ڸ� �ϳ��� �о ���ڷ� ��ȯ�� ���� sum�� ��� ���ϸ� �ȴ�
//	���÷� ����'3'�� ���� 3�� �ٲٴ� ����� ����'3'���� ����'0'�� ���ִ� ���̴�
