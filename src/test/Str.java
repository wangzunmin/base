package test;

public class Str {
	public static void main(String[] args) {
		String str = "adasfAAADFD阿萨德发123";
		int unicodeCount = 0;
		int szCount = 0;
		int zmCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				szCount++;
			} else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				zmCount++;
			} else {
				unicodeCount++;
			}
		}
		System.out.println(unicodeCount);
		System.out.println(szCount);
		System.out.println(zmCount);
	}
}
