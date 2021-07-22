import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1 ~ 9 사이의 숫자를 입력해주세요.");
		int num = scan.nextInt();
		System.out.printf("----%d단----%n", num);
//      if ( num > 0  &&  num < 10 )			
		if ((num > 0) && (num < 10)) { // boolean 자료형은 이항연산자이기 때문에 '0<num<10'으로 작성하면 안됨
			for (int a = 1 ; a < 10; a++){
			System.out.printf("%d * %d = %2d%n", num, a, (num*a));
		}
		}else {
			System.out.println("범위 내의 숫자를 입력해주세요.");
		}
		scan.close();
	}
}
