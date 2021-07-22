
public class P11For05 {
	public static void main(String[] args) {
		/* 2 ~ 9단까지 구구단을 출력하는 코드를 중첩 반복문을 사용해서 작성
		 */
		for(int dan = 2; dan < 10; dan++) { // for i 여는 부분
			System.out.printf("%n----%d단----%n", dan);
			for(int num = 1; num < 10; num++) { // for j 여는 부분
				System.out.printf("%d * %d = %2d%n", dan, num, (dan * num));
			} // for j 닫는 부분
		} // for i 닫는 부분
	}
}
