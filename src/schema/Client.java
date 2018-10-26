package schema;

public class Client {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*HairInterface hair = FactoryBean.getHair("schema.LeftHair");
		hair.draw();*/
		HairInterface hair = FactoryBean.getHair("schema.RightHair");
		hair.draw();
		
		if(true) {
				LeftHair a=new LeftHair();
			}
	}
}
