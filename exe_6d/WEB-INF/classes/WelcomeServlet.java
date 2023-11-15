import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        if (username != null) {
            printWelcomePage(response, username);
        } else {
            // User is not authenticated; redirect to the login page
            response.sendRedirect("login.html");
        }
    }

    private void printWelcomePage(HttpServletResponse response, String username) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Welcome Page</title></head>");
        out.println("<body style='text-align:center;'>");
        out.println("<h2>Welcome, " + username + "!</h2>");
        out.println("<p>Explore our tourism in India</p>");
        out.println("<p>Complete your registration after you select your destination</p>");
        out.println("</body></html>");
    }
}
