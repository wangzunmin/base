package collection;

public class Name {
	private String id;

	public Name(String id) {
		this.id = id;
	}

	public String toString() {
		return this.id;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Name) {
			Name name = (Name) obj;
			System.out.println("equal" + name.id);
			return (id.equals(name.id));
		}
		return super.equals(obj);
	}

	public int hashCode() {
		Name name = (Name) this;
		System.out.println("Hash" + name.id);
		return id.hashCode();

	}
}
