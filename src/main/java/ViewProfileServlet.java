import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //check to see if the user has something
        if(request.getSession().getAttribute("user") == null){
            //if it doesnt have anything they need to login
            response.sendRedirect("/login");
        }
        //they are logged in so send to the profile
        else {
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);

        }
    }
}
