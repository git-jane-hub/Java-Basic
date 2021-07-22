package casting;

public class R02Main {
	public static void main(String[] args) {
		R01Animal a1 = new R01Animal("동물", 1);
		a1.eat();
		System.out.println(a1 instanceof R01Animal);
		System.out.println("------");
		
		R01Animal t1 = new R01Tiger("호랑이", 2);
		t1.eat();
		R01Tiger tiger = (R01Tiger)t1;
		System.out.println(t1 instanceof R01Animal);
		System.out.println(t1 instanceof R01Tiger);
		System.out.println(tiger instanceof R01Animal);
		System.out.println(tiger instanceof R01Tiger);
		tiger.eat();
		tiger.run();
		
		System.out.println("------");
		
		R01Animal k1 = new R01Koala("코알라", 3);
		k1.eat();
		R01Koala koala = (R01Koala)k1;
		koala.eat();
		koala.sleep();
		System.out.println(k1 instanceof R01Animal);
		System.out.println(k1 instanceof R01Koala);
		System.out.println(koala instanceof R01Animal);
		System.out.println(koala instanceof R01Koala);
	}
}
