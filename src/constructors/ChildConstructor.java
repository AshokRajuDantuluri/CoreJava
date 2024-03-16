package constructors;

public class ChildConstructor extends ConstructorConcept {

	String name;
	ChildConstructor(String name)
	{
		super(name);
		this.name=name;
        System.out.println(name);

	}
	




	public static void main(String[] args) {
		
		ChildConstructor cc = new ChildConstructor("Vardhan");
		//ConstructorConcept cc1= new ConstructorConcept();
	}

}
