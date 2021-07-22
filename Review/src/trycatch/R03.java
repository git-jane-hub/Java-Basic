package trycatch;

public class R03 {
	public static void main(String[] args) {
		String [] chulcheck = {"김모모", "박모모", "최모모", "이모모", "황모모"};
		try{
			int random = (int)(Math.random() * 6);
		System.out.println(chulcheck[random]);
		}catch(ArrayIndexOutOfBoundsException a){
			System.out.println("학생이 없는 범위입니다.");
		}
	}
}
