package ch05;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random() * 10); // 0~9���� �� ���� ���Ƿ� ��´�
			int temp = numArr[0];	// numArr[0]�� ���� ���� temp�� �����Ѵ�
			numArr[0] = numArr[n];  // numArr[n]�� ���� numArr[0]�� �����Ѵ�
			numArr[n] = temp; 		// temp�� ���� numArr[n]�� �����Ѵ�
		}
		System.out.println(Arrays.toString(numArr));

	}

}
