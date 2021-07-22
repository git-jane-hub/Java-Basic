package structure;

public class P001Person {
	/* 자바에서 표현할 사람의 필수 정보를 변수로 선언
	 * - main method가 없음, 사용자가 만들고 싶은대로 만든 자료
	 * 이름, 나이, 폰번호를 필수 정보로 지정
	 * - 사람이라는 객체를 표현하는데 있어 이름과 나이와 폰번호를 묶어서 나타내어줌(구조체, 정보의 결속력이 생기면서 특정의 범위가 좁아짐)
	 * - 현실 세계에 있는 객체를 프로그램화 할 수 있음
	 * public은 지금 단계에서는 무조건 붙여줌
	 */
	public String name;
	public int age;
	public String pNum;
	public String address;
}
