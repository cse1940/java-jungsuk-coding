package ch06;

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	
	Data_2(int x) { // 매개변수가 있는 생성자
		value = x;
	}
}

public class Ex6_11 {

	public static void main(String[] args) {
		
		Data_1 d1 = new Data_1();
//		Data_2 d2 = new Data_2(); -> compile error 발생
		Data_2 d2 = new Data_2(10);
	}

}

//	기본 생성자가 컴파일러에 의해서 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다
