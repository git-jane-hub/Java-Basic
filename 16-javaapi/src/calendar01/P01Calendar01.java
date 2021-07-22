package calendar01;

import java.util.Calendar;

public class P01Calendar01 {
	public static void main(String[] args) {
		/* Calendar();
		 * 현재 시간을 일반 시간이 아닌 요일이나 오전/오후 등으로 달력 기준으로 표기
		 * Calendar.getInstance()를 사용
		 */
		Calendar now = Calendar.getInstance();
		System.out.print(now.get(Calendar.YEAR) + "년 ");
		// 월은 0이 1월, 11이 12월이므로 1을 반드시 더해야 함
		System.out.println((now.get(Calendar.MONTH) + 1) + "월");
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "일");
		// 요일은 1이 일요일, 7이 토요일
		System.out.println(now.get(Calendar.DAY_OF_WEEK) + "요일");
		// 0이 오전, 1이 오후
		System.out.println("오전/오후: " + now.get(Calendar.AM_PM));
		System.out.println(now.get(Calendar.HOUR) + "시");
		System.out.println(now.get(Calendar.MINUTE) + "분");
		System.out.println(now.get(Calendar.SECOND) + "초");
	}
}
