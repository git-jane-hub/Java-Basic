package math01;

public class R04 {
	public static void main(String[] args) {
		// 주사위 게임
		int getAOne = (int)(Math.random() * 6) + 1;
		int getATwo = (int)(Math.random() * 6) + 1;

		int getBOne = (int)(Math.random() * 6) + 1;
		int getBTwo = (int)(Math.random() * 6) + 1;
		
		int a = (getAOne + getATwo);
		int b = (getBOne + getBTwo);
		int count = 1;
		boolean bool = true;
		while(bool) {
			if(a > b) {
				System.out.println("a가 이겼습니다.");
				bool = false;
			}else if(b > a) {
				System.out.println("b가 이겼습니다.");
				bool = false;
			}else {
				System.out.println("서로 비겨 게임을 다시 시작합니다.");
				count++;
				if(count == 10) {
					System.out.println("게임을 중지합니다.");
					bool = false;
				}
			}
		}
		System.out.println("a가 던진 주사위의 합: " + a);
		System.out.println("b가 던진 주사위의 합: " + b);
		System.out.println("총 게임 진행 횟수: " + count);
	}
}
