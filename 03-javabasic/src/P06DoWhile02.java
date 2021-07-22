import java.util.Scanner;

public class P06DoWhile02 {
	public static void main(String[] args) {
		/* 여러분들이 배달 어플을 만들었습니다.
		 * 어플은 주문금액을 입력받음
		 * 주문금액이 15000원 미만이면 프로그램이 멈춤
		 * 주문금액은 Scanner를 이용해 order변수에 직접 입력받음
		 * 단, do while 구문으로 작성해
		 * 첫 주문은 주문 금액이 15000미만이여도 "배달을 완료했습니다."라고 출력
		 * 다시 주문금액을 입력받는 로직을 반복문 내부에 작성
		 */
		//Scanner scan1 = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.println("배달금액을 입력해주세요.");
		int order = scan.nextInt();
		do {
		 System.out.printf("주문금액은 %d원입니다.%n", order);
		 System.out.println("배달을 완료했습니다.");
		 System.out.println("다음 배달금액을 입력해주세요.");
		 order = scan.nextInt();  // int는 두번 선언할 수 없음
		} while (order >= 15000); // 해당 조건이 참이면 do로 올라가 다시 실행
		System.out.println("금액이 모자라 배달 서비스가 종료되었습니다.");
	} 
}		

