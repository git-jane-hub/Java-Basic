
public class P06LogicalOperator01 {

	public static void main(String[] args) {
		/*
		 *  논리 연산자는 둘 이상의 논리식을 병렬 형태로 제시
		 *  논리식1 & 논리식2의 경우는 양쪽 논리식이 다 true인 경우
		 *  논리식1 | 논리식2의 경우는 한쪽 이상이 true인 경우
		 *  최종 조건식을 true로 판단
		 */
		System.out.println((100 > 50) & (30 > 50));  // true & false
		System.out.println(100 > 50 | 30 > 50);      // true | false
		
	}
}
