package ap;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	req.getSession().removeAttribute("username");
		req.setAttribute("flash", "Te has deslogueado correctamente");
		
		RequestDispatcher dispatcher = getServletContext()
  		      .getRequestDispatcher("/login.jsp");
  		    dispatcher.forward(req, resp); 	
    }
}
