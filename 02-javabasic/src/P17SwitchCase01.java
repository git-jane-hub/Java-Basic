
public class P17SwitchCase01 {
	public static void main(String[] args) {
		/*  switch ~ case 구문은 변수에 들어있는 자료가 case 구문에 제시된 자료와 일치하는지 여부로 논리식을 실행
		 *  switch(변수) {
		 *  case 값1:
		 *     실행문;
		 *  case 값2:
		 *     실행문;.....
		 *  }
		 *  와 같이 작성
		 *  마지막 default 를 작성시 if ~ else 구문의 else처럼 기능
		 */
		int a = 3;
		switch(a) {
		case 1:    // a에 해당하는 숫자와 case의 숫자가 같으면 문장을 출력
			System.out.println("one");
			break; // case 별로 작성해야 코드가 해당하는 값부터 아래로 계속 실행되는걸 막을 수 있음
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default :  // default는 작성하지 않아도 됨
			System.out.println("?????");
			break; // 마지막 구문에는 작성할 필요가 없으나 일관성을 위해 작성함ㄴ
		}
		// '1', '2', '3', '4', '5', '이외'로 구성됨
	}
}
