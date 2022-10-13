package ch02;

public class Exercise2_8 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		int z = 3;
		
		int temp1 = x;
		int temp2 = y;
		int temp3 = z;
		
		x = temp2;
		y = temp3;
		z = temp1;
		
		System.out.println("x=" + x); // 2
		System.out.println("y=" + y); // 3
		System.out.println("z=" + z); // 1

	}

}
