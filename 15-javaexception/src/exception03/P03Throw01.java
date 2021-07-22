package exception03;

public class P03Throw01 {
	public static void main(String[] args) {
		// throw는 예외 상황이 아니지만 예외를 강제로 발생시킴(에러를 가장 - 테스트할 때 쓰임)
		int i = (int)(Math.random() * 10);
		
		try {
			if(i > 3) {
				throw new ArrayIndexOutOfBoundsException();
			}else {
				System.out.println("정상 범위 난수 발생");
			}
		}catch(Exception e) {
			System.out.println("없는 예외를 만들었습니다.");
			e.printStackTrace();
			// java.lang.ArrayIndexOutOfBoundsException
			//         at exception03.P03Throws01.main(P03Throws01.java:10)
			// - 어떤 라인에서 무슨 에러가 발생했는지 알고싶을 때 작성
		}finally { // 예외 발생 여부와 상관없이 항상 실행
			System.out.println("코드는 여기서 멈춥니다.");
		}
	}
}
