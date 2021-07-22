
public class Practice03 {
	public static void main(String[] args) {
		// 피라미드 역방향으로 찍기
		int num = 4;
		for(int a = 1; a <= num; a++) {
			for (int b = num; b >= a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
