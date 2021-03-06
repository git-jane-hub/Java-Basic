package superclass;
// 초음속 비행기 상속
public class P001SuperSonicAirplane extends P001Airplane {
	/* 초음속 비행기도 일반 비행기처럼 속도를 사용
	 * 따라서 변수는 추가로 정의하지 않음
	 */
	public P001SuperSonicAirplane(int s) {
		/* Airplane의 생성자는 상속되지 않음
		 * 따라서 부모쪽의 생성자라는 의미로
		 * super();를 사용하며 이 때 부모쪽에 넘겨줄 수치값도 함께 받아서 처리 - 변수도 상속된 것을 사용할 것 이라는 뜻
		 */
		super(s);
	}
	
	public void fly() {
		/* 일반 비행 (부모클래스의 fly)는 super.fly();를 이용해 호출 가능
		 * 속도 900 이하인 경우 일반 비행 모드를 호출하게 하고
		 * 속도가 900이상 1300이하인 경우는 초음속 비행을 호출하도록 로직 만들기
		 */
		/*
		speed += 500;
		if(speed < 900) {
			speed -= 500;
			super.fly();
		} else if(speed < 1300) {
			System.out.println("초음속 비행속도: " + speed + "km/h");
		} else {
			speed = 1300;
			System.out.println("초음속 비행속도: " + speed + "km/h");
		}
		*/
		if (speed + 500 < 900) {
			super.fly();
		}else if(speed + 500 <= 1300) {
			speed += 500;
			System.out.println("초음속 비행속도 " + speed + "km/h 입니다.");
		}else {
			speed = 1300;
			System.out.println("초음속 비행속도 " + speed + "km/h 입니다.");
		}
		/*
		 * if ~ else문 안에 다시 if ~ else문을 작성해도됨 - {if ~ }{else(if ~ else)}
		if (speed + 500 < 900) {
			super.fly();
		} else {
			if(speed + 500 >= 1300) {
				speed = 13000;
			}else {
				speed += 500;
			}
			System.out.println("초음속 비행속도 " + speed + "km/h 입니다.");
		}
		*/
	}
}
