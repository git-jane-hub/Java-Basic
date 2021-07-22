package heapmemory;

import java.util.Arrays;

public class P02ArrayComparison {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		// arr2는 arr1에 저장되어있던 주소값을 받음 - shallow copy (<-> deep copy)
		int[] arr3 = {1, 2, 3, 4, 5};
		// 문자열의 경우 같은 값이 들어오면 같은 주소값을 공유하지만, 배열의 경우 같은 값이 들어와도 다른 주소값에 각각 저장됨
		
		arr1[0] = 10;
		// arr1의 0번째 자리수에 10을 대입
		System.out.println(arr1[0]);
		// arr1과 주소값을 공유하고 있기 때문에 arr1의 배열중 하나를 바꿔줘도 arr2의 배열도 변경됨 - 동기화
		System.out.println(arr2[0]);
		
		System.out.println(arr3[0]);
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
		// 주소값이 아닌 전체 배열 데이터를 출력하려면, Arrays.toString(배열); 문법 사용
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
