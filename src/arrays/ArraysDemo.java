package arrays;

import java.util.Arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		binarySearch();
	}

	public static void sort(){
		int a[] = {1,4,0,7,6};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
//		for (int i : a) {
//			System.out.println(i);
//		}
	}
	
	public static void copyOf(){
		int a[] = {1,4,0,7,6};
		int[] copyOf = Arrays.copyOf(a, 10);
		System.out.println(copyOf.length);
//		for (int i : a) {
//			System.out.println(i);
//		}
	}
	
	public static void binarySearch(){
		int a[] = {1,4,0,7,6};//0 1 4 6 7
		Arrays.sort(a);
		int binarySearch = Arrays.binarySearch(a, 0);//需要排序
	}
}
