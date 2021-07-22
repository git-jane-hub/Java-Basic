package exception01;

public class P06Exception06 {
	public static void main(String[] args) {
		/* 예외 발생 케이스 6
		 * ClassCastException
		 * 상속관계가 있는 자료는 부모가 동일하다면 논리적으로는 부모 자료형이 어떤 형태로든 자식 자료형을 가질 수 있기 때문에
		 * 부모자료형에서 어떤 자료형으로도 형변환이 가능
		 * 하지만 반드시 작동되는 것은 아님
		 * Object 자료형 - 자바 모든 클래스의 부모 클래스
		 */
		String str = "3";
		Object obj = str;
		Integer integer = (Integer)obj;
	}
}
