package com.fdm.firstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String userName = request.getParameter("username");
		//String password = request.getParameter("password");
		String firstname =request.getParameter("firstname"); //read form data,  the name have to corespond to the name attribute on the form
		String lastname =  request.getParameter("lastname");
		//String gender = request.getParameter("gender");
		//String[] hobbiesList = request.getParameterValues("hobbies"); //string array was used as we have many hobbies
		//String hobbies = "";
		//for(String str : hobbiesList){
		//	hobbies += str + ",";
		///}
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head><title>welcome page </title></head>");
		writer.println("<body>");
		writer.println("<h2>welcome " + firstname + " " + lastname + " </h2>");
		writer.println("</body>");
		writer.println("</html>");
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
