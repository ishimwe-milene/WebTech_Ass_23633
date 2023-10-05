package auca.com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class forgetpassword extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        
        
        try {
        	if(!email.isEmpty()) {
        		PrintWriter out = response.getWriter();
        		response.setContentType("text/html");
        		out.println("Thank you, a Verification code will be sent to this email: "+email);
        	}else {
        		System.out.println("Please enter you email");
        	}
        }catch(IOException e) {
        	e.printStackTrace();
        }
    }
}
