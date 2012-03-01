package au.com.ejb.session.stateless;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
public class RemoteClient {
	private final static String jndiName="Calculator/remote";
	public static void main(String...g){
		Context ctx;
		Hashtable<String, String> map=new Hashtable<String, String>();
		map.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		map.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
		map.put("java.naming.provider.url", "ec2.jkt.com.au:1099");
		try {
			ctx=new InitialContext(map);
			CalculatorRemote cal=(CalculatorRemote) ctx.lookup(jndiName);
			System.out.println(cal.add( 20,40));
			 
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
}
