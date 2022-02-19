class Student
{
	int id;
	String name=new String();
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return("The id of Student is "+id+"\nName is "+name);
	}
	public boolean equals(Student obj)
	{
		if(this.id==obj.id  && this.name==obj.name)
			return true;
		else
			return false;
	}
	
}
class Test
{
	public static void main(String[] args) {
		Student s1=new Student(1,"ck");
		Student s2=new Student(2,"ck");
		System.out.println(s1.equals(s2));
		System.out.println(s1.getClass());
		// System.out.println(s1);
	}
}