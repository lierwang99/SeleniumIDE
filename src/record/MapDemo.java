package record;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		System.out.println(list.size());
//		list.add(1);
//		System.out.println(list.size());
//		Iterator<Integer> iterator = list.iterator();
//		int i = 1;
//		while(iterator.hasNext()) {
//			System.out.println(i++ + " : "+iterator.next());
//		}
		// TODO Auto-generated method stub
//		Set<Integer> Set = new HashSet<Integer>();
//		Set.add(1);
//		System.out.println("第一次长度："+Set.size());
//		Set.add(1);
//		System.out.println("第2次长度："+Set.size());
//		Iterator<Integer> iterator2 = Set.iterator();
//		int j = 1;
//		while(iterator2.hasNext()) {
//			System.out.println(j++ + " : "+iterator2.next());
//		}
		Map<Integer, String> map = new HashMap<Integer, String>();
//		System.out.println(map.isEmpty());
		map.put(1, "A");
		map.put(2, "B");
		map.put(11, "C");
		map.put(55, "D");
		map.put(66, "e");
		map.put(77, "f");
		map.put(100, "G");
//		int size = map.size();
//		System.out.println(size);
//		String string = map.get(3);
//		System.out.println(string);
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next+" : "+map.get(next));
		}
		
//		Collection<String> vs = map.values();
//		Iterator<String> it = vs.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
	}

}
