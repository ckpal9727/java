class One
{
	final void fun()
	{
		System.out.println("Final fun");
	}
}
class Two extends One
{
	void fun()
	{
		System.out.println("Two fun");	
	}
	public static void main(String[] args) {
		Two t1=new Two();
		// t1.fun();
	}
}