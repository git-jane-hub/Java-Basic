package arrays01;

import java.util.Arrays;

public class P03Arrays03 {
	public static void main(String[] args) {
		/* 3. Arrays.copyOfRange(배열명, 시작 지점, 끝지점);
		 * copyOf()와 비슷하지만 시작지점까지 같이 지정하여 복사
		 * 시작지점은 입력한 값으로, 끝지점은 입력한 값 직전까지 복사
		 */
		int [] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int [] arrCopy = Arrays.copyOfRange(arr, 3, 7);
		System.out.println(Arrays.toString(arrCopy));
		
		// 원본보다 길게 복사하면 나머지는 0으로 채움
		int [] arrCopy2 = Arrays.copyOfRange(arr, 5, 15);
		System.out.println(Arrays.toString(arrCopy2));
	}
}
