import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Confirmation extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse
response)throws ServletException, IOException{

try
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
//Getting the value from the hidden field
String name=request.getParameter("uname");
out.print("Hello "+name+". Registered successfully.");
out.close();
}
catch(Exception e){System.out.println(e);}
}
}