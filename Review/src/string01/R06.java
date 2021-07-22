package string01;
public class R06 {
	public static void main(String[] args) {
		String hello = "Hello Java";
		char [] hello2 = new char[hello.length()];
		for(int a = 0; a < hello.length(); a++) {
			hello2[a] = hello.charAt(a);
			
			// 여기서 대문자 -> 소문자 변환 안됨
			if((hello2[a] >= 65) && (hello2[a] <= 90)) {
				System.out.println(hello);
				hello2[a] = (char)(32 + hello2[a]);
			} else if((hello2[a] >= 97) && (hello2[a] <= 122)) {
				hello2[a] = (char)(hello2[a] - 32);
			}
		}
		System.out.println(hello2);
		
		
		char [] abc = {'a', 'b', 'c'};
		for(int a = 0; a < abc.length; a++) {
			abc[a] = (char)(abc[a] - 32);
		}
		System.out.println(abc);
		char [] def = {'D', 'E', 'F'};
		for(int a = 0; a < def.length; a++) {
			def[a] = (char)(def[a] + 32);
		}
		System.out.println(def);
		
	}
}
