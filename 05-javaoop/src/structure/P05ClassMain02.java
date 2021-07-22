package structure;

public class P05ClassMain02 {
	public static void main(String[] args) {
		P005IPad a = new P005IPad();
		// 문제점: 정보의 누락이 있어도, 에러가 발생하지 않음
		a.gener = "3세대";
		a.size = 11;
		a.lte = false;
		a.pencil = true;
		
		P005IPad b = new P005IPad();
		b.gener = "2세대";
		b.size = 13;
		b.lte = true;
		b.pencil = true;
		
		a.getInfo();
		System.out.println("-------");
		b.getInfo();
	}
}
