package superclass;

public class P001Airplane {
	// 비행기는 속도
	public int speed;
	
	// 생성자는 속도를 입력한 값을 받도록 함
	public P001Airplane(int s) {
		speed = s;
	}
	
	/* fly() 메서드를 수행하면 속도가 500씩 증가
	 * 단 일반 비행기는 속도가 900이상 될 수 없음
	 */
	public void fly() {
		/* 속도를 조건식으로 최대속도는 900초과 안됨
		 * 최대속도 미만에서 500씩 더해주는 로직 작성
		 */
		/*
		if(speed + 500 > 900) {
			speed = 900;
		}else {
			speed += 500;
		}
		*/
		speed += 500;
		if(speed > 900) {
			speed = 900;
		}
			System.out.println("시속 " + speed + "km/h로 비행중입니다.");
	}
	
	/* breakSpeed() 메서드를 수행하면 속도가 100씩 감소
	 * 단, 브레이크 연산은 속도 최저선이 0
	 */
	public void breakSpeed() {
		/* 속도를 조건식으로 0미만으로 내려갈 수 없고
		 * 100씩 감소시키는 로직
		 */
		/*
		if(speed - 100 < 0) {
			speed = 0;
		}else {
			speed -= 100;
		}
		*/
		// 일단 100을 빼주고 최저속도를 검사
		 speed -= 100;
		 if(speed < 0) {
		   speed = 0;
		 }
		System.out.println("감속결과 시속 " + speed + "km/h 입니다.");
	}
}
