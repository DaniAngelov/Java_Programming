// github.com/DaniAngelov

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		AllWork a = new AllWork();
		Task t1 = new Task("building",17);
		Task t2 = new Task("building2",30);
		Task t3 = new Task("building3",7);
		Task t4 = new Task("building4",25);
		Task t5 = new Task("building5",13);
		Task t6 = new Task("building6",9);
		Task t7 = new Task("building7",28);
		
		a.addTask(t1);
		a.addTask(t2);
		a.addTask(t3);
		a.addTask(t4);
		a.addTask(t5);
		a.addTask(t6);
		a.addTask(t7);
		
		Employee e1 = new Employee("gosho");
		Employee e2 = new Employee("misho");
		Employee e3 = new Employee("tosho");
		Employee e4 = new Employee("pesho");
		e1.setAllwork(a);
		e1.setCurrentTask(e1.getAllwork().getNextTask());
		e2.setCurrentTask(e2.getAllwork().getNextTask());
		e3.setCurrentTask(e3.getAllwork().getNextTask());
		e4.setCurrentTask(e4.getAllwork().getNextTask());
		int counter = 1;
		for(;;)
		{
			System.out.println("=====Start of a new working day !=====");
			System.out.println("DAY " + counter + " !!!");
			if(counter != 1)
			{
				e1.startWorkingDay();
				e2.startWorkingDay();
				e3.startWorkingDay();
				e4.startWorkingDay();
			}
			counter++;
			
			e1.showReport();
			e2.showReport();
			e3.showReport();
			e4.showReport();

			if(e2.getAllwork().isAllWorkDone() )
				break;
		}
		
		
	}

}
