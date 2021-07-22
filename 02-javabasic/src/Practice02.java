import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		double rate = 0.005728;
		Scanner scan = new Scanner(System.in);
		System.out.println("중국 위안화의 환율은 174.57입니다.");
		System.out.println("원화 금액을 입력하세요.");
		int won = scan.nextInt();
		System.out.print("원화 " + won + "원을 중국 위안화로 환전 시 ");
		System.out.printf("%dRMB입니다.",Math.round(won * rate));  // %d는 정수값으로 출력
	}
}