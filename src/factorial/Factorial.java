package factorial;

public class Factorial {

	public static int getResult(int i) {
		if (i == 0) {
			return 1;
		} else {
			return i * getResult(i - 1);
		}
	}

	public static void main(String[] args) {
		int result = getResult(4);
		System.out.println(result);
	}
}
