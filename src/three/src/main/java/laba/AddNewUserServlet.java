package laba;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddNewUserServlet")
public class AddNewUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User(req.getParameter("name"),req.getParameter("surname"),req.getParameter("phone"));
        Dao dao = new Dao();
        PrintWriter printWriter = resp.getWriter();
        java.lang.String head = "<link rel='stylesheet' href='bootstrap/css/bootstrap.min.css'>\n" +
                "<link rel='stylesheet' href='style/main.css'>";

        printWriter.print("<html>"+head+"<body><div class='center'><div class='wrapper'>");
        if(dao.getUser(user)==null) {
            dao.adduser(user);
            printWriter.print("<h1>User was added</h1>");
            printWriter.print("<h3>Added user:</h3>");
            printWriter.print("<p>"+user.toString()+"</p><br><br>");
        }
        else {
            printWriter.print("<h1>User <span style='color='red';'>wasn't</span> added</h1>");
            printWriter.print("<h3>Added user:</h3>");
            printWriter.print("<p>"+user.toString()+"</p><br><br>");
        }
        java.lang.String backToMenu = "<a style='margin-top:30px;' href='index.jsp' class='btn btn-primary'>Back to index.jsp</a>";
        printWriter.print(backToMenu + "</div></div></body></html>");
    }
}
