package assignment1;

 public class Product {

	
int id;
String name;
float price;
Product(int pid,String n,float pr)
{
	id=pid;
	name=n;
	price=pr;
}

	public void display()
	{
		System.out.println("product name="+name+""+"product price ="+price);
		System.out.println();
	}
	
	

 
	 
    // Main driver method
    public static void main(String args[])
    {
 
        // Creating an array of product object, or simply
        // creating array of object of class 1
        Product[] obj = new Product[5];
 
        // Creating & initializing actual product objects
        // using constructor
        // Custom input arguments
        obj[0] = new Product(23907, "Hp Omen Gaming 15",40000);
        obj[1] = new Product(91240, "Dell G3 Gaming",45000);
        obj[2] = new Product(29823, "Asus TUF Gaming",50000);
        obj[3] = new Product(11908, "Lenovo Legion Gaming",35000);
        obj[4] = new Product(43590, "Acer Predator Gaming",30000);
 
        
        
        
        for(int i=0;i<=5; i++) {
        	obj[i].display();
        }
        
        
        
        // Lastly displaying the product object data
//        System.out.println("Product Object 1:");
//        obj[0].display();
// 
//        System.out.println("Product Object 2:");
//        obj[1].display();
// 
//        System.out.println("Product Object 3:");
//        obj[2].display();
// 
//        System.out.println("Product Object 4:");
//        obj[3].display();
// 
//        System.out.println("Product Object 5:");
//        obj[4].display();
//   
	}

}
