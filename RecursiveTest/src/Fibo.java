// 피보나치 함수
public class Fibo {
	public static int Fibo(int n) {
		if(n == 1) {
			return 0;
		}else if(n == 2) {
			return 1;
		}else {
			return Fibo(n - 1) + Fibo(n - 2);
		}
	}
	public static void main(String[] args) {
		int i;
		for(i = 1; i < 15; i++) {
			System.out.println(Fibo(i));
		}
		//return 0;
	}
}
