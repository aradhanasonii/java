package Collection;

import java.util.LinkedList;

public class LinkedListCollection {
	public static void main(String[] args) {
		
		LinkedList<Object> list = new LinkedList<Object>();
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
		list.addFirst(20);
		list.addLast("hello");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		for (Object obj : list) {
			System.out.println(obj);
		}
		}

}
