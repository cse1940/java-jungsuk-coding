package ch04;

public class Ex4_17 {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			if(i%3==0) {
				continue; // ���ǽ��� ���� �Ǿ� continue���� ����Ǹ� ���� ������ �̵��Ѵ�, break���� �޸� �ݺ����� ����� �ʴ´�
			}
			System.out.println(i);
		}

	}

}
