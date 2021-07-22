package static02;

public class P01Main {
	public static void main(String[] args) {
		// Asean 조원 없이도 Asean 조별점수는 조회 가능
//		System.out.println(P01Asean.score);
		
		// main.java를 생성하고 메인메서드 내부에 구성원을 최소 4인으로 구성
		P01Asean a1 = new P01Asean(24, 23, 30);
		P01Asean a2 = new P01Asean(25, 21, 30);
		P01Asean a3 = new P01Asean(24, 24, 30);
		P01Asean a4 = new P01Asean(23, 23, 27);
		
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
	}
}
