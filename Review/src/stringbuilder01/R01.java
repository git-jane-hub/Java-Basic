package stringbuilder01;

public class R01 {
	public static void main(String[] args) {
		StringBuilder sen = new StringBuilder("i you w ant tomato");
		sen = sen.append(".")
				// i you w ant tomato.
				.delete(2, 6)
				// i w ant tomato.
				.deleteCharAt(3)
				// i want tomato.
				.insert(7, "to eat ")
				// 에러 - i want tp ewaternolemato.
				.replace(11, 17, "waternolem")
				// 에러
//				.setCharAt(0, 'I');
				;
		sen.setCharAt(0, 'I');
		System.out.println(sen);
		// 에러
//		System.out.println(sen.setCharAt(0, 'I'));
	}
}
