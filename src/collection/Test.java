package collection;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Name n1 = new Name("01");
		Name n2 = new Name("01");

//		Collection c = new HashSet();
		List<Name> c =new ArrayList<Name>();
		c.add(n1);
		c.add(n2);
		System.out.println(c.size());
	}
}
