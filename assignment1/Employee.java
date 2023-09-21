package assignment1;

public class Employee {
	int id;
	String name;
	float salary;
	Employee(int empid,String empname,float sal)
	{
	id=empid;
	name=empname;
	salary=sal;
	}
public void display()
{
	System.out.println("employee name:"+name+""+"salary="+salary);
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Employee [] obj=new Employee [5];
			obj[0]  = new Employee(111,"Rajesh",40000);
			obj[1]=new Employee(112,"smita",45000);
			obj[2]= new Employee(113,"prita",50000);
			
			
			 for(int i=0;i<=5; i++) {
		        	obj[i].display();
		        	
		        }
		        
			
		}
	}

}
