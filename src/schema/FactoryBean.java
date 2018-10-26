package schema;
/**
 * 发型工厂类
 * @author wc
 *
 */
public class FactoryBean {
	
	public static HairInterface getHair(String key) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		HairInterface hair = (HairInterface) Class.forName(key).newInstance();
		return hair;
	}
}
