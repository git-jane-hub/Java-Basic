
public class P09Continue03 {
	public static void main(String[] args) {
		/* 다음은 학생들의 과목별 성적
		 * math = 96, 23, 52, 82, 72, 31, 58
		 * eng = 62, 42, 68, 31, 80, 77, 45
		 * com = 10, 28, 39, 74, 65, 90, 98
		 * 각 과목별 평균점수를 산출, 합격자 평균만 산출
		 * 합격점수는 60점 이상으로
		 */
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		
		int mathWinSum = 0;
		int mathWinN = 0; // 합격자수 구하는 방법 - 변수지정
		for(int mathWinScore: math) {
			if(mathWinScore < 60) {
				continue;                      // 점수가 60미만이면 넘기고
			}else {
				mathWinN++; // 합격자수 구하는 방법 - 합격자수 추가
				mathWinSum += mathWinScore;    // 점수가 60이상이면 더하고
			}
		}
		System.out.println("수학평균: " + mathWinSum/ mathWinN); // 합격자수 구하는 방법 - 합격자수를 이용해 평균산출
		
		int engWinSum = 0;
		for(int engWin: eng) {
			if(engWin < 60) {
				continue;
			}
			engWinSum += engWin;
		}
		System.out.println("영어평균: " + engWinSum/ 4);
		
		int comWinSum = 0;
		for(int comWin: com) {
			if(comWin < 60) {
				continue;
			}
			comWinSum += comWin;
		}
		System.out.println("컴퓨터평균: " + comWinSum/ 4);

	}
}
