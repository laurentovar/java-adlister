import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//make sure you put hello-world after the / in the local host link!
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
    //super class is the HttpServlet
public class HelloWorldServlet extends HttpServlet {

    @Override
    //overriding from parent class (params are request, response)
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        //make the response (printWriter)
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello, World!</h1>");
    }
}