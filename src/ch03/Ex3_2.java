package ch03;

public class Ex3_2 {

	public static void main(String[] args) {
		
		int i=5, j=0;
		
		j = i++; // ������ : ������ ���� ���� �о�� �Ŀ� ���� ������Ų��
		System.out.println("j=i++; ���� ��, i=" + i + ", j=" + j);
		
		i=5; // ����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
		j=0;
		
		j = ++i; // ������ : ������ ���� ���� ������Ų �Ŀ� ������ ���� �о�´�
		System.out.println("j=++i; ���� ��, i=" + i + ", j=" + j);

	}

}
