package test;

import java.util.HashSet;

public class Test5 {
	public static void main(String[] args) {
		String string = "abcdan";
		char[] charArray = string.toCharArray();
		HashSet<Character> characters = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			boolean add = characters.add(charArray[i]);
			if (!add) {
				System.out.println("第一次出现重复的字符为:" + charArray[i]);
			}
		}
	}
	
	
	

}
