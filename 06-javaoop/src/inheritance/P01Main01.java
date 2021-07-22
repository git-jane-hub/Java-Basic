package inheritance;
	/* 컴퓨터 메모리는 Salaryman, Student(자식)안의 내용과 Person(부모)안의 내용을 구분함
	 * 객체 내부에는 Person 과 Student두 부분이 분리되어 있음
	 * 메모리 상으로는 Person이 만들어지고 그 후에 Student가 만들어짐
	 */
public class P01Main01 {
	public static void main(String[] args) {
		/* Student가 Person을 상속했기 때문에
		 * Student는 Person의 자원을 사용가능
		 */
		P001Student s1 = new P001Student();
		s1.name = "최재인";
		s1.age = 20;
		s1.major = "컴퓨터 공학";
		
		s1.getStudentInfo();
		
		
	}
}
