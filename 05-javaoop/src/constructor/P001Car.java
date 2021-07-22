package constructor;

public class P001Car {
	// 자동차 속성(멤버변수)
	public int gas;
	public int speed;
	public String owner;
	
	/*
	 *  자동차 생성자(new 키워드로 자동차 생성시 실행될 메서드)
	 *  리턴타입은 작성하지 않음
	 *  클래스 이름과 동일하게 작성
	 *  생성시 자동으로 호출되기 때문에 무시하고 넘어갈 수 없음
	 */
	public P001Car(int g, int s, String o) { // 아래내용은 생성자로 인해 호출된 실행문
		// 입력받은 정보를 변수에 대입
		gas = g;
		speed = s;
		owner = o;
		System.out.println("자동차 생성 완료!");
		System.out.println("연료: " + gas + ", 속도: " + speed + ", 주인: " + owner);
		// 
	}
	
	// 자동차 동작 추가
	public void getInfo() {
		System.out.println("현재 연료량: " + gas);
		System.out.println("현재 속도: "+ speed);
		System.out.println("현재 주인: "+ owner);
		System.out.println("---------------");
	}
	
	// 자동차 운전 기능 추가 - 메서드(기능)를 활용해 변수(속성)를 변화시킴
	public void accelSpeed() {
		gas -= 2;
		speed += 10;
		getInfo();
	}
	// 자동차 브레이크 기능 추가
	public void breakSpeed() {
		speed -= 10;
		getInfo();
	}
	// 문제점: 현실에서는 어떠한 변수값이 0일 때, 동작하지 않는 경우가 프로그램 내부에서 반영되지 않음
}
