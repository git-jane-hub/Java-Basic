package system01;

public class R02TimeChecker {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int [] arr = new int [100000];
		int count = 0;
		for(int a = 0; a < arr.length; a++) {
			arr[a] = a + 1;
			if(arr[a] % 7 == 0) {
				System.out.println("7의 배수: " + arr[a]);
				count++;
			}
		} System.out.println("7의 배수는 " + count + "개 입니다.");
		long endTime = System.currentTimeMillis();
		System.out.println("연산 소요시간: " + (endTime - startTime) * 0.001 + "초");
	}
}
