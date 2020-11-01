package com.mega.mvc04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//service()
//get으로 요청이 오면 doget이 작동
//post으로 요청이 오면 dopost로 작동
//jsp의 모든 코드는 서블릿의 service()메서드 안으로 구현!
//jsp의 모든 변수는 service() 지역변수
public class Hi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String id = null;
	
       @Override
       public void init(ServletConfig config) throws ServletException{
    	   id = config.getInitParameter("id");
    	   System.out.println(id);
       }
       
       
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get요청됨");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>"+ name + " : get");
		out.println("<h1> login id "+ id);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post요청됨");
		String name = request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>"+ name + " : post");
		out.println("<h1> login id "+ id);
		out.close();
		//doGet(request, response);
	}

}
