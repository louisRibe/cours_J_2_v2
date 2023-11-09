package condition;

public class ConditionalHello {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub

//	    sayHello();
	    if (args.length > 0) {
	    	sayHelloTo(args[0]);
	    }
	    else
	    {
	    	sayHello();
	    }
	    

	}

	private static void sayHello() {
		System.out.println("Hello!");
	}
	
	private static void sayHelloTo(String name) {
		System.out.println("Hello " + name);
	}
}
