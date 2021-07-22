package map;

import java.util.HashMap;
import java.util.Map;

public class R01 {
	public static void main(String[] args) {
		Map<Integer, String> fruit = new HashMap<Integer, String>();
		
		fruit.put(1, "banana");
		fruit.put(2, "orange");
		fruit.put(3, "kiwi");
		fruit.put(4, "apple");
		fruit.put(5, "melon");
		
		System.out.println(fruit.get(1));
		System.out.println(fruit.get(2));
		System.out.println(fruit.get(3));
		System.out.println(fruit.get(4));
		System.out.println(fruit.get(5));
		
		System.out.println(fruit);
		System.out.println(fruit.size());
		
		System.out.println(fruit.containsValue("watermelon"));
		System.out.println(fruit.containsValue("melon"));
		
		for(int a = 1; a < 4; a++) {
			fruit.remove(a);
		}
		System.out.println(fruit);
		System.out.println(fruit.size());
	}
}
