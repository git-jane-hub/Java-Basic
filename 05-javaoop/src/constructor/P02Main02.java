package constructor;

public class P02Main02 {
	public static void main(String[] args) {
		P002Zoo personA = new P002Zoo("어른", 5000, "9시", true) ;
		personA.getInfo();
		System.out.println("----------");
		P002Zoo personB = new P002Zoo("초등", 1000, "10시30분", false) ;
		personB.getInfo();		
	}
}
