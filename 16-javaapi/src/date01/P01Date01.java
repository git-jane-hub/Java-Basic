package date01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P01Date01 {
	public static void main(String[] args) {
		/* Date();
		 * 날짜를 표현하는 클래스로 DB등과 통신 시 date를 이용해 날짜 자료를 받아오거나 넘겨주는 것이 권장됨
		 * 사용시 import(java.util.Date)
		 */
		Date now = new Date();				// 현재의 날짜 정보로 객체가 만들어짐
		String strNow = now.toString();
		System.out.println(strNow);			// 한국 표준시 KST(Korea Standard Time)
		
		/* 표현되는 양식을 바꿈 - SimpleDateFormat을 사용
		 * 사용시 import(java.text.SimpleDateFormat)
		 */
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");	// 월이 분과 겹치기 때문에 대문자로
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
