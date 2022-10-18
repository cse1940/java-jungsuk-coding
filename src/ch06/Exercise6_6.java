package ch06;

class Mypoint {
	int x, y;
	
	Mypoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) { // �ν��Ͻ� �޼���
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y�� �ν��Ͻ� ����
	}
	
}

public class Exercise6_6 {

	public static void main(String[] args) {
		
		Mypoint p = new Mypoint(1, 1);
		
//		p�� (2,2)�� �Ÿ��� ���Ѵ�
		System.out.println(p.getDistance(2, 2));

	}

}
