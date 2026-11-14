package in.backend.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/aaa")
public class MyServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myName = req.getParameter("name1");
		String myEmail=req.getParameter("email1");
		PrintWriter out=resp.getWriter();
		out.println("Your name is : "+myName);
		out.println("Your email is :  "+myEmail);
	}

}
