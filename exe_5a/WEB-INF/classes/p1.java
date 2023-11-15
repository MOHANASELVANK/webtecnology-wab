p1.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class p1 extends HttpServlet
{
 private String message;
 public void init() throws ServletException
 {
 message = "Welcome Back";
 }
 public void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException
 {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println("<h1>" + message + "</h1>");
 out.println("<p> Country Music </p>");
 out.println("<p style = \"font-family: Verdana, Geneva, Tahoma, sans-serif;\">Country (also
called country and western) is a music genre originating in the Southern and Southwestern
United States. First produced in the 1920s, country music primarily focuses on working class
Americans and blue-collar American life.</p>");
 }
 public void destroy() {
 // do nothing.
 }
}