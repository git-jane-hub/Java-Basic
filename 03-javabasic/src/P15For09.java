
public class P15For09 {
	public static void main(String[] args) {
		/* 이거 못품!!!!!!!!!!!!!!!!
		 *  _ _ _ *
		 *  _ _ * *
		 *  _ * * *
		 *  * * * *
		 *  모양 피라미드
		 */
		for (int row = 1; row <= 4; row++) {
			
//			for (int a = 3; a >= 1; a--) {
			for (int a = 0; a < 4-row; a++) { // row 와 연관지어 조건을 작성하여 다음 줄을 작성할 때 공백수가 줄어들 수 있도록 작성	
				System.out.print(" ");
			}
			
			for (int b = 1; b <= row; b++) {
				System.out.print("*");
			}	
			System.out.println();
		}
	}
}
