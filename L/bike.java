package L;
// Though, extra field is added, it satisfies all the
// properties of Vehicle(no of wheels,fuel)
// This satisfies liskov substitution principle 
public class bike extends Vehicle{
	public double mileage;
    public void setmileage(double x){
        this.mileage = x;
    }
	public void setwheels() {
		super.no_of_wheels = 2;
	}
	public void fueltype() {
		super.fuel= "petrol";
	}
}
