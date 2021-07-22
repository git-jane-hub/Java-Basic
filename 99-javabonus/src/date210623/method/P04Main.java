package date210623.method;

public class P04Main {
	public static void main(String[] args) {
		P03Person p1 = new P03Person(10000, 0);
		
		/* 과일을 하나 사고 돈을 1000원 차감하는 setter
		 * setter 특성상 돈이 0원이면 구매 시도를 해도 구매가 이루어지지 않음
		 */
		p1.buyFruits();
		
		/* 수치값을 넣어주는 setter
		 * 집어 넣은 값을 그대로 money의 값을 변경해줌
		 */
		p1.setMoney(1000);
		p1.buyFruits();
		p1.buyFruits();
		p1.getInfo();
	}
}

