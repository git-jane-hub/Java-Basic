import java.util.Scanner;

public class P12For06 {
	public static void main(String[] args) {
		/* Scanner로 정수를 입력받음
		 * 입력받은 정수의 제곱형태의 직사각형이 찍히도록 중첩 반복문 작성
		 * ***
		 * ***
		 * *** 과 같이 출력
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 입력해주세요.");
		int num = scan.nextInt();
		for (int square = 0; square < num; square++) { // 세로변을 만드는 별
			for (int dot = 0; dot < num; dot++) {      // 가로변을 만드는 별
				System.out.print("* ");
			}
			System.out.println();                      // 가로변 한 줄을 다 만들고 세로변 한 줄을 추가해줌
		}
		scan.close();
	}
}
