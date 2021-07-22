package polymorphism;

public class P01Person {
	/* 사람을 나타내는 상속만을 목적으로 하는 클래스
	 * Person을 상속받은 자식들은 전부 Person을 요구하는 자리에 대입될 수 있음
	 */
	private String name;
	private int age;
	
	// 이름과 나이를 초기화하는 생성자
	public P01Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Person 클래스의 전체 데이터를 콘솔에 찍어주는 showPerson() 작성
	/* Person타입으로 호출했을 때, 유일하게 호출가능한 메서드
	 * 이 메서드를 자식에서 오버라이딩(메서드 재정의)하면 부모타입으로도 자식의 showPerson() 호출 가능
	 */
	public void showPerson() {
		System.out.println("-----------------");
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age + "세");
	}
	
	public String getPersonName() {
		return name;
	}
	
	public void setPersonName() {
		this.name = name;
	}
	
	public int getPersonAge() {
		return age;
	}
	
	public void setPersonAge() {
		this.age = age;
	}
}
