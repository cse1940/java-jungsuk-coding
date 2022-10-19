package ch07;

class MyPoint extends Object {
	int x, y;
}

// class Circle extends MyPoint { // 상속
// 	 int r;
// }

class Circle  extends Object { // 포함
	MyPoint p = new MyPoint(); // 참조변수의 초기화
	int r;
}

public class InheritanceTest {

	public static void main(String[] args) {
		
		Circle c = new Circle();
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		System.out.println("c.x=" + c.x);
//		System.out.println("c.y=" + c.y);
//		System.out.println("c.r=" + c.r);
		
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x=" + c.p.x);
		System.out.println("c.p.y=" + c.p.y);
		System.out.println("c.r=" + c.r);
		
		System.out.println(c.toString()); // 문자열 반환
		
		Circle c2 = new Circle();
		System.out.println(c2);

	}

}
