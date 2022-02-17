class Emp
{
	int id,age;
	String name=new String();
	Emp()
	{
		System.out.println("Main");
	}
	
}
class PartTime extends Emp
{
	int numOfHr,RateOfHr;
	PartTime()
	{
			System.out.println("Part Time");
	}
	PartTime(int p_id,int p_age,String p_name,int p_numOfHr,int p_RateOfHr)
	{
		id=p_id;
		age=p_age;
		name=p_name;
		numOfHr=p_numOfHr;
		RateOfHr=p_RateOfHr;
	}	
		void dispalyDetail()
	{
		System.out.println("Details of Part Tiem Employee");
		System.out.println("Id of  emp "+id);
		System.out.println("Age of emp  "+age);
		System.out.println("Name of emp "+name);
		System.out.println("DA of emp "+numOfHr);
		System.out.println("Basic Pay of emp "+RateOfHr);	
	}

}
class FullTime extends Emp
{
	int DA;
	int basicPay;
	FullTime()
	{
		System.out.println("Full time");
	}
	FullTime(int p_id,int p_age,String p_name,int p_DA,int p_basicPay)
	{
		id=p_id;
		age=p_age;
		name=p_name;
		DA=p_DA;
		basicPay=p_basicPay;
	}
	void dispalyDetail()
	{
		System.out.println("Details of Full Time Employee");
		System.out.println("Id of  emp "+id);
		System.out.println("Age of emp  "+age);
		System.out.println("Name of emp "+name);
		System.out.println("DA of emp "+DA);
		System.out.println("Basic Pay of emp "+basicPay);	
	}
}
class Test
{
	public static void main(String[] args) {
		PartTime p1=new PartTime(1,21,"ck",4,200000);
		FullTime f1=new FullTime(2,20,"kp",20000,300000);
		p1.dispalyDetail();
		f1.dispalyDetail();
	}
}
