
public class P15Method06 {
	/* mul method를 선언
	 * 이 method는 임의로 이름붙인 정수 변수 3개를 입력받아
	 * 변수 3개를 곱한 값을 return 해줌
	 * 
	 * info method를 선언, void return 자료형
	 * 이  method는 내부에서
	 * "안녕하세요
	 * 자바 메서드 학습중입니다.
	 * 3줄을 한 번의 호출로 적습니다." 라는 문장을 출력
	 */
	public static int mul(int a, int b, int c) {
		return (a * b * c);
	}
	public static void info() { // 아래 문장들이 완성된 실행문을 가지고 있기 때문에, 소괄호 안을 작성하지 않아도됨
		System.out.println("안녕하세요");
		System.out.println("Java method 학습중입니다.");
		System.out.println("3줄을 한 번의 호출로 적습니다.");
	}
	public static void main(String[] args) {
		/* mul을 호출해 결과값을 int result에 저장
		 * 저장된 값 콘솔창에 출력해 확인
		 * 
		 * info method 반복문으로 3번 호출
		 */
		int result = mul(10, 20, 30); // return 값을 반환받으면 int result = 6000; > mul method 없어짐
		System.out.println(result);
		for(int a = 1; a < 4; a++) {
			info();
		}
	}
}
