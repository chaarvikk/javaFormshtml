package EdurekaServlets;
import java.io.*;
import javax.servlet.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.tools.internal.ws.processor.model.Response;


public class basics extends HttpServlet
{
	private String message;
	
	public void init() throws ServletException 
	{
		message = "This is a new servlet message.";
		
	}
		
		public void doGet (HttpServletRequest request, HttpServletResponse response)
		
		throws ServletException, IOException 
		{
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			out.println("<H1>" + message + "</H1>");
		}
		
		public void destroy() 
		{
			
		}
	}

