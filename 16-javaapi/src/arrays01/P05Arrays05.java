package arrays01;

import java.util.Arrays;

public class P05Arrays05 {
	public static void main(String[] args) {
		/* 4. Arrays.sort(배열명);
		 * 단순히 숫자에만 작동하는 것은 아님
		 * 문자에도 ASCII코드 규칙에 따라 제한적으로 작동
		 */
		String [] arr = {"apple", "Apple", "Banana", "giraffe", "Zet"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
