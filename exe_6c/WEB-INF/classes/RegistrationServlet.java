import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegistrationServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String n = request.getParameter("name");
            out.print("<h1>Welcome " + n + "</h1>");
            // appending the username in the query string
            out.print("<a href='Confirmation?uname=" + n + "'><br>Visit the next page for confirmation</a>");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
