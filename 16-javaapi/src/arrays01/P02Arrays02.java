package arrays01;

import java.util.Arrays;

public class P02Arrays02 {
	public static void main(String[] args) {
		/* 2. Arrays.copyOf(배열명, 복사할 길이);
		 * 특정 배열을 0을 시작으로 n개만(n개 전까지만) 잘라서 복사
		 */
		int [] arr = {1, 2, 3, 4, 5};
		
		int [] arrCopy = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arrCopy));	// 배열 내의 값 추력
//		System.out.println(arrCopy);					// 주소값 출력
		
		// 원본보다 길게 복사하면 나머지는 0으로 채움
		int [] arrCopy2 = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arrCopy2));
	}
}
