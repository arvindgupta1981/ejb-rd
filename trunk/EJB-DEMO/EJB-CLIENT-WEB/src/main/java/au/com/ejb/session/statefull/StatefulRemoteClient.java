package au.com.ejb.session.statefull;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
public class StatefulRemoteClient {
	private final static String jndiName="StatfulCalculator/remote";
	public static void main(String...g){
		Context ctx;
		Hashtable<String, String> map=new Hashtable<String, String>();
		map.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		map.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
		map.put("java.naming.provider.url", "ec2.jkt.com.au:1099");
		try {
			ctx=new InitialContext(map);
			StatefulCalculatorRemote cal=(StatefulCalculatorRemote) ctx.lookup(jndiName);
			//10+20 *30 /40
			cal.add(10);
			//System.out.println(cal.getResult());
			cal.add(20);
			//System.out.println(cal.getResult());
			cal.multiply(30);
			//System.out.println(cal.getResult());
			cal.devide(40);
			System.out.println(cal.getResult()); 
			//cal.add(10);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
}
