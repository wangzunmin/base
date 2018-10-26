package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashCodeDemo {
	public static void main(String[] args) {
//		HashMap<PhoneNumber, String> map = new HashMap<>();
//		map.put(new PhoneNumber(707, 867, 5309), "jenny");
//		
//		String string = map.get(new PhoneNumber(707, 867, 5309));
//		System.out.println(string);
		setDemo();
	}
	
	
	
	public static void setDemo(){
		Set<Boo> set = new HashSet<Boo>();
		set.add(new Boo("1","tom"));
		set.add(new Boo("2","jenny"));
		set.add(new Boo("3","tom"));
		System.out.println(set);
		
	}
}
