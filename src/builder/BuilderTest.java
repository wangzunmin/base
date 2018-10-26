package builder;

public class BuilderTest {
	public static void main(String[] args) {
		Person.PersonBuilder personBuilder = new Person.PersonBuilder("","","");
		
		Person person = personBuilder.createPerson();
		
	}
}
