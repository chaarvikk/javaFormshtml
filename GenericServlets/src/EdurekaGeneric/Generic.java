package EdurekaGeneric;

import java.io.*;
import javax.servlet.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.GenericServlet;



public class Generic extends HttpServlet
{
	public void service(ServletRequest req, ServletResponse res)
			throws IOException, ServletException
	{
		res.setContentType("text/html") ;
		
		PrintWriter pwritter = res.getWriter();
		pwritter.print("<html>");
		pwritter.print("<body>");
		pwritter.print("<h2> Generic Servlet example </h2>");
		pwritter.print("<p>Welcome to my youtbe channel</p>");
		pwritter.print("</body>");
		pwritter.print("</html>");
		
	}
	
}
   
