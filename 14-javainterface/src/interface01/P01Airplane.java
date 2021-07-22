package interface01;

public class P01Airplane implements P01Vehicle{
	private String owner;
	private String type;
	private int curSpeed;
	private int curFuel;
	
	public P01Airplane(String owner) {
		this.owner = owner;
		this.type = "비행기";
		this.curSpeed = 0;
		this.curFuel = AIRPLANE_MAX_GAS;
	}
	
	@Override
	public void accel() {
		curSpeed += 100;
		if(curSpeed + 100 > 1000) {
			curSpeed = 1000;
		}
		curFuel -= 30;
	}

	@Override
	public void breakSpeed() {
		curSpeed -= 80;
		if(curSpeed - 80 < 0) {
			curSpeed = 0;
		}
	}

	@Override
	public void reFuel() {
		curFuel += 50;
		if(curFuel + 50 > AIRPLANE_MAX_GAS) {
			curFuel = AIRPLANE_MAX_GAS;
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
