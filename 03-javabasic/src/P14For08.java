
public class P14For08 {
	public static void main(String[] args) {
		/* 피라미드 형 별을 만들기
		 * 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요
		 * *
		 * **
		 * ***
		 * ****
		 * 중첩 반복문의 어느 곳이 세로, 가로를 담당하는지 생각하기
		 */
		int num = 4;
		for(int a = 1; a <= num; a++) {   // 피라미드의 높이를 담당
			for(int b = 1; b <= a; b++) { // 피라미드 각층의 별 개수를 담당
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
