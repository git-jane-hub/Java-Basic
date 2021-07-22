package math;

public class P05Math05 {
	public static void main(String[] args) {
		/* 주사위 게임 만들기
		 * 주사위 게임은 내 값은 myValue 변수에, 컴퓨터 값은 comValue 변수에
		 * 값을 난수 발생으로 1 ~ 6번위로 부여
		 * 값이 같다면 무승부, 아니면 내 값이나 컴퓨터 값 중 승자를 알려주는 방식
		 */
		int myValue = (int)(Math.random() * 6) + 1;
		int comValue = (int)(Math.random() * 6) + 1;
		
		if(myValue == comValue) {
			System.out.println("무승부입니다.");
		}else if (myValue > comValue){
			System.out.println("내가 이겼습니다.");
		}else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		System.out.println("내 값: " + myValue);
		System.out.println("컴퓨터 값: " + comValue);
	}
}
