class One
{
	int i;
	public static void main(String[] args) {
		One o1=new One();
		One o2=new One();
		System.out.println(" Hash code of "+o1.hashCode());
		System.out.println(" Hash code of "+o2.hashCode());
	}
}