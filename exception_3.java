class One
{
	public static void main(String[] args) {
		int a=10;
		int b=0; //It wiil exicute try block
		// int b=0; //It wiil exicute catch block
		System.out.println("hii");
		try{
				int c=a/b;
				System.out.println("The value of  c is "+c);

				int d[]=new int[2];
				d[0]=100;
				d[10]=100;//ArrayIndexOutOfBoundsException error 
				System.out.println("The value of  c is "+d[0]);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Wrong input " +e);	
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array index out of bound ");		
			}
			
		System.out.println("Outside the try and catch ");	

	}
}