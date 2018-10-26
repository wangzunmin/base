package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		sort1();
	}

	static List<Integer> asList = Arrays.asList(3, 1, 2, 5);

	public static void sort1() {
		System.out.println("sort before:" + asList);
		Collections.sort(asList);
		System.out.println("sort after:" + asList);
	}

	public static void sort2() {
		System.out.println("sort before:" + asList);
		Collections.sort(asList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println("sort after:" + asList);
	}

	static List<Emp> empList;
	static {
		Emp emp1 = new Emp(2, "Guan YunChang");
		Emp emp2 = new Emp(3, "Zhang Fei");
		Emp emp3 = new Emp(1, "Liu Bei");
		empList = Arrays.asList(emp1, emp2, emp3);
	}
	
	public static void sort3(){
		System.out.println("sort before:" + empList);
		Collections.sort(empList, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				return o2.getEmpno() - o1.getEmpno();
			}
		});
		System.out.println("sort after:" + empList);
	}
	
	public static void sort4(){
		System.out.println("sort before:" + empList);
		Collections.sort(empList);
		System.out.println("sort after:" + empList);
	}
}
