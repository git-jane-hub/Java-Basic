import java.util.Scanner;

public class P08For02 {
	public static void main(String[] args) {
		/* Hello Java를 입력한 횟수만큼 출력하는 구문작성
		 * 입력은 Scanner 로 받음
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("반복 횟수를 입력해주세요.");
		int num = scan.nextInt();
		int a;
		for (a = 0; a < num; a++) {
//		for (int a = 0; a < num; a++)
//		for (int a = 1; a <= num; a++)
			System.out.println("Hello Java! "+ (a+1));
		}
		scan.close();
	}
}
