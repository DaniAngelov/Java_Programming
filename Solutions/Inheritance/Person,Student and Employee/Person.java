// github.com/DaniAngelov

public class Person 
{
	protected String name;
	protected  int age;
	private boolean isMale;
	
	Person(String name,int age,boolean isMale)
	{
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}
	
	
	protected void showPersonInfo()
	{
		System.out.println("---------Person Info----------");
		System.out.println(" name: " + this.name);
		System.out.println(" age: "  + this.age);
		System.out.print(" gender: ");
		if(isMale)
			System.out.println("Male");
		else
			System.out.println("Female");
	}
	
}
