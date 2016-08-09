package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SingleServlet
 */
public class SingleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	private String msg;
	public void init() throws ServletException{
		msg = "Dhiki Dhiki agun jole";
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*System.out.println("Response from HTTP GET method");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Hello from Akash</h3>");
		writer.println("<h1>"+msg+"</h1");
		*/
		// Method to handle GET method request.
		  
		      // Set response content type
		      response.setContentType("text/html");

		      PrintWriter out = response.getWriter();
			  String title = "Using GET Method to Read Form Data";
		      String docType =
		      "<!doctype html public \"-//w3c//dtd html 4.0 " +
		      "transitional//en\">\n";
		      int a;
			int b,c;
		      a = Integer.parseInt(request.getParameter("first_name"));
		      b = Integer.parseInt(request.getParameter("last_name"));
		      c = a + b;
		      out.println(docType +
		                "<html>\n" +
		                "<head><title>" + title + "</title></head>\n" +
		                "<body bgcolor=\"#f0f0f0\">\n" +
		                "<h1 align=\"center\">" + title + "</h1>\n" +
		                "<ul>\n" +
		                "  <li><b>Sum is : </b>: "
		                +/* request.getParameter("first_name") + */"\n" + c +
		                /*"  <li><b>Last Name</b>: "
		                + request.getParameter("last_name") + "\n" +*/
		                "</ul>\n" +
		                "</body></html>");
		  }
		  // Method to handle POST method request.
		  public void doPost(HttpServletRequest request,
		                     HttpServletResponse response)
		      throws ServletException, IOException {
		     doGet(request, response);
		  }

		
	}


