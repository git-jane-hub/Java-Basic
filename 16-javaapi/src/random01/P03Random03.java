package random01;

import java.util.Random;

public class P03Random03 {
	public static void main(String[] args) {
		/* Random 클래스의 nextInt()는 나올 숫자의 범위를 지정 가능
		 * 바로 정수로 나오기 때문에 코드가 더 간결함
		 */
		Random random = new Random();
		
		// 범위 입력을 하지 않는 경우 아무 정수(음수, 0, 양수)가 출력됨
		int result = random.nextInt();
		
		System.out.println(result);
		
		// 정수 숫자 하나를 파라미터로 넣어주면 (0 <= 파라미터 내부 값 < n)이 산출됨
		int result2 = random.nextInt(5);
		System.out.println(result2);
	}
}
