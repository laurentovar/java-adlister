import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //if the there is something in the user direct to the profile
        if(request.getSession().getAttribute("user") != null){
            response.sendRedirect("/profile");
        }
        //direct back to the login if no user
        else {
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //check to see if the login username is admin and password is password
        boolean validAttempt = username.equals("admin") && password.equals("password");

        //if the login is an admin redirect to the profile page
        if (validAttempt) {
            request.getSession().setAttribute("user",username);
            response.sendRedirect("/profile");
        }
        //redirect to login again
        else {
            response.sendRedirect("/login");
        }


    }
}