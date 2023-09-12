package inheritance;

class Employee1 {
	float salary=40000;
}
class Programmer extends Employee1{
	int bonus=10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Programmer p=new Programmer();
System.out.println("Programmer salary is:"+p.salary);
System.out.println("Bonus of programmer is:"+p.bonus);

	}

}
