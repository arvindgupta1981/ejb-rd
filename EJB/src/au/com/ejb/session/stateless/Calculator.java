package au.com.ejb.session.stateless;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(CalculatorRemote.class)
public class Calculator implements CalculatorRemote {
	@Override
	public double add(double op1,double op2){
		return op1+op2;
	}
}
