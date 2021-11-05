// 연결 리스트
public class LinkedListClass {
	public int data;
	public LinkedListClass address;	// 다음요소의 주소값을 저장
	
	public LinkedListClass(int data, LinkedListClass address) {
		this.data = data;
		this.address = address;
	}
	
	public void getData() {
		System.out.println(this.data);
	}
	
	public void getAddress() {
		System.out.println(this.address);
	}
	
	
	

}
