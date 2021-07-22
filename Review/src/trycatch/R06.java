package trycatch;

public class R06 {
	public static void looserPicker(String [] arr, int a) throws ArrayIndexOutOfBoundsException {
		System.out.println(arr[a] + "입니다.");
	}
	
	public static void main(String[] args) {
		String [] arr = {"탈락", "통과", "통과", "통과", "통과", "통과", "통과"};
		int a = (int)(Math.random() * 8);
		
		try {
			looserPicker(arr, a);
		}catch(Exception e) {
			System.out.println("범위를 벗어났습니다. 다시 추첨을 진행해주세요.");
		}finally {
			System.out.println("프로그램이 종료됩니다.");
		}
		
	}
}
