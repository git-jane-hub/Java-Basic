package exception01;

public class P04Exception04 {
	public static void main(String[] args) {
		/* 예외 발생 케이스 4
		 * ArrayIndexOutOfBoundsException
		 * 특정 배열을 만들었을 때, 배열 인덱스를 초과해서 입력하는 경우
		 */
		int[] arr = new int [5];
		for(int a : arr) {
			System.out.println(a);
		}
		System.out.println(arr[5]);
	}
}
