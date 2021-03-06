// github.com/DaniAngelov

public class StudentGroup 
{
	private String groupSubject;
	private Student[] students;
	private int freePlaces;
	
	StudentGroup()
	{
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	StudentGroup(String groupSubject)
	{
		this();
		this.groupSubject = groupSubject;
	}
	
	
	
	public String getGroupSubject() {
		return groupSubject;
	}

	public void setGroupSubject(String groupSubject) {
		this.groupSubject = groupSubject;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int getFreePlaces() {
		return freePlaces;
	}

	public void setFreePlaces(int freePlaces) {
		this.freePlaces = freePlaces;
	}

	void addStudent(Student s)
	{
		if(s.getSubject() == this.getGroupSubject() && this.getFreePlaces() > 0)
		{
			this.getStudents()[5 - this.getFreePlaces()] = s;
			this.setFreePlaces(this.getFreePlaces() - 1);
		}
		else
		{
			System.out.println(" You are either another subject or there are no free places left !");
		}
	}
	
	void emptyGroup()
	{
		this.setStudents(new Student[5]);
		this.setFreePlaces(5);
	}
	
	String theBestStudent()
	{
		double max = 0;
		int index = 0;
		for(int i =0;i < this.getStudents().length;i++)
		{
			if(this.getStudents()[i] != null)
			{
			if(max < this.getStudents()[i].getGrade())
			{
				index = i;
				max = this.getStudents()[i].getGrade();
			}
			}
		}
		
		System.out.println("The best student is : " + this.getStudents()[index].getName() );
		return this.getStudents()[index].getName();
	}
	
	void printStudentInGroup()
	{
		for(int i = 0;i < this.getStudents().length;i++)
		{
			if(this.getStudents()[i] != null)
			{
			System.out.println("Student name: " + this.getStudents()[i].getName());
			System.out.println("Student age: " + this.getStudents()[i].getAge());
			System.out.println("Student grade: " + this.getStudents()[i].getGrade());
			System.out.println("Student money: " + this.getStudents()[i].getMoney());
			System.out.println("Student subject: " + this.getStudents()[i].getSubject());
			System.out.println("Student year in college: " + this.getStudents()[i].getYearInCollege());
			System.out.println("-----------------------------------");
			}
		}
	}
	
}
