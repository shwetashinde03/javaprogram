package assignment1;

public class Student {
	int rollno;
	String name;
	float percentage;
	Student(int rn,String n,float per)
	{
		this.rollno=rn;
		this.name=n;
		this.percentage=per;
	}
	public void display()
	{
		System.out.println("Student rollno.:"+rollno+""+"\nStudent name:"+name+""+"\npercentage"+percentage);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Student s1=new Student(12,"Shweta",90);
Student s2=new Student(11,"charu",89);
Student s3=new Student(13,"kadambari",91);
Student s4=new Student(14,"Toshita",92);
Student s5=new Student(15,"Tejaswi",88);
s1.display();
s2.display();
s3.display();
s4.display();
s5.display();
	}

}
