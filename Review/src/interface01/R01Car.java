package interface01;

public class R01Car implements R01Vehicle{
	private String driver;
	private int speed;
	private int fuel;

	public R01Car(String driver) {
		this.driver = driver;
		this.speed = 0;
		this.fuel = 100;
	}
	
	@Override
	public void accelSpeed() {
		speed += 30;
		if(speed + 30 > MAX_SPEED) {
			speed = MAX_SPEED;
		}
		
	}

	@Override
	public void breakSpeed() {
		speed -= 20;
		if(speed - 20 < 0) {
			speed = 0;
		}
	}

	@Override
	public void reFuel() {
		fuel += 30;
		if(fuel + 30 > MAX_FUEL) {
			fuel = MAX_FUEL;
		}
	}
	
	@Override
	public void showInfo() {
		System.out.println("차      주: " + driver);
		System.out.println("현재속도: " + speed);
		System.out.println("현재연료: " + fuel);
		System.out.println("-----------");
	}
	
}
