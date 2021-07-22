
public class P02EnhancedFor02 {
	public static void main(String[] args) {
		/* for문을 못품
		 * 다음은 학생들의 과목별 성적
		 * math = 96, 23, 52, 82, 72, 31, 58
		 * eng = 62, 42, 68, 31, 80, 77, 45
		 * com = 10, 28, 39, 74, 65, 90, 98
		 * 위 3개의 명칭으로 array를 만들어 담은다음
		 * 과목별 평균점수를 enhance for문을 이용해 구하고 출력
		 */
//		1. 각 과목의 점수를 불러옴  2. 각 과목의 합을 더함  3. 합을 더한 개수만큼 나눔  > 평균구하기 
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		
		int mathSum = 0;
		// 1. 각 과목의 점수를 불러옴
		for(int mathN: math) { // enhanced for문으로 mathAver에 들어오는 값은 96, 23, ...
		// 2. 각 과목의 합을 더함
			mathSum += mathN;  // 위에서 mathAver에 들어온 값을 mathSum에 계속 더해 누적을 시킴
			}
		// 3. 합을 더한 개수만큼 나눔
		System.out.println("수학 평균:" + mathSum/math.length);
		
		int engSum = 0;
		for(int a = 0; a < eng.length; a++) {
			engSum += eng[a];
		}
		System.out.println("영어 평균:" + engSum/eng.length);
		
		
		int comSum = 0;
		for(int comN: com) {
			comSum += comN;
		}
		System.out.println("컴퓨터 평균:" + comSum/com.length);
	}
}
	/*	for(int engAver: eng) {
			System.out.println("영어 평균:" + engSum/math.length);
		}
		for(int comAver: com) {
			System.out.println("컴퓨터 평균:" + comSum/math.length);
		}*/
