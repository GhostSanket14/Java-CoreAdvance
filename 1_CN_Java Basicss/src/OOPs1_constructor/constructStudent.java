package OOPs1_constructor;

public class constructStudent {
	
	private int age;
	public int weight;
	
	public constructStudent() {
		System.out.println("No vales were passed, so default constructor .... !");
	}
	
	public constructStudent(int a, int b) { // We can create any number of constructors, but each constructors must have different no. of parameters.
		age=a;								// Ie. now we cant have a constructor with 2 parameters as we have already build one with 2 parameters.
		weight=b;
		System.out.println("Constructor with age : "+age+" & weight "+weight);
	}
	public constructStudent(int a) {	
		age=a;
		System.out.println("Constructor with age : "+age);
	}
	
}