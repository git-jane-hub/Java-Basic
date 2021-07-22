package constructor;

public class P002Zoo {
	public String type;
	public int price;
	public String enter;
	public boolean cupon;
	
	public P002Zoo(String t, int p, String e, boolean c){
		type = t;
		price = p;
		enter = e;
		cupon = c;
	}
	public void getInfo() {
		System.out.println("입장권: " + type);
		System.out.println("지불금액: " + price + "원");
		System.out.println("입장시간: " + enter);
		System.out.println("할인권: " + cupon);
	}
}
