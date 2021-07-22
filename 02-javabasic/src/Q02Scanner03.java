/*  환율 계산기 만들기
 *  네이버에 검색해서 원하는 국가 화폐의 환율을  rate 변수에 저장 - 원래 갖고 있을 값이 rate_변수 선언
 *  스캐너를 이용해서 won 변수에 원화금액을 입력 - 입력 받을 값이 won_nextInt에 저장
 *  원화와 환율을 이용해서 원화 xxxx원을 화전시 xxxx(화폐)입니다.
 *  라는 결과물을 출력
 * 
 */

import java.util.Scanner;

public class Q02Scanner03 {
	public static void main(String[] args) {
		double rate = 0.005728;
		Scanner scan = new Scanner(System.in);
		System.out.println("중국 위안화의 환율은 174.57입니다.");
		System.out.println("원화 금액을 입력하세요.");
		int won = scan.nextInt();
		System.out.println("원화 " + won + "원을 중국 위안화로 환전 시");
		System.out.println(Math.round(won * rate) + "RMB입니다.");
		// Math.round: 소수점 첫째자리에서 반올림
//		System.out.println(String.format("%.2f", (won * rate) + "RMB입니다.");
		// String.format: (나중에 배움)
		
		System.out.printf("%fRMB입니다.%n", won * rate);   // %f의 기본형 - 소수점아래 여섯자리까지 표현
		System.out.printf("%.0fRMB입니다.%n", won * rate); // %f가 표현하는 자리를 소수점아래 0자리만큼 표현
		System.out.printf("%.2fRMB입니다.%n", won * rate); // %f가 표현하는 자리를 소수점아래 2자리만큼 표현
		/*  printf(print formatting):
		 *  문자열을 연결할 때 사용하는 쌍따옴표와 더하기 연산자가 불편해서
		 *  f라는 위치에 구멍을 뚫고 그 자리에 들어갈 값을 쉼표 뒤에 작성(쉼표 뒤 내용을 작성하지 않으면 에러 발생)
		 */
		scan.close();
	}
}
