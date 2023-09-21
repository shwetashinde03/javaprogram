package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mynumber2 {
	
		

		 static int a;
			Mynumber2()
			{
				a=0;
			}
			Mynumber2(int a)
			{
				this.a=a;
			}
			 static boolean ispositive(int a)
			{
				if(a>0)
					
				return true;
				else
				return false;
			
							}
			
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number:");
		int a=Integer.parseInt(br.readLine());
		Mynumber2 m=new Mynumber2();
		if(m.ispositive(a))
			System.out.println("Positive");
		
	}

}
	
