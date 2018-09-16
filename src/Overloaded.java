class Person
{
	int age,grade;
	String face;
	public Person(int age, int grade) 
	{
		this.age = age;
		this.grade = grade;
	}
	
	public Person(String face,int age)
	{
		this.face = face;
		this.age = age;
	}
	
	public Person(int age,String face,int grade)
	{
		this.age = age;
		this.face = face;
		this.grade = grade;
	}
}
public class Overloaded 
{

	public static void main(String[] args) 
	{
		Person Peter = new Person(19,99);
		Person July = new Person("beauty",18);
		Person Russo = new Person(20,"ugly",100);
		
		System.out.println("Age:"+Peter.age+"  grade:"+Peter.grade);
		System.out.println("Age:"+July.age+"  face:"+July.face);
		System.out.println("Age:"+Russo.age+"  grade:"+Peter.grade+"  face:"+Russo.face);
	}

}
