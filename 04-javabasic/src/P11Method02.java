
public class P11Method02 {
	public static int add2(int a) { // 소괄호 내부 a의 데이터 타입은 int이기 때문에 void 대신 int 
		return a + 1;  // return을 이용해 결과값을 반환_결과값을 반환하기 때문에 add2 앞에 int를 적어줘야 함
	}
	public static void main(String[] args) {
		/* 반환자료가 void가 아닌 경우는, 호출 위치에 return문 오른쪽 자료를 그대로 갖다놓음
		 * 자료를 반환하는 것이 꼭 console창에 표시됨을 의미하지는 않음
		 */
		int b = add2(10); // 왼쪽에 있는 값을 오른쪽에 대입(유일)
		// System.out.println(b);
	}
}
