package math;

public class P06Math06 {
	public static void main(String[] args) {
		/* 가위바위보 게임 만들기
		 * Math.random()을 이용해 1/3 확률로 가위, 바위, 보를 부여
		 * 가위 2> 보1, 가위2 < 바위0
		 * 보1 > 바위0, 보1 < 가위2
		 * 바위0 > 가위2, 바위0 < 보1
		 * 같은 요소가 나오면 무승부
		 * 조건식에 ||를 사용
		 */
		// 0, 1, 2
		int myValue = (int)(Math.random() * 3);
		int comValue = (int)(Math.random() * 3);
		
		// 상수처리
		final int ROCK = 0;
		final int PAPER = 1;
		final int SCISSORS = 2;
		
		// 배열로 결과 산출
//		String [] items = {"바위", "보", "가위"};
		
		// 과정
		if(myValue == comValue) {
			System.out.println("비겼습니다.");
		}else if((myValue == SCISSORS && comValue != ROCK) ||
				 (myValue == PAPER && comValue != SCISSORS) ||
				 (myValue == ROCK && comValue != PAPER)) {
			System.out.println("내가 이겼습니다.");			
		}else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
		// 결과
		if(myValue == ROCK) {
			System.out.println("내가 낸 것: 바위");
		}else if(myValue == PAPER) {
			System.out.println("내가 낸 것: 보");
		}else if(myValue == SCISSORS) {
			System.out.println("내가 낸 것: 가위");
		}
		
		if(comValue == ROCK) {
			System.out.println("컴퓨터가 낸 것: 바위");
		}else if(comValue == PAPER) {
			System.out.println("컴퓨터가 낸 것: 보");
		}else if(comValue == SCISSORS) {
			System.out.println("컴퓨터가 낸 것: 가위");
		}
		
		// 배열로 결과출력(결과의 if문을 작성할 필요가 없음)
//		System.out.println("내가 낸 것: " + items[myValue]);
//		System.out.println("컴퓨터가 낸 것: " + items[comValue]);
	}
}
