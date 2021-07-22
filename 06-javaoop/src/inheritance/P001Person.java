package inheritance;
	/* 직장인과 학생을 만듦 - 직장인, 학생 is a 사람
	 * 사람이라면 있는 특징: 이름, 나이 
	 * 	-직장인의 특징: 연봉, 직군
	 *  -학생의 특징: 학교, 전공
	 */
	/* 상속시 고려할 것은 논리 구조
	 * 모든 학생은 사람이다 - o, 그러나 모든 사람은 학생이다 - x 와 같이
	 * 하나의 클래스가 다른 클래스의 바운더리에 완벽히 속하지만, 그 반대의 경우 성립하지 않을 때 상속을 사용
	 */
public class P001Person {
	// 사람이라면 공통적으로 가질 수 있는 속성 정의
	public String name;
	public int age;
	
	public void getPersonInfo() {
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "세 입니다.");
	}
}
