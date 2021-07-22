package collection;

import java.util.ArrayList;
import java.util.List;

public class R01 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(0);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		
		list1.add(1, 1);
		list1.add(2, 20);
		System.out.println(list1);

		list1.set(2, 2);
		System.out.println(list1);
	}
}
