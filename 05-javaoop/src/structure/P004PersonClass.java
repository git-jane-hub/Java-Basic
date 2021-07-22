package structure;

public class P004PersonClass {
	// 정보 정의
	public String name;
	public int age;
	public String pNum;
	public String address;
	public boolean marriage;

	// 추가로 조회 메서드를 PersonClass 내부에 생성
	public void getInfo(P004PersonClass p) { // PersonClass 내부에 method를 작성해도 소괄호 안에 작성?
		System.out.println("이름: " + p.name);
		System.out.println("나이: " + p.age);
		System.out.println("번호: " + p.pNum);
		System.out.println("주소: " + p.address);
		System.out.println("결혼: " + p.marriage);
		/* 
		 * 객체의 변수앞의 참조변수를 없애줘도 에러가 발생하지 않음
		 * 이유는 '같은 지역내'의 변수이기 때문
		 * - 클래스는 자신과 같은 지역에 있는 요소를 소속 명시 없이 조회 가능
		 */
/*
 * 	public void getInfo() { // PersonClass 내부에 method를 작성해도 소괄호 안에 작성? - 할 필요가 없음
 *		 System.out.println("이름: " + name);
 *		 System.out.println("나이: " + age);
 *	  	 System.out.println("번호: " + pNum);
 *		 System.out.println("주소: " + address);
 *		 System.out.println("결혼: " + marriage);
 */
	}
}


