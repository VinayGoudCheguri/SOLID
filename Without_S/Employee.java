package Without_S;
// This class has 2 responsibilities
// violates single responsibility(S) principle
public class Employee {
	private String name;
	private int salary;
	public void printname() {
		System.out.println("Employee name is "+ name);
	}
	public void printsalary() {
		System.out.println("Employee salary is "+ salary);
	}
}
