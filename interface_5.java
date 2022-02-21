interface Ione
{
	int i=10;
	void show();
	

}
interface Itwo
{
	
	void show1();
	

}

interface Ithree extends Ione,Itwo
{
	
	void show2();
	

}
class Two implements Ithree
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

	public void show2()
	{
		System.out.println("Hii I am in show2()");
	} 
	public static void main(String s[])
	{
		Two t1=new Two();
		
		t1.show();
		t1.show1();
		t1.show2();

	}
}