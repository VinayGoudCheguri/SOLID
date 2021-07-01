//Is an upgrade of simple calculator
//Performs both addition and subtraction
// This violated Dependency Inversion
// Because high-level module depends on low-level module

package Without_D;

public class ComplexCalculator extends SimpleCalculator{
	public int sub(int x,int y) {
		return x-y;
	}
	
}
