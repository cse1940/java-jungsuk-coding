package ch06;

class MyMate2 {
	long a, b;
	
//	�ν��Ͻ� ���� a, b���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����
	long add() {return a + b;} // a, b�� �ν��Ͻ� ����
	long subtract() {return a - b;}
	long multiply() {return a * b;}
	double divide() {return a / b;}
	
//	�ν��Ͻ� ������ ������� �Ű����������� �۾��� �����ϴ�
	static long add(long a, long b) {return a + b;} // a, b�� ��������
	static long subtract(long a, long b) {return a - b;}
	static long multiply(long a, long b) {return a * b;}
	static double divide(long a, long b) {return a / (double)b;}
}

public class Ex6_9 {

	public static void main(String[] args) {
		
//		Ŭ���� �޼ҵ� ȣǮ, �ν��Ͻ� �������� ȣ�Ⱑ��
		System.out.println(MyMate2.add(200L, 100L));
		System.out.println(MyMate2.subtract(200L, 100L));
		System.out.println(MyMate2.multiply(200L, 100L));
		System.out.println(MyMate2.divide(200L, 100L));
		
		MyMate2 mm = new MyMate2(); // �ν��Ͻ��� ����
		mm.a = 200L;
		mm.b = 100L;
//		�ν��Ͻ� �޼ҵ�� ��ü���� �Ŀ��� ȣ���� ������
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());

	}

}
