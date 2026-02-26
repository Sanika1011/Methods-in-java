package Method;

class Addition
{
	//parameterized method
	void add(int x,int y)
	{
		//int n1=2,n2=2;
		System.out.println("Addition : "+(x+y));
	}
}

class Subtraction
{
	//parameterized method
	void sub(int x,int y)
	{
		//int n1=2,n2=2;
		System.out.println("Subtraction : "+(x-y));
	}
}

public class Parameterized_method {

	public static void main(String[] args) 
	{
		Addition ob1 = new Addition();
		Subtraction ob2 = new Subtraction();
		
		ob1.add(19,10);
		ob2.sub(40,20);
	}

}
