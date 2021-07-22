package arrays01;

import java.util.Arrays;

public class P04Arrays04 {
	public static void main(String[] args) {
		/* 4. Arrays.sort(배열명);
		 * 배열 내부 순서를 작은 숫자일수록 0 인덱스와 가깝게 큰 숫자일수록 마지막 인덱스에 가깝게 배치
		 * 오름차순으로 정리
		 */
		int [] arr = {21, 60, 32, 44, 1, 59, 99, 89, 36};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// reverse()를 이용해 내림차순으로 정렬가능 - 오름차순으로 먼저 정리해야 함
		
	}
}
