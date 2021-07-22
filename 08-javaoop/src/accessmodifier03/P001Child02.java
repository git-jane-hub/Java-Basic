package accessmodifier03;

import accessmodifier02.P001Parent;
	/* P001Child02는 accessmodifier03 패키지 내부에 있고,
	 * P001Parent는 accessmodifier02 패키지 내부에 있어
	 * 부모-자식간 클래스의 소속이 다름
	 */
public class P001Child02 extends P001Parent{
	protected int e;
	
	/* P001Child02의 getB 메서드는 P001Parent의 b에 접근
	 * getB()와 같이 내부 요소를 조회만 할 수 있고,
	 * 수정은 할 수 없도록 제한하는 메서드를 getter라고 함
	 */
	
	/* 아래 내용이 에러가 발생하지 않고 출력되는 이유는
	 * 패키지는 서로 다른 위치에 있지만,
	 * 서로 상속관계이며 객체구조에서 본 클래스와 am02.parent클래스가 같은 위치에 있고
	 * protected는 상속관계에서는 접근이 가능하기 때문
	 */
	public void getB() {
		// 콘솔에 출력하는 기능만 하는 getter 메서드
		System.out.println(b);
	}
	
	/* getter는 위의 getB()처럼 특정 변수의 수치를 콘솔에 출력해주는 유형도 있지만,
	 * 좀 더 많이 사용하는 유형은 해당 변수의 값을 return 구문을 이용해 호출위치로 가져다 두는 형태를 더 많이 씀
	 * int를 return 자료로 가지는 getBInt()를 추가로 아래에 작성 
	 */
	public int getBInt() {
		// b값을 가져다 놓는(반환하는) 기능을 하는 getter 메서드
		// main 영역에서 해당 메서드를 출력문 괄호에 작성하면 getB와 같은 기능까지 더할 수 있음
		return this.b;
	}
	
	/* b변수의 값을 변경할 수 있도록 도와주는 setB(int) 메서드 작성
	 * b값은 음수가 될 수 없음
	 * 작성된 setB를 이용해 P01Main02.java에서 b값을 변경하는 로직 추가
	 */
	public void setB(int b) {
		// setter는 사용자의 선택폭을 제한할 때 사용
		if(b >= 0) {
			this.b = b;
		}
	}
	
}
