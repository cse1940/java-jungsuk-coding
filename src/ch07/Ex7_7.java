package ch07;

public class Ex7_7 {

	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe; // car = (Car)fe; ����ȯ�� ������
//		car.water(); -> error, CarŸ���� ���������δ� water()�� ȣ���� �� ����
		fe2 = (FireEngine)car; // �ڼ�Ÿ�� <- ����Ÿ��, ����ȯ ���� �Ұ�
		fe2.water();
	}

}

class Car {
	String color;
	int door;
	
	void drive() { // �����ϴ� ���
		System.out.println("drive, Brrr~");
	}
	
	void stop() {  // ���ߴ� ���
		System.out.println("stop!!");
	}
}

class FireEngine extends Car { // �ҹ���
	void water() { // ���� �Ѹ��� ���
		System.out.println("water!!");
	}
}

//	Q. ���������� ����ȯ�� �� �ϳ���?
//	A. ��������(������)�� ���������ν� ����� �� �ִ� ����� ������ �����ϱ� ���ؼ�

// 	Q. instanceof�����ڴ� ���� ����ϳ���?
//	A. ���������� ����ȯ�ϱ� ���� ����ȯ ���ɿ��θ� Ȯ���� ��