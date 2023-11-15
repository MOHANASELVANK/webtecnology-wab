import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Confirmation extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            // Getting the value from the hidden field
            String name = request.getParameter("uname");
            out.print("Hello " + name + ". Good to be back.");

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
