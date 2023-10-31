import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.util.Map.Entry;


public class Assignment5Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String param1 = request.getParameter("name");
        String param2 = request.getParameter("email");

    
        String method = request.getMethod();
        String uri = request.getRequestURI();
        String queryString = request.getQueryString();
        String protocol = request.getProtocol();
        String remoteAddr = request.getRemoteAddr();
        Enumeration<String> headerNames = request.getHeaderNames();
        String contextPath = request.getServletContext().getContextPath();
        String contentType = request.getContentType();

        String authType = request.getAuthType();
        Cookie[] cookies = request.getCookies();

        // Output HTML response
        out.println("<html>");
        out.println("<head><title>ServletRequest and HttpServletRequest Example</title></head>");
        out.println("<body>");

        out.println("<h1>Request Information</h1>");
        out.println("<table border=\"1\">");
        out.println("<tr><th>Method</th><th>Details</th></tr>");
		Map<String,String[]> map = request.getParameterMap();
		
		for(Entry<String,String[]> entry : map.entrySet()){
			String name = entry.getKey();
			String arr = Stringvalues(entry.getValue());
			out.println("<tr><td>"+name+"</td><td>"+ arr+"</td></tr>");	
		}		

        out.println("<tr><th>request.getMethod():</th><th> " + method + "</th></tr>");
        out.println("<tr><th>request.getRequestURI():</th><th> " + uri + "</th></tr>");
        out.println("<tr><th>request.getQueryString():</th><th> " + queryString + "</th></tr>");
        out.println("<tr><th>request.getProtocol():</th><th> " + protocol + "</th></tr>");
        out.println("<tr><th>request.getRemoteAddr():</th><th> " + remoteAddr + "</th></tr>");
    
    
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            out.println("<tr><th>"+ headerName +":</th><th>" + headerValue + "</th></tr>");
        }

        // Output ServletRequest specific methods
        out.println("<tr><th>request.getServletContext().getContextPath():</th><th> " + contextPath + "</th></tr>");
        out.println("<tr><th>request.getContentType():</th><th> " + contentType + "</th></tr>");
        out.println("<tr><th>Authentication Type:</th><th> " + authType + "</th></tr>");
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                out.println("<tr><th>cookie.getName():</th><th> " + cookie.getName() + "</th></tr>");
                out.println("<tr><th>cookie.getValue():</th><th> " + cookie.getValue() + "</th></tr>");
            }
        } 

        out.println("</table></body>");
        out.println("</html>");
                  
    }
    
    public String Stringvalues(String[] array){
        StringBuilder s = new StringBuilder();

        for(String a:array){
            s.append(a);
        }

        return s.toString();
    }
}
