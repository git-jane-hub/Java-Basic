package constructor;
/* 농구선수 클래스 만들기
 * 클래스의 속성으로는 키, 점프력을 수치를 가지고, 기능은 덩크슛을 가짐
 * 
 * 덩크슛은 키 + 점프력이 300이상인 경우 "덩크슛에 성공했습니다."라는 문장을
 *       키 + 점프력이 300미만인 경우 "골대에 닿지 않았습니다."라는 문장을 출력
 * 실행은 'P03Main03.java'에서 
 */
public class P03Main03 {
	public static void main(String[] args) {
		P003BasketballPlayer bP1 = new P003BasketballPlayer(195, 110);
		P003BasketballPlayer bP2 = new P003BasketballPlayer(200, 90);
		
		bP1.dunkShoot();
		bP2.dunkShoot();
	}
}
