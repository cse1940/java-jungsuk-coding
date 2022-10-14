package ch04;

public class Ex4_16 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) {
				break; // break문이 수행되면 이 부분은 실행되지 않고 while문을 완전히 벗어난다
			}
			++i;
			sum += i;
		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);

	}

}
