package exception02;

import java.util.Scanner;

public class P03TryCatch02 {
	public static void main(String[] args) {
		/* 아까 exception1 패키지 내부의 여러 예외 유형 중 하나를 골라 예외가 발생할 수 있는 코드를 작성
		 * 발생할 예외에 대한 처리는 try ~ catch 블록을 활용
		 */
		int [] arr = new int [10];
		for(int a = 0; a < arr.length; a++) {
			arr[a] = a + 1;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 10까지 정수 중 하나를 입력해주세요.");
		int b = scan.nextInt();
		try {
			System.out.println(arr[b - 1] + "을 선택했습니다.");
		} catch(Exception e){
			System.out.println("입력한 숫자는 1부터 10사이의 정수가 아닙니다.");
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}
	}
}
