package pack1;

public class Class1 
{
	int a,b,c;
	
	public Class1(int a, int b) 
	{
		this.a = a;
		this.b = b;
	}

	public void add()
	{
		c= a+b;
		System.out.println("Add of A & b is : " + c);
	}
	
	public void sub()
	{
		c = a-b;
		System.out.println("Sub of A & b is :" + c );
	}
	
	public static void main(String[] args) 
	{
		Class1 c1 = new Class1(10, 20);
		c1.add();
		c1.sub();
		
		System.out.println("hi");
	}
}
