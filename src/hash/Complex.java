package hash;

public class Complex {
	private int age;
	private String name;
	private boolean flag;
	private long lo;
	private float fl;
	private double dou;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public long getLo() {
		return lo;
	}
	public void setLo(long lo) {
		this.lo = lo;
	}
	public float getFl() {
		return fl;
	}
	public void setFl(float fl) {
		this.fl = fl;
	}
	public double getDou() {
		return dou;
	}
	public void setDou(double dou) {
		this.dou = dou;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(dou);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Float.floatToIntBits(fl);
		result = prime * result + (flag ? 1231 : 1237);
		result = prime * result + (int) (lo ^ (lo >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complex other = (Complex) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(dou) != Double.doubleToLongBits(other.dou))
			return false;
		if (Float.floatToIntBits(fl) != Float.floatToIntBits(other.fl))
			return false;
		if (flag != other.flag)
			return false;
		if (lo != other.lo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
