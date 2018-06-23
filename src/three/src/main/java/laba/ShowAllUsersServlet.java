package laba;

import com.sun.org.apache.xpath.internal.operations.String;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/showAllUsers")
public class ShowAllUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        Dao dao = new Dao();
        dao.showAllUsers();
        java.lang.String head = "<link rel='stylesheet' href='bootstrap/css/bootstrap.min.css'>\n" +
                "    <link rel='stylesheet' href='style/main.css'>";
        printWriter.print("<html>" + head + "<body>");
        printWriter.print("<div class='center'><div class='wrapper'><h1>User List:</h1>");
        printWriter.print("<table border='1'><tr><th>ID</th><th>Name</th><th>Surname</th><th>Phone</th></tr>");
        System.out.println(dao.getServerUnswer());
        printWriter.print(dao.getServerUnswer());
        printWriter.print("</table>");
        java.lang.String backToMenu = "<a style='margin-top:30px;' href='index.jsp' class='btn btn-primary'>Back to index.jsp</a>";
        printWriter.print(backToMenu + "</div></div></body></html>");
    }
}