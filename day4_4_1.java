class Std
{
		int id;
		int sem;
		
		static int count=0;
		static int Scount=0;
		{
			count++;
		}
	Std(Std t)
	{
		id=t.id;
		sem=t.sem;
	}
	Std(int i,int s)
	{
		id=i;
		sem=s;
		Scount++;
	}
	
	public static void main(String[] args) {
		// System.out.println("hii");
		Std s=new Std(1,2);
		Std s1=new Std(s);
		Std s3=new Std(2,3);		
		System.out.println("s1 "+s.id+" "+s.sem);
		System.out.println("s2 "+s1.id+" "+s1.sem);
		System.out.println("Count :"+Std.count);
		System.out.println("Count :"+Std.Scount);

	}

}