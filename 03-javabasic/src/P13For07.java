
public class P13For07 {
	public static void main(String[] args) {
		/* 중첩 반복문을 이용해서 다음 방정식의 양의 정수의 해를 모두 구하기
		 * 4x + 5y = 60
		 * x <= 15
		 * y <= 12
		 */
		for(int x = 1; x <=15 ; x++) { // 미지수 개수만큼 for문 중첩 개수를 늘려줌
			for(int y = 1; y <= 12; y++) {
				if((4 * x)+(5 * y) == 60) {  // 공식 적용 x=1일때, y=1 - y=2 - y=3... / x=2일때, y=1 - ...
					System.out.printf("x의 해: %2d%n", x);
					System.out.printf("y의 해: %2d%n", y);
					System.out.println("--------");
				}
			}
		}
	
	}
}
