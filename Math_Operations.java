package Method;

class Demo1
{
	int a=10;
	int b=20;
}

public class Math_Operations {

	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo1();
		int c = d1.a+d1.b;
		System.out.println("Add : "+c);
		
		Demo1 d2 = new Demo1();
		c = d2.a-d2.b;
		System.out.println("Sub : "+c);
		
		Demo1 d3 = new Demo1();
		c = d3.a*d3.b;
		System.out.println("Mul : "+c);
		
		Demo1 d4 = new Demo1();
		c = d4.a/d4.b;
		System.out.println("Div : "+c);
	}

}
