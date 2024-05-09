package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(40);
		list1.add(30);
		list1.add(1);
		Collections.sort(list1);
		System.out.println(list1);
	ArrayList<Object> list = new ArrayList<Object>(list1);
	list.add(10);
	list.add("A");
	list.add(10);
	list.add("Hii");
	list.add(null);
	list.add(null);
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.contains("Hii"));
	System.out.println(list.indexOf("Hii"));
	list.remove("A");
	System.out.println(list);
	
	}

}
