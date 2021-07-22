package stringbuilder01;

public class P06Builder06 {
	public static void main(String[] args) {
		/* 6.setCharAt();
		 * 문자열에서 입력한 인덱스번호의 문자를 다른 문자로 교체
		 * insert()는 뒤로 밀어내서 공간을 확보했지만 setCharAt()은 그 위치의 문자를 덮어씌움
		 * setCharAt()도 한번에 한글자만 교체
		 */
		StringBuilder str = new StringBuilder("abcdefg");
		// setCharAt()으로 변경하는 단일 문자는 홑따옴표 ''로 여닫는 부분을 작성해야함
		System.out.println(str);
		str.setCharAt(5, 'z');
		System.out.println(str);
	}
}
