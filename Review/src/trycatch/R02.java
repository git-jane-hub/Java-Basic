package trycatch;

public class R02 {
	public int a;
	public int b;
	
	public R02(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void showData() {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	public static void main(String[] args) {
		try{
			R02 r1 = new R02(1,3);
			R02 r2 = null;
			r1.showData();
			r2.showData();
		}catch(NullPointerException a){
			System.out.println("연결할 객체가 없습니다.");
		}
	}
}
