package date210623.method;

public class P05GetBMI {
	/* getBMI 메서드 만들기
	 * return 자료형은 double
	 * 입력은 double height, double weight
	 * BMI 공식은 몸무게 / 키(미터)^2
	 * 175cm의 경우, 1.75미터
	 * 메서드를 여기 작성하고, 메인 내부에서 getBMI를 실행문 안에 넣어서 출력
	 */
	
	public static double getBMI(double height, double weight) {
		return weight/((height / 100) * (height / 100));
		/*
		double m = height / 100;
		double result = weight / (m * m);
		return result;
		*/
	}
	
	public static void main(String[] args) {
		System.out.println(getBMI(175, 64));
	}
}
