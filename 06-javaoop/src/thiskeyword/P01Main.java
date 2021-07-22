package thiskeyword;

public class P01Main {
	public static void main(String[] args) {
		
	
		/* this가 적용된 Person 생성하기
		 * 생성 시 ctrl + space를 누르면 입력하려는 요소가 출력됨 
		 */
		P001Person p1 = new P001Person("가나다", 20, 3000, "통계학");
		p1.getInfo();
	
		P001Person p2 = new P001Person("다나가", 30, 5000, "경영학");
		p2.getInfo();
	
	}
}