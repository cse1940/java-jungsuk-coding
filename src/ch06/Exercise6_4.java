package ch06;

class Exercise6_4 {
	
//	�� �� (x,y)�� (x1,y1)���� �Ÿ��� ���Ѵ�
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y�� ��������
	}

	public static void main(String[] args) {
		
		System.out.println(getDistance(1, 1, 2, 2));

	}

}