package system01;

public class R01Eit {
	public static void main(String[] args) {
		for(int num = 0; num < 10; num++) {
			if(num == 4) {
				System.exit(0); // 전체 프로그램을 중단 시킴
			}
			System.out.println("print" + num);
		}
		System.out.println("프로그램 끝");
	}
}
