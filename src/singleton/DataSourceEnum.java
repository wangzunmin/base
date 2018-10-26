package singleton;

/**
 * 枚举方式的单例
 * 
 * @author WZM
 *
 *         2018年10月24日
 */
public enum DataSourceEnum {
	DATASOURCE,
	TYPE;
	private DBConnection connection = null;

	private DataSourceEnum() {
		connection = new DBConnection();
	}

	public DBConnection getDBConnection() {
		return connection;
	}
}
