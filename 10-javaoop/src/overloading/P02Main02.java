package overloading;

public class P02Main02 {
	public static void main(String[] args) {
		/* OverTest에서 작성한 4개의 생성자의 이름이 같아도 
		 * 오버로딩을 통해
		 * 파라미터 내부의 작성된 내용(개수 혹은 종류)에 따라서 호출되는 생성자가 다름
		 */
		/* 오버로딩을 하면 사용자에게 입력하는 값이 자율성을 부여할 수 있음
		 * 사용자가 넣고 싶은 값을 선택해서 넣을 수 있음 - 넣는 경우의 수를 모두 작성해줘야함
		 */
		P02OverTest a1 = new P02OverTest();
		a1.showDate();
		P02OverTest a2 = new P02OverTest("가");
		a2.showDate();
		P02OverTest a3 = new P02OverTest(5);
		a3.showDate();
		P02OverTest a4 = new P02OverTest("나", 6);
		a4.showDate();
	}
}
