package inheriitance;

public class ChildClassSuperKeyword extends ParentClass {

	String name = "ChildClass.";

	public void getString() {
		// when SAME variable define in child class and parent class.
		// in order to get the value of the parent class we need to use the super key
		// word.

		// apply when the method`s name is SAME.
		System.out.println(name);
		System.out.println(super.name);
		super.getData();

	}

	public void getData() {

		System.out.println("this is a method in  CHILDCLASS.");

	} 

	
	//super();   ===> its not a method, constructor call to the super class;
	
	
	
	public ChildClassSuperKeyword() {
		super();// this should be always be at the first line . calling the contructor in the
				// parent class.
		System.out.println("child class constuctor.");
	}

	public static void main(String[] args) {

		ChildClassSuperKeyword cc = new ChildClassSuperKeyword();
		cc.getString();
		cc.getData();

	}

}
