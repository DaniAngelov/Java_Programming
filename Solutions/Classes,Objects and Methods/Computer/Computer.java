// github.com/DaniAngelov

public class Computer 
{
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	
	
	void changeOperationSystem(String newOperationSystem)
	{
		this.operationSystem = newOperationSystem;
	}
	
	void useMemory(int memory)
	{
		if(this.freeMemory - memory < 0)
			System.out.println("Not enough free memory!");
		else
			this.freeMemory -= memory;
	}
	
	void print()
	{
		
		
		System.out.println("Year: " + year);
		System.out.println("Price: " + price);
		System.out.println("It's a notebook: " + isNotebook);
		System.out.println("Hard Disk Memory: " + hardDiskMemory);
		System.out.println("Free Memory: " + freeMemory);
		System.out.println("Operation System: " + operationSystem);
		
		System.out.println("-----------------------------");
	}
}
