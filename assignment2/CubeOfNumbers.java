package assignment2;
import java.util.Scanner;
public class CubeOfNumbers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;

		
		System.out.print("Enter the last number for cube : ");
		Scanner Sc= new Scanner(System.in);
		
		
		n = Sc.nextInt();

		 
		for(i=1;i<=n;i++)
		{
			System.out.println("Cube of " +i+" is : "+(i*i*i));     
		}
	}
	}


