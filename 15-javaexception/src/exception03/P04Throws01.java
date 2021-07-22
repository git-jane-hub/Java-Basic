package exception03;

public class P04Throws01 {
	/* 특정 메서드 영역에서 발생하는 코드는 try 블럭 외부의 예외발생으로 간주됨
	 * 따라서 개념적으로는 try 블럭 밖에 있지만 실제로는 try 블럭에 속한것처럼 처리하기 위해 throws를 사용자 정의 메서드 뒤에 작성
	 */
	public static void doIt(String[] s, int i) throws ArrayIndexOutOfBoundsException {
		System.out.println(s[i]);
	}
	
	public static void main(String[] args) {
		String []greeting = {"안녕","hi","니하오","신짜오"};
		int i = (int)(Math.random() * 5); // 정수 0, 1, 2, 3, 4
		
		try {
			doIt(greeting, i);
			// throws가 작성된 메서드는 반드시 try 블록 내에서 호출되어야 함
		}catch(Exception e) {
			// 위의 예외가 catch에서 넘겨받아 처리
			System.out.println("main 지역에서 처리했습니다.");
		}
	}
}
