package buyandsell;

public class P01MainSingle {
	public static void main(String[] args) {
		P001Buyer b1 = new P001Buyer(2000);
		b1.showBuyer();
//		b1.buyMango(3);
		b1.showBuyer();

		
		P001Seller s1 = new P001Seller(20);
		s1.showMangoSeller();
		s1.sellMango(100);
		s1.showMangoSeller();
		s1.sellMango(15);
		s1.showMangoSeller();
	}
}
