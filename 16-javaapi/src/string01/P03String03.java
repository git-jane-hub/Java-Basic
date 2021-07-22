package string01;

import java.util.Scanner;

public class P03String03 {
	public static void main(String[] args) {
		/* Scanner를 통해서 전체 문장을 입력받음
		 * 해당 문장내에서 찾고 싶은 단어를 입력 받음
		 * 문장 내에 있는 단어들의 인덱스 번호와 몇개가 조회되는지 출력하는 코드 작성
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("전체 문장을 입력해주세요.");
		String all = scan.nextLine();

		System.out.println("문장 내에서 카운트할 단어를 입력해주세요.");
		String voca = scan.nextLine();
		
		// 방법1
		int count = 0;
		for(int a = 0; a < all.length(); a++) {
			int get = all.indexOf(voca, a);
			count += 1;
			System.out.println(get + "번에서 " + count + "번째 <" + voca + ">이/가 검출되었습니다.");
			a = (get + voca.length()) - 1;
			if(get == -1) {
				break;
			}
		}
		System.out.println(voca + "의 총 검출 횟수는 " + count + "회입니다.");
		
		// 방법2
//		int get;
//		int count = 0;
//		boolean bool = true;
//		int fIndex = -1;
//		while(bool) {
//			int get = all.indexOf(voca, fIndex + 1);
//			if(get == -1) {
//				bool = false;
//			}else {
//				fIndex = get;
//				count++;
//				System.out.println(get + "번에서 " + count + "번째 " + voca + " 이/가 검출되었습니다.");
//			}
//		}System.out.println(voca + "의 총 검출 횟수는 " + count + "입니다.");
	}
}
