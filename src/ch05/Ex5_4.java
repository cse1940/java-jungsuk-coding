package ch05;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random() * 10); // 0~9중의 한 값을 임의로 얻는다
			int temp = numArr[0];	// numArr[0]의 값을 변수 temp에 저장한다
			numArr[0] = numArr[n];  // numArr[n]의 값을 numArr[0]에 저장한다
			numArr[n] = temp; 		// temp의 값을 numArr[n]에 저장한다
		}
		System.out.println(Arrays.toString(numArr));

	}

}
