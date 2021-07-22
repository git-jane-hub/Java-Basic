package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class R02 {
	public static void main(String[] args) {
		List<String> fruit = new ArrayList<>();
		List<String> list = new ArrayList<>();
		fruit.add("peach");
		fruit.add("apple");
		fruit.add("cherry");
		fruit.add("banana");
		System.out.println(fruit);
		Collections.sort(fruit);
		System.out.println(fruit);

		System.out.println(fruit.contains("orange"));
		System.out.println(fruit.contains("apple"));
		
		// 해당 인덱스에 있는 내용 
		System.out.println(fruit.get(0));
//		System.out.println(fruit.get("peach"));
		
		System.out.println(fruit.isEmpty());
		System.out.println(list.isEmpty());
		
		System.out.println(fruit.size());
		System.out.println(list.size());
	}
}
