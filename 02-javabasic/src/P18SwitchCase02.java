
public class P18SwitchCase02 {
	public static void main(String[] args) {
		/*  Math.random(); 을 이용해 난수를 하나 발급 받을 수 있음 - 랜덤으로 컴퓨터에서 숫자를 발급받음
		 *  default 난수의 범위는 0초과 1미만
		 *  뒤에 숫자를 곱하면 원하는 범위의 정수를 얻을 수 있음
		 */
		double number = Math.random() * 10;
		// 아래 곱하는 숫자가 n이면 0 ~ n-1까지 출력되기 때문에, 주의해서 작성
		int intNum = (int)(Math.random() * 10);
//		System.out.println(intNum);
		/* switch ~ case 문을 이용해서
		 * 식당 이름을 랜덤하게 출력하는 프로그램을 만들기(최소 6개)
		 */
		int a = intNum;
		switch(a) {
		case 0:
			System.out.println("가츠시");
			break;
		case 1:
			System.out.println("싸다김밥");
			break;
		case 2:
			System.out.println("노브랜드 버거");
			break;
		case 3:
			System.out.println("서가네 식당");
			break;
		case 4:
			System.out.println("로쏘");
			break;
		case 5:
			System.out.println("한우마을");
			break;
		case 6:
			System.out.println("소바식당");
			break;
		case 7:
			System.out.println("혼카츠");
			break;
		case 8:
			System.out.println("백년토종삼계탕");
			break;
		case 9:
			System.out.println("아오이토리");
			break;
		}
	}
}
