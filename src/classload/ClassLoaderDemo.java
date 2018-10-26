package classload;

public class ClassLoaderDemo {

	public static void main(String[] args) {
		ClassLoader classLoader = Test.class.getClassLoader();
		System.out.println(classLoader);
		ClassLoader parent = classLoader.getParent();
		System.out.println(parent);
		ClassLoader parent2 = parent.getParent();
		System.out.println(parent2);
	}
}
