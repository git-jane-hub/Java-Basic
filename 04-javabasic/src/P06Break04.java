import java.util.Scanner;

public class P06Break04 {
	public static void main(String[] args) {
		/* Scanner로 정수를 입력받고 > num
		 * 1 ~ n 까지 차곡차곡 순서대로 더해 나갔을때 > count
		 * 1부터 몇까지 더해야 입력된 정수를 초과하는지 계산해주는 프로그램 작성 > numSum
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("수의 총 합이 몇 이상이 되면 종료하시겠습니까?");
		int num = scan.nextInt();
		int count = 0;
		int numSum = 0;
		while(true) { // 무슨 숫자가 들어올지 모르는 상태이니 더하는데 제한이 없는 while(true) 구문을 사용
			count += 1; // count++
			numSum += count;
			System.out.println("1부터 " + count + "까지의 총합은 : " + numSum + "입니다.");
			if(numSum >= num) { // if문이 거짓이면 아래 내용은 실행하지 않음
				// numSum이 num 이상(>=)이면 일단 아래 문장을 출력은 하고 break
				System.out.println("목표값 : " + num);
				System.out.println("총 합 : " + numSum);
				System.out.println("몇 까지 더했나? : " + count);
				break;
			}
		}
	}
}
