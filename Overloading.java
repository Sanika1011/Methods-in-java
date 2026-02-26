package Method;

//constructor overloading
class Test7
{
	Test7()
	{
		System.out.println("Default constructor");
	}
	
	Test7(int n)
	{
		System.out.println(n);
	}
	
}

public class Overloading {

	public static void main(String[] args) 
	{
//		Test7 t1 = new Test7();
//		Test7 t2 = new Test7(2);
		
		//constructor can be called in this way also
		new Test7();
		new Test7(7);
		new Test7();
	}

}
