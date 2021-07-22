package dateandcalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class R01 {
	public static void main(String[] args) {
		Date now = new Date();
		String nowStr1 = now.toString();
		System.out.println(nowStr1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String nowStr2 = sdf.toString();
		String nowStr3 = sdf.format(now);
		System.out.println(nowStr2);
		System.out.println(nowStr3);
	}
}
