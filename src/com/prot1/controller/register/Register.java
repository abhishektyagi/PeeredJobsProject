package com.prot1.controller.register;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prot1.model.User;


/**
 * Servlet implementation class Register
 */
@WebServlet(description = "Registration of new Candidates", urlPatterns = { "/register.do" })
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		boolean flag=false;
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String userName=request.getParameter("username");
		String sex=request.getParameter("sex");
		String date=request.getParameter("day")+request.getParameter("month");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		String eMail=request.getParameter("email");
		String organization=request.getParameter("company");
		String designation=request.getParameter("designation");
		String role=request.getParameter("role");
		String password=request.getParameter("password");
		if((userName==null || userName=="")||(firstName==null ||firstName=="") ||(lastName=="" || lastName==null)
				|| (sex==null||sex=="")||(date==null ||date=="")||(city==null || city=="")|| (state==null || state=="")
				||(country==null ||country=="")||(eMail==null ||eMail=="")||(organization==null|| organization=="")
				||(role==null || role=="")||(password==null || password==""))
		{
			flag=true;
			System.out.println("you left empty fields");
			response.sendRedirect(response.encodeRedirectURL("register.jsp"));
			return;
		}
			
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUserName(userName);
		user.setSex(sex);
		user.setBirthday(date);
		user.setCity(city);
		user.setState(state);
		user.setCountry(country);
		user.seteMail(eMail);
		user.setCompany(organization);
		user.setDesignation(designation);
		user.setRole(role);
		user.setPassword(password);
		
		if(Registration.register(user) && (!flag)){
		//	RequestDispatcher view = request.getRequestDispatcher("home.jsp");
			//view.forward(request, response);
			response.sendRedirect(response.encodeRedirectURL("index.htm"));//("home.jsp");
			//response.;
		}
		else
			response.sendRedirect(response.encodeRedirectURL("error.jsp"));
		
	}

}
