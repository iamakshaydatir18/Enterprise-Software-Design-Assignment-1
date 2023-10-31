import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Assignment2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		


		out.println("<HTML>\n" + "<HEAD><TITLE>" + "Sample" + "</TITLE></HEAD>\n"
				+ "<BODY BGCOLOR=\"white\">\n" 
				+ "<H1 ALIGN=\"LEFT\">" +"Request and Headers Details"+ "</H1>\n"
				+ "Request Method:" + request.getMethod() 
				+ "<BR>\n" 
				+ "Request URI: "+ request.getRequestURI() + "<BR>\n" 
				+ "Request Protocol: " + request.getProtocol()
				+ "<BR><BR>\n" 
				+ "<TABLE BORDER=1 ALIGN=\"LEFT\">\n" + "<TR BGCOLOR=\"yellow\">\n"
				+ "<TH>Header Name<TH>Header Value");


		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			out.println("<TR><TD>" + headerName);
			out.println(" <TD>" + request.getHeader(headerName));
		}
		out.println("</TABLE>\n</BODY></HTML>");
	}
	/**
	 * Since this servlet is for debugging, have it handle GET and POST identically.
	 */

}