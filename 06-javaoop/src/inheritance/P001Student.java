package inheritance;

public class P001Student extends P001Person{
	// 공통 속성(이름, 나이)이 아닌 학생만의 개별적 특성 정의
	public String schoolName;
	public int grade;
	public String major;
	
	// 학생의 자기소개
	public void getStudentInfo() {
		// 상속받은 자식은 부모쪽 자원을 가져다 쓸 수 있음
		getPersonInfo();
		System.out.println("전공은 " + major + "입니다.");
	}
	
	public void gradeUp() {
		for(int year = 1; year <= 4; year++) {
			grade++;
			System.out.println("학년은 " + grade + "입니다.");
		}
	}
	
	
	
}
