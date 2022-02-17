class One
{
		int i ;
		static int count=0;		
}
class Two 
{
	public static void main(String[] args) {
		One o=new One();
		One o1=new One();
		One.count=20;
		System.out.println("Obj1 Count "+o.count);
		System.out.println("Obj2 Count "+o1.count);
	}
}