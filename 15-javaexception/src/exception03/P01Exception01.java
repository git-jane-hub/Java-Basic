package exception03;

public class P01Exception01 {
	public static void main(String[] args) {
	/* 다중 catch는 블럭 내부에서 여러 유형의 예외가 발생할 수 있을 때,
	 * 각각 예외유형을 다르게 처리 시 사용
	 * catch 구문은 여러번 사용가능
	 */
		int [] number = {1, 2, 3, 4, 5, 0};
	
		try {
			for(int i = 0; i < 6; i++) {
				System.out.println(number[i]);
			}
			System.out.println(number[4] / number[5]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다.");
		}
		catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch(Exception e) { // 상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야함
			System.out.println("이외의 예외가 발생했습니다.");
		}
	}
}
