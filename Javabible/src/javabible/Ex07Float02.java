package javabible;

public class Ex07Float02 {
	public static void main(String[] args) {
		float a, b;
		a = 3.4f;
		/*  float 데이터 타입에 정수를 작성해도 에러가 발생하지 않는 이유는
		 *  int형 자료(550)가 컴파일러에 의해 550.0이라는 float형 자료로 변환되었기 때문
		 *  즉, 자동으로 형변환이 일어남
		 */
		b = 550;
		System.out.println(a);
		System.out.println(b);
	}
}
