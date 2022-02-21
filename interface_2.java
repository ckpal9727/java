interface Itwo
{
	int i=10;
	void show();
	void show1();

}
class Two implements Itwo 
{
	public void show()
	{
		System.out.println("Hii The value of i is "+i);
	}
	public void show1()
	{
		System.out.println("Hii I am in show1()");
	}
	// 
	public static void main(String s[])
	{
		Itwo ref;
		Two t1=new Two();
		ref=t1;
		ref.show();
		ref.show1();

	}
}