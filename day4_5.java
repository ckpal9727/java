class Outer
{
		public int a;
	class Inner
	{
		int b;
		Outer.a=10;
		b=20;
		public static void main(String[] args) {
				Outer o1=new Outer();
			System.out.println("The value of Outer a is "+o1.a);
			System.out.println("The value of Outer a is "+o1.b);
		}
	}
}