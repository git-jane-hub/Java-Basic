package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class R04 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		for(int a = 0; a <= 100000; a++) {
			list1.add(a);
			list2.add(a);
		}
		long startTime1 = System.currentTimeMillis();
		for(int a = 1; a < list1.size() - 1; a++) {
			list1.remove(a);
		}
		long endTime1 = System.currentTimeMillis();
		
		long startTime2 = System.currentTimeMillis();
		for(int a = 1; a < list1.size() - 1; a++) {
			list1.remove(a);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("ArrayList를 처리하는데 걸린시간: " + (endTime1 - startTime1));
		System.out.println("LinkedList를 처리하는데 걸린시간: " + (endTime2 - startTime2));
	}
}
