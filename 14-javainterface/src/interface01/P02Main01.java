package interface01;

public class P02Main01 {
	public static void main(String[] args) {
		// 자동차 생성 및 사용 - P01Vehicle 타입과 P01Car 타입 두가지 모두 작동
		P01Vehicle c1 = new P01Car("김00");
		P01Car c2 = new P01Car("최00");
		c1.showStatus();
		c1.breakSpeed();
		c1.showStatus();
		c1.accel();
		c1.accel();
		c1.accel();
		c1.accel();
		c1.accel();
		c1.accel();
		c1.accel();
		c1.reFuel();
		c1.reFuel();
		c1.reFuel();
		c1.reFuel();
		c1.reFuel();
		c1.showStatus();
		P01Vehicle.test();
	}
}
