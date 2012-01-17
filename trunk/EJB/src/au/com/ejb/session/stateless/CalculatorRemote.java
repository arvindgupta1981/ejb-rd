package au.com.ejb.session.stateless;

import javax.ejb.Remote;

@Remote
public interface CalculatorRemote {
	public double add(double op1,double op2);
}
