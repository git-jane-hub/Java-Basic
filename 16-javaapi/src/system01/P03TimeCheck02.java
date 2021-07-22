package system01;

public class P03TimeCheck02 {
	public static void main(String[] args) {
		/* try catch 구문의 소요시간을 구하기
		 * 원하는 종류의 예외 발생
		 */
		long startPoint = System.currentTimeMillis();
		
		int[] num = new int [10000];
		int i = 0;
		try {
		for(int a = i; a < num.length; a++) {
			num[a] = a + 1;
			System.out.println(num[a]);
		}
		System.out.println(num[i] / (num[i] - 1));
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("숫자가 없습니다.");
		} catch(ArithmeticException b) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception c) {
			System.out.println("어떠한 에러가 발생했습니다.");
		} finally {
			System.out.println("실행 종료합니다.");
		}
		
		long endPoint = System.currentTimeMillis();
		System.out.println("연산: " + (endPoint - startPoint) * 0.001 + "초 소요");
	}
}
