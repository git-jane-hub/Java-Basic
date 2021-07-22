package constructor;

public class P003BasketballPlayer {
	public int height;
	public int jumpPower;
	
	public P003BasketballPlayer(int h, int j) {
		height = h;
		jumpPower = j;
		System.out.println("농구 선수 생성 완료 - 키: " + h + ", 점프력: " + j);
	}
	
	public void dunkShoot() {
		if(height + jumpPower >= 300) {
			System.out.println("덩크슛에 성공했습니다.");
		} else {
			System.out.println("골대에 닿지 않았습니다.");
		}
	}
}