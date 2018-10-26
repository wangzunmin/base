package hash;

public class PhoneNumber {
	private final int areaCode;
	private final int prefix;
	private final int lineNumber;
	
	
	public PhoneNumber(int areaCode, int prefix, int lineNumber) {
		super();
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.lineNumber = lineNumber;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public int getPrefix() {
		return prefix;
	}
	public int getLineNumber() {
		return lineNumber;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + areaCode;
//		result = prime * result + lineNumber;
//		result = prime * result + prefix;
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		if (areaCode != other.areaCode)
			return false;
		if (lineNumber != other.lineNumber)
			return false;
		if (prefix != other.prefix)
			return false;
		return true;
	}
	
	
	
	
}
