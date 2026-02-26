package Method;

import java.util.Scanner;

class Demo
{
 int a;
 int b;
}

public class Value_passing {

	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.a=10;
		d1.b=11;
		System.out.println(d1.a+" "+d1.b);
		
		//taking values using scanner.
		Demo d2 = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b: ");
		d2.a=sc.nextInt();
		d2.b=sc.nextInt();
		System.out.println(d2.a+" "+d2.b);
	}

}
