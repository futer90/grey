import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Список дел</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form method=\"post\" action=\"get \">\n" +
                "    <input name=\"task\">\n" +
                "    <input type=\"submit\" value=\"добаваить\">\n" +
                "</form>\n" +
                "<ol>\n" +
                "<li> Проснуться</li>\n" +
                "</ol>\n" +
                "</body>\n" +
                "</html>");
    }
}
