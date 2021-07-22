package random01;

import java.util.Random;

public class P01Random01 {
	public static void main(String[] args) {
		/* Random 클래스
		 * Math.random()보다 좀 더 간단하게 다양한 종류의 난수값을 얻을 수 있음
		 * java.util을 통해 import
		 */
		Random random = new Random();
		
		// boolean 데이터타입의 난수를 리턴
		boolean result = random.nextBoolean();
		
		System.out.println(result);
	}
}
