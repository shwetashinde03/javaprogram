package assignment2;

import java.util.Scanner;

public class Sphere2 implements Shape2 {
	final float PI = 3.14f;
	float as, r;
	Scanner s = new Scanner(System.in);

	void accept() {
		System.out.println("Enter the Radius ");
		r = s.nextFloat();
	}
    @Override
	public void area() {
		as = 4 * PI * r * r;
	}

	public void show() {
		System.out.println("Area of Sphere is :" + as);
	}

}
