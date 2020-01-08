
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//page that goes up one every time the page is viewed
@WebServlet(name = "PageCounterServlet", urlPatterns = "/page-counter")

public class PageCounterServlet extends HttpServlet {

    // set counter
    private static int counter = 0;

    protected void doGet(HttpServletRequest servReq, HttpServletResponse serResp) throws ServletException, IOException {
        String reset = servReq.getParameter("reset");


        serResp.setContentType("text/html");

        PrintWriter writer = serResp.getWriter();
        counter++;

        if (reset != null && reset.toLowerCase().equals("true")) {
            counter = 1;

            writer.println("<h2>You rest the count of the page!!</h2>");
        }
        writer.println("<h3>The Page count is: " + counter + "</h3>");
    }
}
