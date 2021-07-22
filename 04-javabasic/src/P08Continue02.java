import java.util.Scanner;

public class P08Continue02 {
	public static void main(String[] args) {
		/* 1부터 n까지 총합을 구하되 홀수끼리만 더한 총합을 구하는 구문 작성 > num
		 * continue문을 반드시 사용하는 로직으로 작성
		 * n은 스캐너로 입력받음
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("목표 정수를 입력해주세요.");
		int num = scan.nextInt();
		int count = 0;
		int numSum = 0;
		while(count < num) {
			count++;
			if(count % 2 == 0) { // 짝수인 경우에는 넘겨줌
				continue;
			}
			numSum += count;
			System.out.println("현재 1부터 " + count + "까지 더했습니다.");
			System.out.println("총합은 "+ numSum +"입니다.");
			if(count == num) {
				break ;
			}
		}
	}
}