package polymorphism;
// 부모 클래스를 Person으로 가지는 클래스
public class P01Student extends P01Person{
	private int grade;
	
	public P01Student(String name, int age, int grade) {
		/* 부모쪽의 생성자에게 넘겨주기 위해 생성자 내부에서 super()를 사용
		 * 자식쪽의 생성자에서 super(전달자료1, 전달자료2...)를 사용하면 부모 생성자에게 전달됨
		 */
		super(name, age);
		this.grade = grade;
	}
	
	// 상속받은 showPerson() 을 활용한 showStudent 만들기
	public void showStudent() {
		// 여기 showPerson() 메서드도 super를 붙여 부모에서 가져온 것이라고 언급
		super.showPerson();
		System.out.println("학년: " + this.grade);
	}
	
	/* 부모의 showPerson()을 오버라이딩 해서 자식을 재정의
	 * 재정의된 메서드는 부모 타입으로도 자식에서 호출이 가능
	 */
	public void showPerson() {
		/* 위의 showStudent() 메서드에서 작성된 것처럼 showPerson()이라고 작성하지 않고,
		 * super.showPerson()라고 작성한 이유는
		 * 재귀호출에 의해서 계속 실행문이 출력됨 - StackOverflowError(스택의 용량이 작아서 에러가 발생)
		 */
		super.showPerson();
		System.out.println("학년: " + this.grade + "학년");
	}
}
