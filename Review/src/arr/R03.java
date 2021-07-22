package arr;

import java.util.Arrays;

public class R03 {
	public static void main(String[] args) {
		int [] arr1 = {32, 56, 43, 90, 1, 20};
		String [] arr2 = {"나", "라", "하", "W", "z", "V", "a"};
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
