import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.Map.Entry;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class Assignment3Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String path ="/website/assignment3details.html";
		String method ="post";
	
		out.println("<html>\n");
		out.println("<head><title>Form</title><style>");
		out.println("        div {");
		out.println("          margin-bottom: 10px;");
		out.println("        }");
		out.println("        label1 {");
		out.println("          display: inline-block;");
		out.println("          width: 150px;");
		out.println("          text-align: right;");
		out.println("        }");
		out.println("      </style>");
		out.println("</head>");
		out.println("<body style="+"background-color:silver"+">\n");
		out.println("<form action="+path+" method="+method+">");
		out.println("       <div>");
		out.println("        <h1><b>My Form</b></h1>");
		out.println("        <label1 for="+"email"+">Email:</label1>");
		out.println("        <input type="+"email"+" id="+"email"+" name="+"email"+" required><br><br>");
		out.println("");
		out.println("        <label1 for="+"password"+">Password:</label1>");
		out.println("        <input type="+"password"+" id="+"password"+" name="+"password"+" required><br><br>");
		out.println("");
		out.println("        <label1 for="+"ConfirmPassword"+">Confirm Password:</label1>");
		out.println("        <input type="+"ConfirmPassword"+" id="+"ConfirmPassword"+" name="+"ConfirmPassword"+" required><br><br>");
		out.println("");
		out.println("        <label1 for="+"img"+">Select image:</label1>");
		out.println("        <input type="+"file"+" id="+"img"+" name="+"img"+" accept="+"image/*"+"><br><br>" );
		out.println("");
		out.println("        <label1 for="+"gender"+">Gender:</label1>");
		out.println("        <input type="+"radio"+" name="+"gender"+" value="+"male"+"> Male");
		out.println("        <input type="+"radio"+" name="+"gender"+" value="+"female"+"> Female<br><br>");
		out.println("");
		out.println("        <label1 for="+"country"+">Select Country:</label1>");
		out.println("        <select name="+"country"+" id="+"country"+">");
		out.println("        <option value="+"India"+">India</option>");
		out.println("        <option value="+"United States"+">United States</option>");
		out.println("        <option value="+"France"+">France</option>");
		out.println("        <option value="+"England"+">England</option>");
		out.println("        </select><br><br>");
		out.println("");
		out.println("        <label1 for="+"Hobby"+">Hobby:</label1>");
		out.println("        <input type="+"checkbox"+" id="+"cricket"+" name="+"Hobby"+" value="+"cricket"+">");
		out.println("        <label for="+"cricket"+">Cricket</label>");
		out.println("        <input type="+"checkbox"+" id="+"football"+" name="+"Hobby"+" value="+"football"+">");
		out.println("        <label for="+"football"+">Football</label><br><br>");
		out.println("");
		out.println("        <label1 for="+"Add"+">Address:</label1>");
		out.println("        <input type="+"text"+" id="+"name"+" name="+"address"+" style="+"height: 50px; width:"+"); 200px;"+"><br><br>");
		out.println("        <label1><input type="+"submit"+" value="+"Submit"+"><label1>");
		out.println("    </div>");
		out.println("    </form>\n");
		out.println("</body>");
		out.println("</html>"); 

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<HTML>\n" + "<HEAD><TITLE>" + "User Info" + "</TITLE></HEAD>\n"
				+ "<BODY BGCOLOR=\"white\">\n" 
				+ "<H1 ALIGN=\"LEFT\">" +"User Information"+ "</H1>\n");

		out.println("Using Enumeration getParameterNames Method");
		ArrayList<String> parameterNames = new ArrayList<String>();
 		Enumeration enumeration = request.getParameterNames();
   		 while (enumeration.hasMoreElements()) {
    		String parameterName = (String) enumeration.nextElement();
        	parameterNames.add(parameterName);
	    }

		for(String s : parameterNames){
			out.println(" "+s+"<br>\n");
		}
		out.println("<br>");
		out.println("Using getParameterMap() Method<br>");
		out.println("<h1>Table 1</h1>");
        out.println("<table border=\"1\">");
        out.println("<tr><th>Name</th><th>Details</th></tr>");
		Map<String,String[]> map = request.getParameterMap();
		
		for(Entry<String,String[]> entry : map.entrySet()){
			String name = entry.getKey();
			String arr = Stringvalues(entry.getValue());
			out.println("<tr><td>"+name+"</td><td>"+ arr+"</td></tr>");	
		}		
		out.println("</table>");


		out.println("<br><br>");
		out.println("Using getParameter Method");
		out.println("<h1>Table 2</h1>");
        out.println("<table border=\"1\">");
        out.println("<tr><th>Name</th><th>Details</th></tr>");
        out.println("<tr><td> Email :</td><td>"+ request.getParameter("email")+"</td></tr>");
        out.println("<tr><td> Image :</td><td>"+ request.getParameter("email")+"</td></tr>");
		out.println("<tr><td> Gender :</td><td>" + request.getParameter("email")+"</td></tr>");
        out.println("<tr><td> Country :</td><td>"+ request.getParameter("email")+"</td></tr>");
		out.println("<tr><td> Hobby :</td><td>"+ request.getParameter("email")+"</td></tr>");
        out.println("<tr><td> Address :</td><td>"+ request.getParameter("email")+"</td></tr>");
        out.println("</table>");
		out.println("</BODY></HTML>");
	}

	public String Stringvalues(String[] array){
		StringBuilder s = new StringBuilder();
       
	   s.append("[");
	   for(String a : array){
		s.append(a);
		s.append(" ");
	   }
	   s.append("]");

	   return s.toString();
	}

}