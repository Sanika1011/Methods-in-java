package Method;

class Test
{
	//class has:
	//1.fields -> variables -> data-member
	//2.Methods -> function -> member function
	int a=10;
}

public class Jan_19 {

	public static void main(String[] args) 
	{
		Test t = new Test();
		//Test -> class name
		//t -> object name
		//new -> creates new object
		//test() -> default constructor
	    System.out.println("name: "+t.a);
	    System.out.println(t.hashCode());
	    
	    
	    //object has->
	    //1.State
	    //2.Behavior
	    //3.Identity
	    Test t1 = new Test();
	    System.out.println("number: "+t1.a);
	    System.out.println(t1.hashCode());
	    
	    
	    Test t2 = new Test();
	    System.out.println("int number: "+t2.a);
	    System.out.println(t2.hashCode());
	}

}
