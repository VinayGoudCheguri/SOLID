// This violates Interface Segregation Principle
// as cycle doesn't have mileage
// This is solved by creating 2 interfaces instead of 1
// See package I

package Without_I;

public class cycle implements Vehicle{

	@Override
	public void findmileage() {
		 throw new UnsupportedOperationException();
		
	}

	@Override
	public void cost() {
		System.out.println("Cost is 8000 INR");
		
	}

}
