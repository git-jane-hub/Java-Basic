package string01;

public class P04String04 {
	public static void main(String[] args) {
		/* 3. length();
		 * : 문자열의 길이를 알 수 있음 - 정수로 몇글자인지 알려줌
		 */
		String name = "김수한무 거북이와 두루미 삼천갑자 동박삭 치치카포 사리사리센타";
		System.out.println(name.length());
		
		/* 4. replace();
		 * : 특정 문자열을 변경 - .replace("찾을 단어", "바꿀 단어"); 순으로 입력
		 */
		String report = "안녕하세요. 리포트 보고자는 김영수, 김영수 입니다.";
		// a = 5;
		
		System.out.println(report.replace("김영수", "채종훈")); // 문자열을 변경해서 출력 - 저장하지 않음
		// System.out.println(a + 3);
		
		System.out.println(report);
		report = report.replace("김영수", "채종훈");			// 문자열을 변경해서 저장
		// a = a + 3;
		
		System.out.println(report);
		// System.out.println(a);
	}
}
