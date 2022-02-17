class Std
{
		int id;
		int sem;
		
		static int count=0;
		{
			count++;
		}
		
		static void displayCount()
		{
			System.out.println("Count :"+count);
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
		
	}
	
	public static void main(String[] args) {
		// System.out.println("hii");
		Std s=new Std(1,2);
		Std s1=new Std(s);
		Std s3=new Std(2,3);	
		Std.displayCount();	
		//System.out.println("Count :"+Std.Scount);

	}

}