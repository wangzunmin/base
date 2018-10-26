package genericity.genericity02;

import org.junit.Test;

public class TestPer {
	@Test
	public void test(){
		TestPerson<Student> t = new TestPerson<Student>();
		Student student = new Student();
		t.setP(student);
	}
	
	public static void function(TestPerson<? extends Person> p) {//声明对象 类名称<? extends 类> 对象名称
		
	}
}
