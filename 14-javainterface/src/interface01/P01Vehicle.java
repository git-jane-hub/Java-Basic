package interface01;
/* interface는 선언을 사용
 * 내부에는 상수, 추상 메서드 만을 선언
 * 처음부터 구현(implement)을 전제로 설계되기 때문에 일반 변수, 메서드를 내부에 선언할 수 없음 
 */
public interface P01Vehicle {
	// 최대 연료량 - 각 수단별로 최대치를 상수로 작성
	int BIKE_MAX_GAS = 80;
	int CAR_MAX_GAS = 100;
	int AIRPLANE_MAX_GAS = 1000;
//	public static final int MAX_GAS = 100; 와 같음
	
	/* 탈 것이라면 가지고 있을 공통적 기능을 전부 추상 메서드로 작성
	 * {
	 * 		실행문...
	 * }
	 * 부분 없이 작성
	 */
	public void accel();		// 가속
//	public abstract void accel(); 과 같음
	public void breakSpeed();	// 감속
	public void reFuel();		// 주유
	public void showStatus();	// 계기판 조회
	
	public static void test() {
		System.out.println("테스트");
	}
}
