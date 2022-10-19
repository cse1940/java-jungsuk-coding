package ch07;

class MyPoint3 extends Object {
	int x, y;
	
	MyPoint3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//	ObjectŬ������ toString()�� �������̵�
	public String toString() {
		return "x:" + x + ", y:" + y;
	}
}

public class OverrideTest {

	public static void main(String[] args) {
	
		MyPoint3 p = new MyPoint3(3, 5);
//		p.x = 3;
//		p.y = 5;

//		System.out.println("p.x=" + p.x);
//		System.out.println("p.y=" + p.y);
		System.out.println(p.toString());

	}
	
}

//	�������̵��� ����
//	1. ����ΰ� ���� Ŭ������ �޼���� ��ġ�ؾ� �Ѵ�
//	2. ���� �����ڸ� ���� Ŭ������ �޼��庸�� ���� ������ ������ �� ����
//	3. ���ܴ� ���� Ŭ������ �޼��庸�� ���� ������ �� ���� 

//	�����ε� vs �������̵�
//	�����ε�(overloading) : ������ ���� ���ο� �޼��带 �����ϴ� ��(new)
//	�������̵�(overriding) : ��ӹ��� �޼����� ������ �����ϴ� ��(change)
