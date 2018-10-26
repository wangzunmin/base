package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
//import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(-1);
		set.add(0);
		set.add(9);
		Set<Integer> synchronizedSet = Collections.synchronizedSet(set);
		System.out.println(synchronizedSet);
	}
	
	public static void test2(){
		TreeSet<M> set = new TreeSet<M>();
		set.add(new M(5));
		set.add(new M(1));
		set.add(new M(45));
		set.add(new M(30));
		System.out.println(set);
	}
	
	
	public static void test3(){
//		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(4);
		set.add(2);
		set.add(7);
		System.out.println(set);
		
	}
}
