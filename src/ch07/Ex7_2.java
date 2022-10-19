package ch07;

public class Ex7_2 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();

	}

}

class Parent {
	int x = 10; // super.x(조상멤버)
	}

class Child extends Parent {
	int x = 20; // this.x
	
	void method() {
		System.out.println("x=" + x); // 가장 마지막 x의 값
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}
