package buyandsell;

// Buyer가  Seller를 결정하게 만들기
public class P001Buyer {
	/* 구매자
	 * 구매자는 돈, 망고개수를 멤버변수로 가짐
	 * 은닉 구현을 위해 private으로 처리
	 */
	private int money;
	private int mango;
	private int waterMelon;
	
	/* 생성자는 int money를 받아 돈을 초기화
	 * 망고는 자동으로 0을 대입 - 디폴트값 설정
	 */
	public P001Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.waterMelon = 0;
	}
	
	/* showBuyer는 구매자의 상태를 보여줌
	 * money, mango 수치가 각각 몇인지 콘솔에 출력
	 */
	public void showBuyer() {
		System.out.println("----구매자-----");
		System.out.println("잔액: " + this.money + "원");
		System.out.println("구매한 망고: " + this.mango + "개");
		System.out.println("구매한 수박: " + this.waterMelon + "개");
		System.out.println("-------------");
	}

	/* buyMango는 망고를 구매하는 행위
	 * int mango로 망고 갯수를 입력받으면,
	 * 망고 * 1000원 만큼의 돈을 차감하고 망고 변수는 갯수를 증가
	 */
	/* 현실에서 구매자가 망고 구매시 판매자를 선택,
	 * Seller 변수를 Buyer가 고를 수 있도록 파라미터 설정 
	 * 구매자가 망고를 사면 - 구매자 망고 +1, 판매자 망고 -1
	 * - 그래서 구매자 입장에 seller 변수를 추가(main method에서 생성된 객체의 참조변수)
	 * 원래 고려했어야하는 부분 - 망고 구매(1) - 내가 돈이 알맞게 있는지(1000)
	 * 추가로 고려해야하는 부분 - 망고 구매(1) - 내가 돈이 알맞게 있는지(1000), 판매자가 망고를 가지고 있는지(1)
	 */
	public void buyMango(P001Seller seller, int mango) {
		// setter - 조건 비교를 하고 기능 실행
		// 사려는 망고의 가격보다 buyer의 돈이 부족
		if(this.money < (mango * 1000)) {
			System.out.println("돈이 부족합니다.");
			return;
		}
		// seller가 가진 망고가 buyer가 사려는 망고보다 적음
		if(seller.getSellerMango() < mango) {
			System.out.println("판매자의 망고가 부족합니다.");
			return;
		}
		/* seller에서 망고를 파는 코드를 내가 망고를 사는 코드에 넣어서
		 * 동시에 사고 팔도록 처리해야 상호작용이 가능
		 */
		seller.sellMango(mango);
		this.mango += mango;
		this.money -= (mango * 1000);
		
		/*
		사고싶은 망고 개수와 살 수 있는 망고 개수가 다를 때, 현재 가진 돈으로만 망고를 사는 공식
		- 1000원으로 나누서 살 수 있는 망고 개수를 구하고(=a), 이거만큼 돈이랑 망고를 차감
		int a = this.money / 1000;
		if(mango > a) {
			this.mango += a;
			this.money -= (a * 1000);
			System.out.println("돈이 부족해 망고를 구매할 수 있는 만큼만 구매합니다.");
		}else {
			this.mango += mango;
			this.money -= (mango * 1000);
		}
		*/
	}
	// 수박 구매 추가
	public void buyWaterMelon(P001Seller02 seller, int waterMelon) {
		if(this.money < (waterMelon * 10000)) {
			System.out.println("돈이 부족합니다.");
			return;
		}
		if(seller.getSellWaterMelon() < waterMelon) {
			System.out.println("판매자의 수박이 부족합니다.");
			return;
		}
		seller.sellWaterMelon(waterMelon);
		this.waterMelon += waterMelon;
		this.money -= (waterMelon * 10000);
	}
}
