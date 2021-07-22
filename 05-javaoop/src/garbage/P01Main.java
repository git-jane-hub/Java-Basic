package garbage;

public class P01Main {
	public static void main(String[] args) {
		P001Item i1 = new P001Item(1);
		P001Item i2 = new P001Item(2);
		i2 = null;
		P001Item i3 = new P001Item(3);
		/* 메모리 회수 명령
		 * - 실행을 하다가 시스템 메모리가 부족하면 자동으로 쓰레기를 처리(쓰레기: main method의 스택과 연결되어있는 데이터가 아닌것)
		 * 자동으로 실행되기 때문에 작성해줄 필요는 없음
		 */
		System.gc();
		P001Item i4 = new P001Item(4);
		// i4가 원래 갖고있던 주소값에 null을 넣어줌 - 스택의 i4값은 힙과 연결이 끊어짐
		i4 = null;
		P001Item i5 = new P001Item(5);
		i5 = null;
		System.gc();
		P001Item i6 = new P001Item(6);
		/* '6번 객체 생성'이 먼저 출력되고 - 2객체가 삭제되는 이유는
		 * 스택(속도가 빠르고 공간이 좁음)에서 출력물이 나오고
		 * 가비지컬렉터는 힙(속도가 느리고 공간이 넓음)에서 삭제할 내용을 찾고있기 때문
		 * 그래서 출력할 때 마다 생성과 삭제의 순서가 바뀌기도 함
		 */
	}
}
