package ch07;

public class Ex7_7 {

	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe; // car = (Car)fe; 형변환이 생략됨
//		car.water(); -> error, Car타입의 참조변수로는 water()를 호출할 수 없다
		fe2 = (FireEngine)car; // 자손타입 <- 조상타입, 형변환 생략 불가
		fe2.water();
	}

}

class Car {
	String color;
	int door;
	
	void drive() { // 운전하는 기능
		System.out.println("drive, Brrr~");
	}
	
	void stop() {  // 멈추는 기능
		System.out.println("stop!!");
	}
}

class FireEngine extends Car { // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("water!!");
	}
}

//	Q. 참조변수의 형변환은 왜 하나요?
//	A. 참조변수(리모컨)를 변경함으로써 사용할 수 있는 멤버의 갯수를 조절하기 위해서

// 	Q. instanceof연산자는 언제 사용하나요?
//	A. 참조변수를 형변환하기 전에 형변환 가능여부를 확인할 때