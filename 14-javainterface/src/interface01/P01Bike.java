package interface01;

public class P01Bike implements P01Vehicle{
	private String owner;
	private String type;
	private int curSpeed;
	private int curFuel;
	
	
	public P01Bike(String owner) {
		this.owner = owner;
		this.type = "오토바이";
		this.curSpeed = 0;
		this.curFuel = BIKE_MAX_GAS;
	}
	
	@Override
	public void accel() {
		curSpeed += 5;
		if(curSpeed + 5 > 100) {
			curSpeed = 100;
		}
		curFuel -= 1;
	}

	@Override
	public void breakSpeed() {
		curSpeed -= 5;
		if(curSpeed - 5 < 0) {
			curSpeed = 0;
		}
	}

	@Override
	public void reFuel() {
		curFuel += 15;
		if(curFuel + 15 > BIKE_MAX_GAS) {
			curFuel = BIKE_MAX_GAS;
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
