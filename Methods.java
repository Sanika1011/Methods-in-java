package Method;

class Demo3 //no Memory allocation for the class
{
	//syntax ->
	//return_stmt method_name()
	//{
		//code
	//}
	void get()
	{
		System.out.println("Hello");
	}
	
	void sample()
	{
		System.out.println("sample");
	}
	
}

public class Methods {

	public static void main(String[] args) 
	{
		Demo3 demo3 = new Demo3(); //obj->memory allocated in heap memory
		demo3.get();
		demo3.get();
		demo3.get();
		demo3.get();
		demo3.sample();
	}

}
