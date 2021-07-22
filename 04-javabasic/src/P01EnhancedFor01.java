
public class P01EnhancedFor01 {
	public static void main(String[] args) {
		/* 향상된 for문은 반복문 진행시 타겟으로 배열을 넣음
		 * 이 경우 반복실행 횟수는 배열의 내부요소 개수만큼
		 */
		int[] arr1 = {100, 211, 339, 475, 591}; // 순번은 0부터 시작해서 index: 0, 1, 2, 3, 4
		
		for(int a: arr1) {
			System.out.println(a);
		}
		System.out.println("---------------");
		for(int i = 0; i < arr1.length; i++) { 
			// length: arr1의 내부의 개수 - arr1.length = 5, 내부요소의 개수가 추가되어도 숫자가 변경되면서 유지보수에 좋음
			// i는  arr1의 내부값이 아닌 스택의 주소값으로 순번에 해당하는 힙의 값을 불러오는 역할
			System.out.println(arr1[i]); // arr1의 대괄호 안에 순번(주소값)을 적어주면, 순번안에 있는 내용을 불러옴 
		}
	} // 여기서 main메서드가 끝나면, 스택에서 주소값 데이터도 삭제되고 힙에서 스택으로 불러올 방법이 없기때문에 힙 안의 데이터도 삭제됨
}
