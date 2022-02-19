abstract class One
{
	abstract void fun1();//abstract method
	void fun2()
	{
		System.out.println("fun2");
	}
	public static void main(String[] args) {
		One o1=new One();//error
	}
}