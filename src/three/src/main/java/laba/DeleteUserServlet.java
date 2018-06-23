package laba;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/deleteUser")
public class DeleteUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User deletedUser = new User(req.getParameter("phoneUS"));
        Dao dao = new Dao();
        PrintWriter printWriter = resp.getWriter();
        java.lang.String head = "<link rel='stylesheet' href='bootstrap/css/bootstrap.min.css'>\n" +
                "<link rel='stylesheet' href='style/main.css'>";

        printWriter.print("<html>" + head + "<body><div class='center'><div class='wrapper'>");
        if (dao.getUser(deletedUser) != null) {
            dao.deleteUser(deletedUser);
            printWriter.print("<h1>User was deleted</h1>");
        } else {
            printWriter.print("<h1><span style='color='red';'>user does not exist</span></h1>");
        }
        java.lang.String backToMenu = "<a style='margin-top:30px;' href='index.jsp' class='btn btn-primary'>Back to index.jsp</a>";
        printWriter.print(backToMenu + "</div></div></body></html>");
    }
}
