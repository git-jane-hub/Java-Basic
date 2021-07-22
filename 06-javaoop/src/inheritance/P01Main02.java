package inheritance;

public class P01Main02  {
	public static void main(String[] args) {
		P001Salaryman s2= new P001Salaryman();
		s2.name = "가나다";
		s2.age = 30;
		s2.companyName = "abc";
		s2.salary = 4000;
		s2.getPersonInfo();
		s2.upSalary();
		s2.getSalaryInfo();
		
		P001Student s3 = new P001Student();
		s3.name = "마바사";
		s3.age = 19;
		s3.schoolName = "qwe";
		s3.grade = 3;
		s3.major = "경영학";
		s3.getPersonInfo();
		s3.getStudentInfo();
	}
}
