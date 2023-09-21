package assignment2;

 abstract class Shape {

		abstract void area();

		abstract void volume();

	}

	class sphere extends Shape

	{

		double pi=3.14;

		double radius=4.35;

		void area()

		{

			        double ar=4*pi*radius*radius;

				System.out.println("Area of Sphere is :"+ar);

		}

		void volume()

		{

			double vol=(4/3)*(pi*radius*radius*radius);

			System.out.println("Volume of Sphere is :"+vol);

		}

	}
	class cylinder extends Shape

	{

		double pi=3.14;

		double radius=4.35;

		double height=6.45;

		void area()

		{

			double A=(2*pi*radius*height)+(2*pi*radius*radius);

			System.out.println("Area of Cylinder is :"+A);

		}

		void volume()

		{

			double V=pi*radius*radius*height;

			System.out.println("Volume of Cylinder is :"+V);

		}

	
	public static void main(String a[])

	{

		sphere s=new sphere();

		s.area();

		s.volume();

		

		cylinder cy=new cylinder();

		cy.area();

		cy.volume();

		
	}
	}


