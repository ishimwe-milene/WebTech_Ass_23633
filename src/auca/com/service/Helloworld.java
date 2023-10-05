package auca.com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Helloworld extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("name");
        String password = req.getParameter("password");

        if ("Ishimwe Nyirinkwaya Milene".equals(username) && "player11".equals(password)) {
            try {
            	HttpSession session = req.getSession(true);
            	session.setAttribute("name", username);
                res.sendRedirect("StudentAdmission.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {            
            res.sendRed
            irect("forgetpassword.html"); 
        }
    }
}
