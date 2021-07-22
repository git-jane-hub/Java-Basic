package buyandsell;

public class P001Seller {
	/* 판매자
	 * 돈과 망고를 가짐
	 */
	private int money;
	private int mango;
	
	/* 생성자에서 망고 개수를 입력받을 수 있음
	 * 돈은 0으로 넣어줌
	 */
	public P001Seller(int mango) {
		this.money = 0;
		this.mango = mango;
	}
	// showSeller를 이용해 현재 남은 망고와 돈을 볼 수 있음
	public void showMangoSeller() {
		System.out.println("---망고 판매자---");
		System.out.println("남은 망고: " + this.mango);
		System.out.println("현재 수입: " + this.money);
		System.out.println("-------------");
	}
	
	/* 판매시 망고개수를 입력할 수 있고
	 * 망고 개수 * 1000원 만큼의 돈이 올라가고 망고는 판 개수만큼 차감
	 * 0미만으로 망고가 줄어들 수 없음
	 */
	public void sellMango(int mango) {
		if(this.mango < mango) {
			System.out.println("망고가 부족합니다.");
			return;
		}
		this.mango -= mango;
		this.money += (mango * 1000);
	}
	// 망고개수를 buyer에서 확인할 수 있도록 getter 생성
	public int getSellerMango() {
		return this.mango;
	}
	
	public void setSellerMango(int mango) {
		// Buyer가 seller에게 망고를 가져감
		this.mango -= mango;
	}
	public int getSellerMoney() {
		return this.money;
	}
	
	public void setSellerMoney(int money) {
		// Buyer가 seller에게 망고를 가져감
		this.money += money;
	}
}
