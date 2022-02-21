interface Ione
{
	static final int i=10;
	void show();
	void show1();
}
class One implements Ione
{
	 public void show()
	{
		System.out.println("Show i  is "+i);
	}

	public void show1()
	{
		System.out.println("Show 1");	
	}
	public static void main(String[] args) {
		One o1=new One();
		o1.show();
		o1.show1();
	}
}