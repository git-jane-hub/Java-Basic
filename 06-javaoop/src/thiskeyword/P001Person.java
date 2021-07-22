package thiskeyword;

public class P001Person {
	// 사람의 정보를 기입
	public String name;
	public int age;
	public int money;
	public String major;
	
	// 생성자를 활용
	public P001Person(String name, int age, int money, String major) {
		/* 대입연산자를 기준으로 좌항의 변수는 P001Person 클래스의 변수와 같은 것으로 인식해야함
		 * name = name;이라는 형식으로 입력하면 좌항의 변수가 P001person 클래스의 변수와 같은 것이라고 인식하지 못함
		 */
		/* main에서 입력된 "가나다", 20, 3000, "통계학"이 들어와서  this.변수명에 주소값이 저장됨 
		 * - this는 주소값을 의미한다고 생각하면됨(main의 객체가 저장되는 주소값)
		 * 힙에서 객체가 생성되고 main에서 입력한 값이 저장됨 - 스택에서는 main에서 생성한 변수가 생기고 주소값이 저장됨
		 * this가 여기에서의 주소값을 의미함
		 */
		this.name = name;
		this.age = age; 
		this.money = money;
		this.major = major;
	}
	
	// getInfo()를 이용해 조회
	public void getInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("재산: " + money);
		System.out.println("전공: " + major);
	}
}
