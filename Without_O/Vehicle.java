package Without_O;
// In case, another vehicle type is added
// then we need to modify this class as no chance for extension is provided
public class Vehicle {
	int no_of_wheels =0;
	String vehicletype ;
    public int No_of_wheels(Vehicle v){
        int value = 0;
        if(vehicletype.equals("hatchback")){
            value = 4;
        } else if(vehicletype.equals("bike")) {
            value = 2;
        } 
        return value;
    }
}
