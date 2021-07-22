package arrays01;

import java.util.Arrays;

public class P01Arrays01 {
	public static void main(String[] args) {
		/* 1. Arrays.binarySearch(배열명, 찾는 값);
		 * 이진 탐색
		 * 데이터가 오름차순으로 정렬되어있는 것이 전제 조건
		 * 배열 요소 내부에 중복되는 값이 없어야 최상의 성능을 보임
		 * 대신 조건을 모두 만족하는 경우 조회 속도가 가장 빠름
		 * - 오름차순으로 정렬된 배열에서 중간값을 찾고 중간값을 기준으로 해당값의 반대편을 소거, 다시 중간값을 찾음...
		 */
		
		// 정렬이 안 된 상태의 배열을 탐색할 경우 - 찾지 못함
		int[] arr1 = {5, 7, 6, 1, 3, 9, 0, 12};
		
		int a = Arrays.binarySearch(arr1, 0);
		// 7개의 배열에서 중간값은 (0 + 7)/2 = 3 → 3번 인덱스로 감(1) → 0은 1보다 작기 때문에 3번 인덱스를 포함한 오른쪽 부분 전부 소거
		System.out.println(a);	// -1이 출력됨
		
		// 정렬이 된 상태의 배열을 탐색할 경우
		int [] arr2 = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		
		int b = Arrays.binarySearch(arr2, 14);
		// 11개의 배열에서 중간값은 5 → 5번 인덱스(10)를 포함한 왼쪽 전부 소거 → 
		System.out.println(b);
	}
}
