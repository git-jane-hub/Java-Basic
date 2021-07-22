package buyandsell;

public class P01MainMulti {
	public static void main(String[] args) {
		// 상인 두명
		P001Seller s1 = new P001Seller(10);
		P001Seller s2 = new P001Seller(10);
		P001Seller02 s3 = new P001Seller02(10);
		
		// 구매자 1명
		P001Buyer b1 = new P001Buyer(15000);
		
		// 구매자 정보 확인
		b1.showBuyer();
		
		// 1번 상인에게 구매자가 망고 구매
		b1.buyMango(s1, 3);
		b1.buyWaterMelon(s3, 1);

		// 1번 상인 정보 확인
		s1.showMangoSeller();

		// 2번 상인 정보 확인
		s2.showMangoSeller();

		// 3번 상인 정보 확인
		s3.showWaterMelonSeller();
		
		
		// 구매자 정보 확인
		b1.showBuyer();
		
		
	}
}
