package Collection;
import java.util.TreeMap;
import java.util.Map.Entry;
public class TreeMapMap {
	public static void main(String[] args) {
		TreeMap<Integer, Object> set = new TreeMap<Integer, Object>();
		set.put(10, 'A');
		set.put(40, "hii");
		set.put(10, 80);
		set.put(45, 'B');
		set.put(30, null);
		set.put(60, 20);
		set.put(90, null);
		System.out.println(set);
		System.out.println(set.containsKey(10));
		System.out.println(set.containsValue("hii"));
		System.out.println(set.replace(10, "hello"));
	for (Entry<Integer, Object> m : set.entrySet()) {
	System.out.println(m.getKey()+" "+ m.getValue());
	}
	}
}

