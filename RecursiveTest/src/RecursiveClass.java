// 재귀함수
public class RecursiveClass {
	/*
	public static void recursive() {
		System.out.println("재귀 호출중...");
		// 호출시마다 recursive를 생성하면서 스택메모리에 공간이 없어짐 - stack over flow
		recursive();	// 탈출 조건이 필요		
	}
	*/
	public static void recursive(int num) {
		if(num <= 0) {	// recursive(0)을 호출하고
			return;		// return 문이 실행되면 
			// recursive(1), recursive(2), recursive(3), main이 실행중이다가 차례대로(생성된 역순) 종료됨
		}
		System.out.println("재귀 호출중...");
		recursive(num - 1);
		
	}
	
	public static void main(String[] args) {
		recursive(3);	// 호출
	}
}
