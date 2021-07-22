package buyandsell;

public class P001Seller02 {
	private int waterMelon;
	private int money;
	
	public P001Seller02(int waterMelon) {
		this.waterMelon = waterMelon;
		this.money = 0;
	}
	public void showWaterMelonSeller() {
		System.out.println("---수박 판매자---");
		System.out.println("남은 수박: " + this.waterMelon);
		System.out.println("현재 수입: " + this.money);
		System.out.println("-------------");
	}
	public void sellWaterMelon(int waterMelon) {
		this.waterMelon -= waterMelon;
		this.money += (waterMelon * 10000); 
	}
	public int getSellWaterMelon() {
		return this.waterMelon;
	}
}
