// github.com/DaniAngelov

public class Main {

	
	public static void main(String[] args)
	{
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		
		c1.year = 1998;
		c1.freeMemory = 20;
		c1.hardDiskMemory = 200;
		c1.isNotebook = true;
		c1.operationSystem = "Linux";
		c1.price = 1250;
		
		
		c2.year = 2007;
		c2.freeMemory = 12;
		c2.hardDiskMemory = 600;
		c2.isNotebook = false;
		c2.operationSystem = "Windows";
		c2.price = 600;
		
		c1.changeOperationSystem("Windows");
		c2.useMemory(100);
		
		c1.print();
		c2.print();
		
		
		
	}
}
