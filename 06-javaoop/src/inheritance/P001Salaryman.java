package inheritance;
 /* 상속 문법
  * 클래스 명칭 오른쪽에 <extends 부모클래스 이름> 을 작성
  * 이렇게 상속을 한 클래스는 부모, 자식 클래스가 하나의 객체 내부에 공존하는 형태로 메모리에 생성됨
  */
public class P001Salaryman extends P001Person{
	// 클래스 이름 뒤에 P001Person의 내용을 상속받기로 작성되었기 때문에, 이름과 나이를 불러온 상태
	// 연봉을 추가
	public String companyName;
	public int salary;
	
	public void upSalary() {
		salary += 1000;
	}
	
	public void getSalaryInfo() {
		// 상속 시 부모의 자원을 마음대로 사용가능 - 내부에 정의되지 않은 메서드지만, P001Person의 모든것을 가져와 사용할 수 있음
//		System.out.println("이름은 " + name + "입니다."); // 이렇게 작성해도 에러가 발생하지 않음
		// getPersonInfo();
		System.out.println("회사는 " + companyName + "를 다닙니다.");
		System.out.println("연봉은 " + salary + "만원입니다.");
	}
	
}
