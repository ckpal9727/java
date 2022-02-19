abstract class One
{
	abstract void fun1();//abstract method

}
class Two extends One
{
	void fun1()
	{
		System.out.println("Two's Fun1");
	}
	void fun2()
	{
		System.out.println("Two's Fun1");
	}

	
	public static void main(String[] args) {
		Two t1=new Two();
		// t1.fun1();
		One obj;
		obj=t1;
		obj.fun1();
		// obj.fun2();
		
	}
}