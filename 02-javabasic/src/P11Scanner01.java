import java.util.Scanner; // Scanner를 사용한다는 선언

public class P11Scanner01 {
	public static void main(String[] args) {
		/*  코드 실행 중 사용자의 입력을 받는 경우 스캐너 기능을 사용
		 *  Scanner 부분에 마우스를 갖다대고 import를 클릭
		 */
		// scanner 변수를 생성
		Scanner scan = new Scanner(System.in);
		
		// 아래 코드가 진행되려면 사용자에게 정수 하나를 입력받아야함
		int a = scan.nextInt();
		
		// 입력받은 정수를 출력
		System.out.println(a);
		
		// 메모리 절약을 위해 다 사용한 scan 변수를 닫아줌
		scan.close();
	}
}
