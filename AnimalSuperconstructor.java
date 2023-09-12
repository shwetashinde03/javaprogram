package inheritance;

class AnimalSuperconstructor {
	AnimalSuperconstructor(){System.out.println("animal is created");}
}
class Horse extends AnimalSuperconstructor{
	Horse(){
		super();
		System.out.println("horse is created");}
}

	
class TestSuper3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Horse h=new Horse();

	}

}
