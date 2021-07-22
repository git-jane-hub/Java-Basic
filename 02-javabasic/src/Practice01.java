
public class Practice01 {
	public static void main(String[] args) {
		// 다시 연습
		int intNum = (int)(Math.random()*10);
		int a = intNum;
		switch(a) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("case: "+ a);
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("case: "+ a);
			break;
		}
	}
}
