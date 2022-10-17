package ch06;

class Car {
	String color;			// 색상
	String gearType; 		// 변속기 종류 - auto(자동), manual(수동)
	int door;				// 문의 개서
	
	Car() {}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class Ex6_12 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

	}

}

//	인스턴스를 생성할 때는 다음의 2가지 사항을 결정해야 한다
//	1. 클래스 - 어떤 클래스의 인스턴스를 생성할 것인가?
//	2. 생성자 - 선택한 클래스의 어떤 생성자로 인스턴스를 생성할 것인가?