
public class P07LogicalOperator02 {
	public static void main(String[] args) {
		/*
		 *  &&, || - short circuit(단축 검정) 연산자
		 *  &, | 와 똑같이 작동하지만
		 *  좌항 조건식만으로 최종 결과가 확정되는 경우 추가 연산을 수행하지 않음
		 */
		System.out.println((1 + 3 > 4) && (0 < 3 / 0));
		System.out.println((5 > 4) || (0 < 2 / 0));
		/*
		 *  아래 두 식은 0으로 나누는 식이 우항에 있기 때문에 에러 발생, 논리적으로 판단되지 않는 식
		 *  위의 두 식에서는 단축 검정으로 우항의 식을 무시했지만,
		 *  아래 식은 단축 검정이 불가능하기 때문에 에러가 발생함
		 */
		System.out.println((1 + 3 >= 4) && (0 < 3 / 0));
		System.out.println((5 < 4) || (0 < 2 / 0));
	}
}
