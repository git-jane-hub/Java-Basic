import java.util.Scanner;

public class P09For03 {
	public static void main(String[] args) {
		/* 구구단 출력기 만들기
		 * 1 ~ 9 중 하나의 숫자를 입력받음
		 * 만약 1 ~ 9 범위를 벗어난 숫자가 입력된다면
		 * "범위 내의 수를 입력해주세요" 라는 안내문구를 적고 종료
		 * 맞는 숫자가 들어온다면 결과예시처럼 출력
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("1 ~ 9 사이의 숫자를 입력하세요.");
		int num = scan.nextInt();
		if ((num > 0) && (num < 10)) { // if ~ else if 로 출력식을 두번 작성하지 않고 &&을 사용해 두가지 조건 생성
			for (int a = 1; a < 10; a++) {
				System.out.printf("%d * %d = %d%n",num, a, (num*a));
			}
		} else {
			System.out.println("범위 내의 수를 입력해주세요.");
		}
	}
}
