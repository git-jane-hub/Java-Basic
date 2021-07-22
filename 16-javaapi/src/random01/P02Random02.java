package random01;

import java.util.Random;
import java.util.Scanner;

public class P02Random02 {
	public static void main(String[] args) {
		/* Random 객체를 생성한 다음 nextBoolean()을 이용해서 동전던지기 카운팅 프로그램 만들기
		 * n회 던졌을 때, true = 앞면, false = 뒷면으로 간주해서
		 * 프로그램이 다 끝나면 앞면 몇 회, 뒷면 몇 회인지 콘솔에 출력
		 * 실행 횟수 n회는 스캐너로 입력받음
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("동전 던질 횟수를 알려주세요.");
		int count = scan.nextInt();
		Random coin = new Random();
		int front = 0;
		int back = 0;
		for(int a = 0; a < count; a++) {
			boolean result = coin.nextBoolean();
			if(result == true) {
				front++;
			}else if(result == false){
				back++;
			}
		}
		System.out.println("--동전을 " + count + "회 던진 결과--");
		System.out.println("앞면: " + front);
		System.out.println("뒷면: " + back);
	}
}
