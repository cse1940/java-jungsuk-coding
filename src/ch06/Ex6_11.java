package ch06;

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	
	Data_2(int x) { // �Ű������� �ִ� ������
		value = x;
	}
}

public class Ex6_11 {

	public static void main(String[] args) {
		
		Data_1 d1 = new Data_1();
//		Data_2 d2 = new Data_2(); -> compile error �߻�
		Data_2 d2 = new Data_2(10);
	}

}

//	�⺻ �����ڰ� �����Ϸ��� ���ؼ� �߰��Ǵ� ���� Ŭ������ ���ǵ� �����ڰ� �ϳ��� ���� �� ���̴�
