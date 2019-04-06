package lesson02;

import java.util.Arrays;

public class CyclicRotation {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution()));
	}
	
	public static int[] solution() {
		int[] A = {3,8,9,7,6};
		int K = 3;
		
		int temp;                       // 배열의 마지막 요소 임시 저장
		int countMove = K%A.length;     // 배열의 수가 shift 횟수의 배수면 반복하지 않음
		
		if (A.length != 0) {
			for (int i=0; i<countMove; i++) {
				temp = A[A.length-1];
				for (int j=(A.length-2); j>=0; j--) {
					A[j+1] = A[j];
				}
				A[0] = temp;
			}
		}
		return A;
	}
}
