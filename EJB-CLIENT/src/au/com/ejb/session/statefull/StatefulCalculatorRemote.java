package au.com.ejb.session.statefull;

import javax.ejb.Remote;

@Remote
public interface StatefulCalculatorRemote {
	public void add(double op1);
	public void subtract(double op1);
	public void multiply(double op1);
	public void devide(double op1);
	public double getResult();
}
