package exception02;

import java.util.Scanner;

public class P03TryCatch03 {
	public static void main(String[] args) {
		String[] name = {"김모모", "박모모", "이모모", "최모모"};
		Scanner scan = new Scanner(System.in);
		System.out.println(name.length + "명의 학생 중 몇 번째 학생을 호명하시겠습니까?");
		int a = scan.nextInt();
		try {
			System.out.println(a + "번째 학생은 " + name[a - 1] + "입니다.");
		}catch(Exception  e) {
			System.out.println("학생은 " + name.length + "명입니다.");
		}finally {
			System.out.println("프로그램을 종료합니다.");
		}
	}
}
