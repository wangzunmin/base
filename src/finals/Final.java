package finals;

public class Final {
	
	
	public void print(final String boy){
//		boy = "xx"; error
	}
	
	public void printPerson(final Person boy){
//		boy = new Person(); error
		boy.setName("xxx"); //correct
		
	}
}
