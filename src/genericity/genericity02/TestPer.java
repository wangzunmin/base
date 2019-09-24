package genericity.genericity02;

//import org.junit.Test;

public class TestPer {
//	@Test
	public void test(){
		TestPerson<Student> t = new TestPerson<Student>();
		Student student = new Student();
		t.setP(student);
	}
	
	public static void function(TestPerson<? extends Person> p) {//澹版槑瀵硅薄 绫诲悕绉�<? extends 绫�> 瀵硅薄鍚嶇О
		
	}
}
