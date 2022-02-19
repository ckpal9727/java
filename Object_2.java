class One
{
	int i=10,j=11;
	String name=new String("ck");
	public String toString()
	{
		return ("The value of i "+ i + "\nThe value of j is "+ j + "\nName is "+name);
	}
	public static void main(String[] args) {
		One o1=new One();
		System.out.println(o1);
	}
}