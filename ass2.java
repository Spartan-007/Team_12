package ganesh;
class A
{
	 
	public static void abc()
	{
		int a=500;
	
	System.out.println(a);
	}
	
	public A()
	{
	 System.out.println("In costructor");
		
	}
}
class B
{
	public static void bbc()
	{
		System.out.println("Static block in B");
	}
}

public class ass2 {
	public void main(String[] args) {
	
		A.abc();
		A a=new A();
		B.bbc();
	
	}
}