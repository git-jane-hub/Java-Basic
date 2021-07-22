package arrays01;

import java.util.Arrays;

public class P06Arrays06 {
	public static void main(String[] args) {
		/* 한글은 유니코드 체계에 따라 값이 배정되어 있음
		 * 유니코드는 아스키코드의 범위(대략 세자리 수)를 넘어서는 범위의 문자를 표현하기위해 나온 체계
		 */
		String [] arr = {"김자바", "박스프링", "제이에스피", "스프링부트", "톰캣", "이클립스", "인텔리제이",
						 "java", "python", "jsp", "Spring"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
