package interface01;
/* 클래스에서 인터페이스를 구현(상속이라 하지 않음)하기 위해서는
 * implements(extends가 아님) 키워드를 사용
 * 인터페이스 내부의 추상 메서드는 무조건 구현해야함
 */
public class P01Car implements P01Vehicle{
	/* 자동차라면 가져야하는 변수 설정
	 * 현재 속도, 현재 연료량, 차주
	 */
	private String owner;
	private String type;
	private int curSpeed;
	private int curFuel;
	
	/* 생성자 만들기
	 * 차주만 입력받고 나머지 요소는 현재 속도 0, 연료량 100을 대입
	 */
	public P01Car(String owner) {
		this.owner = owner;
		this.type = "자동차";
		this.curSpeed = 0;
		this.curFuel = CAR_MAX_GAS;
//		this.curFuel = 100; 과 동일
	}
	
	@Override
	public void accel() {
		/* 속도: 한 번 가속 시 10씩 증가 - 200을 초과하지 못함
		 * 연료: 한 번 가속시 1씩 감소
		 */
		curSpeed += 10;
		if(curSpeed + 10 > 200) {
			curSpeed = 200;
		}
		curFuel -= 1;
	}

	@Override
	public void breakSpeed() {
		// 속도: 한 번 감속 시 10씩 감소 - 0 미만으로 내려가지 못함
		curSpeed -= 10;
		if(curSpeed - 10 < 0) {
			curSpeed = 0;
		}
	}

	@Override
	public void reFuel() {
		// 연료: 30씩 증가 - 최댓값은 상수 MAX_GAS를 사용해서 측정
		curFuel += 30;
		if(curFuel + 30 > CAR_MAX_GAS) {
			curFuel = CAR_MAX_GAS;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("차      주: " + this.owner);
		System.out.println("수      단: " + this.type);
		System.out.println("현재속도: " + this.curSpeed);
		System.out.println("현재연료: " + this.curFuel);
		System.out.println("-----------");
	}
}
