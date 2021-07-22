/*  
 *  정수: byte1<short2<int4<long8 - byte와 int를 더하려면, byte를 int의 byte수에 맞춰 자릿수를 늘리고 int끼리 더함
 *  실수: float4<double8 - long과 float을 더하려면, long을 float으로 변환하여 float끼리 더함
 *  실수는 정수와 다르게 이진법으로 표현하지 못하고 넘어가는 숫자가 있음 - long 과 float은 표현하는 범위가 늘어남
 */
public class P06DateTypeCasting {
	/*
	 *  서로 다른 자료형 간에는 원래 연산이 불가능
	 *  하지만 컴퓨터가 자동으로 자료형을 보정해주는 경우가 있는데 이것을 자료 형 변환이라고 함
	 *  promotion: 자동 형 변환 - 작은 범위를 큰 범위에 맞출 때 발생
	 *  casting: 강제 형 변환 - 큰 데이터를 작은 범위에 맞출 때 발생
	 */
	public static void main(String[] args) {
		int a = 5;
		double b = 7.12;
		// 자동 int -> double
		System.out.println(a + b);
		// 출력된 12.120000000000001은 2진수로 표현할 수 있는 12.12와 가장 가까운 값
		// 강제 double -> int
		System.out.println(a + (int)b);
		byte c = (byte) 8578728953l;
		// byte로 강제 형 변환을 해도 숫자의 범위를 넘어섰기 때문에, 뒤에 l을 붙여서 long타입으로 변환
		System.out.println(c);
	}
}
