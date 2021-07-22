import java.util.Scanner;

public class P03While02 {
	public static void main(String[] args) {
		/* 스캐너를 이용해서 String num 변수에
		 * "문자열 형태인 숫자"를 입력받게 함
		 * 이 문자자료 num 을 int loop 변수에 정수로 변환해 저장
		 * loop 변수에 입력된 정수 횟수만큼 - 변수를 하나 더 만들어야 함
		 * "반복문을 실행합니다(횟수)" 라는 문장이 출력되도록 while 구문 작성
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		String num = scan.next();  // String num = scan.nextLine();
		int loop = Integer.parseInt(num);
		int a = 0;
		// 조건식을 만들기 위한 변수_목표지점인 loop까지 도달하기 위해서 필요
		while (a < loop) { // 입력받은 숫자인 loop는 변경될 필요가 없는 숫자
			a += 1;        // 실행을 끝내기 위해 숫자를 계속 변경해주는 것
			System.out.printf("반복문을 실행합니다. %d%n", a);
//			System.out.println("반복문을 실행합니다." + a);
		}
	}
}
