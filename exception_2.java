class One
{
	public static void main(String[] args) {
		int a=10;
		//int b=10; //It wiil exicute try block
		int b=0; //It wiil exicute catch block
		System.out.println("hii");
		try{
				int c=a/b;
				System.out.println("The value of  c is "+c);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Wrong input " +e);	
			}
		System.out.println("Outside the try and catch ");	

	}
}