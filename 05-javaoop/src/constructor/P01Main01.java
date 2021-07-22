package constructor;

import java.util.Scanner;
// Scanner라는 클래스 위에 util이라는 패키지, 그 위에 java라는 패키지가 있다 라는 의미

import structure.P001Person;

public class P01Main01 {
	public static void main(String[] args) {
		/* constructor 패키지 내부에 소속된 P001Car를 호출할때는 같은 영역이기 때문에
		 * 'constructor.P001Car'로 호출해도되고, 'P001Car'로 호출해도 됨
		 */
		constructor.P001Car car1 = new constructor.P001Car(100, 0, "최재인");
		// 자동차 정보 조회
		car1.breakSpeed();
		car1.getInfo();
		
		/* 앞과 같은 방법(pck: structure)으로 작성이되면 변수를 초기화 한 적이 없는데 자동차 정보 조회가 가능함(정보의 누락이 있어도 값이 출력됨)
		 * P001car 생성자(클래스와 이름이 동일)를 만들고,
		 * 생성자에서 반드시 받아야할 정보를 요청하면 누락된 정보가 있을 때 실행되지 않게 함
		 * - fool proof: 사용자의 실수를 방지하기 위한 방법
		 */
		car1.accelSpeed();
		car1.accelSpeed();
		car1.breakSpeed();
		
		/* 외부 패키지에 소속된 클래스를 호출할 때
		 * 1.
		 * '패키지명.클래스명 변수명 = new 패키지명.클래스();'로
		 * 내부와 중복된 이름이 없는 클래스라고 하더라도 패키지명을 입력해서
		 * 어느 패키지에서 가져온 클래스인지 알려줘야함
		 */
		structure.P001Person p2 = new structure.P001Person();
		
		/* 2.
		 * 문서 상단에 import 구문을 이용해 현재 패키지의 P001Person은 structure의 클래스임을 명시
		 * 클래스명을 적고 ctrl + space를 이용해서 자동입력 / 직접 import를 입력
		 */
		P001Person p3 = new P001Person();
		Scanner scan = new Scanner(System.in);
	}
}
