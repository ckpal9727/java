abstract class One
{
	abstract void fun1();//abstract method
	abstract void fun2();
	
	
}
class Two extends One
{
	void fun1()
	{
		System.out.println("Two's Fun1");
	}

	void fun2()
	{
		System.out.println("Two's Fun2");
	}
	public static void main(String[] args) {
		Two o1=new Two();
		o1.fun1();
		o1.fun2();
	}
}