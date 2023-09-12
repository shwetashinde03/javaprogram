package chapter1;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=20;
int y=20;
int add=x+y;
System.out.println(add);

int subtraction=x-y;
System.out.println(subtraction);
int multiply=x*y;
System.out.println(multiply);
float division=x/y;
System.out.println(division);
float remainder=x%y;
System.out.println(remainder);
x += y;
System.out.println("x="+x);
x -= y;
System.out.println("x="+x);
x*=y;
System.out.println("x="+x);
x/=y;
System.out.println("x="+x);
x%=y;
System.out.println("x="+x);
System.out.println("x>y:"+(x>y));
System.out.println("x<y:"+(x<y));
System.out.println("x==y:"+(x==y));
boolean a=true;
boolean b=false;
System.out.println("a && b:"+(a && b));
System.out.println("a || b:"+(a || b));

System.out.println("!a:"+(!a));
	}

}
