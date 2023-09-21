package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	int id;
	String name;
	String dept;
	double salary;
	public double total;
	public Employee()
	{
		id=0;
		name=null;
		dept=null;
		salary=0.0;
	}
	Employee(int empid,String n,String depart,float sal)
	
	{
		id=empid;
		name=n;
		dept=depart;
		salary=sal;
	}
	public void accept()throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter id of employee: ");
		  id=Integer.parseInt(br.readLine());
		  System.out.println("Enter name of employee: ");
		  name=br.readLine();
		  System.out.println("Enter salary of employee: ");
		  salary=Double.parseDouble(br.readLine());
		  System.out.println("Enter department of employee: ");
		  dept=br.readLine();
		 }
		 public double total(double total){
		  total=total(total)+salary;
		  return total;
		 }
		 public void display(){
		  System.out.println("Emp Id: "+id);
		  System.out.println("Name: "+name);
		  System.out.println("Salary: "+salary);
		  System.out.println("Department: "+dept);   
		 }
		}

		class Manager extends Employee{
		 private static double bonus;
		 public void accept() throws IOException{
		  super.accept();
		  System.out.println("Enter Bonus of employee: ");
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  bonus=Double.parseDouble(br.readLine());
		  super.total=bonus;
		 }
		 public void display(){
		  super.display();
		  System.out.println("Bonus: "+bonus);
		  System.out.println("Total Salary: "+total);
		 } 
		
		 public static void main(String[] args) throws IOException{
		  Manager[] m=new Manager[10];
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter the number of employees: ");
		  int n=Integer.parseInt(br.readLine());
		  for(int i=0;i<n;i++){
		   m[i]=new Manager();
		   m[i].accept();
		   m[i].total(bonus);
		  }
		  for(int i=0;i<n;i++){
		  m[i].display();
		  System.out.println("---------------------------------");
		  }
		  double src=m[0].total;
		  int temp=0;
		  for(int i=1;i<n;i++){
		   if(src<m[i].total) 
		   {
		    src=m[i].total;
		    temp=i;
		   }
		  }
		  System.out.println("The Employee having the maximum Total salary is :");
		  m[temp].display();
		 }

	

	
	}


