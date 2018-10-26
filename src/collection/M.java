package collection;
/**
 * implements Comparable<M>
 * @author WZM
 *
 * 2018年9月17日
 */
public class M {
	private int age;

	public M(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public int compareTo(M o) {
//		if(o.getAge() > this.age){
//			return 1;
//		}else if(o.getAge() < this.age){
//			return -1;
//		}
//		return 0;
//	}
	
	
	

	@Override
	public int hashCode() {
		Integer ageCopy = age;
		return ageCopy.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof M){
			return ((M) obj).getAge() == this.age;
		}
		return false;
	}

	@Override
	public String toString() {
		return "M [age=" + age + "]";
	}
	
	
	
}
