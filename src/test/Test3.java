package test;

import java.math.BigDecimal;

public class Test3 implements Cloneable{
	public static void main(String[] args) throws CloneNotSupportedException {
//		double doubleValue = new BigDecimal("12.10").multiply(new BigDecimal("40")).doubleValue();//冻结总金额
//		System.out.println(doubleValue);
		
		String a = "zz";
		System.out.println(a.hashCode());
		
//		Test3 test = new Test3();
//		
//		Test3 clone = (Test3) test.clone();
//		
//		System.out.println(test.toString());
//		System.out.println(clone.toString());
		
		
		String b = new String("zz");
		System.out.println(a == b.intern());
	}
}
