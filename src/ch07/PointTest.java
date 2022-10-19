package ch07;

class Point2 {
	int x, y;
	
	Point2(int x, int y) {
//		super(); -> 컴파일러가 자동 추가
		this.x = x;
		this.y = y;
	}	
	
	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
}

class Point3D2 extends Point2 { 
	int z;
	
	Point3D2(int x, int y, int z) {
		super(x, y); // 조상의 생성자 Point(int x, int y)를 호출
		this.z = z;
	}
	
	String getLocation() { // 오버리이딩
		return "x:" + x + ", y:" + y + ", z:" + z;
	}
}

public class PointTest {

	public static void main(String[] args) {
		
		Point3D2 p3 = new Point3D2(1, 2, 3);
		System.out.println(p3.getLocation());
	}

}
