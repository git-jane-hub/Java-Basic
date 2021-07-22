package string01;

public class R07 {
	public static void main(String[] args) {
		String str1 = "     QWER      ASDF          ZXCV";
		String str2 = "qwerasdfzxcv";
		
		System.out.println(str1.equals(str2));
		
		str1 = str1.trim().replace(" ", "").toLowerCase();
		System.out.println(str1);
		
		System.out.println(str1.equals(str2));
	}
}
