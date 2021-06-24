interface Aryan
{
	String str1="Aryan";
	void Btech();
}

interface Gita
{
	String str2="GITA";
	void Java();
}

abstract class Aptron
{
	void Cse()
	{
		System.out.println("This is Abstract Class");
	}
}

class Test extends Aptron implements Aryan,Gita
{
	public void Btech()
	{
		System.out.println("This is from Interface "+str1);
	}
	public void Java()
	{
		System.out.println("This is from Interface "+str2);
	}
}

class College 
{
	
	public static void main(String args[])
	{
		Test obj=new Test();
		obj.Cse();
		obj.Btech();
		obj.Java();
	}
}