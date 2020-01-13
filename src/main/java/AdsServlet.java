import model.Ads;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ads")
public class AdsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ads ads = DaoFactory.getAdsDao();
        request.setAttribute("ads", ads.all());

        request.getRequestDispatcher("WEB-INF/ads/index.jsp").forward(request, response);
    }
}