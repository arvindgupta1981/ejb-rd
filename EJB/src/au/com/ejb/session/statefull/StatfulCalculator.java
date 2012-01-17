package au.com.ejb.session.statefull;

import javax.ejb.Remote;
import javax.ejb.Remove;

@javax.ejb.Stateful
@Remote(StatefulCalculatorRemote.class)
public class StatfulCalculator implements StatefulCalculatorRemote {
	private double result=0;
	@Override
	public void add(double op2){
		result= result + op2;
	}
	@Override
	public void devide( double op2) {
		result= result/op2;
	}
	@Override
	public void multiply(double op2) {
		result= result*op2;
	}
	@Override
	public void subtract(double op2) {
		result= result-op2;
	}
	@Remove
	public double getResult(){
		return result;
	}
	
}
