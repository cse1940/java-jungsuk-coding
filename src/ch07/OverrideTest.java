package ch07;

class MyPoint3 extends Object {
	int x, y;
	
	MyPoint3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//	Object클래스의 toString()을 오버라이딩
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

//	오버라이딩의 조건
//	1. 선언부가 조상 클래스의 메서드와 일치해야 한다
//	2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다
//	3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다 

//	오버로딩 vs 오버라이딩
//	오버로딩(overloading) : 기존에 없는 새로운 메서드를 정의하는 것(new)
//	오버라이딩(overriding) : 상속받은 메서드의 내용을 변경하는 것(change)
