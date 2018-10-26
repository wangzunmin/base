package collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {
	
	public static void main(String[] args) {
		entry();
	}

	public static void entry(){
		Map<String,Integer> map = new HashMap<>();
		map.put("tom", 1);
		map.put("jack", 2);
		map.put("rose", 3);
		map.put("jay", 4);
		
//		Set<String> keySet = map.keySet();
//		for (String string : keySet) {
//			System.out.println(string);
//		}
		
//		Set<Entry<String,Integer>> entrySet = map.entrySet();
//		
//		for (Entry<String, Integer> entry : entrySet) {
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			System.out.println("key:" + key + "--" +  "value:" + value);
//		}
		
		//----------------map遍历start------------------
		//----------------map遍历方法一------------------
//		Iterator<String> iterator = map.keySet().iterator();
//		while (iterator.hasNext()) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//		}
		
		//----------------map遍历方法二------------------
		Iterator<Entry<String, Integer>> iterator2 = map.entrySet().iterator();
		while (iterator2.hasNext()) {
			Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) iterator2
					.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
//			if(value == 4){
//				iterator2.remove();
//			}
			System.out.println("key:" + key + "--" +  "value:" + value);
		}
		System.out.println(map);
		//----------------map遍历end------------------
		
		
		//----------------map排序start------------------
//		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
//		
//		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
//			@Override
//			public int compare(Entry<String, Integer> o1,
//					Entry<String, Integer> o2) {
//				return o1.getKey().compareTo(o2.getKey());
//			}
//		});
//		
//		for (Entry<String, Integer> entry : list) {
//			System.out.println("key:" + entry.getKey() + "--" +  "value:" + entry.getValue());
//		}
		//----------------map排序end------------------
	}
	
	public static void mao(){
		//LinkedHashMap能保持遍历顺序和插入顺序一致，HashMap并不能
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("tom", 1);
		map.put("jack", 2);
		map.put("rose", 3);
		map.put("jay", 4);
		
		System.out.println(map);
	}
}
