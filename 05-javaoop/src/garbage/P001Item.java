package garbage;

public class P001Item {
	public int num;
	
	public P001Item(int n) {
		num = n;
		System.out.println(num + "번 객체 생성");
	}
	
	/* 소멸자 finallize()
	 * 생성자는 객체가 생성될 때 반드시 호출되고
	 * 소멸자는 객체가 소멸될 때 호출됨
	 */
	protected void finalize() {
		System.out.println(num + "객체 삭제");
	}
}
