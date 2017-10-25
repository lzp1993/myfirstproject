import com.sun.org.apache.xml.internal.security.Init;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class HelloWorld extends HttpServlet {
private String message;

    @Override
    public void init() throws ServletException {
        message="hello world , this is from servlet";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out =resp.getWriter();
        out.println("<h3>"+message+"</h3>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
