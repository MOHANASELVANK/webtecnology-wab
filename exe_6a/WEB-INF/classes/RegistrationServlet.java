import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
// Retrieve form data from the request
response.setContentType("text/html");

PrintWriter pwriter = response.getWriter();
String name = request.getParameter("name");
String email = request.getParameter("email");
String place = request.getParameter("place");
// Create cookies for the user's information
Cookie nameCookie = new Cookie("Uname", name);
// Add the cookies to the response
response.addCookie(nameCookie);
pwriter.print("<h3>Hello - The set cookie is:</h3>"+name);
pwriter.println("<br /> This is how cookie is SET");
//pwriter.print("<a href='Sessions2'>view details</a>");
}
}