package arr;

import java.util.Arrays;

public class R01 {
	public static void main(String[] args) {
		// 정렬되지 않은 배열
		int [] arr1 = {3, 5, 2, 6, 7, 9, 1};
		// 정렬된 배열
		int [] arr2 = {1, 2, 3, 4, 5, 6, 7};
		
		// 숫자 2가 있는 인덱스를 찾음
		int a = Arrays.binarySearch(arr1, 2);
		int b = Arrays.binarySearch(arr2, 2);
		
		System.out.println(a);
		System.out.println(b);
	}
}
