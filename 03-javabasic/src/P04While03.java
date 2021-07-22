
public class P04While03 {
	public static void main(String[] args) {
		/* while 구문의 조건식이 어떻게 해석해도 true로 판단되게 입력하면
		 * 절대 끝나지 않는 무한 루프문이 만들어짐
		 * 이 경우 강제탈출구문 break를 사용해야만 종료할 수 있음
		 */
		int count = 0;
		while (true) { // true는 상수, 특정 조건이 되었을 때 false가 되는 값을 넣어야함
			count += 1;
			System.out.println("반복문이 실행중입니다." + count);
			break;
		}
	}
}
