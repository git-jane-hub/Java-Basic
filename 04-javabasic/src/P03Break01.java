
public class P03Break01 {
	public static void main(String[] args) {
		/* break문은 반복문 내부에서 실행될 경우 즉시 반복문 종료
		 * break문은 중첩반복문에서 사용시 전체 반복문을 종료시키지 않고
		 * break문이 속해있는 영역까지만 / 가장 가까이 있는 반복문을 종료
		 */
		int[] arr = {9, 8, 7, 6, 1, 2, 3, 4, 5};
		int a = 1;

		for(int num: arr) { // arr라는 변수를 순서대로 하나씩 출력하면서 반복
			if(a == num) {  // a와 출력하는 arr중 같은 내용을 찾으면
				System.out.println("1이 나와서 종료합니다.");
				break;      // 종료
			}
			System.out.println("이번 숫자는 " + num + "입니다."); // for문을 나와서 출력되는 문장
		}
	}
}
