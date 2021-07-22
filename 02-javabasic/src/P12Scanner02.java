import java.util.Scanner;

public class P12Scanner02 {
	public static void main(String[] args) {
		// Scanner 생성
		Scanner scan = new Scanner(System.in);
		
		// 문자열을 입력받는 경우
		String name = scan.nextLine();
		
		// 실수를 입력받는 경우
		double height = scan.nextDouble();
		
		/*  문자열과 실수를 연산해도 에러가 발생하지 않음
		 *  (자주 사용되는 방법)
		 *  더하기 연산에 문자열이 한개 이상 있으면 결과값이 문자열로 변경됨 - String + double -> String으로 출력
		 *  
		 *  문자열끼리 더하기 연산을 실행하면 "가나다"+"마바사" -> "가나다마바사"
		 */
		System.out.println(name + height);
		scan.close();
	}
}
