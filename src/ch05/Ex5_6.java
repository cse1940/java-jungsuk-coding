package ch05;

public class Ex5_6 {

	public static void main(String[] args) {
		
		String[] names = {"Kim", "Park", "Yi"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"]:"+names[i]);
		}
		
		String temp = names[2]; // �迭 names�� �� ��° ��Ҹ� temp�� ����
		System.out.println("temp:"+temp);
		names[0] = "Yu"; // �迭 names�� ù ��° ��Ҹ� "Yu"�� ����
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
