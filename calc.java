class Calc
{
	static int add(int a,int b)
	{
		int ans=a+b;
		return ans;
	}
	static float add(float a,float b)
	{
		float ans=a+b;
		return ans;
	}

	static double add(double a,double b)
	{
		double ans=a+b;
		return ans;
	}
	static int sub(int a,int b)
	{
		int ans=a-b;
		return ans;
	}
	/static float add(float a,float b)
	{
		float ans=a+b;
		return ans;
	}

	static double add(double a,double b)
	{
		double ans=a+b;
		return ans;
	}/
	static int mul(int a,int b)
	{
		int ans=a*b;
		return ans;
	}
	static int div(int a,int b)
	{
		int ans=a/b;
		return ans;
	}
}
class Test 
{
	public static void main(String[] args) {
		int ans1=Calc.add(2,3);
		int ans2=Calc.sub(3,3);
		int ans3=Calc.mul(2,3);
		int ans4=Calc.div(6,3);
		float ans5=Calc.add(6.2f,3.1f);
		double ans6=Calc.add(6.5f,3.5f);
		System.out.println("The addition is "+ans1);
		System.out.println("The Subtration is "+ans2);
		System.out.println("The Multiplication is "+ans3);
		System.out.println("The Division is "+ans4);
		System.out.println("The Float addtion is "+ans5);
		System.out.println("The Float addtion is "+ans6);
	}
}