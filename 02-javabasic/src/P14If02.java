import java.util.Scanner;

public class P14If02 {
	public static void main(String[] args) {
		/* 주어진 변수 a에 스캐너로 정수값을 입력받음
		 * 입력받은 정수가 0이상이면 "0보다 크거나 같습니다."를 출력
		 * 그렇지 않다면 "0보다 작습니다."를 출력하는 코드를
		 * if문 2개를 이용해 구현
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a = scan.nextInt();
		System.out.print("입력된 숫자는 ");
		if (a >= 0) {
			System.out.println("0보다 크거나 같습니다.");
		}
		if (a < 0) {
			System.out.println("0보다 작습니다.");
		}
		// 위 if문은 연산이 두번 진행됨
		scan.close();  // scan 닫기
	}
}
