package ganesh;
class A
{
	 
	public static void abc()
	{
		int a=1000;
	
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
		System.out.println("Nishant Here");
		System.out.println("Again Nishant.....");
		}
}

public class ass2 {
	public void main(String[] args) {
	
		A.abc();
		A a=new A();
		B.bbc();
	
	}
}
