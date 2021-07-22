package arr;

import java.util.Arrays;

public class R02 {
	public static void main(String[] args) {
		int [] arr1 = {0, 1, 2, 3, 4, 5};
		int [] arr2 = Arrays.copyOf(arr1, 4);
		int [] arr3 = Arrays.copyOfRange(arr1, 2, 4);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
