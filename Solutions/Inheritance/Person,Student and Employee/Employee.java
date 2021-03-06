// github.com/DaniAngelov

public class Employee extends Person
{
	double daySalary;

	Employee(String name, int age, boolean isMale,double daySalary)
	{
		super(name, age, isMale);
		this.daySalary = daySalary;
	}
	
	
	protected double calculateOvertime(double hours)
	{
		if(this.age < 18)
		{
			return 0;
		}
		else
		{
			this.daySalary += hours * 1.5;
			return hours * 1.5;
		}
	}
	
	void showEmployeeInfo()
	{
		showPersonInfo();
		System.out.println("day salary: " + this.daySalary + " lv");
	}

}
