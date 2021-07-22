
public class P04Break02 {
	public static void main(String[] args) {
		/* 중첩 반복문 사용시 전체 다 종료가 아닌
		 * 내부 반복문만 종료하는 예시
		 * 구구단 출력, 단 n * 5 까지만 출력 
		 */
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단 출력.");
			for(int j = 1; j <= 9; j++) { // break가 없다면 2 ~ 9단까지 출력되는 구구단
				if(j > 5) {               // 이 조건이 참이되면 아래 문장 출력과 break실행
					System.out.println(i + " * 6 이상은 직접 알아보기");
					break;                // 가장가까운 j-for문을 삭제
				}
				System.out.println(i + " * " + j + " = " + i*j);
			} // 여기서 j-for문으로
			System.out.println("----------------");
		}     // 여기서 i-for문으로
	} 
}
