
public class P10For04 {
	public static void main(String[] args) {
		/* 자주 쓰이는 구문
		 * 중첩 반복문은 반복문을 반복시키는 구문
		 * 실행 횟수는 (바깥쪽 반복문 횟수) * (안쪽 반복문 횟수)
		 * 실질적으로 쓸 일이 가장 많은 구문
		 */
		for (int i = 0; i < 3; i++) {    // 바깥쪽 반복문(i = 0, 1, 2) 열기
			for(int j = 0; j < 3; j++) { // 안쪽 반복문(j = 0, 1, 2) 열기
				System.out.print(i * j+" , ");
			} // 안쪽 반복문 닫기 
		}     // 바깥쪽 반복문 닫기
	}
}
