package math01;

public class R05 {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 3);
		int b = (int)(Math.random() * 3);
		/* 가위2 > 보1, 가위2 < 바위0
		 * 보1 > 바위0, 보1 < 가위2
		 * 바위0 > 가위2, 바위0 < 보1
		 */
		final int SCISSORS = 2;
		final int PAPER = 1;
		final int ROCK = 0;
		
		String [] result = {"바위", "보", "가위"};
		
		if(a == b) {
			System.out.println("비겼습니다.");
		}else if((a > b && b != 0) ||
				 (a > b && b != 2) ||
				 (a == 0 && b != 1)){
			System.out.println("a가 이겼습니다.");
		}else {
			System.out.println("b가 이겼습니다.");
		}
		System.out.println("a가 낸 것: " + result[a]);
		System.out.println("b가 낸 것: " + result[b]);
	}
}
