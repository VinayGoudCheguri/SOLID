package I;
// No violations here
public class Car implements Mileage,Cost{

	@Override
	public void findmileage() {
		System.out.println("Mileage is 20 kmpl");
		
	}

	@Override
	public void cost() {
		System.out.println("Cost is 800000 INR");
		
	}

}
