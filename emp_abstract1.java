
import java.util.Scanner;

abstract class Emp
{
	int id,age,salary;
	String name=new String();
	Emp()
	{
		id=0;
		age=0;
		name="";
		salary=0;
	}
	Emp(int e_id,int e_age,String e_name)
	{
		id=e_id;
		age=e_age;
		name=e_name;
		salary=0;
		
	}
	void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter Id ");
		id=sc.nextInt();
		System.out.print("enter Name ");
		name=sc.next();
		System.out.print("enter Age ");
		age=sc.nextInt();
		
	}
	void showDetails()
	{
		System.out.println("Id is "+id);
		System.out.println("Name is  "+name);		
		System.out.println("Age is "+age);		
		System.out.println("Salary  is "+salary);

	}
	abstract void calcSalary();
	
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
		super(p_id,p_age,p_name);
		numOfHr=p_numOfHr;
		RateOfHr=p_RateOfHr;
	}

	void getDetails()
	{
		super.getDetails();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter Numkber of hour ");
		numOfHr=sc.nextInt();
		System.out.print("enter Rate of hour");
		RateOfHr=sc.nextInt();
	}	
	void calcSalary()
	{
		salary=numOfHr*RateOfHr;
	}
	void showDetails()
	{
		super.showDetails();
		System.out.println("DA of emp "+numOfHr);
		System.out.println("Basic Pay of emp "+RateOfHr);	
	}

}
class FullTime extends Emp
{
	int DA;
	int basicPay;
	FullTime()
	{}
	FullTime(int f_id,int f_age,String f_name,int f_DA,int f_basicPay)
	{
		super(f_id,f_age,f_name);
		DA=f_DA;
		basicPay=f_basicPay;

	}
	void getDetails()
	{
		super.getDetails();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter DA ");
		DA=sc.nextInt();
		System.out.print("enter basicPay");
		basicPay=sc.nextInt();
	}
	void showDetails()
	{
		super.showDetails();
		System.out.println("DA of emp "+DA);
		System.out.println("Basic Pay of emp "+basicPay);	
	}
	void calcSalary()
	{
		System.out.println("salary "+salary);
		salary = (basicPay*DA)/31;
		System.out.println("salary "+salary);
	}
}

class Test
{
	public static void main(String[] args) {
		
		// PartTime p1=new PartTime(1,21,"ck",2,200000);
		PartTime p2=new PartTime();
		// FullTime f1=new FullTime(2,20,"kp",3,300000);
		FullTime f2=new FullTime();
		//---this is for Part time 
		// p2.getDetails();
		// System.out.println();
		// System.out.println("Detail of Full time Employee");
		// p1.showDetails();
		// p2.showDetails();

		//--- end Part time

		//---this is for Part time 

		// f2.getDetails();
		// f1.showDetails();
		// f2.showDetails();
		//--- end Part time

		Emp e1;
		e1=p2;
		e1.getDetails();
		e1.calcSalary();
		e1.showDetails();
		
		e1=f2;
		e1.getDetails();
		e1.calcSalary();
		e1.showDetails();

	}
}
