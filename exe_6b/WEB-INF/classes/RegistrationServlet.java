import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegistrationServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String place = request.getParameter("place");

            out.print("Welcome to the First Page " + name);

            // Creating a form with an invisible textfield
            out.print("<form action='Confirmation' method='POST'>");
            out.print("<input type='hidden' name='uname' value='" + name + "'>");
            out.print("<input type='submit' value='go to the second page'>");
            out.print("</form>");

            out.close();
        } catch (IOException e) {
            // Handle IOException
            e.printStackTrace();
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
        }
    }
}
