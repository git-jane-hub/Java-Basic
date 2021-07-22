package exception02;

import java.util.Scanner;

public class P02TryCatch {
	public static void main(String[] args) {
		/* try ~ catch 구문은 크게 예외가 발생할 수 있는 구문을 적는 try 블럭과
		 * 예외 발생시 처리할 catch 블럭으로 나뉨
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1번 정수를 입력해주세요.");
		int a = scan.nextInt();
		System.out.println("2번 정수를 입력해주세요.");
		int b = scan.nextInt();
		
		try {
			/* 예외가 발생할 구문을 적는 블록인
			 * try 블록은 반드시 하단에 catch 블록이 작성되어야 함
			 */ 
			System.out.println(a / b);
			System.out.println("계산 끝!");
		} catch(Exception e){
			/* catch 블록에는 (Exception e)가 기본으로 작성
			 * - 에러가 발생하는 상황이 오면 실행중이던 try구문을 멈추고 catch구문을 실행
			 *   / 에러가 발생하는 상황이 아닌 일반적일 때는 작동되지 않음
			 * 추후 특정한 종류의 예외만 처리하고 싶을때는 다른 자료형을 작성
			 */
			System.out.println("나누는 숫자는 0이 될 수 없습니다.");
		} finally {
			// 모든 실행구문이 끝나고 실행할 코드는 finally 블럭 내부에 작성
			System.out.println("코드 끝!");
		}
	}
}
