package chapter1;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char operator;
Double number1,number2,result;
Scanner input=new Scanner();
System.out.println("choose an operator:+,-,*,or/");
operator=input.next().charAt(0);
System.out.println("enter first number");
number1=input.nextDouble();
System.out.println("enter second number");
number2=input.nextDouble();
switch (operator) {
case'+':
	result=number1 +number2;
	System.out.println(number1+"-"+number2+"="+result);
	break;
case '-':
result=number1-number2;
System.out.println(number1+"-"+number2+"="+result);
break;
case '*':
result=number1*number2;
System.out.println(number1+"*"+number2+"="+result);
break;
case '/':
	result=number1/number2;
	System.out.println(number1+"/"+number2+"="+result);
	break;
	default:
		System.out.println("Invalid operator!");
		break;
}
input.close();

}
	}


