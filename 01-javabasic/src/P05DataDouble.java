
public class P05DataDouble {
	public static void main(String[] args) {
		/*
		 *  실수 표현을 할 때는 float, double 자료형을 사용
		 *  기본적으로 실수 숫자만 작성하면 double
		 *  만약 float으로 실수 숫자를 표현한다면,
		 *  숫자 가장 오른쪽에 f라고 작성
		 *  float은 4byte, double은 8byte
		 */
		// 1.1은 double로 간주
//		float a = 1.1;
		float a = 1.1f;
		double b = 1.1;
		System.out.println(a);
		System.out.println(b);
	}
}
