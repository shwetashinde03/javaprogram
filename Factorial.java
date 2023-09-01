package chapter1;

import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner();
		System.out.println("enter the no.");
		int num=sc.nextInt();
		int i = 0,fact=1;
		while(i<=num)

 {
	fact=fact*i;
	i++;
	}
	System.out.println("factorial of the number:"+fact);
	}

}
