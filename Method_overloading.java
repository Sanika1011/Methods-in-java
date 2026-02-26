package Method;

//method overloading
//compile-time overloading
//static overloading
//static method overloading

//method overloading is not possible by changing only return statement bcoz 
//eg-> void work at compile time and int work at run time

class test6 {
	
	static void get()
	{
		System.out.println("get");
	}
	
	static void get(int n)
	{
		System.out.println("get1");
	}
}
public class Method_overloading {

	public static void main(String[] args) 
	{
		test6.get();
		test6.get(2);
	}

}
