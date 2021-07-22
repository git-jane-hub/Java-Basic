import java.util.Scanner;
/*  성적 판독기를 만듦
 *  if ~ else if 구문을 사용
 *  성적 기준은 95점 이상 A+, 90점 이상 A0, 85점 이상 B+, 80점 이상 B0,
 *  75점 이상 C+, 70점 이상 C0, 65점 이상 D+, 60점 이상 D0, 60점 미만 F로 출력
 *  스캐너로 int score에 성적을 입력받음
 */
public class Q03ScoreChecker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력해주세요.");
		int score = scan.nextInt();
		if (score >= 95) {
			System.out.println("A+입니다.");
		} else if (score >= 90) {
			System.out.println("A0입니다.");
		} else if (score >= 85) {
			System.out.println("B+입니다.");
		} else if (score >= 80) {
			System.out.println("B0입니다.");
		} else if (score >= 75) {
			System.out.println("C+입니다.");
		} else if (score >= 70) {
			System.out.println("C0입니다.");
		} else if (score >= 65) {
			System.out.println("D+입니다.");
		} else if (score >= 60) {
			System.out.println("D0입니다.");
		} else {
			System.out.println("F입니다.");
		}
		// else if는 if 와 else 사이에 무한정으로 작성 가능
		/* 조건문을 작성할 때는 범위가 적은 것(score >= 95 - 100~95_경우의 수: 6개)부터
		 * 범위가 많은 것 순서(score >= 90 - 100~90_경우의 수: 11개)로 작성해야함
		 */
		scan.close();
	// 위 구문처럼 조건이 너무 많아지면, switch ~ case 구문을 사용하면 효율성이 높아짐
	}
}
