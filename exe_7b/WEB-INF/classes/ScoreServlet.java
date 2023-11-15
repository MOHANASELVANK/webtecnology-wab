import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ScoreServlet extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
int score = 0;
// Retrieve user's answers from the request
String q1 = request.getParameter("q1");
String q2 = request.getParameter("q2");
String q3 = request.getParameter("q3");
String q4 = request.getParameter("q4");
String q5 = request.getParameter("q5");

// Check answers and calculate score
if ("Dennis Amiss".equals(q1)) {
score++;
}
if ("Australia".equals(q2)) {
score++;
}
if ("1975".equals(q3)) {
score++;
}
if ("Sachin Tendulkar".equals(q4)) {
score++;
}
if ("West Indies".equals(q5)) {
score++;
}
out.println("<html><head><title>Quiz Result</title></head><body>");

out.println("<h1>Quiz Result</h1>");
out.println("<p>Your score is: " + score + " out of 5</p>");
out.println("</body></html>");
}
}