
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BugTrackerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String title = req.getParameter("title");
        String description = req.getParameter("description");
        String priority = req.getParameter("priority");

        boolean saved = BugTracker.save(title, description, priority);

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        if (saved) {
            out.println("<h3>Bug saved successfully!</h3>");
        } else {
            out.println("<h3>Failed to save bug.</h3>");
        }
    }
}
