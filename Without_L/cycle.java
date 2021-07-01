package Without_L;
// This violates liskov substitution principle 
// as it doesn't contain fuel field
public class cycle extends Vehicle{
	public void setwheels() {
		super.No_of_wheels(2);
	}
}
