package dateandcalendar;

import java.util.Calendar;

public class R02 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.print(now.get(Calendar.YEAR) + "년 ");
		System.out.print(now.get(Calendar.MONTH) + 1 + "월 ");
		System.out.print(now.get(Calendar.DATE) + "일 ");
		System.out.println("요일: " + now.get(Calendar.DAY_OF_WEEK) + "(1: 일요일, 2: 월요일, 3: 수요일, 4: 목요일, 5: 금요일, 6: 토요일)");
		System.out.print(now.get(Calendar.AM_PM) + "(오전: 0, 오후: 1)");
		System.out.print(now.get(Calendar.HOUR) + " 시");
		System.out.print(now.get(Calendar.MINUTE) + " 분");
		System.out.print(now.get(Calendar.SECOND) + " 초");
		
	}
}
