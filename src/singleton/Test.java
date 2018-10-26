package singleton;

public class Test {
	public static void main(String[] args) {
		DBConnection dBConnection1 = DataSourceEnum.TYPE.getDBConnection();
		DBConnection dBConnection2 = DataSourceEnum.TYPE.getDBConnection();
		
		System.out.println(dBConnection1 == dBConnection2);
	}
}
