package Method;

class Addition1
{
	int add(int x,int y)
	{
		int sum= x+y;
		return sum;
	}
}

public class Method_With_Return {

	public static void main(String[] args) 
	{
		Addition1 obj = new Addition1();
		int ans = obj.add(2, 2);
		System.out.println("Addition : "+ans);
		
	}

}
