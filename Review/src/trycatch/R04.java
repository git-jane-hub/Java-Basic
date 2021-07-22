package trycatch;

public class R04 {
	public static void main(String[] args) {
		String [] arr = {"123","456","1qwe23","sfd33","567","s456", "7"};
		int index = (int)(Math.random() * 8);
		try {
			System.out.println(Integer.parseInt(arr[index]));
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("범위 내의 인덱스가 아닙니다.");
		}catch(NumberFormatException b) {
			System.out.println("해당 문자열은 숫자로 바꿀 수 없습니다.");
		}catch(ClassCastException c) {
			System.out.println("해당 문자열은 형변환이 불가능합니다.");
		}
	}
}
