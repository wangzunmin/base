package hash;


public class Dept {
	private int dno;
	private String name;
	private String sex;
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	 * 重写hashcode和equals
	 * 1.实现hashcode：保持和equals使用相同的字段进行计算
	 * 				    最好不要用可变的字段来计算哈希码
	 * 
	 * 
	 * 相等的对象必须有相等的散列码，根据equals方法 ，如果两个对象的实例在逻辑上是相等的，
	 * 但是根据object类的hashcode方法，它们是两个没有
	 * 共同之处的对象，所以需要在重写equals方法后，必须重写hashcode方法
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dno;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	
	/**
	 * equals方法实现用户自定义的逻辑上的相同对象
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dept other = (Dept) obj;
		if (dno != other.dno)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
	
	
}
