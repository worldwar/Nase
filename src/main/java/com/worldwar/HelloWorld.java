package com.worldwar;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloWorld extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
        	request.getRequestDispatcher("hello.jsp").forward(request, response);
//            response.getOutputStream().write("Hello, World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
			e.printStackTrace();
		}
    }

}
