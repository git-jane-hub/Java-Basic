package final02;
/* 상수를 왜 사용하는가?
 * - 초기화한 부분만 수정해도 전체 프로그램에 수정내용이 반영됨
 */
public class P01FinalMain02 {
	public static void main(String[] args) {
		// 일반 숫자를 이용한 출력 요소
		System.out.println("체중: " + 70);
		System.out.println("키: " + 180);
		
		// 아래처럼 출력물에 대한 정보를 작성하지 않으면 실행문이 무엇을 뜻하는지 내용을 알 수 없음
		System.out.println(70);
		System.out.println(180);
		
		/* 자주 사용하게 될 수치는 아래와 같이 상수처리해서 코드에 대입
		 * 변수명만으로도 어떤 의미를 가진 수치인지 유추가 가능 - 코드 가독성이 높아짐
		 * 상수는 대문자로 작성하고 언더바로 띄어쓰기를 함
		 */
		final int WEIGHT = 70;
		final int HEIGHT = 180;
		System.out.println(WEIGHT);
		System.out.println(HEIGHT);
	}
}
