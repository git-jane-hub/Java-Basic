package structure;

public class P04ClassMain01 {
	public static void main(String[] args) {
		P004PersonClass personA = new P004PersonClass();
		personA.name = "가나다";
		personA.age = 20;
		personA.pNum = "010-1234-1234";
		personA.address = "seoul";
		personA.marriage = false;
		
		P004PersonClass personB = new P004PersonClass();
		personB.name = "다나가";
		personB.age = 30;
		personB.pNum = "010-5678-5678";
		personB.address = "gangwon";
		personB.marriage = true;
		
		// PersonClass 의 getInfo method를 호출
		personA.getInfo(personA); // 소괄호 안의 내용이 파라미터
		personB.getInfo(personB);
/*
 * 		personA.getInfo(); // 소괄호 안의 내용이 파라미터 - 작성할 필요가 없음
 *		personB.getInfo();
 */
	}
}
