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
public class Assignment4Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

					//String path ="/website/form.html";
					//String method ="post";
			out.println("<!DOCTYPE html>                                                                                                                                              ");
			out.println("<html lang="+"en"+">");
			out.println("<head>");
			out.println("    <meta charset="+"UTF-8"+">");
			out.println("    <meta name="+"viewport"+" content="+"width=device-width, initial-scale=1.0"+">");
			out.println("    <title>Tuition Waiver Form</title>");
			out.println("    <style>");
			out.println("        body {");
			out.println("            font-family: Arial, sans-serif;");
			out.println("            background-color: #f4f4f4;");
			out.println("            margin: 0;");
			out.println("            padding: 0;");
			out.println("        }");
			out.println("");
			out.println("        .container {");
			out.println("            background-color: #fff;");
			out.println("            border-radius: 5px;");
			out.println("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);");
			out.println("            padding: 20px;");
			out.println("            margin: 20px;");
			out.println("        }");
			out.println("");
			out.println("        .section-header {");
			out.println("            font-weight: bold;");
			out.println("            margin-bottom: 10px;");
			out.println("        }");
			out.println("");
			out.println("        .form-group {");
			out.println("            margin-bottom: 15px;");
			out.println("        }");
			out.println("");
			out.println("        .form-group label {");
			out.println("            display: block;");
			out.println("            font-weight: bold;");
			out.println("        }");
			out.println("");
			out.println("        .form-group input[type="+"text"+"],");
			out.println("        .form-group input[type="+"number"+"] {");
			out.println("            width: 100%;");
			out.println("            padding: 8px;");
			out.println("            border: 1px solid #ccc;");
			out.println("            border-radius: 5px;");
			out.println("        }");
			out.println("");
			out.println("        .form-group select {");
			out.println("            width: 100%;");
			out.println("            padding: 8px;");
			out.println("            border: 1px solid #ccc;");
			out.println("            border-radius: 5px;");
			out.println("        }");
			out.println("");
			out.println("        .form-group textarea {");
			out.println("            width: 100%;");
			out.println("            padding: 8px;");
			out.println("            border: 1px solid #ccc;");
			out.println("            border-radius: 5px;");
			out.println("        }");
			out.println("");
			out.println("        .form-group button {");
			out.println("            background-color: #007BFF;");
			out.println("            color: #fff;");
			out.println("            border: none;");
			out.println("            border-radius: 5px;");
			out.println("            padding: 10px 20px;");
			out.println("            cursor: pointer;");
			out.println("        }");
			out.println("        .h3 {");
			out.println("            font-size: 14px; /* Adjust the font size as needed */");
			out.println("            font-weight: normal;");
			out.println("            color: #333; /* Set the text color as needed */");
			out.println("            line-height: 1.5;");
			out.println("        }");
			out.println("        table {");
			out.println("            width: 100%;");
			out.println("        }");
			out.println("");
			out.println("        table, th, td {");
			out.println("            border: 1px solid #ccc;");
			out.println("            border-collapse: collapse;");
			out.println("        }");
			out.println("");
			out.println("        th, td {");
			out.println("            padding: 8px;");
			out.println("            text-align: left;");
			out.println("        }");
			out.println("");
			out.println("        th {");
			out.println("            background-color: #007BFF;");
			out.println("            color: #fff;");
			out.println("        }");
			out.println("    </style>");
			out.println("</head>");
			out.println("<body>");
			out.println("    <form action="+"/website/assignment4details.html"+" method="+"post"+">");
			out.println("    <div class="+"container"+">");
			out.println("        <h2>Section 1</h2>");
			out.println("        <div class="+"form-group"+">");
			out.println("            <label for="+"academicTerm"+">Academic Term: *(Fall, Winter, Spring, or Summer)</label>");
			out.println("            <input type="+"text"+" id="+"academicTerm"+" name="+"academicTerm"+">");
			out.println("            <label for="+"academicYear"+">Academic Year:</label>");
			out.println("            <input type="+"number"+" id="+"academicYear"+" name="+"academicYear"+">");
			out.println("        </div>");
			out.println("            <h4><label for="+"employeeStatus"+">Employee Status:</label>");
			out.println("            <input type="+"checkbox"+" id="+"pt_staff"+" name="+"pt_staff"+" value="+"P/T Staff"+">");
			out.println("            <label for="+"pt_staff"+">P/T Staff</label>");
			out.println("		    <input type="+"checkbox"+" id="+"pt_faculty"+" name="+"pt_faculty"+" value="+"P/T Faculty"+">");
			out.println("            <label for="+"pt_staff"+">P/T Faculty</label>");
			out.println("		    <input type="+"checkbox"+" id="+"retiree"+" name="+"retiree"+" value="+"Retiree"+">");
			out.println("            <label for="+"retiree"+">Retiree</label>");
			out.println("            <label for="+"other"+">Other</label>");
			out.println("            <input type="+"text"+" id="+"other"+" name="+"other"+"></h4>");
			out.println("            <br>");
			out.println("            <div class="+"h3"+">");
			out.println("                <label for="+"detail"+">*Terms with multiple sessions are considered one academic term for tuition waiver purposes e.g., summer sessions I and");
			out.println("                    II are considered one academic term.</label>");
			out.println("            </div>");
			out.println("");
			out.println("        <h2>Section 2</h2>");
			out.println("        <div class="+"form-group"+">");
			out.println("            <label for="+"studentName"+">Student’s Name:</label>");
			out.println("            <input type="+"text"+" id="+"studentName"+" name="+"studentName"+">");
			out.println("            <label for="+"relationship"+">Relationship to Employee:</label>");
			out.println("            <input type="+"text"+" id="+"relationship"+" name="+"relationship"+">");
			out.println("            <label for="+"studentNUID"+">Student’s NUID:</label>");
			out.println("            <input type="+"text"+" id="+"studentNUID"+" name="+"studentNUID"+">");
			out.println("        </div>");
			out.println("        <div class="+"form-group"+">");
			out.println("            <label for="+"employeeName"+">Employee’s Name (if different from Student’s):</label>");
			out.println("            <input type="+"text"+" id="+"employeeName"+" name="+"employeeName"+">");
			out.println("            <label for="+"employeeNUID"+">Employee’s NUID:</label>");
			out.println("            <input type="+"text"+" id="+"employeeNUID"+" name="+"employeeNUID"+">");
			out.println("            <label for="+"Department"+">Department:</label>");
			out.println("            <input type="+"text"+" id="+"Department"+" name="+"Department"+">");
			out.println("            <label for="+"CL"+">Campus Location:</label>");
			out.println("            <input type="+"text"+" id="+"CL"+" name="+"CL"+">");
			out.println("            <label for="+"PN"+">Phone Number:</label>");
			out.println("            <input type="+"text"+" id="+"PN"+" name="+"PN"+">");
			out.println("            <label for="+"SN"+">Supervisor’s Name:</label>");
			out.println("            <input type="+"text"+" id="+"SN"+" name="+"SN"+">");
			out.println("        </div>");
			out.println("");
			out.println("        <!-- Continue with Sections 3, 4, and 5 -->");
			out.println("        <h2>Section 3 </h2>");
			out.println("");
			out.println("            <label for="+"program"+"><h3><b>Indicate the applicable school or program: </b><h3></label>");
			out.println("            <h4><input type="+"radio"+" id="+"huey"+" name="+"UP"+" value="+"huey"+" checked />");
			out.println("            <label for="+"up"+">Undergraduate Program</label>");
			out.println("            <input type="+"radio"+" id="+"huey"+" name="+"LS"+" value="+"huey"+"  />");
			out.println("            <label for="+"up"+">Law School (excludes employees)</label>");
			out.println("            <input type="+"radio"+" id="+"huey"+" name="+"DC"+" value="+"huey"+"  />");
			out.println("            <label for="+"up"+">Doctoral Candidate</label>");
			out.println("            <input type="+"radio"+" id="+"huey"+" name="+"CPS_U"+" value="+"huey"+"  />");
			out.println("            <label for="+"up"+">College of Professional Studies (CPS) Undergraduate</label>");
			out.println("            <input type="+"radio"+" id="+"huey"+" name="+"GS"+" value="+"huey"+"  />");
			out.println("            <label for="+"up"+">Graduate School</label>");
			out.println("            <input type="+"radio"+" id="+"huey"+" name="+"CPS_GS"+" value="+"huey"+"  />");
			out.println("            <label for="+"up"+"> CPS Graduate School</label></h4>");
			out.println("            ");
			out.println("            <br>");
			out.println("            <br>");
			out.println("            <div class="+"h3"+">");
			out.println("                <label for="+"detail"+">One course per academic term may be taken one-half hour before the end of your workday. If this applies to you, this");
			out.println("                form must be signed by your supervisor below and approved by Human Resources Management.</label>");
			out.println("                <br>");
			out.println("                <br>");
			out.println("                <label for="+"detail"+">Complete the following course information. If you are an employee taking a job related course, please attach the Job");
			out.println("                Related Designation Form to this waiver. </label> ");
			out.println("            </div> ");
			out.println("");
			out.println("            <br>");
			out.println("            <br>");
			out.println("            <div class="+"container"+">");
			out.println("                <h2>Course Information</h2>");
			out.println("                <table>");
			out.println("                    <tr>");
			out.println("                        <th>Course No.</th>");
			out.println("                        <th>Course Name</th>");
			out.println("                        <th>Supervisor Signature</th>");
			out.println("                        <th>Credit Hrs.</th>");
			out.println("                        <th>Day(s)</th>");
			out.println("                        <th>Time</th>");
			out.println("                    </tr>");
			out.println("                    <tr>");
			out.println("                        <td><input type="+"text"+" name="+"one"+" /></td>");
			out.println("                        <td><input type="+"text"+" name="+"two"+" /></td>");
			out.println("                        <td><input type="+"text"+" name="+"three"+" /></td>");
			out.println("                        <td><input type="+"text"+" name="+"four"+" /></td>");
			out.println("                        <td><input type="+"text"+" name="+"five"+" /></td>");
			out.println("                        <td><input type="+"text"+" name="+"six"+" />a.m./p.m.</td>");
			out.println("                    </tr>");
			out.println("                </table>");
			out.println("            </div>");
			out.println("        <br>");
			out.println("        <br>");
			out.println("        <h2>Section 4</h2>");
			out.println("            <div class="+"h3"+">In accordance with Northeastern University's Tuition Waiver Program Guidelines, my signature attests that I am");
			out.println("                currently enrolled in the above courses, or that the student listed above is my spouse, domestic partner or");
			out.println("                unmarried dependent child or the dependent child of my domestic partner as defined under current IRS tax");
			out.println("                regulations. I also certify that I have read the Tuition Waiver Program Guidelines. </div>");
			out.println("");
			out.println("            <div class="+"form-group"+">");
			out.println("                <label for="+"sign"+">Employee’s Signature</label>");
			out.println("                <input type="+"text"+" id="+"sign"+" name="+"sign"+">");
			out.println("                <label for="+"academicYear"+">Date</label>");
			out.println("                <input type="+"date"+" id="+"date"+" name="+"date"+">");
			out.println("            </div>    ");
			out.println("        <br>");
			out.println("        <br>    ");
			out.println("        <h2>Section 5</h2>    ");
			out.println("        <div class="+"form-group"+">");
			out.println("            <label for="+"HRMsign"+">HRM Approval</label>");
			out.println("            <input type="+"text"+" id="+"HRMsign"+" name="+"HRMsign"+">");
			out.println("            <label for="+"HRMdate"+">Date</label>");
			out.println("            <input type="+"date"+" id="+"HRMdate"+" name="+"HRMdate"+">");
			out.println("        </div>   ");
			out.println("        <br>");
			out.println("        <br>");
			out.println("        <button type="+"submit"+">Submit</button>");
			out.println("    </div>");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");

		}

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

		out.println("Using getParameterMap() Method<br>");
		out.println("<br>");
		out.println("<TABLE BORDER=1 ALIGN=\"LEFT\">\n" + "<TR BGCOLOR=\"grey\">\n"
				+ "<TH>Parameter Name <TH> Parameter Value");

		Map<String,String[]> map = request.getParameterMap();
		
		for(Entry<String,String[]> entry : map.entrySet()){
			String name = entry.getKey();
			String arr = Stringvalues(entry.getValue());	
			out.println("<TR><TD>"+name+" :<TD>"+ arr);
		}		
		out.println("</TABLE>");
		
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