package au.com.ejb.ui;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import au.com.ejb.dao.BaseDAOInt;
import au.com.ejb.entity.pojo.Address;
import au.com.ejb.session.stateless.Base.AddressFacadeLocal;

public class Test extends HttpServlet {
	@EJB
	private AddressFacadeLocal adressFacade;
	@Override
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("get");
		adressFacade.persistAddress(new Address("del"));
	}

	@Override
	protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("post");
		adressFacade.persistAddress(new Address("del"));
	}

}
