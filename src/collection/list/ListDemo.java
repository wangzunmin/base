package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		List<Integer> list = new ArrayList<>(5);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		System.out.println(list.size());
	}
}
