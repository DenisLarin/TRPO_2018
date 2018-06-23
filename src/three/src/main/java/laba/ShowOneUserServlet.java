package laba;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/showOneUser")
public class ShowOneUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        Dao dao = new Dao();
        User tempuser = new User(req.getParameter("phoneUS"));
        User user = dao.getUser(tempuser);
        java.lang.String head = "<link rel='stylesheet' href='bootstrap/css/bootstrap.min.css'>\n" +
                "    <link rel='stylesheet' href='style/main.css'>";
        printWriter.print("<html>" + head + "<body>");
        printWriter.print("<div class='center'><div class='wrapper'>");
        if(user!=null){
            printWriter.print("<h1>User:</h1>");
            printWriter.print("<table border='1'><tr><th>ID</th><th>Name</th><th>Surname</th><th>Phone</th></tr>");
            String id = user.getId();
            String name = user.getName();
            String surname = user.getSurname();
            String phone = user.getPhone();
            printWriter.print(String.format("<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>",id,name,surname,phone));
            printWriter.print("</table>");
        }
        else {
            printWriter.print("<h1>User don't found:</h1>");
        }
        java.lang.String backToMenu = "<a style='margin-top:30px;' href='index.jsp' class='btn btn-primary'>Back to index.jsp</a>";
        printWriter.print(backToMenu + "</div></div></body></html>");
    }
}
