import java.util.Scanner;

public class P16IfElseIf01 {
	public static void main(String[] args) {
		/*  if ~ else if는 if로 달린 조건 이외의 조건을 추가하려 힐 때 쓰임
		 *  if 문 다음에 작성하며 else 문 전에 작성
		 *  if ~ else if 구문은 else와 달리 조건식을 기입해야함
		 *  if ~ else if 구문은 몇개라도 작성 가능
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int num = scan.nextInt();
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		// 위 if ~ else if 구문은 연산이 최소 1번 / 최대 2번 진행됨
		scan.close();
	}
}
